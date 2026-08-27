import java.util.function.Consumer;

public class evo implements evl {
   private final evj a;
   private final evo.a b;
   private int c = 0;

   public evo(evo.a $$0) {
      this(0, 0, $$0);
   }

   public evo(int $$0, int $$1, evo.a $$2) {
      this.a = new evj($$0, $$1);
      this.b = $$2;
   }

   public evo a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public evn b() {
      return this.a.b();
   }

   public evn c() {
      return this.a.c();
   }

   public <T extends evm> T a(T $$0, evn $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends evm> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends evm> T a(T $$0, Consumer<evn> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<evm> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int k() {
      return this.a.k();
   }

   @Override
   public int h() {
      return this.a.h();
   }

   @Override
   public void e(int $$0) {
      this.a.e($$0);
   }

   @Override
   public void f(int $$0) {
      this.a.f($$0);
   }

   @Override
   public int p() {
      return this.a.p();
   }

   @Override
   public int r() {
      return this.a.r();
   }

   public static evo d() {
      return new evo(evo.a.b);
   }

   public static evo e() {
      return new evo(evo.a.a);
   }

   public static enum a {
      a,
      b;

      void a(evj $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends evm> T a(evj $$0, T $$1, int $$2, evn $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
