import com.mojang.serialization.MapCodec;

public class egm extends egf {
   public static final MapCodec<egm> b = dta.b.fieldOf("state").xmap(dsz.a::b, dfw::o).xmap(egm::new, $$0 -> $$0.c);
   private final dfw c;

   public egm(dfw $$0) {
      this.c = $$0;
   }

   @Override
   protected egg<?> a() {
      return egg.f;
   }

   @Override
   public dta a(ayv $$0, jd $$1) {
      ji.a $$2 = ji.a.a($$0);
      return this.c.o().b(dmj.i, $$2);
   }
}
