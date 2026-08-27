import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dab extends cya implements dfo {
   public static final MapCodec<dab> a = b(dab::new);
   public static final dlw b = dlv.C;
   private static final int d = 3;
   protected static final eol c = cyo.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dab> a() {
      return a;
   }

   public dab(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return a($$2, div.z, $$0.B ? djf::a : djf::b);
   }

   @Override
   protected det b_(dlf $$0) {
      return det.b;
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(b) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return c;
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, @Nullable bog $$3, coz $$4) {
      if ($$4.B()) {
         dit $$5 = $$0.c_($$1);
         if ($$5 instanceof dio) {
            ((dio)$$5).a($$4.z());
         }
      }
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(aue.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
