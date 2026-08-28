import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqs extends dij {
   public static final MapCodec<dqs> a = b(dqs::new);
   public static final dwf b = dwe.B;

   @Override
   public MapCodec<dqs> a() {
      return a;
   }

   public dqs(dvn.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dvo a(dff $$0, jh $$1, dvo $$2, cor $$3) {
      if (!$$0.y_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arq $$0, jh $$1, dex $$2) {
      cla $$3 = new cla($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b());
      int $$4 = $$3.o();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dff $$0, jh $$1) {
      a($$0, $$1, null);
   }

   private static void a(dff $$0, jh $$1, @Nullable bve $$2) {
      if (!$$0.C) {
         cla $$3 = new cla($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dD(), $$3.dF(), $$3.dJ(), awo.zC, awp.e, 1.0F, 1.0F);
         $$0.a($$2, eak.I, $$1);
      }
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if (!$$0.a(cwj.ot) && !$$0.a(cwj.uo)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dil.a.m(), 11);
         cwb $$7 = $$0.h();
         if ($$0.a(cwj.ot)) {
            $$0.a(1, $$4, bve.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awy.c.b($$7));
         return bsh.a;
      }
   }

   @Override
   protected void a(dff $$0, dvo $$1, ezn $$2, cpk $$3) {
      if (!$$0.C) {
         jh $$4 = $$2.b();
         bui $$5 = $$3.s();
         if ($$3.ca() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bve ? (bve)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dex $$0) {
      return false;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }
}
