import java.util.function.Supplier;
import javax.annotation.Nullable;

public class frq extends frg {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final frq.b q = $$0 -> $$0.get();
   protected final frq.c r;
   protected final frq.b s;

   public static frq.a a(ww $$0, frq.c $$1) {
      return new frq.a($$0, $$1);
   }

   protected frq(int $$0, int $$1, int $$2, int $$3, ww $$4, frq.c $$5, frq.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xk d() {
      return this.s.createNarrationMessage(() -> super.d());
   }

   @Override
   public void a(fvn $$0) {
      this.c($$0);
   }

   public static class a {
      private final ww a;
      private final frq.c b;
      @Nullable
      private ftb c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private frq.b h = frq.q;

      public a(ww $$0, frq.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public frq.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public frq.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public frq.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public frq.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public frq.a a(@Nullable ftb $$0) {
         this.c = $$0;
         return this;
      }

      public frq.a a(frq.b $$0) {
         this.h = $$0;
         return this;
      }

      public frq a() {
         frq $$0 = new frq(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xk createNarrationMessage(Supplier<xk> var1);
   }

   public interface c {
      void onPress(frq var1);
   }
}
