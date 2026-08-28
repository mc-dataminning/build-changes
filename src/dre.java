import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dre extends dhv {
   public static final MapCodec<dre> a = b(dre::new);
   public static final dwq<dvb> b = dwe.bz;
   public static final dwl<jm> c = dme.aF;
   public static final dwf d = dwe.bA;

   @Override
   public MapCodec<dre> a() {
      return a;
   }

   public dre(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(b, dvb.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if (!$$0.f() && $$1.c(b) == dvb.b) {
         if ($$2 instanceof arq $$7) {
            if (!($$7.c_($$3) instanceof duw $$8)) {
               return bsh.f;
            }

            duw.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return bsh.b;
      } else {
         return bsh.f;
      }
   }

   @Nullable
   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new duw($$0, $$1);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return $$0 instanceof arq $$3
         ? a($$2, dst.R, ($$1x, $$2x, $$3x, $$4) -> duw.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dst.R, ($$0x, $$1x, $$2x, $$3x) -> duw.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dvo a(dvo $$0, dow $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dop a_(dvo $$0) {
      return dop.c;
   }
}
