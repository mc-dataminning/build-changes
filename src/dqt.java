import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqt extends dhk {
   public static final MapCodec<dqt> a = b(dqt::new);
   public static final dwg<duq> b = dvt.bz;
   public static final dvx c = dlt.aF;
   public static final dvu d = dvt.bA;

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   public dqt(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jl.c).b(b, duq.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if (!$$0.f() && $$1.c(b) == duq.b) {
         if ($$2 instanceof arm $$7) {
            if (!($$7.c_($$3) instanceof dul $$8)) {
               return bry.f;
            }

            dul.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return bry.b;
      } else {
         return bry.f;
      }
   }

   @Nullable
   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dul($$0, $$1);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return $$0 instanceof arm $$3
         ? a($$2, dsi.R, ($$1x, $$2x, $$3x, $$4) -> dul.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dsi.R, ($$0x, $$1x, $$2x, $$3x) -> dul.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dvd a(dvd $$0, dol $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public doe a_(dvd $$0) {
      return doe.c;
   }
}
