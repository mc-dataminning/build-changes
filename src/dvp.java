import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvp extends dmr {
   public static final MapCodec<dvp> a = b(dvp::new);
   public static final ebk b = ebj.H;

   @Override
   public MapCodec<dvp> a() {
      return a;
   }

   public dvp(eas.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.D($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      if ($$1.D($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public eat a(djm $$0, iv $$1, eat $$2, crm $$3) {
      if (!$$0.w_() && !$$3.gj().d && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arq $$0, iv $$1, djf $$2) {
      cns $$3 = new cns($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.g();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(djm $$0, iv $$1) {
      a($$0, $$1, null);
   }

   private static void a(djm $$0, iv $$1, @Nullable bxj $$2) {
      if (!$$0.C) {
         cns $$3 = new cns($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dz(), $$3.dB(), $$3.dF(), awn.AC, awo.e, 1.0F, 1.0F);
         $$0.a($$2, eft.I, $$1);
      }
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      if (!$$0.a(czr.pg) && !$$0.a(czr.vg)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dmt.a.m(), 11);
         czj $$7 = $$0.h();
         if ($$0.a(czr.pg)) {
            $$0.a(1, $$4, bxj.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awx.c.b($$7));
         return bug.a;
      }
   }

   @Override
   protected void a(djm $$0, eat $$1, fey $$2, csh $$3) {
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
   public boolean a(djf $$0) {
      return false;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }
}
