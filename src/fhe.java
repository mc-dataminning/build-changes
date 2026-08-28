import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fhe extends fgv {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fhe.b q = $$0 -> $$0.get();
   protected final fhe.c r;
   protected final fhe.b s;

   public static fhe.a a(xp $$0, fhe.c $$1) {
      return new fhe.a($$0, $$1);
   }

   protected fhe(int $$0, int $$1, int $$2, int $$3, xp $$4, fhe.c $$5, fhe.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected yd aJ_() {
      return this.s.createNarrationMessage(() -> super.aJ_());
   }

   @Override
   public void a(fla $$0) {
      this.c($$0);
   }

   public static class a {
      private final xp a;
      private final fhe.c b;
      @Nullable
      private fip c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fhe.b h = fhe.q;

      public a(xp $$0, fhe.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fhe.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fhe.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fhe.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fhe.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fhe.a a(@Nullable fip $$0) {
         this.c = $$0;
         return this;
      }

      public fhe.a a(fhe.b $$0) {
         this.h = $$0;
         return this;
      }

      public fhe a() {
         fhe $$0 = new fhe(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      yd createNarrationMessage(Supplier<yd> var1);
   }

   public interface c {
      void onPress(fhe var1);
   }
}
