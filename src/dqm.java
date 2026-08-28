import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dqm extends dlu implements dtb {
   public static final MapCodec<dqm> a = b(dqm::new);
   public static final int b = 15;
   public static final eao c = eae.aS;
   public static final eaf d = eae.I;
   public static final ToIntFunction<dzo> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dqm> a() {
      return a;
   }

   public dqm(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C && $$3.gF()) {
         $$1.a($$2, $$0.a(c), 2);
         return bty.b;
      } else {
         return bty.c;
      }
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return $$3.a(cyw.ib) ? fen.b() : fen.a();
   }

   @Override
   protected boolean e_(dzo $$0) {
      return $$0.y().c();
   }

   @Override
   protected dsf a_(dzo $$0) {
      return dsf.a;
   }

   @Override
   protected float c(dzo $$0, dhv $$1, iu $$2) {
      return 1.0F;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(d) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static cys a(cys $$0, int $$1) {
      $$0.b(kj.aq, das.a.a(c, $$1));
      return $$0;
   }
}
