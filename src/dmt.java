import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmt extends ddk {
   public static final MapCodec<dmt> a = b(dmt::new);
   public static final dse<dqo> b = drr.bz;
   public static final drv c = dhu.aE;
   public static final drs d = drr.bA;

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   public dmt(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, it.c).a(b, dqo.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if ($$0.e() || $$1.c(b) != dqo.b) {
         return bpw.d;
      } else if ($$2 instanceof aqm $$7) {
         if ($$7.c_($$3) instanceof dqj $$9) {
            dqj.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bpw.a;
         } else {
            return bpw.d;
         }
      } else {
         return bpw.b;
      }
   }

   @Nullable
   @Override
   public dog a(io $$0, drb $$1) {
      return new dqj($$0, $$1);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return $$0 instanceof aqm $$3
         ? a($$2, doi.R, ($$1x, $$2x, $$3x, $$4) -> dqj.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, doi.R, ($$0x, $$1x, $$2x, $$3x) -> dqj.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(c, $$0.g().g());
   }

   @Override
   public drb a(drb $$0, dkl $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dke a_(drb $$0) {
      return dke.c;
   }
}
