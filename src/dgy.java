import com.mojang.serialization.MapCodec;

public class dgy extends deu {
   public static final MapCodec<dgy> a = b(dgy::new);
   protected static final ewf b = dhr.c;

   @Override
   public MapCodec<dgy> a() {
      return a;
   }

   protected dgy(drw.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(drx $$0) {
      return true;
   }

   @Override
   public drx a(cxv $$0) {
      return !this.n().a((dbw)$$0.q(), $$0.a()) ? deu.a(this.n(), dew.j.n(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      dhr.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      drx $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dht;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
