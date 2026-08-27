import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgv extends czo implements dhc {
   public static final MapCodec<dgv> a = b(dgv::new);
   public static final dns b = dnr.F;
   public static final dns c = dnr.C;
   public static final dns d = dnr.G;
   protected static final eqm e = dac.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ih.a.b);

   @Override
   public MapCodec<dgv> a() {
      return a;
   }

   public dgv(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, box $$3) {
      if ($$0 instanceof apf $$4) {
         apg $$5 = dlp.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dkk.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if ($$1 instanceof apf $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dkk.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dkk.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return e;
   }

   @Override
   protected eqm f(dnb $$0, cwh $$1, ib $$2) {
      return e;
   }

   @Override
   protected boolean g_(dnb $$0) {
      return true;
   }

   @Nullable
   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlp($$0, $$1);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eiq.c));
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(c) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, cqm $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bmf.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return !$$0.B ? czo.a($$2, dkk.L, ($$0x, $$1x, $$2x, $$3) -> dry.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }
}
