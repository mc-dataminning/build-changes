import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fhm extends fhd {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fhm.b q = $$0 -> $$0.get();
   protected final fhm.c r;
   protected final fhm.b s;

   public static fhm.a a(wu $$0, fhm.c $$1) {
      return new fhm.a($$0, $$1);
   }

   protected fhm(int $$0, int $$1, int $$2, int $$3, wu $$4, fhm.c $$5, fhm.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xi aL_() {
      return this.s.createNarrationMessage(() -> super.aL_());
   }

   @Override
   public void a(fli $$0) {
      this.c($$0);
   }

   public static class a {
      private final wu a;
      private final fhm.c b;
      @Nullable
      private fix c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fhm.b h = fhm.q;

      public a(wu $$0, fhm.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fhm.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fhm.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fhm.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fhm.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fhm.a a(@Nullable fix $$0) {
         this.c = $$0;
         return this;
      }

      public fhm.a a(fhm.b $$0) {
         this.h = $$0;
         return this;
      }

      public fhm a() {
         fhm $$0 = new fhm(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xi createNarrationMessage(Supplier<xi> var1);
   }

   public interface c {
      void onPress(fhm var1);
   }
}
