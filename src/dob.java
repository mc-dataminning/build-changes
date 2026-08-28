import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dob extends dmh {
   public static final MapCodec<dob> a = b(dob::new);
   public static final dxo b = dxn.B;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final fbu f = djm.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final fbu g = djm.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final fbu h = djm.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final fbu i = djm.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final fbu j = djm.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final fbu k = djm.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final fbu l = djm.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final fbu m = djm.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dob> a() {
      return a;
   }

   protected dob(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jn.c).b(b, Boolean.valueOf(false)).b(L, dxi.b));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      switch ((dxi)$$0.c(L)) {
         case a:
            switch ($$0.c(aF).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((jn)$$0.c(aF)) {
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
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if ($$1.C) {
         dwx $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return bsj.a;
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, dga $$3, BiConsumer<cwp, ji> $$4) {
      if ($$3.g()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(dwx $$0, dgi $$1, ji $$2, @Nullable cox $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? ebt.a : ebt.e, $$2);
   }

   protected static void a(@Nullable cox $$0, dgj $$1, ji $$2, dwx $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awa.os, awb.e, 0.3F, $$4);
   }

   private static void a(dwx $$0, dgj $$1, ji $$2, float $$3) {
      jn $$4 = $$0.c(aF).g();
      jn $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new lo(16711680, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dwx $$0) {
      return true;
   }

   private void e(dwx $$0, dgi $$1, ji $$2) {
      jn $$3 = n($$0).g();
      euh $$4 = eud.a($$1, $$3, $$3.o().d() ? jn.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(L, aF, b);
   }
}
