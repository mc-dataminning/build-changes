public class ftf extends ful {
   private static final wp s = wp.c("selectWorld.backupJoinSkipButton");
   public static final wp a = wp.c("selectWorld.backupJoinConfirmButton");
   private final Runnable u;
   protected final ftf.a b;
   private final wp v;
   private final boolean w;
   private fpm x = fpm.a;
   final wp c;
   protected int d;
   private fov y;

   public ftf(Runnable $$0, ftf.a $$1, wp $$2, wp $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, a, $$4);
   }

   public ftf(Runnable $$0, ftf.a $$1, wp $$2, wp $$3, wp $$4, boolean $$5) {
      super($$2);
      this.u = $$0;
      this.b = $$1;
      this.v = $$3;
      this.w = $$5;
      this.c = $$4;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.x = fpm.a(this.p, this.v, this.n - 50);
      int $$0 = (this.x.a() + 1) * 9;
      this.y = fov.a(wp.c("selectWorld.backupEraseCache"), this.p).a(this.n / 2 - 155 + 80, 76 + $$0).a();
      if (this.w) {
         this.c(this.y);
      }

      this.c(fot.a(this.c, $$0x -> this.b.proceed(true, this.y.a())).a(this.n / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fot.a(s, $$0x -> this.b.proceed(false, this.y.a())).a(this.n / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fot.a(wo.e, $$0x -> this.u.run()).a(this.n / 2 - 155 + 80, 124 + $$0, 150, 20).a());
   }

   @Override
   public void a(foe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      this.x.a($$0, this.n / 2, 70);
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.u.run();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   public interface a {
      void proceed(boolean var1, boolean var2);
   }
}
