import com.mojang.serialization.Codec;

public class dqz extends drc<dtf> {
   public dqz(Codec<dtf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtf> $$0) {
      hv $$1 = $$0.e();
      ctt $$2 = $$0.b();
      dtf $$3 = $$0.f();

      for (hv $$4 : hv.a($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            hv $$9 = $$4.i();
            this.a($$2, $$9, cwb.kF.o());
            $$3.b().ifPresent($$3x -> {
               dgd $$4x = $$2.c_($$9);
               if ($$4x instanceof dhs $$5x) {
                  $$5x.a($$3x, $$3.c());
                  $$4x.e();
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, cwb.a.o());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, cwb.F.o());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, cwb.F.o());
         } else {
            this.a($$2, $$4, cwb.a.o());
         }
      }

      return true;
   }
}
