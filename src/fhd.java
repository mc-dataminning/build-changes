import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fhd extends fgu {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fhd.b q = $$0 -> $$0.get();
   protected final fhd.c r;
   protected final fhd.b s;

   public static fhd.a a(xo $$0, fhd.c $$1) {
      return new fhd.a($$0, $$1);
   }

   protected fhd(int $$0, int $$1, int $$2, int $$3, xo $$4, fhd.c $$5, fhd.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected yc aJ_() {
      return this.s.createNarrationMessage(() -> super.aJ_());
   }

   @Override
   public void a(fkz $$0) {
      this.c($$0);
   }

   public static class a {
      private final xo a;
      private final fhd.c b;
      @Nullable
      private fio c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fhd.b h = fhd.q;

      public a(xo $$0, fhd.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fhd.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fhd.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fhd.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fhd.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fhd.a a(@Nullable fio $$0) {
         this.c = $$0;
         return this;
      }

      public fhd.a a(fhd.b $$0) {
         this.h = $$0;
         return this;
      }

      public fhd a() {
         fhd $$0 = new fhd(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      yc createNarrationMessage(Supplier<yc> var1);
   }

   public interface c {
      void onPress(fhd var1);
   }
}
