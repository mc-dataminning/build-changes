import java.util.function.Consumer;

public class esg implements esh {
   private static final int a = 36;
   private static final int b = 30;
   private final ese c = new ese();
   private final ese d = new ese();
   private final ese e = new ese();
   private final euq f;
   private int g;
   private int h;

   public esg(euq $$0) {
      this($$0, 36);
   }

   public esg(euq $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public esg(euq $$0, int $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.c.b().a(0.5F, 0.5F);
      this.d.b().a(0.5F, 0.5F);
      this.e.b().a(0.5F, 0.0F).c(30);
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

   public int a() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void b(int $$0) {
      this.g = $$0;
   }

   public int b() {
      return this.g;
   }

   @Override
   public void b(Consumer<esi> $$0) {
      this.c.b($$0);
      this.e.b($$0);
      this.d.b($$0);
   }

   @Override
   public void c() {
      int $$0 = this.b();
      int $$1 = this.a();
      this.c.b(this.f.g);
      this.c.a($$0);
      this.c.b(0, 0);
      this.c.c();
      this.d.b(this.f.g);
      this.d.a($$1);
      this.d.c();
      this.d.f(this.f.h - $$1);
      this.e.b(this.f.g);
      this.e.a(this.f.h - $$0 - $$1);
      this.e.b(0, $$0);
      this.e.c();
   }

   public <T extends esi> T a(T $$0) {
      return this.c.a($$0);
   }

   public <T extends esi> T a(T $$0, esj $$1) {
      return this.c.a($$0, $$1);
   }

   public <T extends esi> T b(T $$0) {
      return this.d.a($$0);
   }

   public <T extends esi> T b(T $$0, esj $$1) {
      return this.d.a($$0, $$1);
   }

   public <T extends esi> T c(T $$0) {
      return this.e.a($$0);
   }

   public <T extends esi> T c(T $$0, esj $$1) {
      return this.e.a($$0, $$1);
   }

   public esj d() {
      return this.c.a();
   }

   public esj e() {
      return this.e.a();
   }

   public esj f() {
      return this.d.a();
   }
}
