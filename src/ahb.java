import java.util.function.Function;
import javax.annotation.Nullable;

public class ahb implements yv<agf> {
   public static final ym<vl, ahb> a = yv.a(ahb::a, ahb::new);
   private final int b;
   private final ahb.a c;
   private final boolean d;
   static final ahb.a e = new ahb.a() {
      @Override
      public ahb.b a() {
         return ahb.b.b;
      }

      @Override
      public void a(ahb.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vl $$0) {
      }
   };

   private ahb(int $$0, boolean $$1, ahb.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahb a(buj $$0, boolean $$1) {
      return new ahb($$0.ar(), $$1, e);
   }

   public static ahb a(buj $$0, boolean $$1, bsh $$2) {
      return new ahb($$0.ar(), $$1, new ahb.d($$2));
   }

   public static ahb a(buj $$0, boolean $$1, bsh $$2, fay $$3) {
      return new ahb($$0.ar(), $$1, new ahb.e($$2, $$3));
   }

   private ahb(vl $$0) {
      this.b = $$0.l();
      ahb.b $$1 = $$0.b(ahb.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public yx<ahb> a() {
      return agd.bF;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   @Nullable
   public buj a(arc $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahb.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahb.b a();

      void a(ahb.c var1);

      void a(vl var1);
   }

   static enum b {
      a(ahb.d::new),
      b($$0 -> ahb.e),
      c(ahb.e::new);

      final Function<vl, ahb.a> d;

      private b(final Function<vl, ahb.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bsh var1);

      void a(bsh var1, fay var2);

      void a();
   }

   static class d implements ahb.a {
      private final bsh a;

      d(bsh $$0) {
         this.a = $$0;
      }

      private d(vl $$0) {
         this.a = $$0.b(bsh.class);
      }

      @Override
      public ahb.b a() {
         return ahb.b.a;
      }

      @Override
      public void a(ahb.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vl $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahb.a {
      private final bsh a;
      private final fay b;

      e(bsh $$0, fay $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vl $$0) {
         this.b = new fay((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bsh.class);
      }

      @Override
      public ahb.b a() {
         return ahb.b.c;
      }

      @Override
      public void a(ahb.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vl $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}
