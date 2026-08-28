import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dqz extends dmf implements dtq {
   public static final MapCodec<dqz> a = b(dqz::new);
   public static final int b = 15;
   public static final ebh c = eax.aS;
   public static final eay d = eax.I;
   public static final ToIntFunction<eah> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dqz> a() {
      return a;
   }

   public dqz(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C && $$3.gG()) {
         $$1.a($$2, $$0.a(c), 2);
         return bud.b;
      } else {
         return bud.c;
      }
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return $$3.a(czh.ig) ? ffh.b() : ffh.a();
   }

   @Override
   protected boolean e_(eah $$0) {
      return $$0.y().c();
   }

   @Override
   protected dss a_(eah $$0) {
      return dss.a;
   }

   @Override
   protected float c(eah $$0, dig $$1, iu $$2) {
      return 1.0F;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(d) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static czd a(czd $$0, int $$1) {
      $$0.b(kj.aq, dbd.a.a(c, $$1));
      return $$0;
   }
}
