import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FreeType;

public record fkr(akk c, float d, float e, fkr.a f, String g) implements fko {
   private static final Codec<String> h = Codec.withAlternative(Codec.STRING, Codec.STRING.listOf(), $$0 -> String.join("", $$0));
   public static final MapCodec<fkr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akk.a.fieldOf("file").forGetter(fkr::c),
               Codec.FLOAT.optionalFieldOf("size", 11.0F).forGetter(fkr::d),
               Codec.FLOAT.optionalFieldOf("oversample", 1.0F).forGetter(fkr::e),
               fkr.a.b.optionalFieldOf("shift", fkr.a.a).forGetter(fkr::f),
               h.optionalFieldOf("skip", "").forGetter(fkr::g)
            )
            .apply($$0, fkr::new)
   );

   @Override
   public fkp a() {
      return fkp.b;
   }

   @Override
   public Either<fko.b, fko.c> b() {
      return Either.left(this::a);
   }

   private eyj a(atu $$0) throws IOException {
      FT_Face $$1 = null;
      ByteBuffer $$2 = null;

      try {
         eym var20;
         try (InputStream $$3 = $$0.open(this.c.d("font/"))) {
            $$2 = TextureUtil.readResource($$3);
            $$2.flip();
            synchronized (fkn.a) {
               MemoryStack $$4 = MemoryStack.stackPush();

               try {
                  PointerBuffer $$5 = $$4.mallocPointer(1);
                  fkn.a(FreeType.FT_New_Memory_Face(fkn.a(), $$2, 0L, $$5), "Initializing font face");
                  $$1 = FT_Face.create($$5.get());
               } catch (Throwable var14) {
                  if ($$4 != null) {
                     try {
                        $$4.close();
                     } catch (Throwable var12) {
                        var14.addSuppressed(var12);
                     }
                  }

                  throw var14;
               }

               if ($$4 != null) {
                  $$4.close();
               }

               String $$6 = FreeType.FT_Get_Font_Format($$1);
               if (!"TrueType".equals($$6)) {
                  throw new IOException("Font is not in TTF format, was " + $$6);
               }

               fkn.a(FreeType.FT_Select_Charmap($$1, FreeType.FT_ENCODING_UNICODE), "Find unicode charmap");
               var20 = new eym($$2, $$1, this.d, this.e, this.f.c, this.f.d, this.g);
            }
         }

         return var20;
      } catch (Exception var17) {
         synchronized (fkn.a) {
            if ($$1 != null) {
               FreeType.FT_Done_Face($$1);
            }
         }

         MemoryUtil.memFree($$2);
         throw var17;
      }
   }

   public static record a(float c, float d) {
      public static final fkr.a a = new fkr.a(0.0F, 0.0F);
      public static final Codec<fkr.a> b = Codec.floatRange(-512.0F, 512.0F)
         .listOf()
         .comapFlatMap($$0 -> ac.a($$0, 2).map($$0x -> new fkr.a((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.c, $$0.d));

      public float a() {
         return this.c;
      }

      public float b() {
         return this.d;
      }
   }
}
