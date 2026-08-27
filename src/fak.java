import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fak extends fab {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 20;
   public static final int o = 8;
   protected static final fak.b p = $$0 -> $$0.get();
   protected final fak.c q;
   protected final fak.b r;

   public static fak.a a(vs $$0, fak.c $$1) {
      return new fak.a($$0, $$1);
   }

   protected fak(int $$0, int $$1, int $$2, int $$3, vs $$4, fak.c $$5, fak.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.q = $$5;
      this.r = $$6;
   }

   @Override
   public void b() {
      this.q.onPress(this);
   }

   @Override
   protected wg aM_() {
      return this.r.createNarrationMessage(() -> super.aM_());
   }

   @Override
   public void a(fef $$0) {
      this.c($$0);
   }

   public static class a {
      private final vs a;
      private final fak.c b;
      @Nullable
      private fbv c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fak.b h = fak.p;

      public a(vs $$0, fak.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fak.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fak.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fak.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fak.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fak.a a(@Nullable fbv $$0) {
         this.c = $$0;
         return this;
      }

      public fak.a a(fak.b $$0) {
         this.h = $$0;
         return this;
      }

      public fak a() {
         fak $$0 = new fak(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      wg createNarrationMessage(Supplier<wg> var1);
   }

   public interface c {
      void onPress(fak var1);
   }
}
