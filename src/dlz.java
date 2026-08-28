import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlz extends dgv implements dmo {
   public static final MapCodec<dlz> a = b(dlz::new);
   public static final duy<jj.a> b = duq.H;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final eyx d = dgv.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eyx e = dgv.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   public dlz(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.a.a));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      switch ((jj.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$1.B_().j() && $$1.ac().b(ddo.e) && $$3.a(2000) < $$1.am().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, btq.bx)) {
            btj $$4 = btq.bx.a($$1, $$2.d(), btp.d);
            if ($$4 != null) {
               $$4.aA();
               btj $$5 = $$4.dg();
               if ($$5 != null) {
                  $$5.aA();
               }
            }
         }
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      jj.a $$6 = $$1.o();
      jj.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new erb($$3, $$4, $$7).c() ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(arg $$0, btj $$1) {
      return $$1 instanceof cnp $$2 ? Math.max(0, $$0.ac().c($$2.gd().a ? ddo.F : ddo.E)) : 0;
   }

   @Nullable
   @Override
   public eqz a(arg $$0, btj $$1, je $$2) {
      ala<dds> $$3 = $$0.ag() == dds.i ? dds.h : dds.i;
      arg $$4 = $$0.o().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.ag() == dds.i;
         dvr $$6 = $$4.A_();
         double $$7 = dxw.a($$0.B_(), $$4.B_());
         je $$8 = $$6.b($$1.dx() * $$7, $$1.dz(), $$1.dD() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private eqz a(arg $$0, btj $$1, je $$2, je $$3, boolean $$4, dvr $$5) {
      Optional<je> $$6 = $$0.p().a($$3, $$4, $$5);
      l.a $$9;
      eqz.a $$10;
      if ($$6.isPresent()) {
         je $$7 = $$6.get();
         dua $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(duq.H), 21, jj.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = eqz.b.then($$1x -> $$1x.f($$7));
      } else {
         jj.a $$11 = $$1.dS().a_($$2).d(b).orElse(jj.a.a);
         Optional<l.a> $$12 = $$0.p().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = eqz.b.then(eqz.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static eqz a(btj $$0, je $$1, l.a $$2, arg $$3, eqz.a $$4) {
      dua $$5 = $$0.dS().a_($$1);
      jj.a $$6;
      eye $$8;
      if ($$5.b(duq.H)) {
         $$6 = $$5.c(duq.H);
         l.a $$7 = l.a($$1, $$6, 21, jj.a.b, 21, $$2x -> $$0.dS().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jj.a.a;
         $$8 = new eye(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$0.dv(), $$0.dI(), $$0.dK(), $$4);
   }

   private static eqz a(arg $$0, l.a $$1, jj.a $$2, eye $$3, btj $$4, eye $$5, float $$6, float $$7, eqz.a $$8) {
      je $$9 = $$1.a;
      dua $$10 = $$0.a_($$9);
      jj.a $$11 = $$10.d(duq.H).orElse(jj.a.a);
      double $$12 = (double)$$1.b;
      double $$13 = (double)$$1.c;
      btm $$14 = $$4.a($$4.av());
      int $$15 = $$2 == $$11 ? 0 : 90;
      eye $$16 = $$2 == $$11 ? $$5 : new eye($$5.f, $$5.e, -$$5.d);
      double $$17 = (double)$$14.a() / 2.0 + ($$12 - (double)$$14.a()) * $$3.a();
      double $$18 = ($$13 - (double)$$14.b()) * $$3.b();
      double $$19 = 0.5 + $$3.c();
      boolean $$20 = $$11 == jj.a.a;
      eye $$21 = new eye((double)$$9.u() + ($$20 ? $$17 : $$19), (double)$$9.v() + $$18, (double)$$9.w() + ($$20 ? $$19 : $$17));
      eye $$22 = erb.a($$21, $$0, $$4, $$14);
      return new eqz($$0, $$22, $$16, $$6 + (float)$$15, $$7, $$8);
   }

   @Override
   public dmo.a b() {
      return dmo.a.a;
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awd.uI, awe.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(ln.ac, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return cvl.k;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jj.a)$$0.c(b)) {
               case c:
                  return $$0.b(b, jj.a.a);
               case a:
                  return $$0.b(b, jj.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }
}
