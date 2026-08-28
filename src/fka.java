import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fka extends fjr {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fka.b q = $$0 -> $$0.get();
   protected final fka.c r;
   protected final fka.b s;

   public static fka.a a(xd $$0, fka.c $$1) {
      return new fka.a($$0, $$1);
   }

   protected fka(int $$0, int $$1, int $$2, int $$3, xd $$4, fka.c $$5, fka.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xr aQ_() {
      return this.s.createNarrationMessage(() -> super.aQ_());
   }

   @Override
   public void a(fnx $$0) {
      this.c($$0);
   }

   public static class a {
      private final xd a;
      private final fka.c b;
      @Nullable
      private fll c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fka.b h = fka.q;

      public a(xd $$0, fka.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fka.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fka.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fka.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fka.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fka.a a(@Nullable fll $$0) {
         this.c = $$0;
         return this;
      }

      public fka.a a(fka.b $$0) {
         this.h = $$0;
         return this;
      }

      public fka a() {
         fka $$0 = new fka(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xr createNarrationMessage(Supplier<xr> var1);
   }

   public interface c {
      void onPress(fka var1);
   }
}
