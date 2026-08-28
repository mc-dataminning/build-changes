import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drd extends dlu implements drr {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<drd> a = b(drd::new);
   public static final eam<ja.a> b = eae.J;
   private static final Map<ja.a, feq> d = fen.a(dlu.a(4.0, 16.0, 0.0, 16.0));

   @Override
   public MapCodec<drd> a() {
      return a;
   }

   public drd(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.a.a));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, bwa $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$1.B_().j() && $$1.O().c(dil.e) && $$3.a(2000) < $$1.an().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bwj.bR)) {
            bwa $$4 = bwj.bR.a($$1, $$2.d(), bwi.d);
            if ($$4 != null) {
               $$4.aB();
               bwa $$5 = $$4.dk();
               if ($$5 != null) {
                  $$5.aB();
               }
            }
         }
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      ja.a $$8 = $$4.o();
      ja.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !ewu.a($$1, $$3, $$9).b() ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if ($$3.n(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(aro $$0, bwa $$1) {
      return $$1 instanceof cqs $$2 ? Math.max(0, $$0.O().d($$2.gj().a ? dil.G : dil.F)) : 0;
   }

   @Nullable
   @Override
   public ewv a(aro $$0, bwa $$1, iu $$2) {
      ald<dip> $$3 = $$0.aj() == dip.j ? dip.i : dip.j;
      aro $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.aj() == dip.j;
         ebg $$6 = $$4.A_();
         double $$7 = edl.a($$0.B_(), $$4.B_());
         iu $$8 = $$6.b($$1.dA() * $$7, $$1.dC(), $$1.dG() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private ewv a(aro $$0, bwa $$1, iu $$2, iu $$3, boolean $$4, ebg $$5) {
      Optional<iu> $$6 = $$0.q().a($$3, $$4, $$5);
      l.a $$9;
      ewv.a $$10;
      if ($$6.isPresent()) {
         iu $$7 = $$6.get();
         dzo $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(eae.J), 21, ja.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = ewv.b.then($$1x -> $$1x.f($$7));
      } else {
         ja.a $$11 = $$1.dV().a_($$2).d(b).orElse(ja.a.a);
         Optional<l.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            c.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = ewv.b.then(ewv.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static ewv a(bwa $$0, iu $$1, l.a $$2, aro $$3, ewv.a $$4) {
      dzo $$5 = $$0.dV().a_($$1);
      ja.a $$6;
      fdw $$8;
      if ($$5.b(eae.J)) {
         $$6 = $$5.c(eae.J);
         l.a $$7 = l.a($$1, $$6, 21, ja.a.b, 21, $$2x -> $$0.dV().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = ja.a.a;
         $$8 = new fdw(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static ewv a(aro $$0, l.a $$1, ja.a $$2, fdw $$3, bwa $$4, ewv.a $$5) {
      iu $$6 = $$1.a;
      dzo $$7 = $$0.a_($$6);
      ja.a $$8 = $$7.d(eae.J).orElse(ja.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      bwd $$11 = $$4.a($$4.aw());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == ja.a.a;
      fdw $$17 = new fdw((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      fdw $$18 = ewu.a($$17, $$0, $$4, $$11);
      return new ewv($$0, $$18, fdw.c, (float)$$12, 0.0F, bxn.a(bxn.l, bxn.k), $$5);
   }

   @Override
   public drr.a b() {
      return drr.a.a;
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awl.vr, awm.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(lx.af, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return cys.k;
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ja.a)$$0.c(b)) {
               case a:
                  return $$0.b(b, ja.a.c);
               case c:
                  return $$0.b(b, ja.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }
}
