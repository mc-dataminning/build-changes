import java.util.function.Supplier;
import javax.annotation.Nullable;

public class epi extends eoz {
   public static final int u = 120;
   public static final int v = 150;
   public static final int w = 20;
   protected static final epi.b x = $$0 -> $$0.get();
   protected final epi.c y;
   protected final epi.b z;

   public static epi.a a(sw $$0, epi.c $$1) {
      return new epi.a($$0, $$1);
   }

   protected epi(int $$0, int $$1, int $$2, int $$3, sw $$4, epi.c $$5, epi.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.y = $$5;
      this.z = $$6;
   }

   @Override
   public void c() {
      this.y.onPress(this);
   }

   @Override
   protected tj aE_() {
      return this.z.createNarrationMessage(() -> super.aE_());
   }

   @Override
   public void a(esp $$0) {
      this.c($$0);
   }

   public static class a {
      private final sw a;
      private final epi.c b;
      @Nullable
      private eqp c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private epi.b h = epi.x;

      public a(sw $$0, epi.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public epi.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public epi.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public epi.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public epi.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public epi.a a(@Nullable eqp $$0) {
         this.c = $$0;
         return this;
      }

      public epi.a a(epi.b $$0) {
         this.h = $$0;
         return this;
      }

      public epi a() {
         epi $$0 = new epi(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      tj createNarrationMessage(Supplier<tj> var1);
   }

   public interface c {
      void onPress(epi var1);
   }
}
