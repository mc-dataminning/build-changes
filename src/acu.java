import javax.annotation.Nullable;

public class acu implements xd<yx> {
   private final int a;
   @Nullable
   private final sl b;

   public acu(int $$0, @Nullable sl $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public acu(ug $$0) {
      this.a = $$0.n();
      this.b = $$0.q();
   }

   @Override
   public void a(ug $$0) {
      $$0.c(this.a);
      $$0.a((ti)this.b);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public sl d() {
      return this.b;
   }

   @Override
   public boolean b() {
      return true;
   }
}
