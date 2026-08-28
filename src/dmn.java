import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dmn extends dhj implements dnc {
   public static final MapCodec<dmn> a = b(dmn::new);
   public static final dvm<jj.a> b = dve.H;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final ezm d = dhj.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ezm e = dhj.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   public dmn(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.a.a));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      switch ((jj.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$1.B_().j() && $$1.ac().b(dec.e) && $$3.a(2000) < $$1.am().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, btv.bx)) {
            bto $$4 = btv.bx.a($$1, $$2.d(), btu.d);
            if ($$4 != null) {
               $$4.aA();
               bto $$5 = $$4.dg();
               if ($$5 != null) {
                  $$5.aA();
               }
            }
         }
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      jj.a $$6 = $$1.o();
      jj.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new erp($$3, $$4, $$7).c() ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(arh $$0, bto $$1) {
      return $$1 instanceof cnu $$2 ? Math.max(0, $$0.ac().c($$2.gd().a ? dec.F : dec.E)) : 0;
   }

   @Nullable
   @Override
   public ern a(arh $$0, bto $$1, je $$2) {
      alb<deg> $$3 = $$0.ag() == deg.i ? deg.h : deg.i;
      arh $$4 = $$0.o().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.ag() == deg.i;
         dwf $$6 = $$4.A_();
         double $$7 = dyk.a($$0.B_(), $$4.B_());
         je $$8 = $$6.b($$1.dx() * $$7, $$1.dz(), $$1.dD() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private ern a(arh $$0, bto $$1, je $$2, je $$3, boolean $$4, dwf $$5) {
      Optional<je> $$6 = $$0.p().a($$3, $$4, $$5);
      l.a $$9;
      ern.a $$10;
      if ($$6.isPresent()) {
         je $$7 = $$6.get();
         duo $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dve.H), 21, jj.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = ern.b.then($$1x -> $$1x.f($$7));
      } else {
         jj.a $$11 = $$1.dS().a_($$2).d(b).orElse(jj.a.a);
         Optional<l.a> $$12 = $$0.p().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = ern.b.then(ern.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static ern a(bto $$0, je $$1, l.a $$2, arh $$3, ern.a $$4) {
      duo $$5 = $$0.dS().a_($$1);
      jj.a $$6;
      eys $$8;
      if ($$5.b(dve.H)) {
         $$6 = $$5.c(dve.H);
         l.a $$7 = l.a($$1, $$6, 21, jj.a.b, 21, $$2x -> $$0.dS().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jj.a.a;
         $$8 = new eys(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$0.dv(), $$0.dI(), $$0.dK(), $$4);
   }

   private static ern a(arh $$0, l.a $$1, jj.a $$2, eys $$3, bto $$4, eys $$5, float $$6, float $$7, ern.a $$8) {
      je $$9 = $$1.a;
      duo $$10 = $$0.a_($$9);
      jj.a $$11 = $$10.d(dve.H).orElse(jj.a.a);
      double $$12 = (double)$$1.b;
      double $$13 = (double)$$1.c;
      btr $$14 = $$4.a($$4.av());
      int $$15 = $$2 == $$11 ? 0 : 90;
      eys $$16 = $$2 == $$11 ? $$5 : new eys($$5.f, $$5.e, -$$5.d);
      double $$17 = (double)$$14.a() / 2.0 + ($$12 - (double)$$14.a()) * $$3.a();
      double $$18 = ($$13 - (double)$$14.b()) * $$3.b();
      double $$19 = 0.5 + $$3.c();
      boolean $$20 = $$11 == jj.a.a;
      eys $$21 = new eys((double)$$9.u() + ($$20 ? $$17 : $$19), (double)$$9.v() + $$18, (double)$$9.w() + ($$20 ? $$19 : $$17));
      eys $$22 = erp.a($$21, $$0, $$4, $$14);
      return new ern($$0, $$22, $$16, $$6 + (float)$$15, $$7, $$8);
   }

   @Override
   public dnc.a b() {
      return dnc.a.a;
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awe.uI, awf.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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
   public cvp a(dej $$0, je $$1, duo $$2) {
      return cvp.k;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
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
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }
}
