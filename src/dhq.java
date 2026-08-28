import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhq extends ddt<dqc> implements dma {
   public static final MapCodec<dhq> b = b(dhq::new);
   public static final dsw c = div.aE;
   public static final dst d = dss.C;
   protected static final ewk e = dez.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xp f = xp.c("container.enderchest");

   @Override
   public MapCodec<dhq> a() {
      return b;
   }

   protected dhq(dsb.d $$0) {
      super($$0, () -> dpj.d);
      this.k(this.E.b().a(c, je.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dhg.c<? extends dpo> a(dsc $$0, dby $$1, iz $$2, boolean $$3) {
      return dhg.b::b;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return e;
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.b;
   }

   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == enw.c));
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      crg $$5 = $$3.gp();
      dph $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dqc) {
         iz $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bqu.a($$1.B);
         } else if ($$1.B) {
            return bqu.a;
         } else {
            dqc $$8 = (dqc)$$6;
            $$5.a($$8);
            $$3.a(new bre(($$1x, $$2x, $$3x) -> cqb.a($$1x, $$2x, $$5), f));
            $$3.a(awk.aj);
            clo.a($$3, true);
            return bqu.c;
         }
      } else {
         return bqu.a($$1.B);
      }
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return $$0.B ? a($$2, dpj.d, dqc::a) : null;
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(li.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(d) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      dph $$4 = $$1.c_($$2);
      if ($$4 instanceof dqc) {
         ((dqc)$$4).b();
      }
   }
}
