import java.util.function.Function;
import javax.annotation.Nullable;

public class ahc implements zf<agh> {
   public static final yw<vv, ahc> a = zf.a(ahc::a, ahc::new);
   private final int b;
   private final ahc.a c;
   private final boolean d;
   static final ahc.a e = new ahc.a() {
      @Override
      public ahc.b a() {
         return ahc.b.b;
      }

      @Override
      public void a(ahc.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vv $$0) {
      }
   };

   private ahc(int $$0, boolean $$1, ahc.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahc a(bsq $$0, boolean $$1) {
      return new ahc($$0.an(), $$1, e);
   }

   public static ahc a(bsq $$0, boolean $$1, bqp $$2) {
      return new ahc($$0.an(), $$1, new ahc.d($$2));
   }

   public static ahc a(bsq $$0, boolean $$1, bqp $$2, eww $$3) {
      return new ahc($$0.an(), $$1, new ahc.e($$2, $$3));
   }

   private ahc(vv $$0) {
      this.b = $$0.l();
      ahc.b $$1 = $$0.b(ahc.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vv $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zh<ahc> a() {
      return agf.by;
   }

   public void a(agh $$0) {
      $$0.a(this);
   }

   @Nullable
   public bsq a(aqt $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahc.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahc.b a();

      void a(ahc.c var1);

      void a(vv var1);
   }

   static enum b {
      a(ahc.d::new),
      b($$0 -> ahc.e),
      c(ahc.e::new);

      final Function<vv, ahc.a> d;

      private b(final Function<vv, ahc.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bqp var1);

      void a(bqp var1, eww var2);

      void a();
   }

   static class d implements ahc.a {
      private final bqp a;

      d(bqp $$0) {
         this.a = $$0;
      }

      private d(vv $$0) {
         this.a = $$0.b(bqp.class);
      }

      @Override
      public ahc.b a() {
         return ahc.b.a;
      }

      @Override
      public void a(ahc.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vv $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahc.a {
      private final bqp a;
      private final eww b;

      e(bqp $$0, eww $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vv $$0) {
         this.b = new eww((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bqp.class);
      }

      @Override
      public ahc.b a() {
         return ahc.b.c;
      }

      @Override
      public void a(ahc.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vv $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
