import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fkk extends fkb {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fkk.b q = $$0 -> $$0.get();
   protected final fkk.c r;
   protected final fkk.b s;

   public static fkk.a a(xd $$0, fkk.c $$1) {
      return new fkk.a($$0, $$1);
   }

   protected fkk(int $$0, int $$1, int $$2, int $$3, xd $$4, fkk.c $$5, fkk.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xr aO_() {
      return this.s.createNarrationMessage(() -> super.aO_());
   }

   @Override
   public void a(foh $$0) {
      this.c($$0);
   }

   public static class a {
      private final xd a;
      private final fkk.c b;
      @Nullable
      private flv c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fkk.b h = fkk.q;

      public a(xd $$0, fkk.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fkk.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fkk.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fkk.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fkk.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fkk.a a(@Nullable flv $$0) {
         this.c = $$0;
         return this;
      }

      public fkk.a a(fkk.b $$0) {
         this.h = $$0;
         return this;
      }

      public fkk a() {
         fkk $$0 = new fkk(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xr createNarrationMessage(Supplier<xr> var1);
   }

   public interface c {
      void onPress(fkk var1);
   }
}
