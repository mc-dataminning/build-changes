import java.util.function.Function;
import javax.annotation.Nullable;

public class abo implements uw<aav> {
   private final int a;
   private final abo.a b;
   private final boolean c;
   static final abo.a d = new abo.a() {
      @Override
      public abo.b a() {
         return abo.b.b;
      }

      @Override
      public void a(abo.c $$0) {
         $$0.a();
      }

      @Override
      public void a(sh $$0) {
      }
   };

   private abo(int $$0, boolean $$1, abo.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static abo a(big $$0, boolean $$1) {
      return new abo($$0.ah(), $$1, d);
   }

   public static abo a(big $$0, boolean $$1, bgn $$2) {
      return new abo($$0.ah(), $$1, new abo.d($$2));
   }

   public static abo a(big $$0, boolean $$1, bgn $$2, ehf $$3) {
      return new abo($$0.ah(), $$1, new abo.e($$2, $$3));
   }

   public abo(sh $$0) {
      this.a = $$0.m();
      abo.b $$1 = $$0.b(abo.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   @Nullable
   public big a(aki $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(abo.c $$0) {
      this.b.a($$0);
   }

   interface a {
      abo.b a();

      void a(abo.c var1);

      void a(sh var1);
   }

   static enum b {
      a(abo.d::new),
      b($$0 -> abo.d),
      c(abo.e::new);

      final Function<sh, abo.a> d;

      private b(Function<sh, abo.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bgn var1);

      void a(bgn var1, ehf var2);

      void a();
   }

   static class d implements abo.a {
      private final bgn a;

      d(bgn $$0) {
         this.a = $$0;
      }

      private d(sh $$0) {
         this.a = $$0.b(bgn.class);
      }

      @Override
      public abo.b a() {
         return abo.b.a;
      }

      @Override
      public void a(abo.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(sh $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements abo.a {
      private final bgn a;
      private final ehf b;

      e(bgn $$0, ehf $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(sh $$0) {
         this.b = new ehf((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bgn.class);
      }

      @Override
      public abo.b a() {
         return abo.b.c;
      }

      @Override
      public void a(abo.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(sh $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
