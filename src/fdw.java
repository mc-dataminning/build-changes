import java.util.function.Consumer;

public class fdw implements fdx {
   public static final int a = 36;
   private static final int b = 30;
   private final fdu c = new fdu();
   private final fdu d = new fdu();
   private final fdu e = new fdu();
   private final fgh f;
   private int g;
   private int h;

   public fdw(fgh $$0) {
      this($$0, 36);
   }

   public fdw(fgh $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public fdw(fgh $$0, int $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.c.c().a(0.5F, 0.5F);
      this.d.c().a(0.5F, 0.5F);
   }

   @Override
   public void m(int $$0) {
   }

   @Override
   public void n(int $$0) {
   }

   @Override
   public int B() {
      return 0;
   }

   @Override
   public int C() {
      return 0;
   }

   @Override
   public int w() {
      return this.f.g;
   }

   @Override
   public int u() {
      return this.f.h;
   }

   public int b() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void b(int $$0) {
      this.g = $$0;
   }

   public int c() {
      return this.g;
   }

   @Override
   public void b(Consumer<fdy> $$0) {
      this.c.b($$0);
      this.e.b($$0);
      this.d.b($$0);
   }

   @Override
   public void a() {
      int $$0 = this.c();
      int $$1 = this.b();
      this.c.b(this.f.g);
      this.c.a($$0);
      this.c.c(0, 0);
      this.c.a();
      this.d.b(this.f.g);
      this.d.a($$1);
      this.d.a();
      this.d.n(this.f.h - $$1);
      this.e.b(this.f.g);
      this.e.a();
      int $$2 = $$0 + 30;
      int $$3 = this.f.h - $$1 - this.e.u();
      this.e.c(0, Math.min($$2, $$3));
   }

   public <T extends fdy> T a(T $$0) {
      return this.c.a($$0);
   }

   public <T extends fdy> T a(T $$0, Consumer<fdz> $$1) {
      return this.c.a($$0, $$1);
   }

   public <T extends fdy> T b(T $$0) {
      return this.d.a($$0);
   }

   public <T extends fdy> T b(T $$0, Consumer<fdz> $$1) {
      return this.d.a($$0, $$1);
   }

   public <T extends fdy> T c(T $$0) {
      return this.e.a($$0);
   }

   public <T extends fdy> T c(T $$0, Consumer<fdz> $$1) {
      return this.e.a($$0, $$1);
   }
}
