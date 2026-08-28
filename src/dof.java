import com.mojang.serialization.MapCodec;

public class dof extends dma {
   public static final MapCodec<dof> a = b(dof::new);
   private static final ffc b = dma.b(16.0, 0.0, 15.0);

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   protected dof(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dzz $$0) {
      return true;
   }

   @Override
   public dzz a(dcr $$0) {
      return !this.m().a((diy)$$0.q(), $$0.a()) ? dma.a(this.m(), dmc.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$4 == ja.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      doy.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      dzz $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dpa;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
