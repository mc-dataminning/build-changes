import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ess extends esk {
   public static final int l = 120;
   public static final int m = 150;
   public static final int n = 20;
   protected static final ess.b o = $$0 -> $$0.get();
   protected final ess.c p;
   protected final ess.b q;

   public static ess.a a(tn $$0, ess.c $$1) {
      return new ess.a($$0, $$1);
   }

   protected ess(int $$0, int $$1, int $$2, int $$3, tn $$4, ess.c $$5, ess.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.p = $$5;
      this.q = $$6;
   }

   @Override
   public void c() {
      this.p.onPress(this);
   }

   @Override
   protected ua aE_() {
      return this.q.createNarrationMessage(() -> super.aE_());
   }

   @Override
   public void a(ewk $$0) {
      this.c($$0);
   }

   public static class a {
      private final tn a;
      private final ess.c b;
      @Nullable
      private euc c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private ess.b h = ess.o;

      public a(tn $$0, ess.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ess.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public ess.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public ess.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public ess.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public ess.a a(@Nullable euc $$0) {
         this.c = $$0;
         return this;
      }

      public ess.a a(ess.b $$0) {
         this.h = $$0;
         return this;
      }

      public ess a() {
         ess $$0 = new ess(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      ua createNarrationMessage(Supplier<ua> var1);
   }

   public interface c {
      void onPress(ess var1);
   }
}
