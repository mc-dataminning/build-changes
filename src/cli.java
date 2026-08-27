import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cli extends com implements cot {
   private final asw<cwq> a;
   protected final float b;
   private final float c;
   private final Multimap<bnm, bnp> d;

   protected cli(float $$0, float $$1, col $$2, asw<cwq> $$3, cmt.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bnm, bnp> $$5 = ImmutableMultimap.builder();
      $$5.put(bnr.c, new bnp(m, "Tool modifier", (double)this.c, bnp.a.a));
      $$5.put(bnr.e, new bnp(n, "Tool modifier", (double)$$1, bnp.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cmy $$0, djh $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cmy $$0, bml $$1, bml $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(bma.a));
      return true;
   }

   @Override
   public boolean a(cmy $$0, ctp $$1, djh $$2, hx $$3, bml $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bma.a));
      }

      return true;
   }

   @Override
   public Multimap<bnm, bnp> a(bma $$0) {
      return $$0 == bma.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(djh $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(ash.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(ash.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(ash.bG) ? false : $$0.a(this.a);
      }
   }
}
