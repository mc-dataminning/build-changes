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

@fhs
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

   public static void writeAsPNG(Path $$0, String $$1, flj $$2, int $$3, IntUnaryOperator $$4) {
      RenderSystem.assertOnRenderThread();
      int $$5 = 0;

      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         $$5 += $$2.d().a() * $$2.a($$6) * $$2.b($$6);
      }

      fii $$7 = RenderSystem.getDevice().a(() -> "Texture output buffer", fig.c, fih.d, $$5);
      flb $$8 = RenderSystem.getDevice().b();
      Runnable $$9 = () -> {
         try (fii.a $$7x = $$8.a($$7)) {
            int $$8x = 0;

            for (int $$9x = 0; $$9x <= $$3; $$9x++) {
               int $$10x = $$2.a($$9x);
               int $$11x = $$2.b($$9x);

               try (fki $$12x = new fki($$10x, $$11x, false)) {
                  for (int $$13 = 0; $$13 < $$11x; $$13++) {
                     for (int $$14 = 0; $$14 < $$10x; $$14++) {
                        int $$15 = $$7x.a().getInt($$8x + ($$14 + $$13 * $$10x) * $$2.d().a());
                        $$12x.a($$14, $$13, $$4.applyAsInt($$15));
                     }
                  }

                  Path $$16 = $$0.resolve($$1 + "_" + $$9x + ".png");
                  $$12x.a($$16);
                  LOGGER.debug("Exported png to: {}", $$16.toAbsolutePath());
               } catch (IOException var19) {
                  LOGGER.debug("Unable to write: ", var19);
               }

               $$8x += $$2.d().a() * $$10x * $$11x;
            }
         }

         $$7.close();
      };
      AtomicInteger $$10 = new AtomicInteger();
      int $$11 = 0;

      for (int $$12 = 0; $$12 <= $$3; $$12++) {
         $$8.a($$2, $$7, $$11, () -> {
            if ($$10.getAndIncrement() == $$3) {
               $$9.run();
            }
         }, $$12);
         $$11 += $$2.d().a() * $$2.a($$12) * $$2.b($$12);
      }
   }

   public static Path getDebugTexturePath(Path $$0) {
      return $$0.resolve("screenshots").resolve("debug");
   }

   public static Path getDebugTexturePath() {
      return getDebugTexturePath(Path.of("."));
   }
}
