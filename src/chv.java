import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class chv extends ckz implements clf {
   private final aqk<ctc> a;
   protected final float b;
   private final float c;
   private final Multimap<bkn, bkq> d;

   protected chv(float $$0, float $$1, cky $$2, aqk<ctc> $$3, cjg.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bkn, bkq> $$5 = ImmutableMultimap.builder();
      $$5.put(bks.c, new bkq(m, "Tool modifier", (double)this.c, bkq.a.a));
      $$5.put(bks.e, new bkq(n, "Tool modifier", (double)$$1, bkq.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cjl $$0, dfd $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cjl $$0, bjm $$1, bjm $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(bjb.a));
      return true;
   }

   @Override
   public boolean a(cjl $$0, cqb $$1, dfd $$2, gw $$3, bjm $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bjb.a));
      }

      return true;
   }

   @Override
   public Multimap<bkn, bkq> a(bjb $$0) {
      return $$0 == bjb.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dfd $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(apv.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(apv.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(apv.bG) ? false : $$0.a(this.a);
      }
   }
}
