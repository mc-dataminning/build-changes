import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dzt extends dxh {
   public static final Codec<dzt> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               dzt.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dzt::new)
   );
   public final dzt.a e;
   public final float f;
   public final float g;

   public dzt(dxh.c $$0, dzt.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dxh.b> a(dxh.a $$0) {
      return a($$0, dmr.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dxz $$0, dxh.a $$1) {
      ht $$2 = new ht($$1.h().d(), 90, $$1.h().e());
      dbm $$3 = dbm.a($$1.f());
      dzs.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dxq<?> e() {
      return dxq.k;
   }

   public static enum a implements aug {
      a("warm"),
      b("cold");

      public static final Codec<dzt.a> c = aug.a(dzt.a::values);
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
