import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eic extends efq {
   public static final Codec<eic> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               eic.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eic::new)
   );
   public final eic.a e;
   public final float f;
   public final float g;

   public eic(efq.c $$0, eic.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<efq.b> a(efq.a $$0) {
      return a($$0, dva.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(egi $$0, efq.a $$1) {
      id $$2 = new id($$1.h().d(), 90, $$1.h().e());
      dit $$3 = dit.a($$1.f());
      eib.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public efz<?> e() {
      return efz.k;
   }

   public static enum a implements ayg {
      a("warm"),
      b("cold");

      public static final Codec<eic.a> c = ayg.a(eic.a::values);
      private final String d;

      private a(String $$0) {
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
