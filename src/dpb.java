import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpb extends doj implements dmy {
   public static final MapCodec<dpb> a = b(dpb::new);
   public static final dtr c = dtq.C;

   @Override
   protected MapCodec<? extends dpb> a() {
      return a;
   }

   protected dpb(dsz.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(eoz.c)));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(c) ? eoz.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c);
   }
}
