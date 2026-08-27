import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class duf extends dsa {
   public static final Codec<duf> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               duf.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, duf::new)
   );
   public final duf.a e;
   public final float f;
   public final float g;

   public duf(dsa.c $$0, duf.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dsa.b> a(dsa.a $$0) {
      return a($$0, dhk.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dss $$0, dsa.a $$1) {
      gu $$2 = new gu($$1.h().d(), 90, $$1.h().e());
      cvz $$3 = cvz.a($$1.f());
      due.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dsj<?> e() {
      return dsj.k;
   }

   public static enum a implements apr {
      a("warm"),
      b("cold");

      public static final Codec<duf.a> c = apr.a(duf.a::values);
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
