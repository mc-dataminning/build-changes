import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class ckj extends ckm implements cks {
   private final float a;
   private final Multimap<bka, bkd> b;

   public ckj(ckl $$0, int $$1, float $$2, cit.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bka, bkd> $$4 = ImmutableMultimap.builder();
      $$4.put(bkf.f, new bkd(m, "Weapon modifier", (double)this.a, bkd.a.a));
      $$4.put(bkf.h, new bkd(n, "Weapon modifier", (double)$$2, bkd.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dfa $$0, cpm $$1, gu $$2, cbn $$3) {
      return !$$3.f();
   }

   @Override
   public float a(ciy $$0, dfa $$1) {
      if ($$1.a(csn.bs)) {
         return 15.0F;
      } else {
         return $$1.a(apl.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(ciy $$0, biy $$1, biy $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bin.a));
      return true;
   }

   @Override
   public boolean a(ciy $$0, cpm $$1, dfa $$2, gu $$3, biy $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bin.a));
      }

      return true;
   }

   @Override
   public boolean a_(dfa $$0) {
      return $$0.a(csn.bs);
   }

   @Override
   public Multimap<bka, bkd> a(bin $$0) {
      return $$0 == bin.a ? this.b : super.a($$0);
   }
}
