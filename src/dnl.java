import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dnl extends drp implements dnr, duz {
   public static final MapCodec<dnl> a = b(dnl::new);
   private static final ech b = ecg.I;
   private static final eco<edc> c = ecg.bo;
   private static final int d = -1;
   private static final Object2IntMap<edc> f = ag.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(edc.b, 10);
      $$0.put(edc.c, 10);
      $$0.put(edc.d, 100);
   });
   private static final int g = 5;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<edc, fgw> D = Maps.newEnumMap(
      Map.of(edc.a, dno.b(16.0, 11.0, 15.0), edc.b, dno.b(16.0, 11.0, 15.0), edc.c, dno.b(16.0, 11.0, 13.0), edc.d, fgt.a())
   );
   private final Function<ebq, fgw> R;

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   protected dnl(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(e, jc.c).b(c, edc.a));
      this.R = this.q();
   }

   private Function<ebq, fgw> q() {
      Map<jc, fgw> $$0 = fgt.c(dno.b(6.0, 0.0, 13.0).a(0.0, 0.0, 0.25).d());
      return this.a($$1 -> fgt.a(D.get($$1.c(c)), $$0.get($$1.c(e))), new ect[]{b});
   }

   public static void a(dkk $$0, bai $$1, iw $$2, jc $$3) {
      int $$4 = azz.a($$1, 2, 5);
      iw.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((dkl)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jc.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dnm.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jc.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean o(ebq $$0) {
      return $$0.l() || $$0.a(dnq.J) || $$0.a(dnq.tp);
   }

   protected static boolean a(dkl $$0, iw $$1, ebq $$2) {
      return !$$0.t($$1) && o($$2);
   }

   protected static boolean a(dkk $$0, iw $$1, eya $$2, jc $$3) {
      ebq $$4 = dnq.tn.m().b(b, Boolean.valueOf($$2.a(eyb.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dkj $$0, ebq $$1, ffy $$2, ctd $$3) {
      this.a($$1, $$0, $$2.b(), edc.d, awy.hZ);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(b) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.e();
      ebq $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dnq.to) || $$4.a(axn.bB);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4 == jc.a && !$$0.a($$1, $$3)) {
         return dnq.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, eyb.c, eyb.c.a($$1));
         }

         return $$4 == jc.b && $$6.a(this) ? dnq.to.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      ebq $$3 = $$0.a_($$1.d());
      return o($$3);
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      iw $$4 = $$2.d();
      ebq $$5 = $$0.a_($$4);
      if (a((dkl)$$0, $$4, $$5)) {
         jc $$6 = $$3.c(e);
         dnm.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if (!$$1.C) {
         if ($$0.c(c) == edc.a && a($$2, $$3) && !$$1.D($$2)) {
            this.a($$0, $$1, $$2, edc.b, null);
         }
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      } else {
         edc $$4 = $$0.c(c);
         if ($$4 == edc.b) {
            this.a($$0, $$1, $$2, edc.c, awy.hZ);
         } else if ($$4 == edc.c) {
            this.a($$0, $$1, $$2, edc.d, awy.hZ);
         } else if ($$4 == edc.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dkj $$0, iw $$1, awx $$2) {
      float $$3 = azz.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awz.e, 1.0F, $$3);
   }

   private static boolean a(iw $$0, bxe $$1) {
      return $$1.aH() && $$1.dt().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(ebq $$0, dkj $$1, iw $$2, edc $$3, @Nullable awx $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = f.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(ebq $$0, dkj $$1, iw $$2) {
      a($$0, $$1, $$2, edc.a);
      if ($$0.c(c) != edc.a) {
         a($$1, $$2, awy.ia);
      }
   }

   private static void a(ebq $$0, dkj $$1, iw $$2, edc $$3) {
      edc $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, egq.c, $$2);
      }
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return D.get($$0.c(c));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.R.apply($$0);
   }

   @Override
   public ebq a(ded $$0) {
      ebq $$1 = $$0.q().a_($$0.a().e());
      eya $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dnq.tn) || $$1.a(dnq.to);
      return this.m().b(b, Boolean.valueOf($$2.a(eyb.c))).b(e, $$3 ? $$1.c(e) : $$0.g().g());
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, e, c);
   }
}
