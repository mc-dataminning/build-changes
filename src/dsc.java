import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsc extends dmr implements dsq {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<dsc> a = b(dsc::new);
   public static final ebr<jb.a> b = ebj.J;
   private static final Map<jb.a, ffw> d = fft.a(dmr.a(4.0, 16.0, 0.0, 16.0));

   @Override
   public MapCodec<dsc> a() {
      return a;
   }

   public dsc(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.a.a));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, bwi $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.B_().j() && $$1.O().c(dji.f) && $$3.a(2000) < $$1.an().a() && $$1.g($$2)) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bwr.bR)) {
            bwi $$4 = bwr.bR.a($$1, $$2.d(), bwq.d);
            if ($$4 != null) {
               $$4.ay();
               bwi $$5 = $$4.dj();
               if ($$5 != null) {
                  $$5.ay();
               }
            }
         }
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      jb.a $$8 = $$4.o();
      jb.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !exz.a($$1, $$3, $$9).b() ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$3.n(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(arq $$0, bwi $$1) {
      return $$1 instanceof crm $$2 ? Math.max(0, $$0.O().d($$2.gj().a ? dji.H : dji.G)) : 0;
   }

   @Nullable
   @Override
   public eya a(arq $$0, bwi $$1, iv $$2) {
      alf<djm> $$3 = $$0.aj() == djm.j ? djm.i : djm.j;
      arq $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.aj() == djm.j;
         ecl $$6 = $$4.A_();
         double $$7 = eeq.a($$0.B_(), $$4.B_());
         iv $$8 = $$6.b($$1.dz() * $$7, $$1.dB(), $$1.dF() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private eya a(arq $$0, bwi $$1, iv $$2, iv $$3, boolean $$4, ecl $$5) {
      Optional<iv> $$6 = $$0.q().a($$3, $$4, $$5);
      m.a $$9;
      eya.a $$10;
      if ($$6.isPresent()) {
         iv $$7 = $$6.get();
         eat $$8 = $$0.a_($$7);
         $$9 = m.a($$7, $$8.c(ebj.J), 21, jb.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = eya.b.then($$1x -> $$1x.f($$7));
      } else {
         jb.a $$11 = $$1.dU().a_($$2).d(b).orElse(jb.a.a);
         Optional<m.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            c.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = eya.b.then(eya.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static eya a(bwi $$0, iv $$1, m.a $$2, arq $$3, eya.a $$4) {
      eat $$5 = $$0.dU().a_($$1);
      jb.a $$6;
      ffc $$8;
      if ($$5.b(ebj.J)) {
         $$6 = $$5.c(ebj.J);
         m.a $$7 = m.a($$1, $$6, 21, jb.a.b, 21, $$2x -> $$0.dU().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jb.a.a;
         $$8 = new ffc(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static eya a(arq $$0, m.a $$1, jb.a $$2, ffc $$3, bwi $$4, eya.a $$5) {
      iv $$6 = $$1.a;
      eat $$7 = $$0.a_($$6);
      jb.a $$8 = $$7.d(ebj.J).orElse(jb.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      bwl $$11 = $$4.a($$4.at());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jb.a.a;
      ffc $$17 = new ffc((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      ffc $$18 = exz.a($$17, $$0, $$4, $$11);
      return new eya($$0, $$18, ffc.c, (float)$$12, 0.0F, bxx.a(bxx.l, bxx.k), $$5);
   }

   @Override
   public dsq.a b() {
      return dsq.a.a;
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.vv, awo.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(ly.af, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return czn.k;
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jb.a)$$0.c(b)) {
               case a:
                  return $$0.b(b, jb.a.c);
               case c:
                  return $$0.b(b, jb.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }
}
