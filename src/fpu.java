public class fpu extends fra {
   private static final xi s = xi.c("selectWorld.backupJoinSkipButton");
   public static final xi a = xi.c("selectWorld.backupJoinConfirmButton");
   private final Runnable u;
   protected final fpu.a b;
   private final xi v;
   private final boolean w;
   private fma x = fma.a;
   final xi c;
   protected int d;
   private flj y;

   public fpu(Runnable $$0, fpu.a $$1, xi $$2, xi $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, a, $$4);
   }

   public fpu(Runnable $$0, fpu.a $$1, xi $$2, xi $$3, xi $$4, boolean $$5) {
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
      this.x = fma.a(this.p, this.v, this.n - 50);
      int $$0 = (this.x.a() + 1) * 9;
      this.y = flj.a(xi.c("selectWorld.backupEraseCache"), this.p).a(this.n / 2 - 155 + 80, 76 + $$0).a();
      if (this.w) {
         this.c(this.y);
      }

      this.c(flh.a(this.c, $$0x -> this.b.proceed(true, this.y.a())).a(this.n / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(flh.a(s, $$0x -> this.b.proceed(false, this.y.a())).a(this.n / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(flh.a(xh.e, $$0x -> this.u.run()).a(this.n / 2 - 155 + 80, 124 + $$0, 150, 20).a());
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      this.x.a($$0, this.n / 2, 70);
   }

   @Override
   public boolean aH_() {
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
