import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmk extends den implements dmr {
   public static final MapCodec<dmk> a = b(dmk::new);
   public static final dtt b = dts.F;
   public static final dtt c = dts.C;
   public static final dtt d = dts.G;
   protected static final exn e = dfc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(iw.a.b);

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   public dmk(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, brv $$3) {
      if ($$0 instanceof aqt $$4) {
         aqu $$5 = drp.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dqe.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if ($$1 instanceof aqt $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dqe.M).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dqe.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return e;
   }

   @Override
   protected exn g(dtc $$0, dbg $$1, ir $$2) {
      return e;
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Nullable
   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new drp($$0, $$1);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      return this.n().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == epf.c));
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, cuh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpc.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return !$$0.C ? den.a($$2, dqe.M, ($$0x, $$1x, $$2x, $$3) -> dye.c.a($$0x, $$3.gA(), $$3.gB())) : null;
   }
}
