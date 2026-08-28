import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dip extends deg {
   public static final MapCodec<dip> a = b(dip::new);
   public static final dsr b = dsn.Q;
   public static final dso c = dsn.f;
   private static final ewf d = deu.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewf e = deu.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ewf f = ewc.a(e, d);
   private static final ewf g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final ewf h = ewc.a(f, g, evq.e);
   private static final ewf i = ewc.a(h, deu.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ewf j = ewc.a(h, deu.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ewf k = ewc.a(h, deu.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ewf l = ewc.a(h, deu.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ewf m = ewc.a(h, deu.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ewf n = g;
   private static final ewf o = ewc.a(g, deu.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ewf F = ewc.a(g, deu.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ewf G = ewc.a(g, deu.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ewf H = ewc.a(g, deu.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dip> a() {
      return a;
   }

   public dip(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      switch ((je)$$0.c(b)) {
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
   protected ewf a(drx $$0, daz $$1, iz $$2) {
      switch ((je)$$0.c(b)) {
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
   public drx a(cxv $$0) {
      je $$1 = $$0.k().g();
      return this.n().a(b, $$1.o() == je.a.b ? je.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return $$0.B ? null : a($$2, dpe.r, dqb::a);
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         dpc $$5 = $$1.c_($$2);
         if ($$5 instanceof dqb) {
            $$3.a((dqb)$$5);
            $$3.a(awg.ad);
         }

         return bqp.c;
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dbt $$0, iz $$1, drx $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      bql.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return cpp.a($$1.c_($$2));
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      dpc $$4 = $$1.c_($$2);
      if ($$4 instanceof dqb) {
         dqb.a($$1, $$2, $$0, $$3, (dqb)$$4);
      }
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
