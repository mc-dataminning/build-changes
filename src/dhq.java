import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhq extends den {
   public static final MapCodec<dhq> a = b(dhq::new);
   protected static final exn b = dfc.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ir> c = ir.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ir::i).toList();

   @Override
   public MapCodec<dhq> a() {
      return a;
   }

   protected dhq(dtb.d $$0) {
      super($$0);
   }

   public static boolean a(dca $$0, ir $$1, ir $$2) {
      return $$0.a_($$1.a((jv)$$2)).a(awe.cy) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awe.cz);
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (ir $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lb.s,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return $$0.C ? a($$2, dqe.n, dqw::a) : null;
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bqa.b;
      }
   }

   @Nullable
   @Override
   protected bqe b(dtc $$0, dca $$1, ir $$2) {
      dqc $$3 = $$1.c_($$2);
      if ($$3 instanceof dqw) {
         xe $$4 = ((bqf)$$3).P_();
         return new bqk(($$2x, $$3x, $$4x) -> new cqa($$2x, $$3x, cpr.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
