import java.util.function.Consumer;

public class ewd implements ewa {
   private final evy a;
   private final ewd.a b;
   private int c = 0;

   private ewd(ewd.a $$0) {
      this(0, 0, $$0);
   }

   public ewd(int $$0, int $$1, ewd.a $$2) {
      this.a = new evy($$0, $$1);
      this.b = $$2;
   }

   public ewd a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public ewc b() {
      return this.a.b();
   }

   public ewc c() {
      return this.a.c();
   }

   public <T extends ewb> T a(T $$0, ewc $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends ewb> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends ewb> T a(T $$0, Consumer<ewc> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<ewb> $$0) {
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

   public static ewd d() {
      return new ewd(ewd.a.b);
   }

   public static ewd e() {
      return new ewd(ewd.a.a);
   }

   public static enum a {
      a,
      b;

      void a(evy $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends ewb> T a(evy $$0, T $$1, int $$2, ewc $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
