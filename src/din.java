import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class din extends dgu {
   public static final MapCodec<din> a = b(din::new);
   public static final dru b = drt.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final evf f = dea.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final evf g = dea.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final evf h = dea.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final evf i = dea.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final evf j = dea.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final evf k = dea.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final evf l = dea.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final evf m = dea.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<din> a() {
      return a;
   }

   protected din(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, it.c).a(b, Boolean.valueOf(false)).a(K, dro.b));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      switch ((dro)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((it)$$0.c(aE)) {
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
            switch ($$0.c(aE).o()) {
               case a:
                  return m;
               case c:
               default:
                  return l;
            }
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         drd $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return bpw.a;
      } else {
         drd $$6 = this.d($$0, $$1, $$2);
         float $$7 = $$6.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, avi.nU, avj.e, 0.3F, $$7);
         $$1.a($$3, $$6.c(b) ? dvw.a : dvw.e, $$2);
         return bpw.b;
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dar $$3, BiConsumer<ctq, io> $$4) {
      if ($$3.j() == dar.a.d && !$$1.x_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public drd d(drd $$0, daz $$1, io $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(drd $$0, dba $$1, io $$2, float $$3) {
      it $$4 = $$0.c(aE).g();
      it $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new ks(ks.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(drd $$0) {
      return true;
   }

   private void e(drd $$0, daz $$1, io $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(K, aE, b);
   }
}
