import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fdy extends fdp {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fdy.b q = $$0 -> $$0.get();
   protected final fdy.c r;
   protected final fdy.b s;

   public static fdy.a a(wi $$0, fdy.c $$1) {
      return new fdy.a($$0, $$1);
   }

   protected fdy(int $$0, int $$1, int $$2, int $$3, wi $$4, fdy.c $$5, fdy.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected ww aK_() {
      return this.s.createNarrationMessage(() -> super.aK_());
   }

   @Override
   public void a(fhu $$0) {
      this.c($$0);
   }

   public static class a {
      private final wi a;
      private final fdy.c b;
      @Nullable
      private ffj c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fdy.b h = fdy.q;

      public a(wi $$0, fdy.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fdy.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fdy.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fdy.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fdy.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fdy.a a(@Nullable ffj $$0) {
         this.c = $$0;
         return this;
      }

      public fdy.a a(fdy.b $$0) {
         this.h = $$0;
         return this;
      }

      public fdy a() {
         fdy $$0 = new fdy(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      ww createNarrationMessage(Supplier<ww> var1);
   }

   public interface c {
      void onPress(fdy var1);
   }
}
