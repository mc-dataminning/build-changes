import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fsj extends frz {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fsj.b q = $$0 -> $$0.get();
   protected final fsj.c r;
   protected final fsj.b s;

   public static fsj.a a(wy $$0, fsj.c $$1) {
      return new fsj.a($$0, $$1);
   }

   protected fsj(int $$0, int $$1, int $$2, int $$3, wy $$4, fsj.c $$5, fsj.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xm d() {
      return this.s.createNarrationMessage(() -> super.d());
   }

   @Override
   public void a(fwg $$0) {
      this.c($$0);
   }

   public static class a {
      private final wy a;
      private final fsj.c b;
      @Nullable
      private ftu c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fsj.b h = fsj.q;

      public a(wy $$0, fsj.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fsj.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fsj.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fsj.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fsj.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fsj.a a(@Nullable ftu $$0) {
         this.c = $$0;
         return this;
      }

      public fsj.a a(fsj.b $$0) {
         this.h = $$0;
         return this;
      }

      public fsj a() {
         fsj $$0 = new fsj(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xm createNarrationMessage(Supplier<xm> var1);
   }

   public interface c {
      void onPress(fsj var1);
   }
}
