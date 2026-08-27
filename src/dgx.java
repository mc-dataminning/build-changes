import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgx extends dba implements ddi {
   public static final MapCodec<dgx> c = b(dgx::new);
   public static final dmh<dmf> d = dba.b;
   protected static final float e = 6.0F;
   protected static final eos f = cys.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dgx> a() {
      return c;
   }

   public dgx(dli.d $$0) {
      super($$0);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return f;
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.d($$1, $$2, ie.b) && !$$0.a(cyu.kJ);
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return new cpd(cyu.bw);
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      dlj $$1 = super.a($$0);
      if ($$1 != null) {
         egw $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(auf.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      if ($$0.c(d) == dmf.a) {
         dlj $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dmf.b;
      } else {
         egw $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(auf.a) && $$4.e() == 8;
      }
   }

   @Override
   protected egw c_(dlj $$0) {
      return egx.c.a(false);
   }

   @Override
   public boolean a(@Nullable chl $$0, cux $$1, hz $$2, dlj $$3, egv $$4) {
      return false;
   }

   @Override
   public boolean a(cvs $$0, hz $$1, dlj $$2, egw $$3) {
      return false;
   }
}
