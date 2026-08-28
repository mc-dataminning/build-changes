import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnm extends dij implements dob {
   public static final MapCodec<dnm> a = b(dnm::new);
   public static final dwl<jm.a> b = dwe.H;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final fal d = dij.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fal e = dij.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   public dnm(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.a.a));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      switch ((jm.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$1.D_().j() && $$1.ac().b(dfb.e) && $$3.a(2000) < $$1.ak().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bup.bx)) {
            bui $$4 = bup.bx.a($$1, $$2.d(), buo.d);
            if ($$4 != null) {
               $$4.aD();
               bui $$5 = $$4.dm();
               if ($$5 != null) {
                  $$5.aD();
               }
            }
         }
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      jm.a $$8 = $$4.o();
      jm.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !eso.a($$1, $$3, $$9).b() ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(arq $$0, bui $$1) {
      return $$1 instanceof cor $$2 ? Math.max(0, $$0.ac().c($$2.gm().a ? dfb.F : dfb.E)) : 0;
   }

   @Nullable
   @Override
   public esm a(arq $$0, bui $$1, jh $$2) {
      alk<dff> $$3 = $$0.ag() == dff.j ? dff.i : dff.j;
      arq $$4 = $$0.o().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.ag() == dff.j;
         dxe $$6 = $$4.C_();
         double $$7 = dzj.a($$0.D_(), $$4.D_());
         jh $$8 = $$6.b($$1.dD() * $$7, $$1.dF(), $$1.dJ() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private esm a(arq $$0, bui $$1, jh $$2, jh $$3, boolean $$4, dxe $$5) {
      Optional<jh> $$6 = $$0.p().a($$3, $$4, $$5);
      l.a $$9;
      esm.a $$10;
      if ($$6.isPresent()) {
         jh $$7 = $$6.get();
         dvo $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dwe.H), 21, jm.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = esm.b.then($$1x -> $$1x.f($$7));
      } else {
         jm.a $$11 = $$1.dY().a_($$2).d(b).orElse(jm.a.a);
         Optional<l.a> $$12 = $$0.p().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = esm.b.then(esm.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static esm a(bui $$0, jh $$1, l.a $$2, arq $$3, esm.a $$4) {
      dvo $$5 = $$0.dY().a_($$1);
      jm.a $$6;
      ezr $$8;
      if ($$5.b(dwe.H)) {
         $$6 = $$5.c(dwe.H);
         l.a $$7 = l.a($$1, $$6, 21, jm.a.b, 21, $$2x -> $$0.dY().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jm.a.a;
         $$8 = new ezr(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static esm a(arq $$0, l.a $$1, jm.a $$2, ezr $$3, bui $$4, esm.a $$5) {
      jh $$6 = $$1.a;
      dvo $$7 = $$0.a_($$6);
      jm.a $$8 = $$7.d(dwe.H).orElse(jm.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      bul $$11 = $$4.a($$4.ay());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jm.a.a;
      ezr $$17 = new ezr((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      ezr $$18 = eso.a($$17, $$0, $$4, $$11);
      return new esm($$0, $$18, ezr.c, (float)$$12, 0.0F, bvs.a(bvs.l, bvs.k), $$5);
   }

   @Override
   public dob.a b() {
      return dob.a.a;
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awo.uG, awp.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
      }

      for (int $$4 = 0; $$4 < 4; $$4++) {
         double $$5 = (double)$$2.u() + $$3.j();
         double $$6 = (double)$$2.v() + $$3.j();
         double $$7 = (double)$$2.w() + $$3.j();
         double $$8 = ((double)$$3.i() - 0.5) * 0.5;
         double $$9 = ((double)$$3.i() - 0.5) * 0.5;
         double $$10 = ((double)$$3.i() - 0.5) * 0.5;
         int $$11 = $$3.a(2) * 2 - 1;
         if (!$$1.a_($$2.h()).a(this) && !$$1.a_($$2.i()).a(this)) {
            $$5 = (double)$$2.u() + 0.5 + 0.25 * (double)$$11;
            $$8 = (double)($$3.i() * 2.0F * (float)$$11);
         } else {
            $$7 = (double)$$2.w() + 0.5 + 0.25 * (double)$$11;
            $$10 = (double)($$3.i() * 2.0F * (float)$$11);
         }

         $$1.a(ls.ac, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return cwf.k;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jm.a)$$0.c(b)) {
               case c:
                  return $$0.b(b, jm.a.a);
               case a:
                  return $$0.b(b, jm.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }
}
