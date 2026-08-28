import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfe extends dfk {
   public static final MapCodec<dfe> a = b(dfe::new);
   public static final dtw b = dts.P;
   public static final dtt c = dts.u;

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   public dfe(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         dqh $$5 = $$1.c_($$2);
         if ($$5 instanceof dqa) {
            $$3.a((dqa)$$5);
            $$3.a(avz.ar);
            clo.a($$3, true);
         }

         return bqr.c;
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      bqn.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      dqh $$4 = $$1.c_($$2);
      if ($$4 instanceof dqa) {
         ((dqa)$$4).l();
      }
   }

   @Nullable
   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dqa($$0, $$1);
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return cpu.a($$1.c_($$2));
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
