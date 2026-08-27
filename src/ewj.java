public class ewj extends exv {
   private final exv c;
   protected final ewj.a a;
   private final te k;
   private final boolean l;
   private etb m = etb.a;
   protected int b;
   private esk n;

   public ewj(exv $$0, ewj.a $$1, te $$2, te $$3, boolean $$4) {
      super($$2);
      this.c = $$0;
      this.a = $$1;
      this.k = $$3;
      this.l = $$4;
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.m = etb.a(this.i, this.k, this.g - 50);
      int $$0 = (this.m.a() + 1) * 9;
      this.d(esi.a(te.c("selectWorld.backupJoinConfirmButton"), $$0x -> this.a.proceed(true, this.n.a())).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(esi.a(te.c("selectWorld.backupJoinSkipButton"), $$0x -> this.a.proceed(false, this.n.a())).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.d(esi.a(td.e, $$0x -> this.f.a(this.c)).a(this.g / 2 - 155 + 80, 124 + $$0, 150, 20).a());
      this.n = new esk(this.g / 2 - 155 + 80, 76 + $$0, 150, 20, te.c("selectWorld.backupEraseCache"), false);
      if (this.l) {
         this.d(this.n);
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      this.m.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean aA_() {
      return false;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.c);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   public interface a {
      void proceed(boolean var1, boolean var2);
   }
}
