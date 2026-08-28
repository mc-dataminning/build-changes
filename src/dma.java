import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dma extends dhm implements doo {
   public static final MapCodec<dma> a = b(dma::new);
   public static final int b = 15;
   public static final dvs c = dvi.aP;
   public static final dvj d = dvi.C;
   public static final ToIntFunction<dus> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   public dma(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B && $$3.gA()) {
         $$1.a($$2, $$0.a(c), 2);
         return brs.b;
      } else {
         return brs.c;
      }
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return $$3.a(cvw.hC) ? ezn.b() : ezn.a();
   }

   @Override
   protected boolean e_(dus $$0) {
      return $$0.y().c();
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.a;
   }

   @Override
   protected float c(dus $$0, ddo $$1, jf $$2) {
      return 1.0F;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(d) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cvs a(cvs $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(ks.ah, cya.a.a(c, $$1));
      }

      return $$0;
   }
}
