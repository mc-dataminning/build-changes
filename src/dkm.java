import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkm extends dep implements dgx {
   public static final MapCodec<dkm> c = b(dkm::new);
   public static final dqg<dqe> d = dep.b;
   protected static final float e = 6.0F;
   protected static final etc f = dch.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dkm> a() {
      return c;
   }

   public dkm(dph.d $$0) {
      super($$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return f;
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return $$0.d($$1, $$2, ij.b) && !$$0.a(dcj.kJ);
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return new crs(dcj.bw);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = super.a($$0);
      if ($$1 != null) {
         elb $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(avj.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      if ($$0.c(d) == dqe.a) {
         dpi $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dqe.b;
      } else {
         elb $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(avj.a) && $$4.e() == 8;
      }
   }

   @Override
   protected elb c_(dpi $$0) {
      return elc.c.a(false);
   }

   @Override
   public boolean a(@Nullable cka $$0, cym $$1, id $$2, dpi $$3, ela $$4) {
      return false;
   }

   @Override
   public boolean a(czh $$0, id $$1, dpi $$2, elb $$3) {
      return false;
   }
}
