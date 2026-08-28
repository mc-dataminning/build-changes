import javax.annotation.Nullable;

public class bxc {
   private final dqr a;
   private jj b;
   private int c;
   private boolean d;

   public bxc(dqr $$0, jj $$1) {
      this.a = $$0;
      this.b = $$1;
      this.d = true;
   }

   public boolean a(arn $$0, bvs $$1, boolean $$2) {
      if (!this.d) {
         this.f();
         return false;
      } else {
         this.d = false;
         return $$2 && this.c++ >= this.a.a($$0, $$1);
      }
   }

   @Nullable
   public evt a(arn $$0, bvs $$1) {
      return this.a.a($$0, $$1, this.b);
   }

   public dqr.a a() {
      return this.a.b();
   }

   private void f() {
      this.c = Math.max(this.c - 4, 0);
   }

   public boolean b() {
      return this.c <= 0;
   }

   public jj c() {
      return this.b;
   }

   public void a(jj $$0) {
      this.b = $$0;
   }

   public int d() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }

   public void a(boolean $$0) {
      this.d = $$0;
   }

   public boolean a(dqr $$0) {
      return this.a == $$0;
   }
}
