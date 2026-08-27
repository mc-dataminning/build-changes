import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fdp extends fdg {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fdp.b q = $$0 -> $$0.get();
   protected final fdp.c r;
   protected final fdp.b s;

   public static fdp.a a(wg $$0, fdp.c $$1) {
      return new fdp.a($$0, $$1);
   }

   protected fdp(int $$0, int $$1, int $$2, int $$3, wg $$4, fdp.c $$5, fdp.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected wu aL_() {
      return this.s.createNarrationMessage(() -> super.aL_());
   }

   @Override
   public void a(fhl $$0) {
      this.c($$0);
   }

   public static class a {
      private final wg a;
      private final fdp.c b;
      @Nullable
      private ffa c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fdp.b h = fdp.q;

      public a(wg $$0, fdp.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fdp.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fdp.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fdp.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fdp.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fdp.a a(@Nullable ffa $$0) {
         this.c = $$0;
         return this;
      }

      public fdp.a a(fdp.b $$0) {
         this.h = $$0;
         return this;
      }

      public fdp a() {
         fdp $$0 = new fdp(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      wu createNarrationMessage(Supplier<wu> var1);
   }

   public interface c {
      void onPress(fdp var1);
   }
}
