import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlg extends dlf {
   public static final MapCodec<dlg> h = b(dlg::new);
   public static final dsy i = dix.aE;
   public static final dsv j = dlf.d;

   @Override
   public MapCodec<dlg> a() {
      return h;
   }

   protected dlg(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, je.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return dod.m($$0);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return dod.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dfd.a.o() : $$0;
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      dse $$1 = dfd.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      if ($$0.c(j)) {
         je $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(ld.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dca $$0, iz $$1, dse $$2) {
      je $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(i, j);
   }
}
