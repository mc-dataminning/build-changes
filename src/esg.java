import java.util.function.Supplier;
import javax.annotation.Nullable;

public class esg extends ery {
   public static final int l = 120;
   public static final int m = 150;
   public static final int n = 20;
   protected static final esg.b o = $$0 -> $$0.get();
   protected final esg.c p;
   protected final esg.b q;

   public static esg.a a(tf $$0, esg.c $$1) {
      return new esg.a($$0, $$1);
   }

   protected esg(int $$0, int $$1, int $$2, int $$3, tf $$4, esg.c $$5, esg.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.p = $$5;
      this.q = $$6;
   }

   @Override
   public void c() {
      this.p.onPress(this);
   }

   @Override
   protected ts az_() {
      return this.q.createNarrationMessage(() -> super.az_());
   }

   @Override
   public void a(evy $$0) {
      this.c($$0);
   }

   public static class a {
      private final tf a;
      private final esg.c b;
      @Nullable
      private etq c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private esg.b h = esg.o;

      public a(tf $$0, esg.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public esg.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public esg.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public esg.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public esg.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public esg.a a(@Nullable etq $$0) {
         this.c = $$0;
         return this;
      }

      public esg.a a(esg.b $$0) {
         this.h = $$0;
         return this;
      }

      public esg a() {
         esg $$0 = new esg(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      ts createNarrationMessage(Supplier<ts> var1);
   }

   public interface c {
      void onPress(esg var1);
   }
}
