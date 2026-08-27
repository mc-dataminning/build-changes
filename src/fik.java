public class fik extends fjx {
   private final Runnable c;
   protected final fik.a a;
   private final wi d;
   private final boolean o;
   private fer p = fer.a;
   protected int b;
   private fea q;

   public fik(Runnable $$0, fik.a $$1, wi $$2, wi $$3, boolean $$4) {
      super($$2);
      this.c = $$0;
      this.a = $$1;
      this.d = $$3;
      this.o = $$4;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.p = fer.a(this.m, this.d, this.k - 50);
      int $$0 = (this.p.a() + 1) * 9;
      this.c(fdy.a(wi.c("selectWorld.backupJoinConfirmButton"), $$0x -> this.a.proceed(true, this.q.a())).a(this.k / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fdy.a(wi.c("selectWorld.backupJoinSkipButton"), $$0x -> this.a.proceed(false, this.q.a())).a(this.k / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fdy.a(wh.e, $$0x -> this.c.run()).a(this.k / 2 - 155 + 80, 124 + $$0, 150, 20).a());
      this.q = fea.a(wi.c("selectWorld.backupEraseCache"), this.m).a(this.k / 2 - 155 + 80, 76 + $$0).a();
      if (this.o) {
         this.c(this.q);
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 50, 16777215);
      this.p.a($$0, this.k / 2, 70);
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.c.run();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   public interface a {
      void proceed(boolean var1, boolean var2);
   }
}
