import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class chr extends ckv implements clb {
   private final aqj<csx> a;
   protected final float b;
   private final float c;
   private final Multimap<bkj, bkm> d;

   protected chr(float $$0, float $$1, cku $$2, aqj<csx> $$3, cjc.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bkj, bkm> $$5 = ImmutableMultimap.builder();
      $$5.put(bko.f, new bkm(m, "Tool modifier", (double)this.c, bkm.a.a));
      $$5.put(bko.h, new bkm(n, "Tool modifier", (double)$$1, bkm.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cjh $$0, dfl $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cjh $$0, bji $$1, bji $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(bix.a));
      return true;
   }

   @Override
   public boolean a(cjh $$0, cpx $$1, dfl $$2, gw $$3, bji $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bix.a));
      }

      return true;
   }

   @Override
   public Multimap<bkj, bkm> a(bix $$0) {
      return $$0 == bix.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dfl $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(apu.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(apu.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(apu.bG) ? false : $$0.a(this.a);
      }
   }
}
