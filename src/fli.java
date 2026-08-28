import javax.annotation.Nullable;

public record fli(flh a, int b, int c) {
   private static final fli d = new fli(0, 0, 0, 0);

   public fli(int $$0, int $$1, int $$2, int $$3) {
      this(new flh($$0, $$1), $$2, $$3);
   }

   public static fli a() {
      return d;
   }

   public static fli a(flf $$0, int $$1, int $$2, int $$3, int $$4) {
      return switch ($$0) {
         case a -> new fli($$1, $$2, $$3, $$4);
         case b -> new fli($$2, $$1, $$4, $$3);
      };
   }

   public fli a(flg $$0) {
      return new fli(this.a.a($$0), this.b, this.c);
   }

   public int a(flf $$0) {
      return switch ($$0) {
         case a -> this.b;
         case b -> this.c;
      };
   }

   public int b(flg $$0) {
      flf $$1 = $$0.a();
      return $$0.c() ? this.a.a($$1) + this.a($$1) - 1 : this.a.a($$1);
   }

   public fli c(flg $$0) {
      int $$1 = this.b($$0);
      flf $$2 = $$0.a().a();
      int $$3 = this.b($$2.c());
      int $$4 = this.a($$2);
      return a($$0.a(), $$1, $$3, 1, $$4).a($$0);
   }

   public boolean a(fli $$0) {
      return this.a($$0, flf.a) && this.a($$0, flf.b);
   }

   public boolean a(fli $$0, flf $$1) {
      int $$2 = this.b($$1.c());
      int $$3 = $$0.b($$1.c());
      int $$4 = this.b($$1.b());
      int $$5 = $$0.b($$1.b());
      return Math.max($$2, $$3) <= Math.min($$4, $$5);
   }

   public int b(flf $$0) {
      return (this.b($$0.b()) + this.b($$0.c())) / 2;
   }

   @Nullable
   public fli b(fli $$0) {
      int $$1 = Math.max(this.d(), $$0.d());
      int $$2 = Math.max(this.b(), $$0.b());
      int $$3 = Math.min(this.e(), $$0.e());
      int $$4 = Math.min(this.c(), $$0.c());
      return $$1 < $$3 && $$2 < $$4 ? new fli($$1, $$2, $$3 - $$1, $$4 - $$2) : null;
   }

   public int b() {
      return this.a.b();
   }

   public int c() {
      return this.a.b() + this.c;
   }

   public int d() {
      return this.a.a();
   }

   public int e() {
      return this.a.a() + this.b;
   }

   public boolean a(int $$0, int $$1) {
      return $$0 >= this.d() && $$0 < this.e() && $$1 >= this.b() && $$1 < this.c();
   }

   public flh f() {
      return this.a;
   }

   public int g() {
      return this.b;
   }

   public int h() {
      return this.c;
   }
}
