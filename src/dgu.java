import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgu extends det implements dmi {
   public static final MapCodec<dgu> a = b(dgu::new);
   public static final dtb b = dta.C;
   private static final int d = 3;
   protected static final ewy c = dfh.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dgu> a() {
      return a;
   }

   public dgu(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return a($$2, dpr.z, $$0.B ? dqb::a : dqb::b);
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.b;
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(b) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return c;
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(awc.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
