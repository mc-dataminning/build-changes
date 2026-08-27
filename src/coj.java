import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class coj extends com implements cot {
   private final float a;
   private final Multimap<bnm, bnp> b;

   public coj(col $$0, int $$1, float $$2, cmt.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bnm, bnp> $$4 = ImmutableMultimap.builder();
      $$4.put(bnr.c, new bnp(m, "Weapon modifier", (double)this.a, bnp.a.a));
      $$4.put(bnr.e, new bnp(n, "Weapon modifier", (double)$$2, bnp.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(djh $$0, ctp $$1, hx $$2, cfi $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cmy $$0, djh $$1) {
      if ($$1.a(cws.bs)) {
         return 15.0F;
      } else {
         return $$1.a(ash.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cmy $$0, bml $$1, bml $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bma.a));
      return true;
   }

   @Override
   public boolean a(cmy $$0, ctp $$1, djh $$2, hx $$3, bml $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bma.a));
      }

      return true;
   }

   @Override
   public boolean a_(djh $$0) {
      return $$0.a(cws.bs);
   }

   @Override
   public Multimap<bnm, bnp> a(bma $$0) {
      return $$0 == bma.a ? this.b : super.a($$0);
   }
}
