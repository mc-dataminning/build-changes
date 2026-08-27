import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxi extends dvd {
   public static final Codec<dxi> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               dxi.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dxi::new)
   );
   public final dxi.a e;
   public final float f;
   public final float g;

   public dxi(dvd.c $$0, dxi.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dvd.b> a(dvd.a $$0) {
      return a($$0, dkn.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dvv $$0, dvd.a $$1) {
      gw $$2 = new gw($$1.h().d(), 90, $$1.h().e());
      czc $$3 = czc.a($$1.f());
      dxh.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dvm<?> e() {
      return dvm.k;
   }

   public static enum a implements ask {
      a("warm"),
      b("cold");

      public static final Codec<dxi.a> c = ask.a(dxi.a::values);
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
