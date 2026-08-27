import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ebl extends dyz {
   public static final Codec<ebl> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               ebl.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ebl::new)
   );
   public final ebl.a e;
   public final float f;
   public final float g;

   public ebl(dyz.c $$0, ebl.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dyz.b> a(dyz.a $$0) {
      return a($$0, doj.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dzr $$0, dyz.a $$1) {
      hx $$2 = new hx($$1.h().d(), 90, $$1.h().e());
      dcv $$3 = dcv.a($$1.f());
      ebk.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dzi<?> e() {
      return dzi.k;
   }

   public static enum a implements ave {
      a("warm"),
      b("cold");

      public static final Codec<ebl.a> c = ave.a(ebl.a::values);
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
