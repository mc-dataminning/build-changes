import java.util.function.Function;
import javax.annotation.Nullable;

public class ahd implements zg<agi> {
   public static final yx<vw, ahd> a = zg.a(ahd::a, ahd::new);
   private final int b;
   private final ahd.a c;
   private final boolean d;
   static final ahd.a e = new ahd.a() {
      @Override
      public ahd.b a() {
         return ahd.b.b;
      }

      @Override
      public void a(ahd.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vw $$0) {
      }
   };

   private ahd(int $$0, boolean $$1, ahd.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahd a(bsr $$0, boolean $$1) {
      return new ahd($$0.an(), $$1, e);
   }

   public static ahd a(bsr $$0, boolean $$1, bqq $$2) {
      return new ahd($$0.an(), $$1, new ahd.d($$2));
   }

   public static ahd a(bsr $$0, boolean $$1, bqq $$2, exa $$3) {
      return new ahd($$0.an(), $$1, new ahd.e($$2, $$3));
   }

   private ahd(vw $$0) {
      this.b = $$0.l();
      ahd.b $$1 = $$0.b(ahd.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zi<ahd> a() {
      return agg.by;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   @Nullable
   public bsr a(aqu $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahd.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahd.b a();

      void a(ahd.c var1);

      void a(vw var1);
   }

   static enum b {
      a(ahd.d::new),
      b($$0 -> ahd.e),
      c(ahd.e::new);

      final Function<vw, ahd.a> d;

      private b(final Function<vw, ahd.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bqq var1);

      void a(bqq var1, exa var2);

      void a();
   }

   static class d implements ahd.a {
      private final bqq a;

      d(bqq $$0) {
         this.a = $$0;
      }

      private d(vw $$0) {
         this.a = $$0.b(bqq.class);
      }

      @Override
      public ahd.b a() {
         return ahd.b.a;
      }

      @Override
      public void a(ahd.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vw $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahd.a {
      private final bqq a;
      private final exa b;

      e(bqq $$0, exa $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vw $$0) {
         this.b = new exa((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bqq.class);
      }

      @Override
      public ahd.b a() {
         return ahd.b.c;
      }

      @Override
      public void a(ahd.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vw $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
