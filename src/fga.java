import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fga extends ffr {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fga.b q = $$0 -> $$0.get();
   protected final fga.c r;
   protected final fga.b s;

   public static fga.a a(wx $$0, fga.c $$1) {
      return new fga.a($$0, $$1);
   }

   protected fga(int $$0, int $$1, int $$2, int $$3, wx $$4, fga.c $$5, fga.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xl aL_() {
      return this.s.createNarrationMessage(() -> super.aL_());
   }

   @Override
   public void a(fjw $$0) {
      this.c($$0);
   }

   public static class a {
      private final wx a;
      private final fga.c b;
      @Nullable
      private fhl c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fga.b h = fga.q;

      public a(wx $$0, fga.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fga.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fga.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fga.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fga.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fga.a a(@Nullable fhl $$0) {
         this.c = $$0;
         return this;
      }

      public fga.a a(fga.b $$0) {
         this.h = $$0;
         return this;
      }

      public fga a() {
         fga $$0 = new fga(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xl createNarrationMessage(Supplier<xl> var1);
   }

   public interface c {
      void onPress(fga var1);
   }
}
