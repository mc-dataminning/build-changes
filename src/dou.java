import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dou extends dfk {
   public static final MapCodec<dou> a = b(dou::new);
   public static final duf<dsp> b = dts.bz;
   public static final dtw c = dju.aE;
   public static final dtt d = dts.bA;

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   public dou(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ji.c).a(b, dsp.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, eww $$6) {
      if ($$0.e() || $$1.c(b) != dsp.b) {
         return bqt.d;
      } else if ($$2 instanceof aqu $$7) {
         if ($$7.c_($$3) instanceof dsk $$9) {
            dsk.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bqt.a;
         } else {
            return bqt.d;
         }
      } else {
         return bqt.b;
      }
   }

   @Nullable
   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dsk($$0, $$1);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return $$0 instanceof aqu $$3
         ? a($$2, dqj.R, ($$1x, $$2x, $$3x, $$4) -> dsk.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dqj.R, ($$0x, $$1x, $$2x, $$3x) -> dsk.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(c, $$0.g().g());
   }

   @Override
   public dtc a(dtc $$0, dmm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dmf a_(dtc $$0) {
      return dmf.c;
   }
}
