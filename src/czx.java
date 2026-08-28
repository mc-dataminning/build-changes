import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czx(czs d, czs e, jj<brb> f) implements dab {
   public static final MapCodec<czx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               czs.b.fieldOf("min_damage").forGetter(czx::b), czs.b.fieldOf("max_damage").forGetter(czx::c), brb.b.fieldOf("damage_type").forGetter(czx::d)
            )
            .apply($$0, czx::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
      float $$5 = ayg.b($$3.dT(), this.d.a($$1), this.e.a($$1));
      $$3.a(new bqz(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<czx> a() {
      return a;
   }

   public czs b() {
      return this.d;
   }

   public czs c() {
      return this.e;
   }

   public jj<brb> d() {
      return this.f;
   }
}
