import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fim extends fid {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fim.b q = $$0 -> $$0.get();
   protected final fim.c r;
   protected final fim.b s;

   public static fim.a a(wz $$0, fim.c $$1) {
      return new fim.a($$0, $$1);
   }

   protected fim(int $$0, int $$1, int $$2, int $$3, wz $$4, fim.c $$5, fim.b $$6) {
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
   public void a(fmi $$0) {
      this.c($$0);
   }

   public static class a {
      private final wz a;
      private final fim.c b;
      @Nullable
      private fjx c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fim.b h = fim.q;

      public a(wz $$0, fim.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fim.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fim.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fim.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fim.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fim.a a(@Nullable fjx $$0) {
         this.c = $$0;
         return this;
      }

      public fim.a a(fim.b $$0) {
         this.h = $$0;
         return this;
      }

      public fim a() {
         fim $$0 = new fim(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xn createNarrationMessage(Supplier<xn> var1);
   }

   public interface c {
      void onPress(fim var1);
   }
}
