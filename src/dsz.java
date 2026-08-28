import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsz extends dno implements dtn {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<dsz> a = b(dsz::new);
   public static final eco<jc.a> b = ecg.J;
   private static final Map<jc.a, fgw> d = fgt.a(dno.a(4.0, 16.0, 0.0, 16.0));

   @Override
   public MapCodec<dsz> a() {
      return a;
   }

   public dsz(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.a.a));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, bxe $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$1.F_().j() && $$1.O().c(dkf.f) && $$3.a(2000) < $$1.an().a() && $$1.g($$2)) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bxn.bS)) {
            bxe $$4 = bxn.bS.a($$1, $$2.d(), bxm.d);
            if ($$4 != null) {
               $$4.ay();
               bxe $$5 = $$4.dk();
               if ($$5 != null) {
                  $$5.ay();
               }
            }
         }
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      jc.a $$8 = $$4.o();
      jc.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !eyz.a($$1, $$3, $$9).b() ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if ($$3.n(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(asb $$0, bxe $$1) {
      return $$1 instanceof csi $$2 ? Math.max(0, $$0.O().d($$2.gk().a ? dkf.H : dkf.G)) : 0;
   }

   @Nullable
   @Override
   public eza a(asb $$0, bxe $$1, iw $$2) {
      alq<dkj> $$3 = $$0.aj() == dkj.j ? dkj.i : dkj.j;
      asb $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.aj() == dkj.j;
         edi $$6 = $$4.E_();
         double $$7 = efn.a($$0.F_(), $$4.F_());
         iw $$8 = $$6.b($$1.dA() * $$7, $$1.dC(), $$1.dG() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private eza a(asb $$0, bxe $$1, iw $$2, iw $$3, boolean $$4, edi $$5) {
      Optional<iw> $$6 = $$0.q().a($$3, $$4, $$5);
      m.a $$9;
      eza.a $$10;
      if ($$6.isPresent()) {
         iw $$7 = $$6.get();
         ebq $$8 = $$0.a_($$7);
         $$9 = m.a($$7, $$8.c(ecg.J), 21, jc.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = eza.b.then($$1x -> $$1x.f($$7));
      } else {
         jc.a $$11 = $$1.dV().a_($$2).d(b).orElse(jc.a.a);
         Optional<m.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            c.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = eza.b.then(eza.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static eza a(bxe $$0, iw $$1, m.a $$2, asb $$3, eza.a $$4) {
      ebq $$5 = $$0.dV().a_($$1);
      jc.a $$6;
      fgc $$8;
      if ($$5.b(ecg.J)) {
         $$6 = $$5.c(ecg.J);
         m.a $$7 = m.a($$1, $$6, 21, jc.a.b, 21, $$2x -> $$0.dV().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jc.a.a;
         $$8 = new fgc(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static eza a(asb $$0, m.a $$1, jc.a $$2, fgc $$3, bxe $$4, eza.a $$5) {
      iw $$6 = $$1.a;
      ebq $$7 = $$0.a_($$6);
      jc.a $$8 = $$7.d(ecg.J).orElse(jc.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      bxh $$11 = $$4.a($$4.at());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jc.a.a;
      fgc $$17 = new fgc((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      fgc $$18 = eyz.a($$17, $$0, $$4, $$11);
      return new eza($$0, $$18, fgc.c, (float)$$12, 0.0F, byt.a(byt.l, byt.k), $$5);
   }

   @Override
   public dtn.a b() {
      return dtn.a.a;
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awy.vv, awz.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(lz.af, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return dak.l;
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jc.a)$$0.c(b)) {
               case a:
                  return $$0.b(b, jc.a.c);
               case c:
                  return $$0.b(b, jc.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }
}
