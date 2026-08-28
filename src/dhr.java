import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhr extends ddu<dqd> implements dmb {
   public static final MapCodec<dhr> b = b(dhr::new);
   public static final dsx c = diw.aE;
   public static final dsu d = dst.C;
   protected static final ewl e = dfa.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xp f = xp.c("container.enderchest");

   @Override
   public MapCodec<dhr> a() {
      return b;
   }

   protected dhr(dsc.d $$0) {
      super($$0, () -> dpk.d);
      this.k(this.E.b().a(c, je.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dhh.c<? extends dpp> a(dsd $$0, dbz $$1, iz $$2, boolean $$3) {
      return dhh.b::b;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return e;
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.b;
   }

   @Override
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == enx.c));
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      crh $$5 = $$3.gp();
      dpi $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dqd) {
         iz $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bqv.a($$1.B);
         } else if ($$1.B) {
            return bqv.a;
         } else {
            dqd $$8 = (dqd)$$6;
            $$5.a($$8);
            $$3.a(new brf(($$1x, $$2x, $$3x) -> cqc.a($$1x, $$2x, $$5), f));
            $$3.a(awk.aj);
            clp.a($$3, true);
            return bqv.c;
         }
      } else {
         return bqv.a($$1.B);
      }
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return $$0.B ? a($$2, dpk.d, dqd::a) : null;
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
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
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(d) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      dpi $$4 = $$1.c_($$2);
      if ($$4 instanceof dqd) {
         ((dqd)$$4).b();
      }
   }
}
