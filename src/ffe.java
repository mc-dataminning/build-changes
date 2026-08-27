import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ffe extends fev {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final ffe.b q = $$0 -> $$0.get();
   protected final ffe.c r;
   protected final ffe.b s;

   public static ffe.a a(wu $$0, ffe.c $$1) {
      return new ffe.a($$0, $$1);
   }

   protected ffe(int $$0, int $$1, int $$2, int $$3, wu $$4, ffe.c $$5, ffe.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected xi aK_() {
      return this.s.createNarrationMessage(() -> super.aK_());
   }

   @Override
   public void a(fja $$0) {
      this.c($$0);
   }

   public static class a {
      private final wu a;
      private final ffe.c b;
      @Nullable
      private fgp c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private ffe.b h = ffe.q;

      public a(wu $$0, ffe.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ffe.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public ffe.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public ffe.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public ffe.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public ffe.a a(@Nullable fgp $$0) {
         this.c = $$0;
         return this;
      }

      public ffe.a a(ffe.b $$0) {
         this.h = $$0;
         return this;
      }

      public ffe a() {
         ffe $$0 = new ffe(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      xi createNarrationMessage(Supplier<xi> var1);
   }

   public interface c {
      void onPress(ffe var1);
   }
}
