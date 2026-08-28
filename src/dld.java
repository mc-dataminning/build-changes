import com.mojang.serialization.MapCodec;

public class dld extends dma implements dmd {
   public static final MapCodec<dld> a = b(dld::new);
   private static final ffc b = dma.b(8.0, 0.0, 12.0);

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   public dld(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b.a($$0.a($$2));
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$3.a(3) == 0 && $$1.v($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return $$1.a_($$2.e()).a(axc.ax);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         return dmc.a.m();
      } else {
         return $$4 == ja.b && $$6.a(dmc.nC) ? dmc.nC.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return new cyy(czc.eh);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      this.a($$0, $$2);
   }

   protected void a(div $$0, iu $$1) {
      $$0.a($$1.d(), dmc.nC.m().b(dle.c, eal.b), 3);
   }
}
