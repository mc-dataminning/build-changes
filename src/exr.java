import java.util.function.Supplier;
import javax.annotation.Nullable;

public class exr extends exi {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 20;
   public static final int o = 8;
   protected static final exr.b p = $$0 -> $$0.get();
   protected final exr.c q;
   protected final exr.b r;

   public static exr.a a(vg $$0, exr.c $$1) {
      return new exr.a($$0, $$1);
   }

   protected exr(int $$0, int $$1, int $$2, int $$3, vg $$4, exr.c $$5, exr.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.q = $$5;
      this.r = $$6;
   }

   @Override
   public void b() {
      this.q.onPress(this);
   }

   @Override
   protected vu aM_() {
      return this.r.createNarrationMessage(() -> super.aM_());
   }

   @Override
   public void a(fbk $$0) {
      this.c($$0);
   }

   public static class a {
      private final vg a;
      private final exr.c b;
      @Nullable
      private ezc c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private exr.b h = exr.p;

      public a(vg $$0, exr.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public exr.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public exr.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public exr.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public exr.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public exr.a a(@Nullable ezc $$0) {
         this.c = $$0;
         return this;
      }

      public exr.a a(exr.b $$0) {
         this.h = $$0;
         return this;
      }

      public exr a() {
         exr $$0 = new exr(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      vu createNarrationMessage(Supplier<vu> var1);
   }

   public interface c {
      void onPress(exr var1);
   }
}
