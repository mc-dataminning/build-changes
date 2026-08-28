import com.mojang.serialization.MapCodec;

public class dny extends dkd implements drj {
   public static final MapCodec<dny> a = b(dny::new);
   private static final fcl c = dkd.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   public static final dyf b = dye.J;

   public dny(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(b) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(etr.c)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return c;
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
