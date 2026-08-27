import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfg extends den {
   public static final MapCodec<dfg> a = b(dfg::new);
   public static final dtt[] b = new dtt[]{dts.k, dts.l, dts.m};
   protected static final exn c = exk.a(dfc.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dfc.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   public dfg(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return $$0.C ? null : a($$2, dqe.m, dqf::a);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c;
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         dqc $$5 = $$1.c_($$2);
         if ($$5 instanceof dqf) {
            $$3.a((dqf)$$5);
            $$3.a(avz.aa);
         }

         return bqa.b;
      }
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lb.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      bpw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return cpg.a($$1.c_($$2));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
