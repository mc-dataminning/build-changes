import java.util.function.Supplier;
import javax.annotation.Nullable;

public class etj extends etb {
   public static final int l = 120;
   public static final int m = 150;
   public static final int n = 20;
   protected static final etj.b o = $$0 -> $$0.get();
   protected final etj.c p;
   protected final etj.b q;

   public static etj.a a(ui $$0, etj.c $$1) {
      return new etj.a($$0, $$1);
   }

   protected etj(int $$0, int $$1, int $$2, int $$3, ui $$4, etj.c $$5, etj.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.p = $$5;
      this.q = $$6;
   }

   @Override
   public void c() {
      this.p.onPress(this);
   }

   @Override
   protected uw aI_() {
      return this.q.createNarrationMessage(() -> super.aI_());
   }

   @Override
   public void a(exc $$0) {
      this.c($$0);
   }

   public static class a {
      private final ui a;
      private final etj.c b;
      @Nullable
      private euu c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private etj.b h = etj.o;

      public a(ui $$0, etj.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public etj.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public etj.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public etj.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public etj.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public etj.a a(@Nullable euu $$0) {
         this.c = $$0;
         return this;
      }

      public etj.a a(etj.b $$0) {
         this.h = $$0;
         return this;
      }

      public etj a() {
         etj $$0 = new etj(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      uw createNarrationMessage(Supplier<uw> var1);
   }

   public interface c {
      void onPress(etj var1);
   }
}
