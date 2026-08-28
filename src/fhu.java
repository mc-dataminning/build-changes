import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fhu extends fhl {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fhu.b q = $$0 -> $$0.get();
   protected final fhu.c r;
   protected final fhu.b s;

   public static fhu.a a(wu $$0, fhu.c $$1) {
      return new fhu.a($$0, $$1);
   }

   protected fhu(int $$0, int $$1, int $$2, int $$3, wu $$4, fhu.c $$5, fhu.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xi aM_() {
      return this.s.createNarrationMessage(() -> super.aM_());
   }

   @Override
   public void a(flq $$0) {
      this.c($$0);
   }

   public static class a {
      private final wu a;
      private final fhu.c b;
      @Nullable
      private fjf c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fhu.b h = fhu.q;

      public a(wu $$0, fhu.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fhu.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fhu.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fhu.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fhu.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fhu.a a(@Nullable fjf $$0) {
         this.c = $$0;
         return this;
      }

      public fhu.a a(fhu.b $$0) {
         this.h = $$0;
         return this;
      }

      public fhu a() {
         fhu $$0 = new fhu(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xi createNarrationMessage(Supplier<xi> var1);
   }

   public interface c {
      void onPress(fhu var1);
   }
}
