import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dmq extends dhm implements dnf {
   public static final MapCodec<dmq> a = b(dmq::new);
   public static final dvq<jk.a> b = dvi.H;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final ezq d = dhm.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ezq e = dhm.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   public dmq(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.a.a));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      switch ((jk.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$1.C_().j() && $$1.ac().b(def.e) && $$3.a(2000) < $$1.am().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bty.bx)) {
            btr $$4 = bty.bx.a($$1, $$2.d(), btx.d);
            if ($$4 != null) {
               $$4.aA();
               btr $$5 = $$4.dg();
               if ($$5 != null) {
                  $$5.aA();
               }
            }
         }
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      jk.a $$6 = $$1.o();
      jk.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new ert($$3, $$4, $$7).c() ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(arj $$0, btr $$1) {
      return $$1 instanceof cnx $$2 ? Math.max(0, $$0.ac().c($$2.ge().a ? def.F : def.E)) : 0;
   }

   @Nullable
   @Override
   public err a(arj $$0, btr $$1, jf $$2) {
      ald<dej> $$3 = $$0.ag() == dej.i ? dej.h : dej.i;
      arj $$4 = $$0.o().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.ag() == dej.i;
         dwj $$6 = $$4.B_();
         double $$7 = dyo.a($$0.C_(), $$4.C_());
         jf $$8 = $$6.b($$1.dx() * $$7, $$1.dz(), $$1.dD() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private err a(arj $$0, btr $$1, jf $$2, jf $$3, boolean $$4, dwj $$5) {
      Optional<jf> $$6 = $$0.p().a($$3, $$4, $$5);
      l.a $$9;
      err.a $$10;
      if ($$6.isPresent()) {
         jf $$7 = $$6.get();
         dus $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dvi.H), 21, jk.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = err.b.then($$1x -> $$1x.f($$7));
      } else {
         jk.a $$11 = $$1.dS().a_($$2).d(b).orElse(jk.a.a);
         Optional<l.a> $$12 = $$0.p().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = err.b.then(err.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static err a(btr $$0, jf $$1, l.a $$2, arj $$3, err.a $$4) {
      dus $$5 = $$0.dS().a_($$1);
      jk.a $$6;
      eyw $$8;
      if ($$5.b(dvi.H)) {
         $$6 = $$5.c(dvi.H);
         l.a $$7 = l.a($$1, $$6, 21, jk.a.b, 21, $$2x -> $$0.dS().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jk.a.a;
         $$8 = new eyw(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$0.dv(), $$0.dI(), $$0.dK(), $$4);
   }

   private static err a(arj $$0, l.a $$1, jk.a $$2, eyw $$3, btr $$4, eyw $$5, float $$6, float $$7, err.a $$8) {
      jf $$9 = $$1.a;
      dus $$10 = $$0.a_($$9);
      jk.a $$11 = $$10.d(dvi.H).orElse(jk.a.a);
      double $$12 = (double)$$1.b;
      double $$13 = (double)$$1.c;
      btu $$14 = $$4.a($$4.av());
      int $$15 = $$2 == $$11 ? 0 : 90;
      eyw $$16 = $$2 == $$11 ? $$5 : new eyw($$5.f, $$5.e, -$$5.d);
      double $$17 = (double)$$14.a() / 2.0 + ($$12 - (double)$$14.a()) * $$3.a();
      double $$18 = ($$13 - (double)$$14.b()) * $$3.b();
      double $$19 = 0.5 + $$3.c();
      boolean $$20 = $$11 == jk.a.a;
      eyw $$21 = new eyw((double)$$9.u() + ($$20 ? $$17 : $$19), (double)$$9.v() + $$18, (double)$$9.w() + ($$20 ? $$19 : $$17));
      eyw $$22 = ert.a($$21, $$0, $$4, $$14);
      return new err($$0, $$22, $$16, $$6 + (float)$$15, $$7, $$8);
   }

   @Override
   public dnf.a b() {
      return dnf.a.a;
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awg.uI, awh.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(lo.ac, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return cvs.k;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jk.a)$$0.c(b)) {
               case c:
                  return $$0.b(b, jk.a.a);
               case a:
                  return $$0.b(b, jk.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }
}
