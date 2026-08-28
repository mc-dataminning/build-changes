import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eoe extends elr {
   public static final MapCodec<eoe> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               eoe.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eoe::new)
   );
   public final eoe.a e;
   public final float f;
   public final float g;

   public eoe(elr.c $$0, eoe.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<elr.b> a(elr.a $$0) {
      return a($$0, eaz.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(emj $$0, elr.a $$1) {
      jg $$2 = new jg($$1.h().d(), 90, $$1.h().e());
      dol $$3 = dol.a($$1.f());
      eod.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public ema<?> e() {
      return ema.k;
   }

   public static enum a implements baf {
      a("warm"),
      b("cold");

      public static final Codec<eoe.a> c = baf.a(eoe.a::values);
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
