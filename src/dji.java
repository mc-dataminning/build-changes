import com.mojang.serialization.MapCodec;

public class dji extends ddy implements deb {
   public static final MapCodec<dji> a = b(dji::new);

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   protected dji(dra.d $$0) {
      super($$0);
   }

   private static boolean b(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.c();
      drb $$4 = $$1.a_($$3);
      int $$5 = eml.a($$1, $$0, $$2, $$4, $$3, it.b, $$4.b($$1, $$3));
      return $$5 < $$1.P();
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dea.dV.n());
      }
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      drb $$4 = $$0.a_($$2);
      io $$5 = $$2.c();
      dsy $$6 = $$0.l().g();
      jk<dzk<?, ?>> $$7 = $$0.H_().d(lf.aC);
      if ($$4.a(dea.ow)) {
         this.a($$7, rv.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dea.on)) {
         this.a($$7, rv.j, $$0, $$6, $$1, $$5);
         this.a($$7, rv.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rv.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jk<dzk<?, ?>> $$0, akl<dzk<?, ?>> $$1, aqm $$2, dsy $$3, ayk $$4, io $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dzk)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public deb.a aq_() {
      return deb.a.a;
   }
}
