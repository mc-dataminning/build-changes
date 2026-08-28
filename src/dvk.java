import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvk extends dmm {
   public static final MapCodec<dvk> a = b(dvk::new);
   public static final ebf b = ebe.H;

   @Override
   public MapCodec<dvk> a() {
      return a;
   }

   public dvk(ean.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.D($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if ($$1.D($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public eao a(djh $$0, iv $$1, eao $$2, crj $$3) {
      if (!$$0.w_() && !$$3.gj().d && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arq $$0, iv $$1, dja $$2) {
      cnp $$3 = new cnp($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.g();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(djh $$0, iv $$1) {
      a($$0, $$1, null);
   }

   private static void a(djh $$0, iv $$1, @Nullable bxj $$2) {
      if (!$$0.C) {
         cnp $$3 = new cnp($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dz(), $$3.dB(), $$3.dF(), awn.AC, awo.e, 1.0F, 1.0F);
         $$0.a($$2, efo.I, $$1);
      }
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if (!$$0.a(czo.pg) && !$$0.a(czo.vg)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dmo.a.m(), 11);
         czg $$7 = $$0.h();
         if ($$0.a(czo.pg)) {
            $$0.a(1, $$4, bxj.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awx.c.b($$7));
         return bug.a;
      }
   }

   @Override
   protected void a(djh $$0, eao $$1, fet $$2, cse $$3) {
      if ($$0 instanceof arq $$4) {
         iv $$5 = $$2.b();
         bwi $$6 = $$3.q();
         if ($$3.bW() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bxj ? (bxj)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dja $$0) {
      return false;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }
}
