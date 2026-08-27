import java.util.function.Consumer;

public class ewf implements ewc {
   private final ewa a;
   private final ewf.a b;
   private int c = 0;

   private ewf(ewf.a $$0) {
      this(0, 0, $$0);
   }

   public ewf(int $$0, int $$1, ewf.a $$2) {
      this.a = new ewa($$0, $$1);
      this.b = $$2;
   }

   public ewf a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public ewe b() {
      return this.a.b();
   }

   public ewe c() {
      return this.a.c();
   }

   public <T extends ewd> T a(T $$0, ewe $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends ewd> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends ewd> T a(T $$0, Consumer<ewe> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<ewd> $$0) {
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

   public static ewf d() {
      return new ewf(ewf.a.b);
   }

   public static ewf e() {
      return new ewf(ewf.a.a);
   }

   public static enum a {
      a,
      b;

      void a(ewa $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends ewd> T a(ewa $$0, T $$1, int $$2, ewe $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
