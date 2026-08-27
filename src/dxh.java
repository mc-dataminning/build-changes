import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxh extends dvc {
   public static final Codec<dxh> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               dxh.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dxh::new)
   );
   public final dxh.a e;
   public final float f;
   public final float g;

   public dxh(dvc.c $$0, dxh.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dvc.b> a(dvc.a $$0) {
      return a($$0, dkm.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dvu $$0, dvc.a $$1) {
      gw $$2 = new gw($$1.h().d(), 90, $$1.h().e());
      czn $$3 = czn.a($$1.f());
      dxg.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dvl<?> e() {
      return dvl.k;
   }

   public static enum a implements asu {
      a("warm"),
      b("cold");

      public static final Codec<dxh.a> c = asu.a(dxh.a::values);
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
