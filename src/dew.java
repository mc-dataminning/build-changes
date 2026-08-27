import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dew extends dev {
   public static final MapCodec<dew> h = b(dew::new);
   public static final dmd i = dcn.aE;
   public static final dma j = dev.d;

   @Override
   public MapCodec<dew> a() {
      return h;
   }

   protected dew(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ie.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return dhs.m($$0);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return dhs.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? cyu.a.o() : $$0;
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      dlj $$1 = cyu.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if ($$0.c(j)) {
         ie $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(jt.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(cvr $$0, hz $$1, dlj $$2) {
      ie $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(i, j);
   }
}
