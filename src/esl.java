import java.util.function.Supplier;
import javax.annotation.Nullable;

public class esl extends esd {
   public static final int l = 120;
   public static final int m = 150;
   public static final int n = 20;
   protected static final esl.b o = $$0 -> $$0.get();
   protected final esl.c p;
   protected final esl.b q;

   public static esl.a a(ti $$0, esl.c $$1) {
      return new esl.a($$0, $$1);
   }

   protected esl(int $$0, int $$1, int $$2, int $$3, ti $$4, esl.c $$5, esl.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.p = $$5;
      this.q = $$6;
   }

   @Override
   public void c() {
      this.p.onPress(this);
   }

   @Override
   protected tv aA_() {
      return this.q.createNarrationMessage(() -> super.aA_());
   }

   @Override
   public void a(ewd $$0) {
      this.c($$0);
   }

   public static class a {
      private final ti a;
      private final esl.c b;
      @Nullable
      private etv c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private esl.b h = esl.o;

      public a(ti $$0, esl.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public esl.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public esl.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public esl.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public esl.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public esl.a a(@Nullable etv $$0) {
         this.c = $$0;
         return this;
      }

      public esl.a a(esl.b $$0) {
         this.h = $$0;
         return this;
      }

      public esl a() {
         esl $$0 = new esl(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      tv createNarrationMessage(Supplier<tv> var1);
   }

   public interface c {
      void onPress(esl var1);
   }
}
