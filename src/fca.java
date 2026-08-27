public class fca extends fdm {
   private final Runnable c;
   protected final fca.a a;
   private final vg k;
   private final boolean l;
   private eyk m = eyk.a;
   protected int b;
   private ext n;

   public fca(Runnable $$0, fca.a $$1, vg $$2, vg $$3, boolean $$4) {
      super($$2);
      this.c = $$0;
      this.a = $$1;
      this.k = $$3;
      this.l = $$4;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.m = eyk.a(this.i, this.k, this.g - 50);
      int $$0 = (this.m.a() + 1) * 9;
      this.d(exr.a(vg.c("selectWorld.backupJoinConfirmButton"), $$0x -> this.a.proceed(true, this.n.a())).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(exr.a(vg.c("selectWorld.backupJoinSkipButton"), $$0x -> this.a.proceed(false, this.n.a())).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.d(exr.a(vf.e, $$0x -> this.c.run()).a(this.g / 2 - 155 + 80, 124 + $$0, 150, 20).a());
      this.n = ext.a(vg.c("selectWorld.backupEraseCache"), this.i).a(this.g / 2 - 155 + 80, 76 + $$0).a();
      if (this.l) {
         this.d(this.n);
      }
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      this.m.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean aN_() {
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
