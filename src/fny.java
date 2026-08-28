import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fny extends fnp {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fny.b q = $$0 -> $$0.get();
   protected final fny.c r;
   protected final fny.b s;

   public static fny.a a(xv $$0, fny.c $$1) {
      return new fny.a($$0, $$1);
   }

   protected fny(int $$0, int $$1, int $$2, int $$3, xv $$4, fny.c $$5, fny.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected yj aR_() {
      return this.s.createNarrationMessage(() -> super.aR_());
   }

   @Override
   public void a(frw $$0) {
      this.c($$0);
   }

   public static class a {
      private final xv a;
      private final fny.c b;
      @Nullable
      private fpk c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fny.b h = fny.q;

      public a(xv $$0, fny.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fny.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fny.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fny.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fny.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fny.a a(@Nullable fpk $$0) {
         this.c = $$0;
         return this;
      }

      public fny.a a(fny.b $$0) {
         this.h = $$0;
         return this;
      }

      public fny a() {
         fny $$0 = new fny(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      yj createNarrationMessage(Supplier<yj> var1);
   }

   public interface c {
      void onPress(fny var1);
   }
}
