import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drn extends dkw implements dkp, dpf {
   public static final MapCodec<drn> a = b(drn::new);
   protected static final float b = 6.0F;
   protected static final fcs c = dkm.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<drn> a() {
      return a;
   }

   protected drn(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c;
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dko.le);
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());
      return $$1.a(aya.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      dxv $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return $$0.a_($$1.d()).a(dko.J);
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   protected etx b_(dxv $$0) {
      return ety.c.a(false);
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      dxv $$4 = dko.bE.m();
      dxv $$5 = $$4.b(dsv.d, dyq.a);
      jh $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
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
