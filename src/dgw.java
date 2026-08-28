import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgw extends dmj implements dmy {
   public static final MapCodec<dgw> a = b(dgw::new);
   public static final dtr b = dtq.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final exp e = dfw.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final exp f = dfw.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final exp g = dfw.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dgw> a() {
      return a;
   }

   public dgw(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ji.a.b));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      switch ((ji.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eoz.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(b) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
