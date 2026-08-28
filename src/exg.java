import java.util.Optional;
import javax.annotation.Nullable;

public abstract class exg extends ewy {
   @Override
   public ewz d() {
      return exb.b;
   }

   @Override
   public ewz e() {
      return exb.c;
   }

   @Override
   public czj a() {
      return czr.rp;
   }

   @Override
   public void a(djm $$0, iv $$1, exa $$2, azv $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.Dg, awo.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(ly.ao, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lw h() {
      return ly.l;
   }

   @Override
   protected boolean a(arq $$0) {
      return $$0.O().c(dji.W);
   }

   @Override
   protected void a(djn $$0, iv $$1, eat $$2) {
      dxr $$3 = $$2.x() ? $$0.c_($$1) : null;
      dmr.a($$2, $$0, $$1, $$3);
   }

   @Override
   protected void a(djm $$0, iv $$1, bwi $$2, bxb $$3) {
      $$3.a(bxc.d);
   }

   @Override
   public int b(djp $$0) {
      return 4;
   }

   @Override
   public eat b(exa $$0) {
      return dmt.J.m().b(drn.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ewz $$0) {
      return $$0 == exb.c || $$0 == exb.b;
   }

   @Override
   public int c(djp $$0) {
      return 1;
   }

   @Override
   public int a(djp $$0) {
      return 5;
   }

   @Override
   public boolean a(exa $$0, diq $$1, iv $$2, ewz $$3, jb $$4) {
      return $$4 == jb.a && !$$3.a(axh.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awm> j() {
      return Optional.of(awn.dj);
   }

   public static class a extends exg {
      @Override
      protected void a(eau.a<ewz, exa> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(exa $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(exa $$0) {
         return false;
      }
   }

   public static class b extends exg {
      @Override
      public int d(exa $$0) {
         return 8;
      }

      @Override
      public boolean c(exa $$0) {
         return true;
      }
   }
}
