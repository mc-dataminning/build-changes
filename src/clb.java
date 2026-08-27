import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class clb extends cof implements col {
   private final asq<cwj> a;
   protected final float b;
   private final float c;
   private final Multimap<bng, bnj> d;

   protected clb(float $$0, float $$1, coe $$2, asq<cwj> $$3, cmm.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bng, bnj> $$5 = ImmutableMultimap.builder();
      $$5.put(bnl.c, new bnj(m, "Tool modifier", (double)this.c, bnj.a.a));
      $$5.put(bnl.e, new bnj(n, "Tool modifier", (double)$$1, bnj.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cmr $$0, dja $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cmr $$0, bmf $$1, bmf $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(blu.a));
      return true;
   }

   @Override
   public boolean a(cmr $$0, cti $$1, dja $$2, hx $$3, bmf $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(blu.a));
      }

      return true;
   }

   @Override
   public Multimap<bng, bnj> a(blu $$0) {
      return $$0 == blu.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dja $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(asb.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(asb.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(asb.bG) ? false : $$0.a(this.a);
      }
   }
}
