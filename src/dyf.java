import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dyf extends dwa {
   public static final Codec<dyf> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               dyf.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dyf::new)
   );
   public final dyf.a e;
   public final float f;
   public final float g;

   public dyf(dwa.c $$0, dyf.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      return a($$0, dlk.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dws $$0, dwa.a $$1) {
      ht $$2 = new ht($$1.h().d(), 90, $$1.h().e());
      dal $$3 = dal.a($$1.f());
      dye.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dwj<?> e() {
      return dwj.k;
   }

   public static enum a implements atr {
      a("warm"),
      b("cold");

      public static final Codec<dyf.a> c = atr.a(dyf.a::values);
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
