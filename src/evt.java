import java.util.function.Consumer;

public class evt implements evq {
   private final evo a;
   private final evt.a b;
   private int c = 0;

   private evt(evt.a $$0) {
      this(0, 0, $$0);
   }

   public evt(int $$0, int $$1, evt.a $$2) {
      this.a = new evo($$0, $$1);
      this.b = $$2;
   }

   public evt a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public evs b() {
      return this.a.b();
   }

   public evs c() {
      return this.a.c();
   }

   public <T extends evr> T a(T $$0, evs $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends evr> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends evr> T a(T $$0, Consumer<evs> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<evr> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int l() {
      return this.a.l();
   }

   @Override
   public int i() {
      return this.a.i();
   }

   @Override
   public void f(int $$0) {
      this.a.f($$0);
   }

   @Override
   public void g(int $$0) {
      this.a.g($$0);
   }

   @Override
   public int r() {
      return this.a.r();
   }

   @Override
   public int t() {
      return this.a.t();
   }

   public static evt d() {
      return new evt(evt.a.b);
   }

   public static evt e() {
      return new evt(evt.a.a);
   }

   public static enum a {
      a,
      b;

      void a(evo $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends evr> T a(evo $$0, T $$1, int $$2, evs $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
