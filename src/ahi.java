import java.util.function.Function;
import javax.annotation.Nullable;

public class ahi implements zc<agm> {
   public static final yt<vr, ahi> a = zc.a(ahi::a, ahi::new);
   private final int b;
   private final ahi.a c;
   private final boolean d;
   static final ahi.a e = new ahi.a() {
      @Override
      public ahi.b a() {
         return ahi.b.b;
      }

      @Override
      public void a(ahi.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vr $$0) {
      }
   };

   private ahi(int $$0, boolean $$1, ahi.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahi a(bvs $$0, boolean $$1) {
      return new ahi($$0.ar(), $$1, e);
   }

   public static ahi a(bvs $$0, boolean $$1, btp $$2) {
      return new ahi($$0.ar(), $$1, new ahi.d($$2));
   }

   public static ahi a(bvs $$0, boolean $$1, btp $$2, fcu $$3) {
      return new ahi($$0.ar(), $$1, new ahi.e($$2, $$3));
   }

   private ahi(vr $$0) {
      this.b = $$0.l();
      ahi.b $$1 = $$0.b(ahi.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public ze<ahi> a() {
      return agk.bF;
   }

   public void a(agm $$0) {
      $$0.a(this);
   }

   @Nullable
   public bvs a(arn $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahi.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahi.b a();

      void a(ahi.c var1);

      void a(vr var1);
   }

   static enum b {
      a(ahi.d::new),
      b($$0 -> ahi.e),
      c(ahi.e::new);

      final Function<vr, ahi.a> d;

      private b(final Function<vr, ahi.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(btp var1);

      void a(btp var1, fcu var2);

      void a();
   }

   static class d implements ahi.a {
      private final btp a;

      d(btp $$0) {
         this.a = $$0;
      }

      private d(vr $$0) {
         this.a = $$0.b(btp.class);
      }

      @Override
      public ahi.b a() {
         return ahi.b.a;
      }

      @Override
      public void a(ahi.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vr $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahi.a {
      private final btp a;
      private final fcu b;

      e(btp $$0, fcu $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vr $$0) {
         this.b = new fcu((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(btp.class);
      }

      @Override
      public ahi.b a() {
         return ahi.b.c;
      }

      @Override
      public void a(ahi.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(vr $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}
