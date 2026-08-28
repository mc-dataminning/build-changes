import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmt extends dfk implements dna {
   public static final MapCodec<dmt> a = b(dmt::new);
   public static final dtt b = dts.F;
   public static final dtt c = dts.C;
   public static final dtt d = dts.G;
   protected static final exv e = dfy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ji.a.b);

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   public dmt(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, bsr $$3) {
      if ($$0 instanceof aqu $$4) {
         aqv $$5 = drq.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dqj.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if ($$1 instanceof aqu $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dqj.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dqj.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected exv b(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return e;
   }

   @Override
   protected exv f(dtc $$0, dcc $$1, jd $$2) {
      return e;
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Nullable
   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drq($$0, $$1);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == epf.c));
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, cuq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpt.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return !$$0.B ? dfk.a($$2, dqj.L, ($$0x, $$1x, $$2x, $$3) -> dyi.c.a($$0x, $$3.gm(), $$3.gn())) : null;
   }
}
