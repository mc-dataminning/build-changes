import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fsc extends frs {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fsc.b q = $$0 -> $$0.get();
   protected final fsc.c r;
   protected final fsc.b s;

   public static fsc.a a(wy $$0, fsc.c $$1) {
      return new fsc.a($$0, $$1);
   }

   protected fsc(int $$0, int $$1, int $$2, int $$3, wy $$4, fsc.c $$5, fsc.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xm d() {
      return this.s.createNarrationMessage(() -> super.d());
   }

   @Override
   public void a(fvz $$0) {
      this.c($$0);
   }

   public static class a {
      private final wy a;
      private final fsc.c b;
      @Nullable
      private ftn c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fsc.b h = fsc.q;

      public a(wy $$0, fsc.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fsc.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fsc.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fsc.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fsc.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fsc.a a(@Nullable ftn $$0) {
         this.c = $$0;
         return this;
      }

      public fsc.a a(fsc.b $$0) {
         this.h = $$0;
         return this;
      }

      public fsc a() {
         fsc $$0 = new fsc(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xm createNarrationMessage(Supplier<xm> var1);
   }

   public interface c {
      void onPress(fsc var1);
   }
}
