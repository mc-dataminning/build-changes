import com.mojang.serialization.MapCodec;

public class doh extends dkm implements drq {
   public static final MapCodec<doh> a = b(doh::new);
   private static final fcs c = dkm.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   public static final dym b = dyl.D;

   public doh(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(b) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(ety.c)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c;
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
