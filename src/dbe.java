import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbe extends dbd {
   public static final MapCodec<dbe> h = b(dbe::new);
   public static final dic i = cyv.aE;
   public static final dhz j = dbd.d;

   @Override
   public MapCodec<dbe> a() {
      return h;
   }

   protected dbe(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, hx.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return ddz.h($$0);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return cvc.cq.a($$0, $$1, $$2);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return cvc.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = cvc.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$0.c(j)) {
         hx $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(jm.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(csa $$0, ht $$1, dhi $$2) {
      hx $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return cvc.cq.a($$0, $$1);
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return cvc.cq.a($$0, $$1);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(i, j);
   }
}
