import com.mojang.serialization.MapCodec;

public class djk extends dea implements ded {
   public static final MapCodec<djk> a = b(djk::new);

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   protected djk(drc.d $$0) {
      super($$0);
   }

   private static boolean b(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.c();
      drd $$4 = $$1.a_($$3);
      int $$5 = emn.a($$1, $$0, $$2, $$4, $$3, it.b, $$4.b($$1, $$3));
      return $$5 < $$1.P();
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dec.dV.n());
      }
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      drd $$4 = $$0.a_($$2);
      io $$5 = $$2.c();
      dta $$6 = $$0.l().g();
      jk<dzm<?, ?>> $$7 = $$0.H_().d(lf.aC);
      if ($$4.a(dec.ow)) {
         this.a($$7, rv.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dec.on)) {
         this.a($$7, rv.j, $$0, $$6, $$1, $$5);
         this.a($$7, rv.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rv.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jk<dzm<?, ?>> $$0, akm<dzm<?, ?>> $$1, aqn $$2, dta $$3, aym $$4, io $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dzm)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public ded.a ar_() {
      return ded.a.a;
   }
}
