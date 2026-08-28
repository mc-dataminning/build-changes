import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class doi extends dly {
   public static final MapCodec<doi> a = b(doi::new);
   public static final ebm<jb.a> b = ebe.K;
   public static final ebm<ebi> c = ebe.bD;
   public static final ebf d = ebe.w;

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   protected doi(ean.d $$0) {
      super($$0);
      this.l(this.m().b(b, jb.a.b).b(c, ebi.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dyc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != ebi.a ? a($$2, dxo.k, dyc::a) : null;
      }
   }

   public static boolean a(djh $$0) {
      return $$0.X();
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if (a($$1)) {
         if ($$0.c(c) != ebi.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.gD, awo.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      $$2.a($$3, this, 1);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      eao $$4 = d($$0, $$1, $$2);
      if ($$4 != $$0) {
         $$1.a($$2, $$4, 3);
      }
   }

   private static eao d(eao $$0, djh $$1, iv $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = $$0.c(c) == ebi.a;
      return $$3 && $$4 ? $$0.b(c, a($$1) ? ebi.c : ebi.b) : $$0;
   }

   public static boolean b(eao $$0, djk $$1, iv $$2) {
      jb.a $$3 = $$0.c(b);

      for (jb $$4 : $$3.g()) {
         eao $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(axc.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dji $$0, iv $$1) {
      for (jb $$2 : jb.values()) {
         iv $$3 = $$1.a($$2);
         eao $$4 = $$0.a_($$3);
         if (!$$4.a(axc.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      return d(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return dtf.b($$0, $$1);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, dja $$3, BiConsumer<czk, iv> $$4) {
      if ($$1.c_($$2) instanceof dyc $$5 && $$3 instanceof djx $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof crj $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public eao a(djh $$0, iv $$1, eao $$2, crj $$3) {
      if ($$0.c_($$1) instanceof dyc $$4) {
         $$4.a($$3.dV().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(crj $$0, eao $$1, djh $$2, iv $$3) {
      if (!$$0.gk() && !$$0.V_() && $$1.c(d) && $$2 instanceof arq $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      if ($$0.c(c) == ebi.a) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dyc $$3 ? $$3.d() : 0;
      }
   }
}
