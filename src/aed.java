import java.util.function.Function;
import javax.annotation.Nullable;

public class aed implements xf<adj> {
   private final int a;
   private final aed.a b;
   private final boolean c;
   static final aed.a d = new aed.a() {
      @Override
      public aed.b a() {
         return aed.b.b;
      }

      @Override
      public void a(aed.c $$0) {
         $$0.a();
      }

      @Override
      public void a(ui $$0) {
      }
   };

   private aed(int $$0, boolean $$1, aed.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static aed a(blu $$0, boolean $$1) {
      return new aed($$0.aj(), $$1, d);
   }

   public static aed a(blu $$0, boolean $$1, bjz $$2) {
      return new aed($$0.aj(), $$1, new aed.d($$2));
   }

   public static aed a(blu $$0, boolean $$1, bjz $$2, els $$3) {
      return new aed($$0.aj(), $$1, new aed.e($$2, $$3));
   }

   public aed(ui $$0) {
      this.a = $$0.n();
      aed.b $$1 = $$0.b(aed.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   @Nullable
   public blu a(and $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(aed.c $$0) {
      this.b.a($$0);
   }

   interface a {
      aed.b a();

      void a(aed.c var1);

      void a(ui var1);
   }

   static enum b {
      a(aed.d::new),
      b($$0 -> aed.d),
      c(aed.e::new);

      final Function<ui, aed.a> d;

      private b(Function<ui, aed.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bjz var1);

      void a(bjz var1, els var2);

      void a();
   }

   static class d implements aed.a {
      private final bjz a;

      d(bjz $$0) {
         this.a = $$0;
      }

      private d(ui $$0) {
         this.a = $$0.b(bjz.class);
      }

      @Override
      public aed.b a() {
         return aed.b.a;
      }

      @Override
      public void a(aed.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(ui $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements aed.a {
      private final bjz a;
      private final els b;

      e(bjz $$0, els $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(ui $$0) {
         this.b = new els((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bjz.class);
      }

      @Override
      public aed.b a() {
         return aed.b.c;
      }

      @Override
      public void a(aed.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(ui $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
