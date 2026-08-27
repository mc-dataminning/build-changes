import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class chk extends cko implements cku {
   private final aqd<csq> a;
   protected final float b;
   private final float c;
   private final Multimap<bkc, bkf> d;

   protected chk(float $$0, float $$1, ckn $$2, aqd<csq> $$3, civ.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bkc, bkf> $$5 = ImmutableMultimap.builder();
      $$5.put(bkh.f, new bkf(m, "Tool modifier", (double)this.c, bkf.a.a));
      $$5.put(bkh.h, new bkf(n, "Tool modifier", (double)$$1, bkf.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cja $$0, dfe $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cja $$0, bjb $$1, bjb $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(biq.a));
      return true;
   }

   @Override
   public boolean a(cja $$0, cpq $$1, dfe $$2, gw $$3, bjb $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(biq.a));
      }

      return true;
   }

   @Override
   public Multimap<bkc, bkf> a(biq $$0) {
      return $$0 == biq.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dfe $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(apo.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(apo.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(apo.bG) ? false : $$0.a(this.a);
      }
   }
}
