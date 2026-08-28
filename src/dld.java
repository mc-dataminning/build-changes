import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dld extends dlc {
   public static final MapCodec<dld> h = b(dld::new);
   public static final dsv i = diu.aE;
   public static final dss j = dlc.d;

   @Override
   public MapCodec<dld> a() {
      return h;
   }

   protected dld(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, je.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return doa.m($$0);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return doa.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dfa.a.o() : $$0;
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = dfa.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
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
   protected boolean a(dbx $$0, iz $$1, dsb $$2) {
      je $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(i, j);
   }
}
