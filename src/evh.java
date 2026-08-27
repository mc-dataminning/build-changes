import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryUtil;

public record evh(aer c, float d, float e, evh.a f, String g) implements eve {
   private static final Codec<String> h = aqy.a(Codec.STRING, Codec.STRING.listOf(), $$0 -> String.join("", $$0));
   public static final MapCodec<evh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aer.a.fieldOf("file").forGetter(evh::c),
               Codec.FLOAT.optionalFieldOf("size", 11.0F).forGetter(evh::d),
               Codec.FLOAT.optionalFieldOf("oversample", 1.0F).forGetter(evh::e),
               evh.a.b.optionalFieldOf("shift", evh.a.a).forGetter(evh::f),
               h.optionalFieldOf("skip", "").forGetter(evh::g)
            )
            .apply($$0, evh::new)
   );

   @Override
   public evf a() {
      return evf.b;
   }

   @Override
   public Either<eve.a, eve.b> b() {
      return Either.left(this::a);
   }

   private eji a(anm $$0) throws IOException {
      STBTTFontinfo $$1 = null;
      ByteBuffer $$2 = null;

      try {
         ejl var5;
         try (InputStream $$3 = $$0.open(this.c.d("font/"))) {
            $$1 = STBTTFontinfo.malloc();
            $$2 = TextureUtil.readResource($$3);
            $$2.flip();
            if (!STBTruetype.stbtt_InitFont($$1, $$2)) {
               throw new IOException("Invalid ttf");
            }

            var5 = new ejl($$2, $$1, this.d, this.e, this.f.c, this.f.d, this.g);
         }

         return var5;
      } catch (Exception var9) {
         if ($$1 != null) {
            $$1.free();
         }

         MemoryUtil.memFree($$2);
         throw var9;
      }
   }

   public static record a(float c, float d) {
      public static final evh.a a = new evh.a(0.0F, 0.0F);
      public static final Codec<evh.a> b = Codec.FLOAT
         .listOf()
         .comapFlatMap($$0 -> ac.a($$0, 2).map($$0x -> new evh.a((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.c, $$0.d));

      public float a() {
         return this.c;
      }

      public float b() {
         return this.d;
      }
   }
}
