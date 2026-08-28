import java.util.function.Function;
import javax.annotation.Nullable;

public class aii implements aac<ahm> {
   public static final zt<ws, aii> a = aac.a(aii::a, aii::new);
   private final int b;
   private final aii.a c;
   private final boolean d;
   static final aii.a e = new aii.a() {
      @Override
      public aii.b a() {
         return aii.b.b;
      }

      @Override
      public void a(aii.c $$0) {
         $$0.a();
      }

      @Override
      public void a(ws $$0) {
      }
   };

   private aii(int $$0, boolean $$1, aii.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static aii a(bvj $$0, boolean $$1) {
      return new aii($$0.ar(), $$1, e);
   }

   public static aii a(bvj $$0, boolean $$1, bth $$2) {
      return new aii($$0.ar(), $$1, new aii.d($$2));
   }

   public static aii a(bvj $$0, boolean $$1, bth $$2, fbx $$3) {
      return new aii($$0.ar(), $$1, new aii.e($$2, $$3));
   }

   private aii(ws $$0) {
      this.b = $$0.l();
      aii.b $$1 = $$0.b(aii.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(ws $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public aae<aii> a() {
      return ahk.bF;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   @Nullable
   public bvj a(ash $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(aii.c $$0) {
      this.c.a($$0);
   }

   interface a {
      aii.b a();

      void a(aii.c var1);

      void a(ws var1);
   }

   static enum b {
      a(aii.d::new),
      b($$0 -> aii.e),
      c(aii.e::new);

      final Function<ws, aii.a> d;

      private b(final Function<ws, aii.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bth var1);

      void a(bth var1, fbx var2);

      void a();
   }

   static class d implements aii.a {
      private final bth a;

      d(bth $$0) {
         this.a = $$0;
      }

      private d(ws $$0) {
         this.a = $$0.b(bth.class);
      }

      @Override
      public aii.b a() {
         return aii.b.a;
      }

      @Override
      public void a(aii.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(ws $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements aii.a {
      private final bth a;
      private final fbx b;

      e(bth $$0, fbx $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(ws $$0) {
         this.b = new fbx((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bth.class);
      }

      @Override
      public aii.b a() {
         return aii.b.c;
      }

      @Override
      public void a(aii.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(ws $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}
