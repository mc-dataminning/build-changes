import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fpq extends fpg {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fpq.b q = $$0 -> $$0.get();
   protected final fpq.c r;
   protected final fpq.b s;

   public static fpq.a a(wp $$0, fpq.c $$1) {
      return new fpq.a($$0, $$1);
   }

   protected fpq(int $$0, int $$1, int $$2, int $$3, wp $$4, fpq.c $$5, fpq.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xd d() {
      return this.s.createNarrationMessage(() -> super.d());
   }

   @Override
   public void a(ftn $$0) {
      this.c($$0);
   }

   public static class a {
      private final wp a;
      private final fpq.c b;
      @Nullable
      private frb c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fpq.b h = fpq.q;

      public a(wp $$0, fpq.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fpq.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fpq.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fpq.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fpq.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fpq.a a(@Nullable frb $$0) {
         this.c = $$0;
         return this;
      }

      public fpq.a a(fpq.b $$0) {
         this.h = $$0;
         return this;
      }

      public fpq a() {
         fpq $$0 = new fpq(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xd createNarrationMessage(Supplier<xd> var1);
   }

   public interface c {
      void onPress(fpq var1);
   }
}
