import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fot extends foi {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fot.b q = $$0 -> $$0.get();
   protected final fot.c r;
   protected final fot.b s;

   public static fot.a a(wp $$0, fot.c $$1) {
      return new fot.a($$0, $$1);
   }

   protected fot(int $$0, int $$1, int $$2, int $$3, wp $$4, fot.c $$5, fot.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xd d() {
      return this.s.createNarrationMessage(() -> super.d());
   }

   @Override
   public void a(fsq $$0) {
      this.c($$0);
   }

   public static class a {
      private final wp a;
      private final fot.c b;
      @Nullable
      private fqe c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fot.b h = fot.q;

      public a(wp $$0, fot.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fot.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fot.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fot.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fot.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fot.a a(@Nullable fqe $$0) {
         this.c = $$0;
         return this;
      }

      public fot.a a(fot.b $$0) {
         this.h = $$0;
         return this;
      }

      public fot a() {
         fot $$0 = new fot(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xd createNarrationMessage(Supplier<xd> var1);
   }

   public interface c {
      void onPress(fot var1);
   }
}
