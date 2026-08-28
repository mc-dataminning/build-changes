import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dks extends dfw implements dmy {
   public static final MapCodec<dks> a = b(dks::new);
   public static final dtr b = dtq.C;

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   protected dks(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dta $$0, dta $$1, ji $$2) {
      return $$1.a(dfy.ac) && $$2.o() == ji.a.b;
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
   protected eoy b_(dta $$0) {
      return $$0.c(b) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }
}
