import java.util.function.Supplier;
import javax.annotation.Nullable;

public class foe extends fnv {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final foe.b q = $$0 -> $$0.get();
   protected final foe.c r;
   protected final foe.b s;

   public static foe.a a(xv $$0, foe.c $$1) {
      return new foe.a($$0, $$1);
   }

   protected foe(int $$0, int $$1, int $$2, int $$3, xv $$4, foe.c $$5, foe.b $$6) {
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
   public void a(fsc $$0) {
      this.c($$0);
   }

   public static class a {
      private final xv a;
      private final foe.c b;
      @Nullable
      private fpq c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private foe.b h = foe.q;

      public a(xv $$0, foe.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public foe.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public foe.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public foe.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public foe.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public foe.a a(@Nullable fpq $$0) {
         this.c = $$0;
         return this;
      }

      public foe.a a(foe.b $$0) {
         this.h = $$0;
         return this;
      }

      public foe a() {
         foe $$0 = new foe(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      yj createNarrationMessage(Supplier<yj> var1);
   }

   public interface c {
      void onPress(foe var1);
   }
}
