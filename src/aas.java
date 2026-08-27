import javax.annotation.Nullable;

public class aas implements vd<ww> {
   private final int a;
   @Nullable
   private final qw b;

   public aas(int $$0, @Nullable qw $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aas(so $$0) {
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
   public qw d() {
      return this.b;
   }

   @Override
   public boolean b() {
      return true;
   }
}
