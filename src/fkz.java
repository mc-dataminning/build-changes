import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fkz extends fkq {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fkz.b q = $$0 -> $$0.get();
   protected final fkz.c r;
   protected final fkz.b s;

   public static fkz.a a(xh $$0, fkz.c $$1) {
      return new fkz.a($$0, $$1);
   }

   protected fkz(int $$0, int $$1, int $$2, int $$3, xh $$4, fkz.c $$5, fkz.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xv aP_() {
      return this.s.createNarrationMessage(() -> super.aP_());
   }

   @Override
   public void a(fox $$0) {
      this.c($$0);
   }

   public static class a {
      private final xh a;
      private final fkz.c b;
      @Nullable
      private fmk c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fkz.b h = fkz.q;

      public a(xh $$0, fkz.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fkz.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fkz.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fkz.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fkz.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fkz.a a(@Nullable fmk $$0) {
         this.c = $$0;
         return this;
      }

      public fkz.a a(fkz.b $$0) {
         this.h = $$0;
         return this;
      }

      public fkz a() {
         fkz $$0 = new fkz(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xv createNarrationMessage(Supplier<xv> var1);
   }

   public interface c {
      void onPress(fkz var1);
   }
}
