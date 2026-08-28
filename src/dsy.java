import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsy extends dsx {
   public static final MapCodec<dsy> f = b(dsy::new);
   public static final ebm<jb> g = dqn.e;
   public static final ebf h = dsx.b;

   @Override
   public MapCodec<dsy> a() {
      return f;
   }

   protected dsy(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(g, jb.c).b(h, Boolean.valueOf(true)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return dwf.o($$0);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return dwf.b($$1, $$2, $$0.c(g));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dmo.a.m() : $$0;
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      eao $$1 = dmo.cA.a($$0);
      return $$1 == null ? null : this.m().b(g, $$1.c(g));
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if ($$0.c(h)) {
         jb $$4 = $$0.c(g).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(lt.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(djh $$0, iv $$1, eao $$2) {
      jb $$3 = $$2.c(g).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$0.c(h) && $$0.c(g) != $$3 ? 15 : 0;
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(g, h);
   }

   @Nullable
   @Override
   protected eyd a(djh $$0, eao $$1) {
      return exz.a($$0, $$1.c(g).g(), jb.b);
   }
}
