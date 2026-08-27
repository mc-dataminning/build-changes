import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cns extends cnv implements cob {
   private final float a;
   private final Multimap<bmw, bmz> b;

   public cns(cnu $$0, int $$1, float $$2, cmc.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bmw, bmz> $$4 = ImmutableMultimap.builder();
      $$4.put(bnb.c, new bmz(m, "Weapon modifier", (double)this.a, bmz.a.a));
      $$4.put(bnb.e, new bmz(n, "Weapon modifier", (double)$$2, bmz.a.a));
      this.b = $$4.build();
   }

   public float h() {
      return this.a;
   }

   @Override
   public boolean a(dip $$0, csy $$1, hv $$2, cer $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cmh $$0, dip $$1) {
      if ($$1.a(cwb.bs)) {
         return 15.0F;
      } else {
         return $$1.a(arr.bD) ? 1.5F : 1.0F;
      }
   }

   @Override
   public boolean a(cmh $$0, blv $$1, blv $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(blk.a));
      return true;
   }

   @Override
   public boolean a(cmh $$0, csy $$1, dip $$2, hv $$3, blv $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(blk.a));
      }

      return true;
   }

   @Override
   public boolean a_(dip $$0) {
      return $$0.a(cwb.bs);
   }

   @Override
   public Multimap<bmw, bmz> a(blk $$0) {
      return $$0 == blk.a ? this.b : super.a($$0);
   }
}
