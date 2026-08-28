import com.mojang.serialization.Codec;

public class eca extends ece<eeh> {
   public eca(Codec<eeh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecg<eeh> $$0) {
      jd $$1 = $$0.e();
      dds $$2 = $$0.b();
      eeh $$3 = $$0.f();

      for (jd $$4 : jd.c($$1.b(-1, -2, -1), $$1.b(1, 2, 1))) {
         boolean $$5 = $$4.u() == $$1.u();
         boolean $$6 = $$4.v() == $$1.v();
         boolean $$7 = $$4.w() == $$1.w();
         boolean $$8 = Math.abs($$4.v() - $$1.v()) == 2;
         if ($$5 && $$6 && $$7) {
            jd $$9 = $$4.j();
            this.a($$2, $$9, dga.kF.o());
            $$3.b().ifPresent($$3x -> {
               if ($$2.c_($$9) instanceof dry $$5x) {
                  $$5x.a($$3x, $$3.c());
               }
            });
         } else if ($$6) {
            this.a($$2, $$4, dga.a.o());
         } else if ($$8 && $$5 && $$7) {
            this.a($$2, $$4, dga.F.o());
         } else if (($$5 || $$7) && !$$8) {
            this.a($$2, $$4, dga.F.o());
         } else {
            this.a($$2, $$4, dga.a.o());
         }
      }

      return true;
   }
}
