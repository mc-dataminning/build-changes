import java.util.function.Function;
import javax.annotation.Nullable;

public class aft implements yb<aez> {
   public static final xs<uu, aft> a = yb.a(aft::a, aft::new);
   private final int b;
   private final aft.a c;
   private final boolean d;
   static final aft.a e = new aft.a() {
      @Override
      public aft.b a() {
         return aft.b.b;
      }

      @Override
      public void a(aft.c $$0) {
         $$0.a();
      }

      @Override
      public void a(uu $$0) {
      }
   };

   private aft(int $$0, boolean $$1, aft.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static aft a(box $$0, boolean $$1) {
      return new aft($$0.aj(), $$1, e);
   }

   public static aft a(box $$0, boolean $$1, bnc $$2) {
      return new aft($$0.aj(), $$1, new aft.d($$2));
   }

   public static aft a(box $$0, boolean $$1, bnc $$2, ept $$3) {
      return new aft($$0.aj(), $$1, new aft.e($$2, $$3));
   }

   private aft(uu $$0) {
      this.b = $$0.l();
      aft.b $$1 = $$0.b(aft.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(uu $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public yd<aft> a() {
      return aex.bw;
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   @Nullable
   public box a(apf $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(aft.c $$0) {
      this.c.a($$0);
   }

   interface a {
      aft.b a();

      void a(aft.c var1);

      void a(uu var1);
   }

   static enum b {
      a(aft.d::new),
      b($$0 -> aft.e),
      c(aft.e::new);

      final Function<uu, aft.a> d;

      private b(Function<uu, aft.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bnc var1);

      void a(bnc var1, ept var2);

      void a();
   }

   static class d implements aft.a {
      private final bnc a;

      d(bnc $$0) {
         this.a = $$0;
      }

      private d(uu $$0) {
         this.a = $$0.b(bnc.class);
      }

      @Override
      public aft.b a() {
         return aft.b.a;
      }

      @Override
      public void a(aft.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(uu $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements aft.a {
      private final bnc a;
      private final ept b;

      e(bnc $$0, ept $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(uu $$0) {
         this.b = new ept((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bnc.class);
      }

      @Override
      public aft.b a() {
         return aft.b.c;
      }

      @Override
      public void a(aft.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(uu $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
