import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fik extends fib {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fik.b q = $$0 -> $$0.get();
   protected final fik.c r;
   protected final fik.b s;

   public static fik.a a(wz $$0, fik.c $$1) {
      return new fik.a($$0, $$1);
   }

   protected fik(int $$0, int $$1, int $$2, int $$3, wz $$4, fik.c $$5, fik.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xn aQ_() {
      return this.s.createNarrationMessage(() -> super.aQ_());
   }

   @Override
   public void a(fmg $$0) {
      this.c($$0);
   }

   public static class a {
      private final wz a;
      private final fik.c b;
      @Nullable
      private fjv c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fik.b h = fik.q;

      public a(wz $$0, fik.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fik.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fik.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fik.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fik.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fik.a a(@Nullable fjv $$0) {
         this.c = $$0;
         return this;
      }

      public fik.a a(fik.b $$0) {
         this.h = $$0;
         return this;
      }

      public fik a() {
         fik $$0 = new fik(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xn createNarrationMessage(Supplier<xn> var1);
   }

   public interface c {
      void onPress(fik var1);
   }
}
