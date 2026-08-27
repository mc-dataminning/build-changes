import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class efq extends ede {
   public static final Codec<efq> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               efq.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, efq::new)
   );
   public final efq.a e;
   public final float f;
   public final float g;

   public efq(ede.c $$0, efq.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<ede.b> a(ede.a $$0) {
      return a($$0, dso.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(edw $$0, ede.a $$1) {
      ib $$2 = new ib($$1.h().d(), 90, $$1.h().e());
      dgo $$3 = dgo.a($$1.f());
      efp.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public edn<?> e() {
      return edn.k;
   }

   public static enum a implements axq {
      a("warm"),
      b("cold");

      public static final Codec<efq.a> c = axq.a(efq.a::values);
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
