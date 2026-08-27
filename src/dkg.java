import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkg extends dby {
   public static final MapCodec<dkg> a = b(dkg::new);
   public static final dpq b = dpp.B;

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   public dkg(doy.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public doz a(cyx $$0, ib $$1, doz $$2, cjt $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cyx $$0, ib $$1, cyp $$2) {
      if (!$$0.B) {
         cge $$3 = new cge($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.r();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cyx $$0, ib $$1) {
      a($$0, $$1, null);
   }

   private static void a(cyx $$0, ib $$1, @Nullable bqo $$2) {
      if (!$$0.B) {
         cge $$3 = new cge($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dr(), $$3.dt(), $$3.dx(), aum.zc, aun.e, 1.0F, 1.0F);
         $$0.a($$2, dts.I, $$1);
      }
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if (!$$0.a(crm.or) && !$$0.a(crm.tW)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dca.a.n(), 11);
         cre $$7 = $$0.f();
         if (!$$4.f()) {
            if ($$0.a(crm.or)) {
               $$0.a(1, $$4, bqo.d($$5));
            } else {
               $$0.g(1);
            }
         }

         $$4.b(auw.c.b($$7));
         return boc.a($$2.B);
      }
   }

   @Override
   protected void a(cyx $$0, doz $$1, erw $$2, ckl $$3) {
      if (!$$0.B) {
         ib $$4 = $$2.a();
         bpv $$5 = $$3.u();
         if ($$3.bN() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bqo ? (bqo)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cyp $$0) {
      return false;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }
}
