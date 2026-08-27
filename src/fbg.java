import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fbg extends fax {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 20;
   public static final int o = 8;
   protected static final fbg.b p = $$0 -> $$0.get();
   protected final fbg.c q;
   protected final fbg.b r;

   public static fbg.a a(vu $$0, fbg.c $$1) {
      return new fbg.a($$0, $$1);
   }

   protected fbg(int $$0, int $$1, int $$2, int $$3, vu $$4, fbg.c $$5, fbg.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.q = $$5;
      this.r = $$6;
   }

   @Override
   public void b() {
      this.q.onPress(this);
   }

   @Override
   protected wi aL_() {
      return this.r.createNarrationMessage(() -> super.aL_());
   }

   @Override
   public void a(ffc $$0) {
      this.c($$0);
   }

   public static class a {
      private final vu a;
      private final fbg.c b;
      @Nullable
      private fcr c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fbg.b h = fbg.p;

      public a(vu $$0, fbg.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fbg.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fbg.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fbg.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fbg.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fbg.a a(@Nullable fcr $$0) {
         this.c = $$0;
         return this;
      }

      public fbg.a a(fbg.b $$0) {
         this.h = $$0;
         return this;
      }

      public fbg a() {
         fbg $$0 = new fbg(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      wi createNarrationMessage(Supplier<wi> var1);
   }

   public interface c {
      void onPress(fbg var1);
   }
}
