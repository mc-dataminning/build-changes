import javax.annotation.Nullable;

public class byq {
   private final dtn a;
   private iw b;
   private int c;
   private boolean d;

   public byq(dtn $$0, iw $$1) {
      this.a = $$0;
      this.b = $$1;
      this.d = true;
   }

   public boolean a(asb $$0, bxe $$1, boolean $$2) {
      if (!this.d) {
         this.f();
         return false;
      } else {
         this.d = false;
         return $$2 && this.c++ >= this.a.a($$0, $$1);
      }
   }

   @Nullable
   public eza a(asb $$0, bxe $$1) {
      return this.a.a($$0, $$1, this.b);
   }

   public dtn.a a() {
      return this.a.b();
   }

   private void f() {
      this.c = Math.max(this.c - 4, 0);
   }

   public boolean b() {
      return this.c <= 0;
   }

   public iw c() {
      return this.b;
   }

   public void a(iw $$0) {
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

   public boolean a(dtn $$0) {
      return this.a == $$0;
   }
}
