package com.mojang.blaze3d.platform;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

@fhc
public class TextureUtil {
   private static final Logger LOGGER = LogUtils.getLogger();
   public static final int MIN_MIPMAP_LEVEL = 0;
   private static final int DEFAULT_IMAGE_BUFFER_SIZE = 8192;

   public static ByteBuffer readResource(InputStream $$0) throws IOException {
      ReadableByteChannel $$1 = Channels.newChannel($$0);
      return $$1 instanceof SeekableByteChannel $$2 ? readResource($$1, (int)$$2.size() + 1) : readResource($$1, 8192);
   }

   private static ByteBuffer readResource(ReadableByteChannel $$0, int $$1) throws IOException {
      ByteBuffer $$2 = MemoryUtil.memAlloc($$1);

      try {
         while ($$0.read($$2) != -1) {
            if (!$$2.hasRemaining()) {
               $$2 = MemoryUtil.memRealloc($$2, $$2.capacity() * 2);
            }
         }

         return $$2;
      } catch (IOException var4) {
         MemoryUtil.memFree($$2);
         throw var4;
      }
   }

   public static void writeAsPNG(Path $$0, String $$1, fjw $$2, int $$3, IntUnaryOperator $$4) {
      RenderSystem.assertOnRenderThread();
      int $$5 = 0;

      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         $$5 += $$2.b().d() * $$2.a($$6) * $$2.b($$6);
      }

      fhs $$7 = new fhs(fhq.c, fhr.d, $$5);
      Runnable $$8 = () -> {
         try (fhs.a $$6 = $$7.a()) {
            int $$7x = 0;

            for (int $$8x = 0; $$8x <= $$3; $$8x++) {
               int $$9x = $$2.a($$8x);
               int $$10x = $$2.b($$8x);

               try (fiz $$11x = new fiz($$9x, $$10x, false)) {
                  for (int $$12 = 0; $$12 < $$10x; $$12++) {
                     for (int $$13 = 0; $$13 < $$9x; $$13++) {
                        int $$14 = $$6.a().getInt($$7x + ($$13 + $$12 * $$9x) * $$2.b().d());
                        $$11x.a($$13, $$12, $$4.applyAsInt($$14));
                     }
                  }

                  Path $$15 = $$0.resolve($$1 + "_" + $$8x + ".png");
                  $$11x.a($$15);
                  LOGGER.debug("Exported png to: {}", $$15.toAbsolutePath());
               } catch (IOException var18) {
                  LOGGER.debug("Unable to write: ", var18);
               }

               $$7x += $$2.b().d() * $$9x * $$10x;
            }
         }

         $$7.close();
      };
      AtomicInteger $$9 = new AtomicInteger();
      int $$10 = 0;

      for (int $$11 = 0; $$11 <= $$3; $$11++) {
         $$2.a($$7, $$10, () -> {
            if ($$9.getAndIncrement() == $$3) {
               $$8.run();
            }
         }, $$11);
         $$10 += $$2.b().d() * $$2.a($$11) * $$2.b($$11);
      }
   }

   public static Path getDebugTexturePath(Path $$0) {
      return $$0.resolve("screenshots").resolve("debug");
   }

   public static Path getDebugTexturePath() {
      return getDebugTexturePath(Path.of("."));
   }
}
