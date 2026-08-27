import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class coz extends csa {
   private final avd<dac> a;
   protected final float b;
   private final float c;
   private final Multimap<il<bqr>, bqu> d;

   protected coz(float $$0, float $$1, crz $$2, avd<dac> $$3, cqh.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<il<bqr>, bqu> $$5 = ImmutableMultimap.builder();
      $$5.put(bqw.c, new bqu(m, "Tool modifier", (double)this.c, bqu.a.a));
      $$5.put(bqw.e, new bqu(n, "Tool modifier", (double)$$1, bqu.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cqm $$0, dnb $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cqm $$0, bpp $$1, bpp $$2) {
      $$0.a(2, $$2, bpe.a);
      return true;
   }

   @Override
   public boolean a(cqm $$0, cxb $$1, dnb $$2, ib $$3, bpp $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, bpe.a);
      }

      return true;
   }

   @Override
   public Multimap<il<bqr>, bqu> a(bpe $$0) {
      return $$0 == bpe.a ? this.d : super.a($$0);
   }

   public float c() {
      return this.c;
   }

   @Override
   public boolean a_(dnb $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(aun.bF)) {
         return false;
      } else if ($$1 < 2 && $$0.a(aun.bG)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(aun.bH) ? false : $$0.a(this.a);
      }
   }
}
