import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtl extends dku {
   public static final MapCodec<dtl> a = b(dtl::new);
   public static final dzd b = dzc.H;

   @Override
   public MapCodec<dtl> a() {
      return a;
   }

   public dtl(dyl.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dym a(dhp $$0, jj $$1, dym $$2, cqi $$3) {
      if (!$$0.w_() && !$$3.gj().d && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arn $$0, jj $$1, dhi $$2) {
      cmo $$3 = new cmo($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.g();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dhp $$0, jj $$1) {
      a($$0, $$1, null);
   }

   private static void a(dhp $$0, jj $$1, @Nullable bwr $$2) {
      if (!$$0.C) {
         cmo $$3 = new cmo($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dA(), $$3.dC(), $$3.dG(), awk.Aw, awl.e, 1.0F, 1.0F);
         $$0.a($$2, edm.I, $$1);
      }
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if (!$$0.a(cyc.pb) && !$$0.a(cyc.uZ)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dkw.a.m(), 11);
         cxu $$7 = $$0.h();
         if ($$0.a(cyc.pb)) {
            $$0.a(1, $$4, bwr.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awu.c.b($$7));
         return btq.a;
      }
   }

   @Override
   protected void a(dhp $$0, dym $$1, fcq $$2, crb $$3) {
      if ($$0 instanceof arn $$4) {
         jj $$5 = $$2.b();
         bvs $$6 = $$3.q();
         if ($$3.bY() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bwr ? (bwr)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dhi $$0) {
      return false;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }
}
