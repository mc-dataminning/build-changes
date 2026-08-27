import java.util.function.Function;
import javax.annotation.Nullable;

public class aee implements xg<adk> {
   private final int a;
   private final aee.a b;
   private final boolean c;
   static final aee.a d = new aee.a() {
      @Override
      public aee.b a() {
         return aee.b.b;
      }

      @Override
      public void a(aee.c $$0) {
         $$0.a();
      }

      @Override
      public void a(uj $$0) {
      }
   };

   private aee(int $$0, boolean $$1, aee.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static aee a(blw $$0, boolean $$1) {
      return new aee($$0.aj(), $$1, d);
   }

   public static aee a(blw $$0, boolean $$1, bkb $$2) {
      return new aee($$0.aj(), $$1, new aee.d($$2));
   }

   public static aee a(blw $$0, boolean $$1, bkb $$2, emc $$3) {
      return new aee($$0.aj(), $$1, new aee.e($$2, $$3));
   }

   public aee(uj $$0) {
      this.a = $$0.n();
      aee.b $$1 = $$0.b(aee.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(adk $$0) {
      $$0.a(this);
   }

   @Nullable
   public blw a(ane $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(aee.c $$0) {
      this.b.a($$0);
   }

   interface a {
      aee.b a();

      void a(aee.c var1);

      void a(uj var1);
   }

   static enum b {
      a(aee.d::new),
      b($$0 -> aee.d),
      c(aee.e::new);

      final Function<uj, aee.a> d;

      private b(Function<uj, aee.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bkb var1);

      void a(bkb var1, emc var2);

      void a();
   }

   static class d implements aee.a {
      private final bkb a;

      d(bkb $$0) {
         this.a = $$0;
      }

      private d(uj $$0) {
         this.a = $$0.b(bkb.class);
      }

      @Override
      public aee.b a() {
         return aee.b.a;
      }

      @Override
      public void a(aee.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(uj $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements aee.a {
      private final bkb a;
      private final emc b;

      e(bkb $$0, emc $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(uj $$0) {
         this.b = new emc((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bkb.class);
      }

      @Override
      public aee.b a() {
         return aee.b.c;
      }

      @Override
      public void a(aee.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(uj $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
