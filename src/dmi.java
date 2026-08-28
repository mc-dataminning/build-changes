import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmi extends dly {
   public static final MapCodec<dmi> a = b(dmi::new);
   public static final ebm<jb> b = dqn.e;
   public static final ebm<ebc> c = ebe.Y;
   public static final ebf d = ebe.A;
   private static final ffr f = ffo.a(dmm.b(6.0, 6.0, 13.0), dmm.b(8.0, 4.0, 6.0));
   private static final ffr g = ffo.a(f, dmm.b(2.0, 13.0, 16.0));
   private static final Map<jb.a, ffr> h = ffo.a(dmm.a(16.0, 16.0, 8.0));
   private static final Map<jb.a, ffr> i = ffo.a(ffo.a(f, dmm.a(2.0, 16.0, 13.0, 15.0)));
   private static final Map<jb, ffr> D = ffo.c(ffo.a(f, dmm.a(2.0, 13.0, 15.0, 0.0, 13.0)));
   public static final int e = 1;

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   public dmi(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, ebc.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(djh $$0, eao $$1, fet $$2, cse $$3) {
      crj $$6 = $$3.q() instanceof crj $$5 ? $$5 : null;
      this.a($$0, $$1, $$2, $$6, true);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      return (bug)(this.a($$1, $$0, $$4, $$3, true) ? bug.a : bug.e);
   }

   public boolean a(djh $$0, eao $$1, fet $$2, @Nullable crj $$3, boolean $$4) {
      jb $$5 = $$2.c();
      iv $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awx.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(eao $$0, jb $$1, double $$2) {
      if ($$1.o() != jb.a.b && !($$2 > 0.8124F)) {
         jb $$3 = $$0.c(b);
         ebc $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(djh $$0, iv $$1, @Nullable jb $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bwi $$0, djh $$1, iv $$2, @Nullable jb $$3) {
      dxm $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dxk) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dxk)$$4).a($$3);
         $$1.a(null, $$2, awn.bZ, awo.e, 2.0F, 1.0F);
         $$1.a($$0, efo.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ffr o(eao $$0) {
      jb $$1 = $$0.c(b);

      return switch ((ebc)$$0.c(c)) {
         case a -> (ffr)h.get($$1.o());
         case c -> (ffr)D.get($$1);
         case d -> (ffr)i.get($$1.o());
         case b -> g;
      };
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.o($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      jb $$1 = $$0.k();
      iv $$2 = $$0.a();
      djh $$3 = $$0.q();
      jb.a $$4 = $$1.o();
      if ($$4 == jb.a.b) {
         eao $$5 = this.m().b(c, $$1 == jb.a ? ebc.b : ebc.a).b(b, $$0.g());
         if ($$5.a((djk)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jb.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jb.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jb.e)
            || $$4 == jb.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jb.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jb.c);
         eao $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? ebc.d : ebc.c);
         if ($$7.a((djk)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jb.b);
         $$7 = $$7.b(c, $$8 ? ebc.a : ebc.b);
         if ($$7.a((djk)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, dja $$3, BiConsumer<czk, iv> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      ebc $$8 = $$0.c(c);
      jb $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != ebc.d) {
         return dmo.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == ebc.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, ebc.c).b(b, $$4.g());
            }

            if ($$8 == ebc.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, ebc.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      jb $$3 = q($$0).g();
      return $$3 == jb.b ? dmm.a($$1, $$2.d(), jb.a) : dpi.b($$1, $$2, $$3);
   }

   private static jb q(eao $$0) {
      switch ((ebc)$$0.c(c)) {
         case a:
            return jb.b;
         case b:
            return jb.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dxk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return a($$2, dxo.F, $$0.C ? dxk::a : dxk::b);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   @Override
   public eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
