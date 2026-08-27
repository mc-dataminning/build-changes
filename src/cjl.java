import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class cjl extends cmp implements cmv {
   private final arr<cut> a;
   protected final float b;
   private final float c;
   private final Multimap<blz, bmc> d;

   protected cjl(float $$0, float $$1, cmo $$2, arr<cut> $$3, ckw.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<blz, bmc> $$5 = ImmutableMultimap.builder();
      $$5.put(bme.c, new bmc(m, "Tool modifier", (double)this.c, bmc.a.a));
      $$5.put(bme.e, new bmc(n, "Tool modifier", (double)$$1, bmc.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(clb $$0, dgw $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(clb $$0, bky $$1, bky $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(bkn.a));
      return true;
   }

   @Override
   public boolean a(clb $$0, crs $$1, dgw $$2, ht $$3, bky $$4) {
      if (!$$1.B && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bkn.a));
      }

      return true;
   }

   @Override
   public Multimap<blz, bmc> a(bkn $$0) {
      return $$0 == bkn.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(dgw $$0) {
      int $$1 = this.i().d();
      if ($$1 < 3 && $$0.a(arc.bE)) {
         return false;
      } else if ($$1 < 2 && $$0.a(arc.bF)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(arc.bG) ? false : $$0.a(this.a);
      }
   }
}
