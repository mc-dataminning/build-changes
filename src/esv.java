import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class esv extends eqi {
   public static final MapCodec<esv> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               esv.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, esv::new)
   );
   public final esv.a e;
   public final float f;
   public final float g;

   public esv(eqi.c $$0, esv.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<eqi.b> a(eqi.a $$0) {
      return a($$0, efn.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(era $$0, eqi.a $$1) {
      iu $$2 = new iu($$1.h().d(), 90, $$1.h().e());
      dsm $$3 = dsm.a($$1.f());
      esu.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public eqr<?> e() {
      return eqr.k;
   }

   public static enum a implements bai {
      a("warm"),
      b("cold");

      public static final Codec<esv.a> c = bai.a(esv.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public String a() {
         return this.d;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
