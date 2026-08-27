import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ebr extends dzf {
   public static final Codec<ebr> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               ebr.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ebr::new)
   );
   public final ebr.a e;
   public final float f;
   public final float g;

   public ebr(dzf.c $$0, ebr.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      return a($$0, dop.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dzx $$0, dzf.a $$1) {
      hx $$2 = new hx($$1.h().d(), 90, $$1.h().e());
      ddb $$3 = ddb.a($$1.f());
      ebq.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dzo<?> e() {
      return dzo.k;
   }

   public static enum a implements avj {
      a("warm"),
      b("cold");

      public static final Codec<ebr.a> c = avj.a(ebr.a::values);
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
