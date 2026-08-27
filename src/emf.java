import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class emf extends ejt {
   public static final Codec<emf> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               emf.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, emf::new)
   );
   public final emf.a e;
   public final float f;
   public final float g;

   public emf(ejt.d $$0, emf.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      return a($$0, dyu.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(ekl $$0, ejt.b $$1) {
      ir $$2 = new ir($$1.h().d(), 90, $$1.h().e());
      dmd $$3 = dmd.a($$1.f());
      eme.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public ekc<?> f() {
      return ekc.k;
   }

   public static enum a implements azg {
      a("warm"),
      b("cold");

      public static final Codec<emf.a> c = azg.a(emf.a::values);
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
