import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class des extends der {
   public static final MapCodec<des> h = b(des::new);
   public static final dlz i = dcj.aE;
   public static final dlw j = der.d;

   @Override
   public MapCodec<des> a() {
      return h;
   }

   protected des(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ie.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return dho.m($$0);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return dho.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? cyq.a.o() : $$0;
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      dlf $$1 = cyq.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
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
   protected boolean a(cvn $$0, hz $$1, dlf $$2) {
      ie $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(i, j);
   }
}
