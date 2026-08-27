import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class cym extends dcj implements cyr, dfo {
   public static final MapCodec<cym> a = b(cym::new);
   private static final dlw f = dlv.C;
   private static final int g = 6;
   protected static final eol b = cyo.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final eol c = cyo.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final eol d = cyo.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final eol e = cyo.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<cym> a() {
      return a;
   }

   protected cym(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ie.c));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      switch ((ie)$$0.c(aE)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(f) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.d();
      dlf $$4 = $$1.a_($$3);
      dlf $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(atz.bx)) && ($$5.a(this) || $$5.a(cyq.sD));
   }

   protected static boolean a(cvo $$0, hz $$1, egp $$2, ie $$3) {
      dlf $$4 = cyq.sE.o().a(f, Boolean.valueOf($$2.a(egq.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if (($$1 == ie.a || $$1 == ie.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      Optional<hz> $$3 = l.a($$0, $$1, $$2.b(), ie.b, cyq.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hz $$4 = $$3.get().c();
         dlf $$5 = $$0.a_($$4);
         return cyl.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      Optional<hz> $$4 = l.a($$0, $$2, $$3.b(), ie.b, cyq.sD);
      if (!$$4.isEmpty()) {
         hz $$5 = $$4.get();
         hz $$6 = $$5.c();
         ie $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         cyl.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return new coz(cyq.sD);
   }
}
