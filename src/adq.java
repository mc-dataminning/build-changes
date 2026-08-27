import java.util.function.Function;
import javax.annotation.Nullable;

public class adq implements wu<acw> {
   private final int a;
   private final adq.a b;
   private final boolean c;
   static final adq.a d = new adq.a() {
      @Override
      public adq.b a() {
         return adq.b.b;
      }

      @Override
      public void a(adq.c $$0) {
         $$0.a();
      }

      @Override
      public void a(ue $$0) {
      }
   };

   private adq(int $$0, boolean $$1, adq.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static adq a(blf $$0, boolean $$1) {
      return new adq($$0.aj(), $$1, d);
   }

   public static adq a(blf $$0, boolean $$1, bjk $$2) {
      return new adq($$0.aj(), $$1, new adq.d($$2));
   }

   public static adq a(blf $$0, boolean $$1, bjk $$2, elb $$3) {
      return new adq($$0.aj(), $$1, new adq.e($$2, $$3));
   }

   public adq(ue $$0) {
      this.a = $$0.n();
      adq.b $$1 = $$0.b(adq.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(acw $$0) {
      $$0.a(this);
   }

   @Nullable
   public blf a(amp $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(adq.c $$0) {
      this.b.a($$0);
   }

   interface a {
      adq.b a();

      void a(adq.c var1);

      void a(ue var1);
   }

   static enum b {
      a(adq.d::new),
      b($$0 -> adq.d),
      c(adq.e::new);

      final Function<ue, adq.a> d;

      private b(Function<ue, adq.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bjk var1);

      void a(bjk var1, elb var2);

      void a();
   }

   static class d implements adq.a {
      private final bjk a;

      d(bjk $$0) {
         this.a = $$0;
      }

      private d(ue $$0) {
         this.a = $$0.b(bjk.class);
      }

      @Override
      public adq.b a() {
         return adq.b.a;
      }

      @Override
      public void a(adq.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(ue $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements adq.a {
      private final bjk a;
      private final elb b;

      e(bjk $$0, elb $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(ue $$0) {
         this.b = new elb((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bjk.class);
      }

      @Override
      public adq.b a() {
         return adq.b.c;
      }

      @Override
      public void a(adq.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(ue $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
