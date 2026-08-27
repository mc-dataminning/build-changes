import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eve extends euw {
   public static final int l = 120;
   public static final int m = 150;
   public static final int n = 20;
   public static final int o = 8;
   protected static final eve.b p = $$0 -> $$0.get();
   protected final eve.c q;
   protected final eve.b r;

   public static eve.a a(uv $$0, eve.c $$1) {
      return new eve.a($$0, $$1);
   }

   protected eve(int $$0, int $$1, int $$2, int $$3, uv $$4, eve.c $$5, eve.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.q = $$5;
      this.r = $$6;
   }

   @Override
   public void b() {
      this.q.onPress(this);
   }

   @Override
   protected vj aN_() {
      return this.r.createNarrationMessage(() -> super.aN_());
   }

   @Override
   public void a(eyx $$0) {
      this.c($$0);
   }

   public static class a {
      private final uv a;
      private final eve.c b;
      @Nullable
      private ewp c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private eve.b h = eve.p;

      public a(uv $$0, eve.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public eve.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public eve.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public eve.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public eve.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public eve.a a(@Nullable ewp $$0) {
         this.c = $$0;
         return this;
      }

      public eve.a a(eve.b $$0) {
         this.h = $$0;
         return this;
      }

      public eve a() {
         eve $$0 = new eve(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      vj createNarrationMessage(Supplier<vj> var1);
   }

   public interface c {
      void onPress(eve var1);
   }
}
