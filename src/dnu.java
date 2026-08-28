import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnu extends del {
   public static final MapCodec<dnu> a = b(dnu::new);
   public static final dtf<drp> b = dss.bz;
   public static final dsw c = div.aE;
   public static final dst d = dss.bA;

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   public dnu(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, je.c).a(b, drp.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if ($$0.e() || $$1.c(b) != drp.b) {
         return bqw.d;
      } else if ($$2 instanceof arf $$7) {
         if ($$7.c_($$3) instanceof drk $$9) {
            drk.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bqw.a;
         } else {
            return bqw.d;
         }
      } else {
         return bqw.b;
      }
   }

   @Nullable
   @Override
   public dph a(iz $$0, dsc $$1) {
      return new drk($$0, $$1);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return $$0 instanceof arf $$3
         ? a($$2, dpj.R, ($$1x, $$2x, $$3x, $$4) -> drk.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dpj.R, ($$0x, $$1x, $$2x, $$3x) -> drk.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(c, $$0.g().g());
   }

   @Override
   public dsc a(dsc $$0, dlm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dlf a_(dsc $$0) {
      return dlf.c;
   }
}
