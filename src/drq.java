import com.mojang.serialization.Codec;

public class drq extends drt<dtw> {
   public drq(Codec<dtw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<dtw> $$0) {
      hx $$1 = $$0.e();
      cuj $$2 = $$0.b();
      dtw $$3 = $$0.f();

      for (hx $$4 : hx.a($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            hx $$9 = $$4.i();
            this.a($$2, $$9, cwr.kF.o());
            $$3.b().ifPresent($$3x -> {
               dgu $$4x = $$2.c_($$9);
               if ($$4x instanceof dij $$5x) {
                  $$5x.a($$3x, $$3.c());
                  $$4x.e();
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, cwr.a.o());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, cwr.F.o());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, cwr.F.o());
         } else {
            this.a($$2, $$4, cwr.a.o());
         }
      }

      return true;
   }
}
