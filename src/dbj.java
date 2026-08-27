import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbj extends dbi {
   public static final MapCodec<dbj> h = b(dbj::new);
   public static final dih i = cza.aE;
   public static final die j = dbi.d;

   @Override
   public MapCodec<dbj> a() {
      return h;
   }

   protected dbj(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ib.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return dee.h($$0);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return cvh.cq.a($$0, $$1, $$2);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return cvh.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = cvh.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$0.c(j)) {
         ib $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(jq.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(csf $$0, hx $$1, dhn $$2) {
      ib $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return cvh.cq.a($$0, $$1);
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return cvh.cq.a($$0, $$1);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(i, j);
   }
}
