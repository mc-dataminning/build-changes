import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deh extends den {
   public static final MapCodec<deh> a = b(deh::new);
   public static final dtw b = dts.P;
   public static final dtt c = dts.u;

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   public deh(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iw.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         dqc $$5 = $$1.c_($$2);
         if ($$5 instanceof dpu) {
            $$3.a((dpu)$$5);
            $$3.a(avz.as);
            ckp.a($$3, true);
         }

         return bqa.b;
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      bpw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      dqc $$4 = $$1.c_($$2);
      if ($$4 instanceof dpu) {
         ((dpu)$$4).l();
      }
   }

   @Nullable
   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dpu($$0, $$1);
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
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
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(b, $$0.d().g());
   }
}
