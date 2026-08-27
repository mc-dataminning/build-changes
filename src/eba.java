import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eba extends dyo {
   public static final Codec<eba> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               eba.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eba::new)
   );
   public final eba.a e;
   public final float f;
   public final float g;

   public eba(dyo.c $$0, eba.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dyo.b> a(dyo.a $$0) {
      return a($$0, dny.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dzg $$0, dyo.a $$1) {
      hv $$2 = new hv($$1.h().d(), 90, $$1.h().e());
      dcl $$3 = dcl.a($$1.f());
      eaz.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dyx<?> e() {
      return dyx.k;
   }

   public static enum a implements aut {
      a("warm"),
      b("cold");

      public static final Codec<eba.a> c = aut.a(eba.a::values);
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
