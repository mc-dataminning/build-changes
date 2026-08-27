import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhv extends ddm {
   public static final MapCodec<dhv> a = b(dhv::new);
   public static final drx b = drt.Q;
   public static final dru c = drt.f;
   private static final evf d = dea.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final evf e = dea.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final evf f = evc.a(e, d);
   private static final evf g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final evf h = evc.a(f, g, euq.e);
   private static final evf i = evc.a(h, dea.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final evf j = evc.a(h, dea.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final evf k = evc.a(h, dea.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final evf l = evc.a(h, dea.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final evf m = evc.a(h, dea.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final evf n = g;
   private static final evf o = evc.a(g, dea.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final evf F = evc.a(g, dea.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final evf G = evc.a(g, dea.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final evf H = evc.a(g, dea.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dhv> a() {
      return a;
   }

   public dhv(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      switch ((it)$$0.c(b)) {
         case a:
            return i;
         case c:
            return k;
         case d:
            return l;
         case e:
            return m;
         case f:
            return j;
         default:
            return h;
      }
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2) {
      switch ((it)$$0.c(b)) {
         case a:
            return n;
         case c:
            return F;
         case d:
            return G;
         case e:
            return H;
         case f:
            return o;
         default:
            return g;
      }
   }

   @Override
   public drd a(cxb $$0) {
      it $$1 = $$0.k().g();
      return this.n().a(b, $$1.o() == it.a.b ? it.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dph($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return $$0.B ? null : a($$2, dok.r, dph::a);
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         doi $$5 = $$1.c_($$2);
         if ($$5 instanceof dph) {
            $$3.a((dph)$$5);
            $$3.a(avs.ad);
         }

         return bpw.b;
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(daz $$0, io $$1, drd $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      bps.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return cov.a($$1.c_($$2));
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      doi $$4 = $$1.c_($$2);
      if ($$4 instanceof dph) {
         dph.a($$1, $$2, $$0, $$3, (dph)$$4);
      }
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
