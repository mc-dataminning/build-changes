import java.util.function.Function;
import javax.annotation.Nullable;

public class ahw implements zo<aha> {
   public static final ze<vy, ahw> a = zo.a(ahw::a, ahw::new);
   private final int b;
   private final ahw.a c;
   private final boolean d;
   static final ahw.a e = new ahw.a() {
      @Override
      public ahw.b a() {
         return ahw.b.b;
      }

      @Override
      public void a(ahw.c $$0) {
         $$0.a();
      }

      @Override
      public void a(vy $$0) {
      }
   };

   private ahw(int $$0, boolean $$1, ahw.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahw a(bxe $$0, boolean $$1) {
      return new ahw($$0.ao(), $$1, e);
   }

   public static ahw a(bxe $$0, boolean $$1, bvb $$2) {
      return new ahw($$0.ao(), $$1, new ahw.d($$2));
   }

   public static ahw a(bxe $$0, boolean $$1, bvb $$2, fgc $$3) {
      return new ahw($$0.ao(), $$1, new ahw.e($$2, $$3));
   }

   private ahw(vy $$0) {
      this.b = $$0.l();
      ahw.b $$1 = $$0.b(ahw.b.class);
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
   public zq<ahw> a() {
      return agy.bF;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   @Nullable
   public bxe a(asb $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahw.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahw.b a();

      void a(ahw.c var1);

      void a(vy var1);
   }

   static enum b {
      a(ahw.d::new),
      b($$0 -> ahw.e),
      c(ahw.e::new);

      final Function<vy, ahw.a> d;

      private b(final Function<vy, ahw.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bvb var1);

      void a(bvb var1, fgc var2);

      void a();
   }

   static class d implements ahw.a {
      private final bvb a;

      d(bvb $$0) {
         this.a = $$0;
      }

      private d(vy $$0) {
         this.a = $$0.b(bvb.class);
      }

      @Override
      public ahw.b a() {
         return ahw.b.a;
      }

      @Override
      public void a(ahw.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(vy $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahw.a {
      private final bvb a;
      private final fgc b;

      e(bvb $$0, fgc $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(vy $$0) {
         this.b = new fgc((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bvb.class);
      }

      @Override
      public ahw.b a() {
         return ahw.b.c;
      }

      @Override
      public void a(ahw.c $$0) {
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
