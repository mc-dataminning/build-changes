import javax.annotation.Nullable;

public class aau implements vf<wy> {
   private final int a;
   @Nullable
   private final qy b;

   public aau(int $$0, @Nullable qy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aau(sq $$0) {
      this.a = $$0.m();
      this.b = $$0.p();
   }

   @Override
   public void a(sq $$0) {
      $$0.c(this.a);
      $$0.a((rs)this.b);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public qy d() {
      return this.b;
   }

   @Override
   public boolean b() {
      return true;
   }
}
