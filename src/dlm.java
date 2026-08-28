import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlm extends dll {
   public static final MapCodec<dlm> h = b(dlm::new);
   public static final dte i = djd.aE;
   public static final dtb j = dll.d;

   @Override
   public MapCodec<dlm> a() {
      return h;
   }

   protected dlm(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, jf.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return doj.m($$0);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return doj.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dfj.a.o() : $$0;
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = dfj.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
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
   protected boolean a(dcf $$0, ja $$1, dsk $$2) {
      jf $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(i, j);
   }
}
