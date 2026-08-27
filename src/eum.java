import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eum extends eue {
   public static final int l = 120;
   public static final int m = 150;
   public static final int n = 20;
   public static final int o = 8;
   protected static final eum.b p = $$0 -> $$0.get();
   protected final eum.c q;
   protected final eum.b r;

   public static eum.a a(ur $$0, eum.c $$1) {
      return new eum.a($$0, $$1);
   }

   protected eum(int $$0, int $$1, int $$2, int $$3, ur $$4, eum.c $$5, eum.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.q = $$5;
      this.r = $$6;
   }

   @Override
   public void b() {
      this.q.onPress(this);
   }

   @Override
   protected vf aL_() {
      return this.r.createNarrationMessage(() -> super.aL_());
   }

   @Override
   public void a(eyf $$0) {
      this.c($$0);
   }

   public static class a {
      private final ur a;
      private final eum.c b;
      @Nullable
      private evx c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private eum.b h = eum.p;

      public a(ur $$0, eum.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public eum.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public eum.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public eum.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public eum.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public eum.a a(@Nullable evx $$0) {
         this.c = $$0;
         return this;
      }

      public eum.a a(eum.b $$0) {
         this.h = $$0;
         return this;
      }

      public eum a() {
         eum $$0 = new eum(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      vf createNarrationMessage(Supplier<vf> var1);
   }

   public interface c {
      void onPress(eum var1);
   }
}
