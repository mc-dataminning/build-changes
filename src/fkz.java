import java.util.function.Consumer;

public class fkz implements fla {
   public static final int a = 33;
   private static final int b = 30;
   private final fkx c = new fkx();
   private final fkx d = new fkx();
   private final fkx e = new fkx();
   private final fnd f;
   private int g;
   private int h;

   public fkz(fnd $$0) {
      this($$0, 33);
   }

   public fkz(fnd $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public fkz(fnd $$0, int $$1, int $$2) {
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
   public int D() {
      return 0;
   }

   @Override
   public int E() {
      return 0;
   }

   @Override
   public int y() {
      return this.f.m;
   }

   @Override
   public int w() {
      return this.f.n;
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
      return this.f.n - this.c() - this.b();
   }

   @Override
   public void b(Consumer<flb> $$0) {
      this.c.b($$0);
      this.e.b($$0);
      this.d.b($$0);
   }

   @Override
   public void a() {
      int $$0 = this.c();
      int $$1 = this.b();
      this.c.b(this.f.m);
      this.c.a($$0);
      this.c.c(0, 0);
      this.c.a();
      this.d.b(this.f.m);
      this.d.a($$1);
      this.d.a();
      this.d.n(this.f.n - $$1);
      this.e.b(this.f.m);
      this.e.a();
      int $$2 = $$0 + 30;
      int $$3 = this.f.n - $$1 - this.e.w();
      this.e.c(0, Math.min($$2, $$3));
   }

   public <T extends flb> T a(T $$0) {
      return this.c.a($$0);
   }

   public <T extends flb> T a(T $$0, Consumer<flc> $$1) {
      return this.c.a($$0, $$1);
   }

   public void a(wu $$0, fgx $$1) {
      this.c.a(new fit($$0, $$1));
   }

   public <T extends flb> T b(T $$0) {
      return this.d.a($$0);
   }

   public <T extends flb> T b(T $$0, Consumer<flc> $$1) {
      return this.d.a($$0, $$1);
   }

   public <T extends flb> T c(T $$0) {
      return this.e.a($$0);
   }

   public <T extends flb> T c(T $$0, Consumer<flc> $$1) {
      return this.e.a($$0, $$1);
   }
}
