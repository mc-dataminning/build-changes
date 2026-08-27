import java.util.function.Supplier;
import javax.annotation.Nullable;

public class feu extends fel {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final feu.b q = $$0 -> $$0.get();
   protected final feu.c r;
   protected final feu.b s;

   public static feu.a a(ws $$0, feu.c $$1) {
      return new feu.a($$0, $$1);
   }

   protected feu(int $$0, int $$1, int $$2, int $$3, ws $$4, feu.c $$5, feu.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xg aK_() {
      return this.s.createNarrationMessage(() -> super.aK_());
   }

   @Override
   public void a(fiq $$0) {
      this.c($$0);
   }

   public static class a {
      private final ws a;
      private final feu.c b;
      @Nullable
      private fgf c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private feu.b h = feu.q;

      public a(ws $$0, feu.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public feu.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public feu.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public feu.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public feu.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public feu.a a(@Nullable fgf $$0) {
         this.c = $$0;
         return this;
      }

      public feu.a a(feu.b $$0) {
         this.h = $$0;
         return this;
      }

      public feu a() {
         feu $$0 = new feu(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xg createNarrationMessage(Supplier<xg> var1);
   }

   public interface c {
      void onPress(feu var1);
   }
}
