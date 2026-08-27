import javax.annotation.Nullable;

public class frc implements cpa {
   private final int c;
   private final int d;
   protected final frb[][] a;
   protected final cpx b;

   frc(cpx $$0, int $$1, int $$2, frb[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dfl a_(gw $$0) {
      int $$1 = hz.a($$0.u()) - this.c;
      int $$2 = hz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public eao b_(gw $$0) {
      int $$1 = hz.a($$0.u()) - this.c;
      int $$2 = hz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(hc $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public ead x_() {
      return this.b.x_();
   }

   @Nullable
   @Override
   public dcx c_(gw $$0) {
      int $$1 = hz.a($$0.u()) - this.c;
      int $$2 = hz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(gw $$0, cpi $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public int H_() {
      return this.b.H_();
   }

   @Override
   public int I_() {
      return this.b.I_();
   }
}
