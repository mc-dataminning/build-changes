import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class coc extends cof implements col {
   private final float a;
   private final Multimap<bng, bnj> b;

   public coc(coe $$0, int $$1, float $$2, cmm.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bng, bnj> $$4 = ImmutableMultimap.builder();
      $$4.put(bnl.c, new bnj(m, "Weapon modifier", (double)this.a, bnj.a.a));
      $$4.put(bnl.e, new bnj(n, "Weapon modifier", (double)$$2, bnj.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dja $$0, cti $$1, hx $$2, cfb $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cmr $$0, dja $$1) {
      if ($$1.a(cwl.bs)) {
         return 15.0F;
      } else {
         return $$1.a(asb.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cmr $$0, bmf $$1, bmf $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(blu.a));
      return true;
   }

   @Override
   public boolean a(cmr $$0, cti $$1, dja $$2, hx $$3, bmf $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(blu.a));
      }

      return true;
   }

   @Override
   public boolean a_(dja $$0) {
      return $$0.a(cwl.bs);
   }

   @Override
   public Multimap<bng, bnj> a(blu $$0) {
      return $$0 == blu.a ? this.b : super.a($$0);
   }
}
