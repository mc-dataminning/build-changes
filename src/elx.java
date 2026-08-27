import java.util.Optional;
import javax.annotation.Nullable;

public abstract class elx extends elp {
   @Override
   public elq d() {
      return els.b;
   }

   @Override
   public elq e() {
      return els.c;
   }

   @Override
   public cry a() {
      return csg.qz;
   }

   @Override
   public void a(czu $$0, im $$1, elr $$2, ayd $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, auz.BM, ava.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(kw.ai, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public ku h() {
      return kw.l;
   }

   @Override
   protected boolean a(czu $$0) {
      return $$0.aa().b(czq.U);
   }

   @Override
   protected void a(czv $$0, im $$1, dpy $$2) {
      dnd $$3 = $$2.t() ? $$0.c_($$1) : null;
      dcv.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(czx $$0) {
      return 4;
   }

   @Override
   public dpy b(elr $$0) {
      return dcx.G.n().a(dhl.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(elq $$0) {
      return $$0 == els.c || $$0 == els.b;
   }

   @Override
   public int c(czx $$0) {
      return 1;
   }

   @Override
   public int a(czx $$0) {
      return 5;
   }

   @Override
   public boolean a(elr $$0, cza $$1, im $$2, elq $$3, ir $$4) {
      return $$4 == ir.a && !$$3.a(avt.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<auy> j() {
      return Optional.of(auz.di);
   }

   public static class a extends elx {
      @Override
      protected void a(dpz.a<elq, elr> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(elr $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(elr $$0) {
         return false;
      }
   }

   public static class b extends elx {
      @Override
      public int d(elr $$0) {
         return 8;
      }

      @Override
      public boolean c(elr $$0) {
         return true;
      }
   }
}
