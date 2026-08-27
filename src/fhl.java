import java.util.function.Consumer;

public class fhl implements fhm {
   public static final int a = 33;
   private static final int b = 30;
   private final fhj c = new fhj();
   private final fhj d = new fhj();
   private final fhj e = new fhj();
   private final fjx f;
   private int g;
   private int h;

   public fhl(fjx $$0) {
      this($$0, 33);
   }

   public fhl(fjx $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public fhl(fjx $$0, int $$1, int $$2) {
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
   public int C() {
      return 0;
   }

   @Override
   public int D() {
      return 0;
   }

   @Override
   public int x() {
      return this.f.k;
   }

   @Override
   public int v() {
      return this.f.l;
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

   public int d() {
      return this.f.l - this.c() - this.b();
   }

   @Override
   public void b(Consumer<fhn> $$0) {
      this.c.b($$0);
      this.e.b($$0);
      this.d.b($$0);
   }

   @Override
   public void a() {
      int $$0 = this.c();
      int $$1 = this.b();
      this.c.b(this.f.k);
      this.c.a($$0);
      this.c.c(0, 0);
      this.c.a();
      this.d.b(this.f.k);
      this.d.a($$1);
      this.d.a();
      this.d.n(this.f.l - $$1);
      this.e.b(this.f.k);
      this.e.a();
      int $$2 = $$0 + 30;
      int $$3 = this.f.l - $$1 - this.e.v();
      this.e.c(0, Math.min($$2, $$3));
   }

   public <T extends fhn> T a(T $$0) {
      return this.c.a($$0);
   }

   public <T extends fhn> T a(T $$0, Consumer<fho> $$1) {
      return this.c.a($$0, $$1);
   }

   public void a(wi $$0, fdj $$1) {
      this.c.a(new fff($$0, $$1));
   }

   public <T extends fhn> T b(T $$0) {
      return this.d.a($$0);
   }

   public <T extends fhn> T b(T $$0, Consumer<fho> $$1) {
      return this.d.a($$0, $$1);
   }

   public <T extends fhn> T c(T $$0) {
      return this.e.a($$0);
   }

   public <T extends fhn> T c(T $$0, Consumer<fho> $$1) {
      return this.e.a($$0, $$1);
   }
}
