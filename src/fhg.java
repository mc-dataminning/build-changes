import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fhg extends fgx {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fhg.b q = $$0 -> $$0.get();
   protected final fhg.c r;
   protected final fhg.b s;

   public static fhg.a a(xp $$0, fhg.c $$1) {
      return new fhg.a($$0, $$1);
   }

   protected fhg(int $$0, int $$1, int $$2, int $$3, xp $$4, fhg.c $$5, fhg.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected yd aJ_() {
      return this.s.createNarrationMessage(() -> super.aJ_());
   }

   @Override
   public void a(flc $$0) {
      this.c($$0);
   }

   public static class a {
      private final xp a;
      private final fhg.c b;
      @Nullable
      private fir c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fhg.b h = fhg.q;

      public a(xp $$0, fhg.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fhg.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fhg.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fhg.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fhg.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fhg.a a(@Nullable fir $$0) {
         this.c = $$0;
         return this;
      }

      public fhg.a a(fhg.b $$0) {
         this.h = $$0;
         return this;
      }

      public fhg a() {
         fhg $$0 = new fhg(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      yd createNarrationMessage(Supplier<yd> var1);
   }

   public interface c {
      void onPress(fhg var1);
   }
}
