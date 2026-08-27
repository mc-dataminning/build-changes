import java.util.function.Function;
import javax.annotation.Nullable;

public class afp implements xz<aev> {
   public static final xq<us, afp> a = xz.a(afp::a, afp::new);
   private final int b;
   private final afp.a c;
   private final boolean d;
   static final afp.a e = new afp.a() {
      @Override
      public afp.b a() {
         return afp.b.b;
      }

      @Override
      public void a(afp.c $$0) {
         $$0.a();
      }

      @Override
      public void a(us $$0) {
      }
   };

   private afp(int $$0, boolean $$1, afp.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static afp a(bof $$0, boolean $$1) {
      return new afp($$0.aj(), $$1, e);
   }

   public static afp a(bof $$0, boolean $$1, bmk $$2) {
      return new afp($$0.aj(), $$1, new afp.d($$2));
   }

   public static afp a(bof $$0, boolean $$1, bmk $$2, eov $$3) {
      return new afp($$0.aj(), $$1, new afp.e($$2, $$3));
   }

   private afp(us $$0) {
      this.b = $$0.l();
      afp.b $$1 = $$0.b(afp.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(us $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public yb<afp> a() {
      return aet.bw;
   }

   public void a(aev $$0) {
      $$0.a(this);
   }

   @Nullable
   public bof a(apa $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(afp.c $$0) {
      this.c.a($$0);
   }

   interface a {
      afp.b a();

      void a(afp.c var1);

      void a(us var1);
   }

   static enum b {
      a(afp.d::new),
      b($$0 -> afp.e),
      c(afp.e::new);

      final Function<us, afp.a> d;

      private b(Function<us, afp.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bmk var1);

      void a(bmk var1, eov var2);

      void a();
   }

   static class d implements afp.a {
      private final bmk a;

      d(bmk $$0) {
         this.a = $$0;
      }

      private d(us $$0) {
         this.a = $$0.b(bmk.class);
      }

      @Override
      public afp.b a() {
         return afp.b.a;
      }

      @Override
      public void a(afp.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(us $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements afp.a {
      private final bmk a;
      private final eov b;

      e(bmk $$0, eov $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(us $$0) {
         this.b = new eov((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bmk.class);
      }

      @Override
      public afp.b a() {
         return afp.b.c;
      }

      @Override
      public void a(afp.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(us $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
