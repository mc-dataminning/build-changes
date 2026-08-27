import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ffz extends ffq {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final ffz.b q = $$0 -> $$0.get();
   protected final ffz.c r;
   protected final ffz.b s;

   public static ffz.a a(wx $$0, ffz.c $$1) {
      return new ffz.a($$0, $$1);
   }

   protected ffz(int $$0, int $$1, int $$2, int $$3, wx $$4, ffz.c $$5, ffz.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xl aK_() {
      return this.s.createNarrationMessage(() -> super.aK_());
   }

   @Override
   public void a(fjv $$0) {
      this.c($$0);
   }

   public static class a {
      private final wx a;
      private final ffz.c b;
      @Nullable
      private fhk c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private ffz.b h = ffz.q;

      public a(wx $$0, ffz.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ffz.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public ffz.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public ffz.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public ffz.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public ffz.a a(@Nullable fhk $$0) {
         this.c = $$0;
         return this;
      }

      public ffz.a a(ffz.b $$0) {
         this.h = $$0;
         return this;
      }

      public ffz a() {
         ffz $$0 = new ffz(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xl createNarrationMessage(Supplier<xl> var1);
   }

   public interface c {
      void onPress(ffz var1);
   }
}
