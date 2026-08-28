import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fhc extends fgt {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fhc.b q = $$0 -> $$0.get();
   protected final fhc.c r;
   protected final fhc.b s;

   public static fhc.a a(xo $$0, fhc.c $$1) {
      return new fhc.a($$0, $$1);
   }

   protected fhc(int $$0, int $$1, int $$2, int $$3, xo $$4, fhc.c $$5, fhc.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected yc aK_() {
      return this.s.createNarrationMessage(() -> super.aK_());
   }

   @Override
   public void a(fky $$0) {
      this.c($$0);
   }

   public static class a {
      private final xo a;
      private final fhc.c b;
      @Nullable
      private fin c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fhc.b h = fhc.q;

      public a(xo $$0, fhc.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fhc.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fhc.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fhc.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fhc.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fhc.a a(@Nullable fin $$0) {
         this.c = $$0;
         return this;
      }

      public fhc.a a(fhc.b $$0) {
         this.h = $$0;
         return this;
      }

      public fhc a() {
         fhc $$0 = new fhc(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      yc createNarrationMessage(Supplier<yc> var1);
   }

   public interface c {
      void onPress(fhc var1);
   }
}
