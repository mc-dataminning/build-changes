import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ezh extends eyy {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 20;
   public static final int o = 8;
   protected static final ezh.b p = $$0 -> $$0.get();
   protected final ezh.c q;
   protected final ezh.b r;

   public static ezh.a a(vq $$0, ezh.c $$1) {
      return new ezh.a($$0, $$1);
   }

   protected ezh(int $$0, int $$1, int $$2, int $$3, vq $$4, ezh.c $$5, ezh.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.q = $$5;
      this.r = $$6;
   }

   @Override
   public void b() {
      this.q.onPress(this);
   }

   @Override
   protected we aN_() {
      return this.r.createNarrationMessage(() -> super.aN_());
   }

   @Override
   public void a(fdc $$0) {
      this.c($$0);
   }

   public static class a {
      private final vq a;
      private final ezh.c b;
      @Nullable
      private fas c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private ezh.b h = ezh.p;

      public a(vq $$0, ezh.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ezh.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public ezh.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public ezh.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public ezh.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public ezh.a a(@Nullable fas $$0) {
         this.c = $$0;
         return this;
      }

      public ezh.a a(ezh.b $$0) {
         this.h = $$0;
         return this;
      }

      public ezh a() {
         ezh $$0 = new ezh(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      we createNarrationMessage(Supplier<we> var1);
   }

   public interface c {
      void onPress(ezh var1);
   }
}
