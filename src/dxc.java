import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxc extends dux {
   public static final Codec<dxc> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               dxc.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dxc::new)
   );
   public final dxc.a e;
   public final float f;
   public final float g;

   public dxc(dux.c $$0, dxc.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dux.b> a(dux.a $$0) {
      return a($$0, dkh.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dvp $$0, dux.a $$1) {
      gv $$2 = new gv($$1.h().d(), 90, $$1.h().e());
      cyw $$3 = cyw.a($$1.f());
      dxb.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dvg<?> e() {
      return dvg.k;
   }

   public static enum a implements asf {
      a("warm"),
      b("cold");

      public static final Codec<dxc.a> c = asf.a(dxc.a::values);
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
