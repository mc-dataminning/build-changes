import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dos extends djl implements dpi {
   public static final MapCodec<dos> a = b(dos::new);
   public static final dxt<jn.a> b = dxm.K;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final fbt d = djl.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fbt e = djl.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dos> a() {
      return a;
   }

   public dos(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.a.a));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      switch ((jn.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.G_().j() && $$1.O().b(dgd.e) && $$3.a(2000) < $$1.am().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bur.bQ)) {
            buk $$4 = bur.bQ.a($$1, $$2.d(), buq.d);
            if ($$4 != null) {
               $$4.aB();
               buk $$5 = $$4.dk();
               if ($$5 != null) {
                  $$5.aB();
               }
            }
         }
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      jn.a $$8 = $$4.o();
      jn.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !etx.a($$1, $$3, $$9).b() ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(ard $$0, buk $$1) {
      return $$1 instanceof cow $$2 ? Math.max(0, $$0.O().c($$2.gj().a ? dgd.G : dgd.F)) : 0;
   }

   @Nullable
   @Override
   public ety a(ard $$0, buk $$1, ji $$2) {
      aku<dgh> $$3 = $$0.ai() == dgh.j ? dgh.i : dgh.j;
      ard $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.ai() == dgh.j;
         dym $$6 = $$4.F_();
         double $$7 = ear.a($$0.G_(), $$4.G_());
         ji $$8 = $$6.b($$1.dA() * $$7, $$1.dC(), $$1.dG() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private ety a(ard $$0, buk $$1, ji $$2, ji $$3, boolean $$4, dym $$5) {
      Optional<ji> $$6 = $$0.q().a($$3, $$4, $$5);
      l.a $$9;
      ety.a $$10;
      if ($$6.isPresent()) {
         ji $$7 = $$6.get();
         dww $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dxm.K), 21, jn.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = ety.b.then($$1x -> $$1x.f($$7));
      } else {
         jn.a $$11 = $$1.dV().a_($$2).d(b).orElse(jn.a.a);
         Optional<l.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = ety.b.then(ety.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static ety a(buk $$0, ji $$1, l.a $$2, ard $$3, ety.a $$4) {
      dww $$5 = $$0.dV().a_($$1);
      jn.a $$6;
      faz $$8;
      if ($$5.b(dxm.K)) {
         $$6 = $$5.c(dxm.K);
         l.a $$7 = l.a($$1, $$6, 21, jn.a.b, 21, $$2x -> $$0.dV().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jn.a.a;
         $$8 = new faz(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static ety a(ard $$0, l.a $$1, jn.a $$2, faz $$3, buk $$4, ety.a $$5) {
      ji $$6 = $$1.a;
      dww $$7 = $$0.a_($$6);
      jn.a $$8 = $$7.d(dxm.K).orElse(jn.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      bun $$11 = $$4.a($$4.aw());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jn.a.a;
      faz $$17 = new faz((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      faz $$18 = etx.a($$17, $$0, $$4, $$11);
      return new ety($$0, $$18, faz.c, (float)$$12, 0.0F, bvu.a(bvu.l, bvu.k), $$5);
   }

   @Override
   public dpi.a b() {
      return dpi.a.a;
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
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
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return cwo.j;
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
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
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }
}
