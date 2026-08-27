import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlv extends dlu {
   public static final MapCodec<dlv> h = b(dlv::new);
   public static final dtw i = djc.aE;
   public static final dtt j = dlu.d;

   @Override
   public MapCodec<dlv> a() {
      return h;
   }

   protected dlv(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, iw.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return dou.m($$0);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return dou.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dfe.a.n() : $$0;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = dfe.db.a($$0);
      return $$1 == null ? null : this.n().a(i, $$1.c(i));
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$0.c(j)) {
         iw $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(kv.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dca $$0, ir $$1, dtc $$2) {
      iw $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(i, j);
   }
}
