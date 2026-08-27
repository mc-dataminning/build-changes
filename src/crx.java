import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class crx extends csa {
   private final float a;
   private final Multimap<il<bqr>, bqu> b;

   public crx(crz $$0, int $$1, float $$2, cqh.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<il<bqr>, bqu> $$4 = ImmutableMultimap.builder();
      $$4.put(bqw.c, new bqu(m, "Weapon modifier", (double)this.a, bqu.a.a));
      $$4.put(bqw.e, new bqu(n, "Weapon modifier", (double)$$2, bqu.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dnb $$0, cxb $$1, ib $$2, ciu $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cqm $$0, dnb $$1) {
      if ($$1.a(dae.bs)) {
         return 15.0F;
      } else {
         return $$1.a(aun.bE) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cqm $$0, bpp $$1, bpp $$2) {
      $$0.a(1, $$2, bpe.a);
      return true;
   }

   @Override
   public boolean a(cqm $$0, cxb $$1, dnb $$2, ib $$3, bpp $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, bpe.a);
      }

      return true;
   }

   @Override
   public boolean a_(dnb $$0) {
      return $$0.a(dae.bs);
   }

   @Override
   public Multimap<il<bqr>, bqu> a(bpe $$0) {
      return $$0 == bpe.a ? this.b : super.a($$0);
   }
}
