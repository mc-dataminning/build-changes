import java.util.function.Supplier;
import javax.annotation.Nullable;

public class esi extends esa {
   public static final int l = 120;
   public static final int m = 150;
   public static final int n = 20;
   protected static final esi.b o = $$0 -> $$0.get();
   protected final esi.c p;
   protected final esi.b q;

   public static esi.a a(te $$0, esi.c $$1) {
      return new esi.a($$0, $$1);
   }

   protected esi(int $$0, int $$1, int $$2, int $$3, te $$4, esi.c $$5, esi.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.p = $$5;
      this.q = $$6;
   }

   @Override
   public void c() {
      this.p.onPress(this);
   }

   @Override
   protected tr aB_() {
      return this.q.createNarrationMessage(() -> super.aB_());
   }

   @Override
   public void a(evt $$0) {
      this.c($$0);
   }

   public static class a {
      private final te a;
      private final esi.c b;
      @Nullable
      private etr c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private esi.b h = esi.o;

      public a(te $$0, esi.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public esi.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public esi.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public esi.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public esi.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public esi.a a(@Nullable etr $$0) {
         this.c = $$0;
         return this;
      }

      public esi.a a(esi.b $$0) {
         this.h = $$0;
         return this;
      }

      public esi a() {
         esi $$0 = new esi(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      tr createNarrationMessage(Supplier<tr> var1);
   }

   public interface c {
      void onPress(esi var1);
   }
}
