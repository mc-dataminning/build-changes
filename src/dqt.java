import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dqt extends dma implements dtj {
   public static final MapCodec<dqt> a = b(dqt::new);
   public static final int b = 15;
   public static final eaz c = eap.aS;
   public static final eaq d = eap.I;
   public static final ToIntFunction<dzz> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   public dqt(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C && $$3.gF()) {
         $$1.a($$2, $$0.a(c), 2);
         return bub.b;
      } else {
         return bub.c;
      }
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return $$3.a(czc.id) ? fez.b() : fez.a();
   }

   @Override
   protected boolean e_(dzz $$0) {
      return $$0.y().c();
   }

   @Override
   protected dsm a_(dzz $$0) {
      return dsm.a;
   }

   @Override
   protected float c(dzz $$0, dib $$1, iu $$2) {
      return 1.0F;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(d) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static cyy a(cyy $$0, int $$1) {
      $$0.b(kj.aq, day.a.a(c, $$1));
      return $$0;
   }
}
