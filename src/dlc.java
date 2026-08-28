import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlc extends dlb {
   public static final MapCodec<dlc> h = b(dlc::new);
   public static final dsu i = dit.aE;
   public static final dsr j = dlb.d;

   @Override
   public MapCodec<dlc> a() {
      return h;
   }

   protected dlc(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, je.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return dnz.m($$0);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return dnz.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dez.a.o() : $$0;
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = dez.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
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
   protected boolean a(dbw $$0, iz $$1, dsa $$2) {
      je $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(i, j);
   }
}
