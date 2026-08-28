import java.util.function.Function;
import javax.annotation.Nullable;

public class ahp implements zj<agt> {
   public static final za<vy, ahp> a = zj.a(ahp::a, ahp::new);
   private final int b;
   private final ahp.a c;
   private final boolean d;
   static final ahp.a e = new ahp.a() {
      @Override
      public ahp.b a() {
         return ahp.b.b;
      }

      @Override
      public void a(ahp.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vy $$0) {
      }
   };

   private ahp(int $$0, boolean $$1, ahp.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahp a(bwv $$0, boolean $$1) {
      return new ahp($$0.ao(), $$1, e);
   }

   public static ahp a(bwv $$0, boolean $$1, bus $$2) {
      return new ahp($$0.ao(), $$1, new ahp.d($$2));
   }

   public static ahp a(bwv $$0, boolean $$1, bus $$2, ffs $$3) {
      return new ahp($$0.ao(), $$1, new ahp.e($$2, $$3));
   }

   private ahp(vy $$0) {
      this.b = $$0.l();
      ahp.b $$1 = $$0.b(ahp.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zl<ahp> a() {
      return agr.bF;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwv a(aru $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahp.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahp.b a();

      void a(ahp.c var1);

      void a(vy var1);
   }

   static enum b {
      a(ahp.d::new),
      b($$0 -> ahp.e),
      c(ahp.e::new);

      final Function<vy, ahp.a> d;

      private b(final Function<vy, ahp.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bus var1);

      void a(bus var1, ffs var2);

      void a();
   }

   static class d implements ahp.a {
      private final bus a;

      d(bus $$0) {
         this.a = $$0;
      }

      private d(vy $$0) {
         this.a = $$0.b(bus.class);
      }

      @Override
      public ahp.b a() {
         return ahp.b.a;
      }

      @Override
      public void a(ahp.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vy $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahp.a {
      private final bus a;
      private final ffs b;

      e(bus $$0, ffs $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vy $$0) {
         this.b = new ffs((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bus.class);
      }

      @Override
      public ahp.b a() {
         return ahp.b.c;
      }

      @Override
      public void a(ahp.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vy $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}
