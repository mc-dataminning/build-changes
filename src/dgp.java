import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgp extends den implements dmr {
   public static final MapCodec<dgp> a = b(dgp::new);
   public static final dtt b = dts.C;
   private static final int d = 3;
   protected static final exn c = dfc.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dgp> a() {
      return a;
   }

   public dgp(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return a($$2, dqe.A, $$0.C ? dqo::a : dqo::b);
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.b;
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(b) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Boolean.valueOf($$1.a(awj.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
