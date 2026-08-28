import com.mojang.serialization.MapCodec;

public class dhd extends dez {
   public static final MapCodec<dhd> a = b(dhd::new);
   protected static final ewk b = dhw.c;

   @Override
   public MapCodec<dhd> a() {
      return a;
   }

   protected dhd(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dsc $$0) {
      return true;
   }

   @Override
   public dsc a(cya $$0) {
      return !this.o().a((dcb)$$0.q(), $$0.a()) ? dez.a(this.o(), dfb.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      dhw.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      dsc $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dhy;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
