import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ewb extends evt {
   @Override
   public evu d() {
      return evw.b;
   }

   @Override
   public evu e() {
      return evw.c;
   }

   @Override
   public cyo a() {
      return cyw.rk;
   }

   @Override
   public void a(dip $$0, iu $$1, evv $$2, azt $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awl.Da, awm.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lx.ao, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lv h() {
      return lx.l;
   }

   @Override
   protected boolean a(aro $$0) {
      return $$0.O().c(dil.V);
   }

   @Override
   protected void a(diq $$0, iu $$1, dzo $$2) {
      dwn $$3 = $$2.x() ? $$0.c_($$1) : null;
      dlu.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dis $$0) {
      return 4;
   }

   @Override
   public dzo b(evv $$0) {
      return dlw.J.m().b(dqo.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(evu $$0) {
      return $$0 == evw.c || $$0 == evw.b;
   }

   @Override
   public int c(dis $$0) {
      return 1;
   }

   @Override
   public int a(dis $$0) {
      return 5;
   }

   @Override
   public boolean a(evv $$0, dhv $$1, iu $$2, evu $$3, ja $$4) {
      return $$4 == ja.a && !$$3.a(axf.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awk> j() {
      return Optional.of(awl.dj);
   }

   public static class a extends ewb {
      @Override
      protected void a(dzp.a<evu, evv> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(evv $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(evv $$0) {
         return false;
      }
   }

   public static class b extends ewb {
      @Override
      public int d(evv $$0) {
         return 8;
      }

      @Override
      public boolean c(evv $$0) {
         return true;
      }
   }
}
