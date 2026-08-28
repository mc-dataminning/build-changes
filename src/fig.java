import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fig extends fhx {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fig.b q = $$0 -> $$0.get();
   protected final fig.c r;
   protected final fig.b s;

   public static fig.a a(wy $$0, fig.c $$1) {
      return new fig.a($$0, $$1);
   }

   protected fig(int $$0, int $$1, int $$2, int $$3, wy $$4, fig.c $$5, fig.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xm aM_() {
      return this.s.createNarrationMessage(() -> super.aM_());
   }

   @Override
   public void a(fmc $$0) {
      this.c($$0);
   }

   public static class a {
      private final wy a;
      private final fig.c b;
      @Nullable
      private fjr c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fig.b h = fig.q;

      public a(wy $$0, fig.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fig.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fig.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fig.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fig.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fig.a a(@Nullable fjr $$0) {
         this.c = $$0;
         return this;
      }

      public fig.a a(fig.b $$0) {
         this.h = $$0;
         return this;
      }

      public fig a() {
         fig $$0 = new fig(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xm createNarrationMessage(Supplier<xm> var1);
   }

   public interface c {
      void onPress(fig var1);
   }
}
