import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsr extends dkd {
   public static final MapCodec<dsr> a = b(dsr::new);
   public static final dyf b = dye.I;

   @Override
   public MapCodec<dsr> a() {
      return a;
   }

   public dsr(dxn.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dxo a(dgz $$0, jh $$1, dxo $$2, cpo $$3) {
      if (!$$0.B_() && !$$3.b() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arx $$0, jh $$1, dgr $$2) {
      clt $$3 = new clt($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.m();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dgz $$0, jh $$1) {
      a($$0, $$1, null);
   }

   private static void a(dgz $$0, jh $$1, @Nullable bvx $$2) {
      if (!$$0.C) {
         clt $$3 = new clt($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dB(), $$3.dD(), $$3.dH(), awv.An, aww.e, 1.0F, 1.0F);
         $$0.a($$2, eck.I, $$1);
      }
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if (!$$0.a(cxk.oX) && !$$0.a(cxk.uV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dkf.a.m(), 11);
         cxc $$7 = $$0.h();
         if ($$0.a(cxk.oX)) {
            $$0.a(1, $$4, bvx.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(axf.c.b($$7));
         return bta.a;
      }
   }

   @Override
   protected void a(dgz $$0, dxo $$1, fbn $$2, cqh $$3) {
      if ($$0 instanceof arx $$4) {
         jh $$5 = $$2.b();
         bvb $$6 = $$3.p();
         if ($$3.bY() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bvx ? (bvx)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dgr $$0) {
      return false;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }
}
