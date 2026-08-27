public class exa extends eym {
   private final eym c;
   protected final exa.a a;
   private final tn k;
   private final boolean l;
   private etl m = etl.a;
   protected int b;
   private esu n;

   public exa(eym $$0, exa.a $$1, tn $$2, tn $$3, boolean $$4) {
      super($$2);
      this.c = $$0;
      this.a = $$1;
      this.k = $$3;
      this.l = $$4;
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.m = etl.a(this.i, this.k, this.g - 50);
      int $$0 = (this.m.a() + 1) * 9;
      this.d(ess.a(tn.c("selectWorld.backupJoinConfirmButton"), $$0x -> this.a.proceed(true, this.n.a())).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(ess.a(tn.c("selectWorld.backupJoinSkipButton"), $$0x -> this.a.proceed(false, this.n.a())).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.d(ess.a(tm.e, $$0x -> this.f.a(this.c)).a(this.g / 2 - 155 + 80, 124 + $$0, 150, 20).a());
      this.n = new esu(this.g / 2 - 155 + 80, 76 + $$0, 150, 20, tn.c("selectWorld.backupEraseCache"), false);
      if (this.l) {
         this.d(this.n);
      }
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      this.m.a($$0, this.g / 2, 70);
   }

   @Override
   public boolean ay_() {
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
