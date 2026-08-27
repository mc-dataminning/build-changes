public class ffu extends fhh {
   private final Runnable c;
   protected final ffu.a a;
   private final vu k;
   private final boolean l;
   private fcb m = fcb.a;
   protected int b;
   private fbk n;

   public ffu(Runnable $$0, ffu.a $$1, vu $$2, vu $$3, boolean $$4) {
      super($$2);
      this.c = $$0;
      this.a = $$1;
      this.k = $$3;
      this.l = $$4;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.m = fcb.a(this.i, this.k, this.g - 50);
      int $$0 = (this.m.a() + 1) * 9;
      this.c(fbi.a(vu.c("selectWorld.backupJoinConfirmButton"), $$0x -> this.a.proceed(true, this.n.a())).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fbi.a(vu.c("selectWorld.backupJoinSkipButton"), $$0x -> this.a.proceed(false, this.n.a())).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fbi.a(vt.e, $$0x -> this.c.run()).a(this.g / 2 - 155 + 80, 124 + $$0, 150, 20).a());
      this.n = fbk.a(vu.c("selectWorld.backupEraseCache"), this.i).a(this.g / 2 - 155 + 80, 76 + $$0).a();
      if (this.l) {
         this.c(this.n);
      }
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      this.m.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean aM_() {
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
