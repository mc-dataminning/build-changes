import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dln extends dlm {
   public static final MapCodec<dln> h = b(dln::new);
   public static final dtf i = dje.aE;
   public static final dtc j = dlm.d;

   @Override
   public MapCodec<dln> a() {
      return h;
   }

   protected dln(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, jf.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return dok.m($$0);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return dok.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dfk.a.o() : $$0;
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = dfk.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$0.c(j)) {
         jf $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(le.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dcg $$0, ja $$1, dsl $$2) {
      jf $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(i, j);
   }
}
