import java.util.function.Supplier;
import javax.annotation.Nullable;

public class exg extends ewx {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 20;
   public static final int o = 8;
   protected static final exg.b p = $$0 -> $$0.get();
   protected final exg.c q;
   protected final exg.b r;

   public static exg.a a(vf $$0, exg.c $$1) {
      return new exg.a($$0, $$1);
   }

   protected exg(int $$0, int $$1, int $$2, int $$3, vf $$4, exg.c $$5, exg.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.q = $$5;
      this.r = $$6;
   }

   @Override
   public void b() {
      this.q.onPress(this);
   }

   @Override
   protected vt aK_() {
      return this.r.createNarrationMessage(() -> super.aK_());
   }

   @Override
   public void a(faz $$0) {
      this.c($$0);
   }

   public static class a {
      private final vf a;
      private final exg.c b;
      @Nullable
      private eyr c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private exg.b h = exg.p;

      public a(vf $$0, exg.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public exg.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public exg.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public exg.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public exg.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public exg.a a(@Nullable eyr $$0) {
         this.c = $$0;
         return this;
      }

      public exg.a a(exg.b $$0) {
         this.h = $$0;
         return this;
      }

      public exg a() {
         exg $$0 = new exg(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      vt createNarrationMessage(Supplier<vt> var1);
   }

   public interface c {
      void onPress(exg var1);
   }
}
