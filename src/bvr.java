import javax.annotation.Nullable;

public class bvr {
   private final dpj a;
   private ji b;
   private int c;
   private boolean d;

   public bvr(dpj $$0, ji $$1) {
      this.a = $$0;
      this.b = $$1;
      this.d = true;
   }

   public boolean a(arc $$0, buk $$1, boolean $$2) {
      if (!this.d) {
         this.f();
         return false;
      } else {
         this.d = false;
         return $$2 && this.c++ >= this.a.a($$0, $$1);
      }
   }

   @Nullable
   public etz a(arc $$0, buk $$1) {
      return this.a.a($$0, $$1, this.b);
   }

   public dpj.a a() {
      return this.a.b();
   }

   private void f() {
      this.c = Math.max(this.c - 4, 0);
   }

   public boolean b() {
      return this.c <= 0;
   }

   public ji c() {
      return this.b;
   }

   public void a(ji $$0) {
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

   public boolean a(dpj $$0) {
      return this.a == $$0;
   }
}
