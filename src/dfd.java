import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfd extends dfw implements dmy {
   public static final MapCodec<dfd> a = b(dfd::new);
   public static final dtr b = dtq.C;

   @Override
   public MapCodec<dfd> a() {
      return a;
   }

   protected dfd(dsz.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dta $$0, dca $$1, jd $$2) {
      return $$0.u().c();
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.a;
   }

   @Override
   protected float d(dta $$0, dca $$1, jd $$2) {
      return 1.0F;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(b) ? eoz.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eoz.c));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   public cuo a(@Nullable cmv $$0, dcv $$1, jd $$2, dta $$3) {
      return $$0 != null && $$0.f() ? dmy.super.a($$0, $$1, $$2, $$3) : cuo.l;
   }

   @Override
   public boolean a(@Nullable cmv $$0, dca $$1, jd $$2, dta $$3, eox $$4) {
      return $$0 != null && $$0.f() ? dmy.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
