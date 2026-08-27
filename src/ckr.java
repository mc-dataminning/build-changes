import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class ckr extends cnv implements cob {
   private final asg<cvz> a;
   protected final float b;
   private final float c;
   private final Multimap<bmw, bmz> d;

   protected ckr(float $$0, float $$1, cnu $$2, asg<cvz> $$3, cmc.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bmw, bmz> $$5 = ImmutableMultimap.builder();
      $$5.put(bnb.c, new bmz(m, "Tool modifier", (double)this.c, bmz.a.a));
      $$5.put(bnb.e, new bmz(n, "Tool modifier", (double)$$1, bmz.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cmh $$0, dip $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cmh $$0, blv $$1, blv $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(blk.a));
      return true;
   }

   @Override
   public boolean a(cmh $$0, csy $$1, dip $$2, hv $$3, blv $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(blk.a));
      }

      return true;
   }

   @Override
   public Multimap<bmw, bmz> a(blk $$0) {
      return $$0 == blk.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dip $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(arr.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(arr.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(arr.bG) ? false : $$0.a(this.a);
      }
   }
}
