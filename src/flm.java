import javax.annotation.Nullable;

public record flm(fll a, int b, int c) {
   private static final flm d = new flm(0, 0, 0, 0);

   public flm(int $$0, int $$1, int $$2, int $$3) {
      this(new fll($$0, $$1), $$2, $$3);
   }

   public static flm a() {
      return d;
   }

   public static flm a(flj $$0, int $$1, int $$2, int $$3, int $$4) {
      return switch ($$0) {
         case a -> new flm($$1, $$2, $$3, $$4);
         case b -> new flm($$2, $$1, $$4, $$3);
      };
   }

   public flm a(flk $$0) {
      return new flm(this.a.a($$0), this.b, this.c);
   }

   public int a(flj $$0) {
      return switch ($$0) {
         case a -> this.b;
         case b -> this.c;
      };
   }

   public int b(flk $$0) {
      flj $$1 = $$0.a();
      return $$0.c() ? this.a.a($$1) + this.a($$1) - 1 : this.a.a($$1);
   }

   public flm c(flk $$0) {
      int $$1 = this.b($$0);
      flj $$2 = $$0.a().a();
      int $$3 = this.b($$2.c());
      int $$4 = this.a($$2);
      return a($$0.a(), $$1, $$3, 1, $$4).a($$0);
   }

   public boolean a(flm $$0) {
      return this.a($$0, flj.a) && this.a($$0, flj.b);
   }

   public boolean a(flm $$0, flj $$1) {
      int $$2 = this.b($$1.c());
      int $$3 = $$0.b($$1.c());
      int $$4 = this.b($$1.b());
      int $$5 = $$0.b($$1.b());
      return Math.max($$2, $$3) <= Math.min($$4, $$5);
   }

   public int b(flj $$0) {
      return (this.b($$0.b()) + this.b($$0.c())) / 2;
   }

   @Nullable
   public flm b(flm $$0) {
      int $$1 = Math.max(this.d(), $$0.d());
      int $$2 = Math.max(this.b(), $$0.b());
      int $$3 = Math.min(this.e(), $$0.e());
      int $$4 = Math.min(this.c(), $$0.c());
      return $$1 < $$3 && $$2 < $$4 ? new flm($$1, $$2, $$3 - $$1, $$4 - $$2) : null;
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

   public fll f() {
      return this.a;
   }

   public int g() {
      return this.b;
   }

   public int h() {
      return this.c;
   }
}
