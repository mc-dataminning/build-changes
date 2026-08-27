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

public record esa(acq c, float d, float e, esa.a f, String g) implements erx {
   private static final Codec<String> h = Codec.either(Codec.STRING, Codec.STRING.listOf())
      .xmap($$0 -> (String)$$0.map($$0x -> $$0x, $$0x -> String.join("", $$0x)), Either::left);
   public static final MapCodec<esa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               acq.a.fieldOf("file").forGetter(esa::c),
               Codec.FLOAT.optionalFieldOf("size", 11.0F).forGetter(esa::d),
               Codec.FLOAT.optionalFieldOf("oversample", 1.0F).forGetter(esa::e),
               esa.a.b.optionalFieldOf("shift", esa.a.a).forGetter(esa::f),
               h.optionalFieldOf("skip", "").forGetter(esa::g)
            )
            .apply($$0, esa::new)
   );

   @Override
   public ery a() {
      return ery.b;
   }

   @Override
   public Either<erx.a, erx.b> b() {
      return Either.left(this::a);
   }

   private egm a(akx $$0) throws IOException {
      STBTTFontinfo $$1 = null;
      ByteBuffer $$2 = null;

      try {
         egp var5;
         try (InputStream $$3 = $$0.open(this.c.d("font/"))) {
            $$1 = STBTTFontinfo.malloc();
            $$2 = TextureUtil.readResource($$3);
            $$2.flip();
            if (!STBTruetype.stbtt_InitFont($$1, $$2)) {
               throw new IOException("Invalid ttf");
            }

            var5 = new egp($$2, $$1, this.d, this.e, this.f.c, this.f.d, this.g);
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
      public static final esa.a a = new esa.a(0.0F, 0.0F);
      public static final Codec<esa.a> b = Codec.FLOAT
         .listOf()
         .comapFlatMap($$0 -> ac.a($$0, 2).map($$0x -> new esa.a((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.c, $$0.d));

      public float a() {
         return this.c;
      }

      public float b() {
         return this.d;
      }
   }
}
