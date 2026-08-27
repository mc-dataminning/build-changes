import com.google.common.annotations.VisibleForTesting;

public class dos extends dnm implements dvc.b<dos.a> {
   private final dos.a a;

   public dos(in $$0, dqh $$1) {
      super(dno.K, $$0, $$1);
      this.a = new dos.a($$1, new duw($$0));
   }

   public static void a(dad $$0, in $$1, dqh $$2, dos $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dos.a b() {
      return this.a;
   }

   public static class a implements dvc {
      public static final int a = 8;
      final djz b;
      private final dqh c;
      private final dve d;

      public a(dqh $$0, dve $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = djz.a();
      }

      @Override
      public dve a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dvc.a c() {
         return dvc.a.b;
      }

      @Override
      public boolean a(aqh $$0, iw<dva> $$1, dva.a $$2, etp $$3) {
         if ($$1.a(dva.p) && $$2.a() instanceof bsa $$4) {
            if (!$$4.eG()) {
               int $$5 = $$4.eh();
               if ($$4.ef() && $$5 > 0) {
                  this.b.a(in.a($$3.a(is.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eF();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, in.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public djz d() {
         return this.b;
      }

      private void a(aqh $$0, in $$1, dqh $$2, ayg $$3) {
         $$0.a($$1, $$2.a(djw.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(kx.G, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, avc.vM, avd.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dad $$0, bsa $$1) {
         if ($$1.ek() instanceof aqi $$3) {
            bqf $$4 = $$1.eA() == null ? $$0.ai().a((clh)$$3) : $$1.eA();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
