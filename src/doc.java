import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doc extends det {
   public static final MapCodec<doc> a = b(doc::new);
   public static final dtn<drx> b = dta.bz;
   public static final dte c = djd.aE;
   public static final dtb d = dta.bA;

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   public doc(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, jf.c).a(b, drx.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if ($$0.e() || $$1.c(b) != drx.b) {
         return bqi.d;
      } else if ($$2 instanceof aqm $$7) {
         if ($$7.c_($$3) instanceof drs $$9) {
            drs.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bqi.a;
         } else {
            return bqi.d;
         }
      } else {
         return bqi.b;
      }
   }

   @Nullable
   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new drs($$0, $$1);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return $$0 instanceof aqm $$3
         ? a($$2, dpr.R, ($$1x, $$2x, $$3x, $$4) -> drs.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dpr.R, ($$0x, $$1x, $$2x, $$3x) -> drs.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(c, $$0.g().g());
   }

   @Override
   public dsk a(dsk $$0, dlu $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dln a_(dsk $$0) {
      return dln.c;
   }
}
