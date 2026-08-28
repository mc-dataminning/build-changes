import com.mojang.serialization.MapCodec;

public class dhb extends dex {
   public static final MapCodec<dhb> a = b(dhb::new);
   protected static final ewi b = dhu.c;

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   protected dhb(drz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dsa $$0) {
      return true;
   }

   @Override
   public dsa a(cxy $$0) {
      return !this.o().a((dbz)$$0.q(), $$0.a()) ? dex.a(this.o(), dez.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      dhu.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      dsa $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dhw;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
