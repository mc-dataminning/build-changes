import java.util.function.Supplier;
import javax.annotation.Nullable;

public class flw extends fln {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final flw.b q = $$0 -> $$0.get();
   protected final flw.c r;
   protected final flw.b s;

   public static flw.a a(xl $$0, flw.c $$1) {
      return new flw.a($$0, $$1);
   }

   protected flw(int $$0, int $$1, int $$2, int $$3, xl $$4, flw.c $$5, flw.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xz aO_() {
      return this.s.createNarrationMessage(() -> super.aO_());
   }

   @Override
   public void a(fpu $$0) {
      this.c($$0);
   }

   public static class a {
      private final xl a;
      private final flw.c b;
      @Nullable
      private fnh c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private flw.b h = flw.q;

      public a(xl $$0, flw.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public flw.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public flw.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public flw.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public flw.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public flw.a a(@Nullable fnh $$0) {
         this.c = $$0;
         return this;
      }

      public flw.a a(flw.b $$0) {
         this.h = $$0;
         return this;
      }

      public flw a() {
         flw $$0 = new flw(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xz createNarrationMessage(Supplier<xz> var1);
   }

   public interface c {
      void onPress(flw var1);
   }
}
