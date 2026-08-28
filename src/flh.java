import java.util.function.Supplier;
import javax.annotation.Nullable;

public class flh extends fky {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final flh.b q = $$0 -> $$0.get();
   protected final flh.c r;
   protected final flh.b s;

   public static flh.a a(xi $$0, flh.c $$1) {
      return new flh.a($$0, $$1);
   }

   protected flh(int $$0, int $$1, int $$2, int $$3, xi $$4, flh.c $$5, flh.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xw aO_() {
      return this.s.createNarrationMessage(() -> super.aO_());
   }

   @Override
   public void a(fpf $$0) {
      this.c($$0);
   }

   public static class a {
      private final xi a;
      private final flh.c b;
      @Nullable
      private fms c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private flh.b h = flh.q;

      public a(xi $$0, flh.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public flh.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public flh.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public flh.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public flh.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public flh.a a(@Nullable fms $$0) {
         this.c = $$0;
         return this;
      }

      public flh.a a(flh.b $$0) {
         this.h = $$0;
         return this;
      }

      public flh a() {
         flh $$0 = new flh(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xw createNarrationMessage(Supplier<xw> var1);
   }

   public interface c {
      void onPress(flh var1);
   }
}
