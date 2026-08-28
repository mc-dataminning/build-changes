public class fqq extends frw {
   private static final xj s = xj.c("selectWorld.backupJoinSkipButton");
   public static final xj a = xj.c("selectWorld.backupJoinConfirmButton");
   private final Runnable u;
   protected final fqq.a b;
   private final xj v;
   private final boolean w;
   private fmw x = fmw.a;
   final xj c;
   protected int d;
   private fmf y;

   public fqq(Runnable $$0, fqq.a $$1, xj $$2, xj $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, a, $$4);
   }

   public fqq(Runnable $$0, fqq.a $$1, xj $$2, xj $$3, xj $$4, boolean $$5) {
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
      this.x = fmw.a(this.p, this.v, this.n - 50);
      int $$0 = (this.x.a() + 1) * 9;
      this.y = fmf.a(xj.c("selectWorld.backupEraseCache"), this.p).a(this.n / 2 - 155 + 80, 76 + $$0).a();
      if (this.w) {
         this.c(this.y);
      }

      this.c(fmd.a(this.c, $$0x -> this.b.proceed(true, this.y.a())).a(this.n / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fmd.a(s, $$0x -> this.b.proceed(false, this.y.a())).a(this.n / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fmd.a(xi.e, $$0x -> this.u.run()).a(this.n / 2 - 155 + 80, 124 + $$0, 150, 20).a());
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
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
