import java.util.function.Consumer;

public class evz implements ewa {
   public static final int a = 36;
   private static final int b = 30;
   private final evx c = new evx();
   private final evx d = new evx();
   private final evx e = new evx();
   private final eyk f;
   private int g;
   private int h;

   public evz(eyk $$0) {
      this($$0, 36);
   }

   public evz(eyk $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public evz(eyk $$0, int $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.c.c().a(0.5F, 0.5F);
      this.d.c().a(0.5F, 0.5F);
   }

   @Override
   public void f(int $$0) {
   }

   @Override
   public void g(int $$0) {
   }

   @Override
   public int r() {
      return 0;
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   public int l() {
      return this.f.g;
   }

   @Override
   public int i() {
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
   public void b(Consumer<ewb> $$0) {
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
      this.d.g(this.f.h - $$1);
      this.e.b(this.f.g);
      this.e.a();
      int $$2 = $$0 + 30;
      int $$3 = this.f.h - $$1 - this.e.i();
      this.e.b(0, Math.min($$2, $$3));
   }

   public <T extends ewb> T a(T $$0) {
      return this.c.a($$0);
   }

   public <T extends ewb> T a(T $$0, Consumer<ewc> $$1) {
      return this.c.a($$0, $$1);
   }

   public <T extends ewb> T b(T $$0) {
      return this.d.a($$0);
   }

   public <T extends ewb> T b(T $$0, Consumer<ewc> $$1) {
      return this.d.a($$0, $$1);
   }

   public <T extends ewb> T c(T $$0) {
      return this.e.a($$0);
   }

   public <T extends ewb> T c(T $$0, Consumer<ewc> $$1) {
      return this.e.a($$0, $$1);
   }
}
