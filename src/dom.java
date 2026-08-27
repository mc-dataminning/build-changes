import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dom extends den {
   public static final MapCodec<dom> a = b(dom::new);
   public static final duf<dsp> b = dts.bz;
   public static final dtw c = djc.aE;

   @Override
   public MapCodec<dom> a() {
      return a;
   }

   public dom(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, iw.c).a(b, dsp.a));
   }

   @Override
   public bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if ($$0.d() || $$1.c(b) != dsp.b) {
         return bqc.d;
      } else if ($$2 instanceof aqt $$7) {
         if ($$7.c_($$3) instanceof dsk $$9) {
            dsk.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bqc.a;
         } else {
            return bqc.d;
         }
      } else {
         return bqc.b;
      }
   }

   @Nullable
   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dsk($$0, $$1);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return $$0 instanceof aqt $$3
         ? a($$2, dqe.S, ($$1x, $$2x, $$3x, $$4) -> dsk.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dqe.S, ($$0x, $$1x, $$2x, $$3x) -> dsk.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(c, $$0.g().g());
   }

   @Override
   public dtc a(dtc $$0, dmd $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dlw a_(dtc $$0) {
      return dlw.c;
   }
}
