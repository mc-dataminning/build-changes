import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fty extends fto {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fty.b q = $$0 -> $$0.get();
   protected final fty.c r;
   protected final fty.b s;

   public static fty.a a(xg $$0, fty.c $$1) {
      return new fty.a($$0, $$1);
   }

   protected fty(int $$0, int $$1, int $$2, int $$3, xg $$4, fty.c $$5, fty.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xu d() {
      return this.s.createNarrationMessage(() -> super.d());
   }

   @Override
   public void a(fxv $$0) {
      this.c($$0);
   }

   public static class a {
      private final xg a;
      private final fty.c b;
      @Nullable
      private fvj c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fty.b h = fty.q;

      public a(xg $$0, fty.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fty.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fty.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fty.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fty.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fty.a a(@Nullable fvj $$0) {
         this.c = $$0;
         return this;
      }

      public fty.a a(fty.b $$0) {
         this.h = $$0;
         return this;
      }

      public fty a() {
         fty $$0 = new fty(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xu createNarrationMessage(Supplier<xu> var1);
   }

   public interface c {
      void onPress(fty var1);
   }
}
