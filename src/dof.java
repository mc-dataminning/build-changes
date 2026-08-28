import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dof extends dig implements dkp {
   public static final MapCodec<dof> c = b(dof::new);
   public static final dua<dty> d = dig.b;
   protected static final float e = 6.0F;
   protected static final exv f = dfy.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dof> a() {
      return c;
   }

   public dof(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return f;
   }

   @Override
   protected boolean b(dtc $$0, dcc $$1, jd $$2) {
      return $$0.d($$1, $$2, ji.b) && !$$0.a(dga.kJ);
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return new cuq(dga.bw);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = super.a($$0);
      if ($$1 != null) {
         epe $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(awk.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      if ($$0.c(d) == dty.a) {
         dtc $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dty.b;
      } else {
         epe $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awk.a) && $$4.e() == 8;
      }
   }

   @Override
   protected epe b_(dtc $$0) {
      return epf.c.a(false);
   }

   @Override
   public boolean a(@Nullable cmx $$0, dcc $$1, jd $$2, dtc $$3, epd $$4) {
      return false;
   }

   @Override
   public boolean a(dcx $$0, jd $$1, dtc $$2, epe $$3) {
      return false;
   }
}
