import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fko extends fkf {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fko.b q = $$0 -> $$0.get();
   protected final fko.c r;
   protected final fko.b s;

   public static fko.a a(xe $$0, fko.c $$1) {
      return new fko.a($$0, $$1);
   }

   protected fko(int $$0, int $$1, int $$2, int $$3, xe $$4, fko.c $$5, fko.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xs aP_() {
      return this.s.createNarrationMessage(() -> super.aP_());
   }

   @Override
   public void a(fol $$0) {
      this.c($$0);
   }

   public static class a {
      private final xe a;
      private final fko.c b;
      @Nullable
      private flz c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fko.b h = fko.q;

      public a(xe $$0, fko.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fko.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fko.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fko.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fko.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fko.a a(@Nullable flz $$0) {
         this.c = $$0;
         return this;
      }

      public fko.a a(fko.b $$0) {
         this.h = $$0;
         return this;
      }

      public fko a() {
         fko $$0 = new fko(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xs createNarrationMessage(Supplier<xs> var1);
   }

   public interface c {
      void onPress(fko var1);
   }
}
