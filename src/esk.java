import java.util.function.Supplier;
import javax.annotation.Nullable;

public class esk extends esc {
   public static final int l = 120;
   public static final int m = 150;
   public static final int n = 20;
   protected static final esk.b o = $$0 -> $$0.get();
   protected final esk.c p;
   protected final esk.b q;

   public static esk.a a(tl $$0, esk.c $$1) {
      return new esk.a($$0, $$1);
   }

   protected esk(int $$0, int $$1, int $$2, int $$3, tl $$4, esk.c $$5, esk.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.p = $$5;
      this.q = $$6;
   }

   @Override
   public void c() {
      this.p.onPress(this);
   }

   @Override
   protected tz aE_() {
      return this.q.createNarrationMessage(() -> super.aE_());
   }

   @Override
   public void a(ewd $$0) {
      this.c($$0);
   }

   public static class a {
      private final tl a;
      private final esk.c b;
      @Nullable
      private etv c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private esk.b h = esk.o;

      public a(tl $$0, esk.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public esk.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public esk.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public esk.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public esk.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public esk.a a(@Nullable etv $$0) {
         this.c = $$0;
         return this;
      }

      public esk.a a(esk.b $$0) {
         this.h = $$0;
         return this;
      }

      public esk a() {
         esk $$0 = new esk(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      tz createNarrationMessage(Supplier<tz> var1);
   }

   public interface c {
      void onPress(esk var1);
   }
}
