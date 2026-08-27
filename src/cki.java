import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cki extends ckl implements ckr {
   private final float a;
   private final Multimap<bjz, bkc> b;

   public cki(ckk $$0, int $$1, float $$2, cis.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bjz, bkc> $$4 = ImmutableMultimap.builder();
      $$4.put(bke.f, new bkc(m, "Weapon modifier", (double)this.a, bkc.a.a));
      $$4.put(bke.h, new bkc(n, "Weapon modifier", (double)$$2, bkc.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dez $$0, cpl $$1, gu $$2, cbm $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cix $$0, dez $$1) {
      if ($$1.a(csm.bs)) {
         return 15.0F;
      } else {
         return $$1.a(apl.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cix $$0, biy $$1, biy $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bin.a));
      return true;
   }

   @Override
   public boolean a(cix $$0, cpl $$1, dez $$2, gu $$3, biy $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bin.a));
      }

      return true;
   }

   @Override
   public boolean a_(dez $$0) {
      return $$0.a(csm.bs);
   }

   @Override
   public Multimap<bjz, bkc> a(bin $$0) {
      return $$0 == bin.a ? this.b : super.a($$0);
   }
}
