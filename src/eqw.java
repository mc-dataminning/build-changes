import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eqw extends eoj {
   public static final MapCodec<eqw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               eqw.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eqw::new)
   );
   public final eqw.a e;
   public final float f;
   public final float g;

   public eqw(eoj.c $$0, eqw.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<eoj.b> a(eoj.a $$0) {
      return a($$0, edp.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(epb $$0, eoj.a $$1) {
      jh $$2 = new jh($$1.h().d(), 90, $$1.h().e());
      drb $$3 = drb.a($$1.f());
      eqv.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public eos<?> e() {
      return eos.k;
   }

   public static enum a implements bba {
      a("warm"),
      b("cold");

      public static final Codec<eqw.a> c = bba.a(eqw.a::values);
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
