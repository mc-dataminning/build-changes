import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dey extends den {
   public static final dtw a = dts.R;
   private static final exn d = exk.a(dfc.a(6.0, 0.0, 6.0, 10.0, 5.0, 10.0), dfc.a(1.0, 5.0, 1.0, 15.0, 15.0, 15.0));
   public static final MapCodec<dey> b = b(dey::new);
   public static final int c = 1000;

   public dey(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, iw.c));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(a);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      return this.n().a(a, $$0.g());
   }

   @Override
   public MapCodec<dey> a() {
      return b;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return d;
   }

   @Nullable
   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqa($$0, $$1);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if (!$$1.C && $$3 instanceof bse $$4) {
         $$1.a($$2, dqe.T).ifPresent($$3x -> {
            int $$4x = $$3x.b() + $$4.r();
            $$4.ao();

            while ($$4x >= 1000) {
               cuh $$5 = new cuh(cuk.As);
               $$5.b(ke.ae, new cyb(1000));
               a($$1, $$2, $$5);
               $$4x -= 1000;
            }

            $$3x.a($$4x);
            $$3x.e();
         });
      }
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return a($$2, dqe.T, dqa::a);
   }
}
