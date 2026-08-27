import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cjt extends cmx implements cnd {
   private final arv<cva> a;
   protected final float b;
   private final float c;
   private final Multimap<bmh, bmk> d;

   protected cjt(float $$0, float $$1, cmw $$2, arv<cva> $$3, cle.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bmh, bmk> $$5 = ImmutableMultimap.builder();
      $$5.put(bmm.c, new bmk(m, "Tool modifier", (double)this.c, bmk.a.a));
      $$5.put(bmm.e, new bmk(n, "Tool modifier", (double)$$1, bmk.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(clj $$0, dhi $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(clj $$0, blg $$1, blg $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(bkv.a));
      return true;
   }

   @Override
   public boolean a(clj $$0, csa $$1, dhi $$2, ht $$3, blg $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bkv.a));
      }

      return true;
   }

   @Override
   public Multimap<bmh, bmk> a(bkv $$0) {
      return $$0 == bkv.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dhi $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(arg.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(arg.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(arg.bG) ? false : $$0.a(this.a);
      }
   }
}
