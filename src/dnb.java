import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnb extends dhy implements dnq {
   public static final MapCodec<dnb> a = b(dnb::new);
   public static final dwb<jl.a> b = dvt.H;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final fab d = dhy.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fab e = dhy.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   public dnb(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.a.a));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      switch ((jl.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$1.D_().j() && $$1.ac().b(der.e) && $$3.a(2000) < $$1.am().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bug.bx)) {
            btz $$4 = bug.bx.a($$1, $$2.d(), buf.d);
            if ($$4 != null) {
               $$4.aC();
               btz $$5 = $$4.dl();
               if ($$5 != null) {
                  $$5.aC();
               }
            }
         }
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      jl.a $$6 = $$1.o();
      jl.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new ese($$3, $$4, $$7).c() ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(arm $$0, btz $$1) {
      return $$1 instanceof coh $$2 ? Math.max(0, $$0.ac().c($$2.gl().a ? der.F : der.E)) : 0;
   }

   @Nullable
   @Override
   public esc a(arm $$0, btz $$1, jg $$2) {
      alg<dev> $$3 = $$0.ag() == dev.j ? dev.i : dev.j;
      arm $$4 = $$0.o().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.ag() == dev.j;
         dwu $$6 = $$4.C_();
         double $$7 = dyz.a($$0.D_(), $$4.D_());
         jg $$8 = $$6.b($$1.dC() * $$7, $$1.dE(), $$1.dI() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private esc a(arm $$0, btz $$1, jg $$2, jg $$3, boolean $$4, dwu $$5) {
      Optional<jg> $$6 = $$0.p().a($$3, $$4, $$5);
      l.a $$9;
      esc.a $$10;
      if ($$6.isPresent()) {
         jg $$7 = $$6.get();
         dvd $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dvt.H), 21, jl.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = esc.b.then($$1x -> $$1x.f($$7));
      } else {
         jl.a $$11 = $$1.dX().a_($$2).d(b).orElse(jl.a.a);
         Optional<l.a> $$12 = $$0.p().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = esc.b.then(esc.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static esc a(btz $$0, jg $$1, l.a $$2, arm $$3, esc.a $$4) {
      dvd $$5 = $$0.dX().a_($$1);
      jl.a $$6;
      ezh $$8;
      if ($$5.b(dvt.H)) {
         $$6 = $$5.c(dvt.H);
         l.a $$7 = l.a($$1, $$6, 21, jl.a.b, 21, $$2x -> $$0.dX().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jl.a.a;
         $$8 = new ezh(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static esc a(arm $$0, l.a $$1, jl.a $$2, ezh $$3, btz $$4, esc.a $$5) {
      jg $$6 = $$1.a;
      dvd $$7 = $$0.a_($$6);
      jl.a $$8 = $$7.d(dvt.H).orElse(jl.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      buc $$11 = $$4.a($$4.ax());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jl.a.a;
      ezh $$17 = new ezh((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      ezh $$18 = ese.a($$17, $$0, $$4, $$11);
      return new esc($$0, $$18, ezh.c, (float)$$12, 0.0F, bvj.a(bvj.l, bvj.k), $$5);
   }

   @Override
   public dnq.a b() {
      return dnq.a.a;
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awk.uG, awl.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(lq.ac, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return cvx.k;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jl.a)$$0.c(b)) {
               case c:
                  return $$0.b(b, jl.a.a);
               case a:
                  return $$0.b(b, jl.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }
}
