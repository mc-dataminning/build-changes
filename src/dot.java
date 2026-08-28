import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dot extends djm implements dpj {
   public static final MapCodec<dot> a = b(dot::new);
   public static final dxu<jn.a> b = dxn.K;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final fbu d = djm.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fbu e = djm.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   public dot(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.a.a));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      switch ((jn.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.G_().j() && $$1.O().b(dge.e) && $$3.a(2000) < $$1.am().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bus.bQ)) {
            bul $$4 = bus.bQ.a($$1, $$2.d(), bur.d);
            if ($$4 != null) {
               $$4.aB();
               bul $$5 = $$4.dk();
               if ($$5 != null) {
                  $$5.aB();
               }
            }
         }
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      jn.a $$8 = $$4.o();
      jn.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !ety.a($$1, $$3, $$9).b() ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, bul $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(ard $$0, bul $$1) {
      return $$1 instanceof cox $$2 ? Math.max(0, $$0.O().c($$2.gj().a ? dge.G : dge.F)) : 0;
   }

   @Nullable
   @Override
   public etz a(ard $$0, bul $$1, ji $$2) {
      aku<dgi> $$3 = $$0.ai() == dgi.j ? dgi.i : dgi.j;
      ard $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.ai() == dgi.j;
         dyn $$6 = $$4.F_();
         double $$7 = eas.a($$0.G_(), $$4.G_());
         ji $$8 = $$6.b($$1.dA() * $$7, $$1.dC(), $$1.dG() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private etz a(ard $$0, bul $$1, ji $$2, ji $$3, boolean $$4, dyn $$5) {
      Optional<ji> $$6 = $$0.q().a($$3, $$4, $$5);
      l.a $$9;
      etz.a $$10;
      if ($$6.isPresent()) {
         ji $$7 = $$6.get();
         dwx $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dxn.K), 21, jn.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = etz.b.then($$1x -> $$1x.f($$7));
      } else {
         jn.a $$11 = $$1.dV().a_($$2).d(b).orElse(jn.a.a);
         Optional<l.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = etz.b.then(etz.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static etz a(bul $$0, ji $$1, l.a $$2, ard $$3, etz.a $$4) {
      dwx $$5 = $$0.dV().a_($$1);
      jn.a $$6;
      fba $$8;
      if ($$5.b(dxn.K)) {
         $$6 = $$5.c(dxn.K);
         l.a $$7 = l.a($$1, $$6, 21, jn.a.b, 21, $$2x -> $$0.dV().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jn.a.a;
         $$8 = new fba(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static etz a(ard $$0, l.a $$1, jn.a $$2, fba $$3, bul $$4, etz.a $$5) {
      ji $$6 = $$1.a;
      dwx $$7 = $$0.a_($$6);
      jn.a $$8 = $$7.d(dxn.K).orElse(jn.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      buo $$11 = $$4.a($$4.aw());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jn.a.a;
      fba $$17 = new fba((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      fba $$18 = ety.a($$17, $$0, $$4, $$11);
      return new etz($$0, $$18, fba.c, (float)$$12, 0.0F, bvv.a(bvv.l, bvv.k), $$5);
   }

   @Override
   public dpj.a b() {
      return dpj.a.a;
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.vh, awb.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(lt.ae, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return cwp.j;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jn.a)$$0.c(b)) {
               case c:
                  return $$0.b(b, jn.a.a);
               case a:
                  return $$0.b(b, jn.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }
}
