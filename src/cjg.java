import javax.annotation.Nullable;

public class cjg extends btz {
   public final cjj b;
   public final String c;
   private final buc d;

   public cjg(cjj $$0, String $$1, float $$2, float $$3) {
      super($$0.aq(), $$0.dX());
      this.d = buc.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(ako.a $$0) {
   }

   @Override
   protected void a(uj $$0) {
   }

   @Override
   protected void b(uj $$0) {
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Nullable
   @Override
   public cvx dK() {
      return this.b.dK();
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean u(btz $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zo<acd> a(arl $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public buc a(bvh $$0) {
      return this.d;
   }

   @Override
   public boolean dV() {
      return false;
   }
}
