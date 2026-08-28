import javax.annotation.Nullable;

public class bxk {
   private final drr a;
   private iu b;
   private int c;
   private boolean d;

   public bxk(drr $$0, iu $$1) {
      this.a = $$0;
      this.b = $$1;
      this.d = true;
   }

   public boolean a(aro $$0, bwa $$1, boolean $$2) {
      if (!this.d) {
         this.f();
         return false;
      } else {
         this.d = false;
         return $$2 && this.c++ >= this.a.a($$0, $$1);
      }
   }

   @Nullable
   public ewv a(aro $$0, bwa $$1) {
      return this.a.a($$0, $$1, this.b);
   }

   public drr.a a() {
      return this.a.b();
   }

   private void f() {
      this.c = Math.max(this.c - 4, 0);
   }

   public boolean b() {
      return this.c <= 0;
   }

   public iu c() {
      return this.b;
   }

   public void a(iu $$0) {
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

   public boolean a(drr $$0) {
      return this.a == $$0;
   }
}
