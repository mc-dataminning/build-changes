import com.mojang.serialization.MapCodec;

public class doa extends dke implements drl {
   public static final MapCodec<doa> a = b(doa::new);
   public static final dyh b = dyg.I;
   private static final fcr c = dke.b(8.0, 0.0, 8.0);

   public doa(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(etx.c)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c;
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
