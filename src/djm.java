import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djm extends dfp<dsa> implements dnx {
   public static final MapCodec<djm> b = b(djm::new);
   public static final duu c = dkr.aE;
   public static final dur d = duq.C;
   protected static final eyx e = dgv.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xd f = xd.c("container.enderchest");

   @Override
   public MapCodec<djm> a() {
      return b;
   }

   protected djm(dtz.d $$0) {
      super($$0, () -> drg.d);
      this.l(this.E.b().b(c, jj.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public djc.c<? extends drl> a(dua $$0, dds $$1, je $$2, boolean $$3) {
      return djc.b::b;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return e;
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.b;
   }

   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      return this.o().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == eqc.c));
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      cse $$5 = $$3.gp();
      if ($$5 != null && $$1.c_($$2) instanceof dsa $$7) {
         je $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return brk.a;
         } else {
            if (!$$1.B) {
               $$5.a($$7);
               $$3.a(new brs(($$1x, $$2x, $$3x) -> cqz.a($$1x, $$2x, $$5), f));
               $$3.a(awn.aj);
               cmg.a($$3, true);
            }

            return brk.a;
         }
      } else {
         return brk.a;
      }
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dsa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return $$0.B ? a($$2, drg.d, dsa::a) : null;
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(ln.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(d) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      dre $$4 = $$1.c_($$2);
      if ($$4 instanceof dsa) {
         ((dsa)$$4).b();
      }
   }
}
