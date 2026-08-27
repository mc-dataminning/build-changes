import java.util.function.Function;
import javax.annotation.Nullable;

public class adf implements wk<acl> {
   private final int a;
   private final adf.a b;
   private final boolean c;
   static final adf.a d = new adf.a() {
      @Override
      public adf.b a() {
         return adf.b.b;
      }

      @Override
      public void a(adf.c $$0) {
         $$0.a();
      }

      @Override
      public void a(tu $$0) {
      }
   };

   private adf(int $$0, boolean $$1, adf.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static adf a(bkq $$0, boolean $$1) {
      return new adf($$0.aj(), $$1, d);
   }

   public static adf a(bkq $$0, boolean $$1, biw $$2) {
      return new adf($$0.aj(), $$1, new adf.d($$2));
   }

   public static adf a(bkq $$0, boolean $$1, biw $$2, eju $$3) {
      return new adf($$0.aj(), $$1, new adf.e($$2, $$3));
   }

   public adf(tu $$0) {
      this.a = $$0.n();
      adf.b $$1 = $$0.b(adf.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(acl $$0) {
      $$0.a(this);
   }

   @Nullable
   public bkq a(ame $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(adf.c $$0) {
      this.b.a($$0);
   }

   interface a {
      adf.b a();

      void a(adf.c var1);

      void a(tu var1);
   }

   static enum b {
      a(adf.d::new),
      b($$0 -> adf.d),
      c(adf.e::new);

      final Function<tu, adf.a> d;

      private b(Function<tu, adf.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(biw var1);

      void a(biw var1, eju var2);

      void a();
   }

   static class d implements adf.a {
      private final biw a;

      d(biw $$0) {
         this.a = $$0;
      }

      private d(tu $$0) {
         this.a = $$0.b(biw.class);
      }

      @Override
      public adf.b a() {
         return adf.b.a;
      }

      @Override
      public void a(adf.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(tu $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements adf.a {
      private final biw a;
      private final eju b;

      e(biw $$0, eju $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(tu $$0) {
         this.b = new eju((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(biw.class);
      }

      @Override
      public adf.b a() {
         return adf.b.c;
      }

      @Override
      public void a(adf.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(tu $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
