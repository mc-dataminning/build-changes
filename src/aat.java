import javax.annotation.Nullable;

public class aat implements vd<ww> {
   private final int a;
   @Nullable
   private final qx b;

   public aat(int $$0, @Nullable qx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aat(so $$0) {
      this.a = $$0.m();
      this.b = $$0.p();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a((rq)this.b);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public qx d() {
      return this.b;
   }

   @Override
   public boolean b() {
      return true;
   }
}
