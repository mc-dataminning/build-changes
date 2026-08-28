import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fmd extends flu {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fmd.b q = $$0 -> $$0.get();
   protected final fmd.c r;
   protected final fmd.b s;

   public static fmd.a a(xj $$0, fmd.c $$1) {
      return new fmd.a($$0, $$1);
   }

   protected fmd(int $$0, int $$1, int $$2, int $$3, xj $$4, fmd.c $$5, fmd.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xx aN_() {
      return this.s.createNarrationMessage(() -> super.aN_());
   }

   @Override
   public void a(fqb $$0) {
      this.c($$0);
   }

   public static class a {
      private final xj a;
      private final fmd.c b;
      @Nullable
      private fno c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fmd.b h = fmd.q;

      public a(xj $$0, fmd.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fmd.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fmd.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fmd.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fmd.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fmd.a a(@Nullable fno $$0) {
         this.c = $$0;
         return this;
      }

      public fmd.a a(fmd.b $$0) {
         this.h = $$0;
         return this;
      }

      public fmd a() {
         fmd $$0 = new fmd(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xx createNarrationMessage(Supplier<xx> var1);
   }

   public interface c {
      void onPress(fmd var1);
   }
}
