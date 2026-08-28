import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpc extends djd implements dlm {
   public static final MapCodec<dpc> c = b(dpc::new);
   public static final duy<duw> d = djd.b;
   protected static final float e = 6.0F;
   protected static final eyx f = dgv.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dpc> a() {
      return c;
   }

   public dpc(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return f;
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return $$0.c($$1, $$2, jj.b) && !$$0.a(dgx.kJ);
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl(dgx.bw);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      dua $$1 = super.a($$0);
      if ($$1 != null) {
         eqb $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(awy.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      if ($$0.c(d) == duw.a) {
         dua $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == duw.b;
      } else {
         eqb $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awy.a) && $$4.e() == 8;
      }
   }

   @Override
   protected eqb b_(dua $$0) {
      return eqc.c.a(false);
   }

   @Override
   public boolean a(@Nullable cnp $$0, dcx $$1, je $$2, dua $$3, eqa $$4) {
      return false;
   }

   @Override
   public boolean a(ddt $$0, je $$1, dua $$2, eqb $$3) {
      return false;
   }
}
