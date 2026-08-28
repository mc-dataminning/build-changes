import java.util.function.Function;
import javax.annotation.Nullable;

public class ahl implements zf<agp> {
   public static final yw<vu, ahl> a = zf.a(ahl::a, ahl::new);
   private final int b;
   private final ahl.a c;
   private final boolean d;
   static final ahl.a e = new ahl.a() {
      @Override
      public ahl.b a() {
         return ahl.b.b;
      }

      @Override
      public void a(ahl.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vu $$0) {
      }
   };

   private ahl(int $$0, boolean $$1, ahl.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahl a(bwd $$0, boolean $$1) {
      return new ahl($$0.ar(), $$1, e);
   }

   public static ahl a(bwd $$0, boolean $$1, bua $$2) {
      return new ahl($$0.ar(), $$1, new ahl.d($$2));
   }

   public static ahl a(bwd $$0, boolean $$1, bua $$2, fei $$3) {
      return new ahl($$0.ar(), $$1, new ahl.e($$2, $$3));
   }

   private ahl(vu $$0) {
      this.b = $$0.l();
      ahl.b $$1 = $$0.b(ahl.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zh<ahl> a() {
      return agn.bF;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwd a(arq $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahl.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahl.b a();

      void a(ahl.c var1);

      void a(vu var1);
   }

   static enum b {
      a(ahl.d::new),
      b($$0 -> ahl.e),
      c(ahl.e::new);

      final Function<vu, ahl.a> d;

      private b(final Function<vu, ahl.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bua var1);

      void a(bua var1, fei var2);

      void a();
   }

   static class d implements ahl.a {
      private final bua a;

      d(bua $$0) {
         this.a = $$0;
      }

      private d(vu $$0) {
         this.a = $$0.b(bua.class);
      }

      @Override
      public ahl.b a() {
         return ahl.b.a;
      }

      @Override
      public void a(ahl.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vu $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahl.a {
      private final bua a;
      private final fei b;

      e(bua $$0, fei $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vu $$0) {
         this.b = new fei((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bua.class);
      }

      @Override
      public ahl.b a() {
         return ahl.b.c;
      }

      @Override
      public void a(ahl.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vu $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}
