import java.util.function.Supplier;
import javax.annotation.Nullable;

public class esq extends esi {
   public static final int l = 120;
   public static final int m = 150;
   public static final int n = 20;
   protected static final esq.b o = $$0 -> $$0.get();
   protected final esq.c p;
   protected final esq.b q;

   public static esq.a a(tm $$0, esq.c $$1) {
      return new esq.a($$0, $$1);
   }

   protected esq(int $$0, int $$1, int $$2, int $$3, tm $$4, esq.c $$5, esq.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.p = $$5;
      this.q = $$6;
   }

   @Override
   public void c() {
      this.p.onPress(this);
   }

   @Override
   protected tz aF_() {
      return this.q.createNarrationMessage(() -> super.aF_());
   }

   @Override
   public void a(ewi $$0) {
      this.c($$0);
   }

   public static class a {
      private final tm a;
      private final esq.c b;
      @Nullable
      private eua c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private esq.b h = esq.o;

      public a(tm $$0, esq.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public esq.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public esq.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public esq.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public esq.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public esq.a a(@Nullable eua $$0) {
         this.c = $$0;
         return this;
      }

      public esq.a a(esq.b $$0) {
         this.h = $$0;
         return this;
      }

      public esq a() {
         esq $$0 = new esq(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      tz createNarrationMessage(Supplier<tz> var1);
   }

   public interface c {
      void onPress(esq var1);
   }
}
