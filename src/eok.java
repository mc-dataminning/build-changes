import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eok extends elx {
   public static final MapCodec<eok> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               a($$0),
               eok.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eok::new)
   );
   public final eok.a e;
   public final float f;
   public final float g;

   public eok(elx.c $$0, eok.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      return a($$0, ebf.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(emp $$0, elx.a $$1) {
      jh $$2 = new jh($$1.h().d(), 90, $$1.h().e());
      dor $$3 = dor.a($$1.f());
      eoj.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public emg<?> e() {
      return emg.k;
   }

   public static enum a implements bag {
      a("warm"),
      b("cold");

      public static final Codec<eok.a> c = bag.a(eok.a::values);
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
