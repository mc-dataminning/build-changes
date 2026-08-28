import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fop extends fof {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fop.b q = $$0 -> $$0.get();
   protected final fop.c r;
   protected final fop.b s;

   public static fop.a a(wo $$0, fop.c $$1) {
      return new fop.a($$0, $$1);
   }

   protected fop(int $$0, int $$1, int $$2, int $$3, wo $$4, fop.c $$5, fop.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xc d() {
      return this.s.createNarrationMessage(() -> super.d());
   }

   @Override
   public void a(fsn $$0) {
      this.c($$0);
   }

   public static class a {
      private final wo a;
      private final fop.c b;
      @Nullable
      private fqb c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fop.b h = fop.q;

      public a(wo $$0, fop.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fop.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fop.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fop.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fop.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fop.a a(@Nullable fqb $$0) {
         this.c = $$0;
         return this;
      }

      public fop.a a(fop.b $$0) {
         this.h = $$0;
         return this;
      }

      public fop a() {
         fop $$0 = new fop(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xc createNarrationMessage(Supplier<xc> var1);
   }

   public interface c {
      void onPress(fop var1);
   }
}
