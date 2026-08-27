import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dzh extends dwv {
   public static final Codec<dzh> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               dzh.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dzh::new)
   );
   public final dzh.a e;
   public final float f;
   public final float g;

   public dzh(dwv.c $$0, dzh.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      return a($$0, dmf.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dxn $$0, dwv.a $$1) {
      ht $$2 = new ht($$1.h().d(), 90, $$1.h().e());
      dbf $$3 = dbf.a($$1.f());
      dzg.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dxe<?> e() {
      return dxe.k;
   }

   public static enum a implements aub {
      a("warm"),
      b("cold");

      public static final Codec<dzh.a> c = aub.a(dzh.a::values);
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
