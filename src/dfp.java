import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfp extends czb implements cyv, ddi {
   public static final MapCodec<dfp> a = b(dfp::new);
   protected static final float b = 6.0F;
   protected static final eos c = cys.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dfp> a() {
      return a;
   }

   protected dfp(dli.d $$0) {
      super($$0);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return c;
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.d($$1, $$2, ie.b) && !$$0.a(cyu.kJ);
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());
      return $$1.a(auf.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      dlj $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return true;
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   protected egw c_(dlj $$0) {
      return egx.c.a(false);
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      dlj $$4 = cyu.bx.o();
      dlj $$5 = $$4.a(dgx.d, dmf.a);
      hz $$6 = $$2.c();
      if ($$0.a_($$6).a(cyu.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
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
