import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fof extends fnw {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fof.b q = $$0 -> $$0.get();
   protected final fof.c r;
   protected final fof.b s;

   public static fof.a a(xv $$0, fof.c $$1) {
      return new fof.a($$0, $$1);
   }

   protected fof(int $$0, int $$1, int $$2, int $$3, xv $$4, fof.c $$5, fof.b $$6) {
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
   public void a(fsd $$0) {
      this.c($$0);
   }

   public static class a {
      private final xv a;
      private final fof.c b;
      @Nullable
      private fpr c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fof.b h = fof.q;

      public a(xv $$0, fof.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fof.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fof.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fof.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fof.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fof.a a(@Nullable fpr $$0) {
         this.c = $$0;
         return this;
      }

      public fof.a a(fof.b $$0) {
         this.h = $$0;
         return this;
      }

      public fof a() {
         fof $$0 = new fof(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      yj createNarrationMessage(Supplier<yj> var1);
   }

   public interface c {
      void onPress(fof var1);
   }
}
