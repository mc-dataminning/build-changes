import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dsc extends det {
   public static final MapCodec<dsc> a = b(dsc::new);
   public static final dte b = dse.a;
   public static final dti<dtm> c = dse.c;

   @Override
   public MapCodec<dsc> a() {
      return a;
   }

   public dsc(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, dtm.a));
   }

   @Nullable
   @Override
   public dpp a(ja $$0, dsk $$1) {
      return null;
   }

   public static dpp a(ja $$0, dsk $$1, dsk $$2, jf $$3, boolean $$4, boolean $$5) {
      return new dsg($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return a($$2, dpr.k, dsg::a);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpp $$5 = $$1.c_($$2);
         if ($$5 instanceof dsg) {
            ((dsg)$$5).k();
         }
      }
   }

   @Override
   public void a(dcg $$0, ja $$1, dsk $$2) {
      ja $$3 = $$1.a($$2.c(b).g());
      dsk $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dsd && $$4.c(dsd.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bqg.c;
      } else {
         return bqg.e;
      }
   }

   @Override
   protected List<cuc> a(dsk $$0, eqx.a $$1) {
      dsg $$2 = this.a($$1.a(), ja.a($$1.a(etq.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return ewv.a();
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      dsg $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ewv.a();
   }

   @Nullable
   private dsg a(dbl $$0, ja $$1) {
      dpp $$2 = $$0.c_($$1);
      return $$2 instanceof dsg ? (dsg)$$2 : null;
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return cuc.l;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
