import java.util.function.Function;
import javax.annotation.Nullable;

public class agy implements ze<agd> {
   public static final yv<vx, agy> a = ze.a(agy::a, agy::new);
   private final int b;
   private final agy.a c;
   private final boolean d;
   static final agy.a e = new agy.a() {
      @Override
      public agy.b a() {
         return agy.b.b;
      }

      @Override
      public void a(agy.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vx $$0) {
      }
   };

   private agy(int $$0, boolean $$1, agy.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static agy a(bru $$0, boolean $$1) {
      return new agy($$0.al(), $$1, e);
   }

   public static agy a(bru $$0, boolean $$1, bpt $$2) {
      return new agy($$0.al(), $$1, new agy.d($$2));
   }

   public static agy a(bru $$0, boolean $$1, bpt $$2, euk $$3) {
      return new agy($$0.al(), $$1, new agy.e($$2, $$3));
   }

   private agy(vx $$0) {
      this.b = $$0.l();
      agy.b $$1 = $$0.b(agy.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zg<agy> a() {
      return agb.bx;
   }

   public void a(agd $$0) {
      $$0.a(this);
   }

   @Nullable
   public bru a(aqm $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(agy.c $$0) {
      this.c.a($$0);
   }

   interface a {
      agy.b a();

      void a(agy.c var1);

      void a(vx var1);
   }

   static enum b {
      a(agy.d::new),
      b($$0 -> agy.e),
      c(agy.e::new);

      final Function<vx, agy.a> d;

      private b(Function<vx, agy.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bpt var1);

      void a(bpt var1, euk var2);

      void a();
   }

   static class d implements agy.a {
      private final bpt a;

      d(bpt $$0) {
         this.a = $$0;
      }

      private d(vx $$0) {
         this.a = $$0.b(bpt.class);
      }

      @Override
      public agy.b a() {
         return agy.b.a;
      }

      @Override
      public void a(agy.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vx $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements agy.a {
      private final bpt a;
      private final euk b;

      e(bpt $$0, euk $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vx $$0) {
         this.b = new euk((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bpt.class);
      }

      @Override
      public agy.b a() {
         return agy.b.c;
      }

      @Override
      public void a(agy.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vx $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
