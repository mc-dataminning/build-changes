import javax.annotation.Nullable;

public class fra implements coy {
   private final int c;
   private final int d;
   protected final fqz[][] a;
   protected final cpv b;

   fra(cpv $$0, int $$1, int $$2, fqz[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dfj a_(gw $$0) {
      int $$1 = hw.a($$0.u()) - this.c;
      int $$2 = hw.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public eam b_(gw $$0) {
      int $$1 = hw.a($$0.u()) - this.c;
      int $$2 = hw.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(ha $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public eab x_() {
      return this.b.x_();
   }

   @Nullable
   @Override
   public dcv c_(gw $$0) {
      int $$1 = hw.a($$0.u()) - this.c;
      int $$2 = hw.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(gw $$0, cpg $$1) {
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
