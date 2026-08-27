import java.util.function.Function;
import javax.annotation.Nullable;

public class abt implements va<aaz> {
   private final int a;
   private final abt.a b;
   private final boolean c;
   static final abt.a d = new abt.a() {
      @Override
      public abt.b a() {
         return abt.b.b;
      }

      @Override
      public void a(abt.c $$0) {
         $$0.a();
      }

      @Override
      public void a(sl $$0) {
      }
   };

   private abt(int $$0, boolean $$1, abt.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static abt a(bil $$0, boolean $$1) {
      return new abt($$0.ah(), $$1, d);
   }

   public static abt a(bil $$0, boolean $$1, bgs $$2) {
      return new abt($$0.ah(), $$1, new abt.d($$2));
   }

   public static abt a(bil $$0, boolean $$1, bgs $$2, ehi $$3) {
      return new abt($$0.ah(), $$1, new abt.e($$2, $$3));
   }

   public abt(sl $$0) {
      this.a = $$0.m();
      abt.b $$1 = $$0.b(abt.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sl $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(aaz $$0) {
      $$0.a(this);
   }

   @Nullable
   public bil a(akn $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(abt.c $$0) {
      this.b.a($$0);
   }

   interface a {
      abt.b a();

      void a(abt.c var1);

      void a(sl var1);
   }

   static enum b {
      a(abt.d::new),
      b($$0 -> abt.d),
      c(abt.e::new);

      final Function<sl, abt.a> d;

      private b(Function<sl, abt.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bgs var1);

      void a(bgs var1, ehi var2);

      void a();
   }

   static class d implements abt.a {
      private final bgs a;

      d(bgs $$0) {
         this.a = $$0;
      }

      private d(sl $$0) {
         this.a = $$0.b(bgs.class);
      }

      @Override
      public abt.b a() {
         return abt.b.a;
      }

      @Override
      public void a(abt.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(sl $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements abt.a {
      private final bgs a;
      private final ehi b;

      e(bgs $$0, ehi $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(sl $$0) {
         this.b = new ehi((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bgs.class);
      }

      @Override
      public abt.b a() {
         return abt.b.c;
      }

      @Override
      public void a(abt.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(sl $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
