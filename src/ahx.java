import java.util.function.Function;
import javax.annotation.Nullable;

public class ahx implements zr<ahb> {
   public static final zi<wh, ahx> a = zr.a(ahx::a, ahx::new);
   private final int b;
   private final ahx.a c;
   private final boolean d;
   static final ahx.a e = new ahx.a() {
      @Override
      public ahx.b a() {
         return ahx.b.b;
      }

      @Override
      public void a(ahx.c $$0) {
         $$0.a();
      }

      @Override
      public void a(wh $$0) {
      }
   };

   private ahx(int $$0, boolean $$1, ahx.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahx a(bvb $$0, boolean $$1) {
      return new ahx($$0.ar(), $$1, e);
   }

   public static ahx a(bvb $$0, boolean $$1, bsz $$2) {
      return new ahx($$0.ar(), $$1, new ahx.d($$2));
   }

   public static ahx a(bvb $$0, boolean $$1, bsz $$2, fbr $$3) {
      return new ahx($$0.ar(), $$1, new ahx.e($$2, $$3));
   }

   private ahx(wh $$0) {
      this.b = $$0.l();
      ahx.b $$1 = $$0.b(ahx.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(wh $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zt<ahx> a() {
      return agz.bF;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   @Nullable
   public bvb a(arx $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahx.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahx.b a();

      void a(ahx.c var1);

      void a(wh var1);
   }

   static enum b {
      a(ahx.d::new),
      b($$0 -> ahx.e),
      c(ahx.e::new);

      final Function<wh, ahx.a> d;

      private b(final Function<wh, ahx.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bsz var1);

      void a(bsz var1, fbr var2);

      void a();
   }

   static class d implements ahx.a {
      private final bsz a;

      d(bsz $$0) {
         this.a = $$0;
      }

      private d(wh $$0) {
         this.a = $$0.b(bsz.class);
      }

      @Override
      public ahx.b a() {
         return ahx.b.a;
      }

      @Override
      public void a(ahx.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(wh $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahx.a {
      private final bsz a;
      private final fbr b;

      e(bsz $$0, fbr $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(wh $$0) {
         this.b = new fbr((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bsz.class);
      }

      @Override
      public ahx.b a() {
         return ahx.b.c;
      }

      @Override
      public void a(ahx.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(wh $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}
