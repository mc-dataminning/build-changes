import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqn extends fqd {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fqn.b q = $$0 -> $$0.get();
   protected final fqn.c r;
   protected final fqn.b s;

   public static fqn.a a(wv $$0, fqn.c $$1) {
      return new fqn.a($$0, $$1);
   }

   protected fqn(int $$0, int $$1, int $$2, int $$3, wv $$4, fqn.c $$5, fqn.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xj d() {
      return this.s.createNarrationMessage(() -> super.d());
   }

   @Override
   public void a(fuk $$0) {
      this.c($$0);
   }

   public static class a {
      private final wv a;
      private final fqn.c b;
      @Nullable
      private fry c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fqn.b h = fqn.q;

      public a(wv $$0, fqn.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fqn.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fqn.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fqn.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fqn.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fqn.a a(@Nullable fry $$0) {
         this.c = $$0;
         return this;
      }

      public fqn.a a(fqn.b $$0) {
         this.h = $$0;
         return this;
      }

      public fqn a() {
         fqn $$0 = new fqn(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xj createNarrationMessage(Supplier<xj> var1);
   }

   public interface c {
      void onPress(fqn var1);
   }
}
