import com.mojang.serialization.MapCodec;

public class dir extends dey implements dlz {
   public static final MapCodec<dir> a = b(dir::new);
   private static final ewj b = dey.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public dir(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(dsr.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(dsr.C);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(dsr.C)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(dsr.C) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());
      return this.o().a(dsr.C, Boolean.valueOf($$1.b(env.c)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
