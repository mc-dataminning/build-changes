import javax.annotation.Nullable;

public class aam implements ux<wp> {
   private final int a;
   @Nullable
   private final qr b;

   public aam(int $$0, @Nullable qr $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aam(si $$0) {
      this.a = $$0.m();
      this.b = $$0.p();
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.a((rk)this.b);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public qr d() {
      return this.b;
   }

   @Override
   public boolean b() {
      return true;
   }
}
