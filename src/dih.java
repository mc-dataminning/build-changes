import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dih extends dme implements dim, dpk {
   public static final MapCodec<dih> a = b(dih::new);
   private static final dwf f = dwe.C;
   private static final int g = 6;
   protected static final fal b = dij.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final fal c = dij.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final fal d = dij.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final fal e = dij.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dih> a() {
      return a;
   }

   protected dih(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jm.c));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      switch ((jm)$$0.c(aF)) {
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
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(f) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jh $$3 = $$2.e();
      dvo $$4 = $$1.a_($$3);
      dvo $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axd.bz)) && ($$5.a(this) || $$5.a(dil.sD));
   }

   protected static boolean a(dfg $$0, jh $$1, ero $$2, jm $$3) {
      dvo $$4 = dil.sE.m().b(f, Boolean.valueOf($$2.a(erp.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if (($$4 == jm.a || $$4 == jm.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(f)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      Optional<jh> $$3 = l.a($$0, $$1, $$2.b(), jm.b, dil.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get().d();
         dvo $$5 = $$0.a_($$4);
         return dig.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      Optional<jh> $$4 = l.a($$0, $$2, $$3.b(), jm.b, dil.sD);
      if (!$$4.isEmpty()) {
         jh $$5 = $$4.get();
         jh $$6 = $$5.d();
         jm $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         dig.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return new cwf(dil.sD);
   }
}
