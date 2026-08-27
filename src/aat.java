import javax.annotation.Nullable;

public class aat implements ve<wx> {
   private final int a;
   @Nullable
   private final qy b;

   public aat(int $$0, @Nullable qy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aat(sp $$0) {
      this.a = $$0.m();
      this.b = $$0.p();
   }

   @Override
   public void a(sp $$0) {
      $$0.c(this.a);
      $$0.a((rr)this.b);
   }

   public void a(wx $$0) {
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
