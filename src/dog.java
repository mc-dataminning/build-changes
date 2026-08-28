import com.mojang.serialization.MapCodec;

public class dog extends dkl implements drp {
   public static final MapCodec<dog> a = b(dog::new);
   private static final fcr c = dkl.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   public static final dyl b = dyk.D;

   public dog(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dog> a() {
      return a;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(etx.c)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return c;
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
