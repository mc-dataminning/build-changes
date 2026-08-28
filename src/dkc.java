import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public class dkc extends dod implements dkh, drl {
   public static final MapCodec<dkc> a = b(dkc::new);
   private static final dyh b = dyg.I;
   private static final Map<jn, fcr> c = fco.c(dke.b(6.0, 0.0, 16.0).a(0.0, 0.0, 0.25).d());

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   protected dkc(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(e, jn.c));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c.get($$0.c(e));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, e);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.e();
      dxq $$4 = $$1.a_($$3);
      dxq $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(awp.bA)) && ($$5.a(this) || $$5.a(dkg.th));
   }

   protected static boolean a(dha $$0, ji $$1, etw $$2, jn $$3) {
      dxq $$4 = dkg.ti.m().b(b, Boolean.valueOf($$2.a(etx.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if (($$4 == jn.a || $$4 == jn.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(b)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      Optional<ji> $$3 = l.a($$0, $$1, $$2.b(), jn.b, dkg.th);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ji $$4 = $$3.get().d();
         dxq $$5 = $$0.a_($$4);
         return dkb.a((dhb)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      Optional<ji> $$4 = l.a($$0, $$2, $$3.b(), jn.b, dkg.th);
      if (!$$4.isEmpty()) {
         ji $$5 = $$4.get();
         ji $$6 = $$5.d();
         jn $$7 = $$3.c(e);
         a($$0, $$5, $$0.b_($$5), $$7);
         dkb.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return new cxh(dkg.th);
   }
}
