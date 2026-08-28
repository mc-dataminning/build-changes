import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class djg extends dkw implements dfz, dmy {
   public static final MapCodec<djg> a = b(djg::new);
   private static final dtr c = dtq.C;
   private final dkx d = new dkx(this);

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   public djg(dsz.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dta> b(int $$0) {
      return $$1 -> dkw.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, cyb $$1) {
      return !$$1.n().a(cur.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return ji.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(c) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dta $$0, dca $$1, jd $$2) {
      return $$0.u().c();
   }

   @Override
   public dkx c() {
      return this.d;
   }
}
