import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsv extends dmw implements dpf {
   public static final MapCodec<dsv> c = b(dsv::new);
   public static final dys<dyq> d = dmw.b;
   protected static final float e = 6.0F;
   protected static final fcs f = dkm.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dsv> a() {
      return c;
   }

   public dsv(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return f;
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dko.le);
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return new cxp(dko.bD);
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = super.a($$0);
      if ($$1 != null) {
         etx $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(aya.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      if ($$0.c(d) == dyq.a) {
         dxv $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dyq.b;
      } else {
         etx $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(aya.a) && $$4.e() == 8;
      }
   }

   @Override
   protected etx b_(dxv $$0) {
      return ety.c.a(false);
   }

   @Override
   public boolean a(@Nullable cpx $$0, dgn $$1, jh $$2, dxv $$3, etw $$4) {
      return false;
   }

   @Override
   public boolean a(dhj $$0, jh $$1, dxv $$2, etx $$3) {
      return false;
   }
}
