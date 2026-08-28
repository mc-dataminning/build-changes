import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dot extends dmz {
   public static final MapCodec<dot> a = b(dot::new);
   public static final dye b = dyd.x;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final fcm f = dke.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final fcm g = dke.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final fcm h = dke.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final fcm i = dke.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final fcm j = dke.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final fcm k = dke.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final fcm l = dke.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final fcm m = dke.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   protected dot(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(L, dxy.b));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      switch ((dxy)$$0.c(L)) {
         case a:
            switch ($$0.c(aF).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((jm)$$0.c(aF)) {
               case f:
                  return i;
               case e:
                  return h;
               case d:
                  return g;
               case c:
               default:
                  return f;
            }
         case c:
         default:
            switch ($$0.c(aF).o()) {
               case a:
                  return m;
               case c:
               default:
                  return l;
            }
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if ($$1.C) {
         dxn $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return bte.a;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, dgs $$3, BiConsumer<cxk, jh> $$4) {
      if ($$3.g()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(dxn $$0, dha $$1, jh $$2, @Nullable cps $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? ecj.a : ecj.e, $$2);
   }

   protected static void a(@Nullable cps $$0, dhb $$1, jh $$2, dxn $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, axf.ol, axg.e, 0.3F, $$4);
   }

   private static void a(dxn $$0, dhb $$1, jh $$2, float $$3) {
      jm $$4 = $$0.c(aF).g();
      jm $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new ln(ln.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dxn $$0) {
      return true;
   }

   private void e(dxn $$0, dha $$1, jh $$2) {
      jm $$3 = n($$0).g();
      eux $$4 = eut.a($$1, $$3, $$3.o().d() ? jm.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(L, aF, b);
   }
}
