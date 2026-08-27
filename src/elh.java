import java.util.Optional;
import javax.annotation.Nullable;

public abstract class elh extends ekz {
   @Override
   public ela d() {
      return elc.b;
   }

   @Override
   public ela e() {
      return elc.c;
   }

   @Override
   public crn a() {
      return crv.qy;
   }

   @Override
   public void a(czg $$0, id $$1, elb $$2, axt $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, auo.BF, aup.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(kn.aj, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public kl h() {
      return kn.m;
   }

   @Override
   protected boolean a(czg $$0) {
      return $$0.aa().b(czc.U);
   }

   @Override
   protected void a(czh $$0, id $$1, dpi $$2) {
      dmo $$3 = $$2.t() ? $$0.c_($$1) : null;
      dch.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(czj $$0) {
      return 4;
   }

   @Override
   public dpi b(elb $$0) {
      return dcj.G.n().a(dgw.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ela $$0) {
      return $$0 == elc.c || $$0 == elc.b;
   }

   @Override
   public int c(czj $$0) {
      return 1;
   }

   @Override
   public int a(czj $$0) {
      return 5;
   }

   @Override
   public boolean a(elb $$0, cym $$1, id $$2, ela $$3, ij $$4) {
      return $$4 == ij.a && !$$3.a(avj.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<aun> j() {
      return Optional.of(auo.di);
   }

   public static class a extends elh {
      @Override
      protected void a(dpj.a<ela, elb> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(elb $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(elb $$0) {
         return false;
      }
   }

   public static class b extends elh {
      @Override
      public int d(elb $$0) {
         return 8;
      }

      @Override
      public boolean c(elb $$0) {
         return true;
      }
   }
}
