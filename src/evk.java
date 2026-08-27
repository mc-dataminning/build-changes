import java.util.function.Consumer;

public class evk implements evl {
   private static final int a = 36;
   private static final int b = 30;
   private final evi c = new evi();
   private final evi d = new evi();
   private final evi e = new evi();
   private final exv f;
   private int g;
   private int h;

   public evk(exv $$0) {
      this($$0, 36);
   }

   public evk(exv $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public evk(exv $$0, int $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.c.c().a(0.5F, 0.5F);
      this.d.c().a(0.5F, 0.5F);
   }

   @Override
   public void e(int $$0) {
   }

   @Override
   public void f(int $$0) {
   }

   @Override
   public int p() {
      return 0;
   }

   @Override
   public int r() {
      return 0;
   }

   @Override
   public int k() {
      return this.f.g;
   }

   @Override
   public int h() {
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
   public void b(Consumer<evm> $$0) {
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
      this.c.b(0, 0);
      this.c.a();
      this.d.b(this.f.g);
      this.d.a($$1);
      this.d.a();
      this.d.f(this.f.h - $$1);
      this.e.b(this.f.g);
      this.e.a();
      int $$2 = $$0 + 30;
      int $$3 = this.f.h - $$1 - this.e.h();
      this.e.b(0, Math.min($$2, $$3));
   }

   public <T extends evm> T a(T $$0) {
      return this.c.a($$0);
   }

   public <T extends evm> T a(T $$0, Consumer<evn> $$1) {
      return this.c.a($$0, $$1);
   }

   public <T extends evm> T b(T $$0) {
      return this.d.a($$0);
   }

   public <T extends evm> T b(T $$0, Consumer<evn> $$1) {
      return this.d.a($$0, $$1);
   }

   public <T extends evm> T c(T $$0) {
      return this.e.a($$0);
   }

   public <T extends evm> T c(T $$0, Consumer<evn> $$1) {
      return this.e.a($$0, $$1);
   }
}
