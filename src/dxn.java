import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxn extends dvi {
   public static final Codec<dxn> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               dxn.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dxn::new)
   );
   public final dxn.a e;
   public final float f;
   public final float g;

   public dxn(dvi.c $$0, dxn.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      return a($$0, dks.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dwa $$0, dvi.a $$1) {
      gw $$2 = new gw($$1.h().d(), 90, $$1.h().e());
      czh $$3 = czh.a($$1.f());
      dxm.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dvr<?> e() {
      return dvr.k;
   }

   public static enum a implements asp {
      a("warm"),
      b("cold");

      public static final Codec<dxn.a> c = asp.a(dxn.a::values);
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
