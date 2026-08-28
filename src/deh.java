import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deh extends did {
   public static final MapCodec<deh> a = b(deh::new);
   public static final dte b = djd.aE;
   private static final ewy c = dfh.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ewy d = dfh.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ewy e = dfh.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ewy f = dfh.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ewy g = dfh.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ewy h = dfh.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ewy i = dfh.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ewy j = ewv.a(c, d, e, f);
   private static final ewy k = ewv.a(c, g, h, i);
   private static final wu l = wu.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   public deh(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c));
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.aC);
         return bqg.c;
      }
   }

   @Nullable
   @Override
   protected bqk b(dsk $$0, dcf $$1, ja $$2) {
      return new bqq(($$2x, $$3, $$4) -> new cpj($$2x, $$3, cpt.a($$1, $$2)), l);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      jf $$4 = $$0.c(b);
      return $$4.o() == jf.a.a ? j : k;
   }

   @Override
   protected void a(cit $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, dsk $$3, cit $$4) {
      if (!$$4.aX()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dcf $$0, ja $$1, cit $$2) {
      if (!$$2.aX()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bqz a(bsg $$0) {
      return $$0.dR().b($$0);
   }

   @Nullable
   public static dsk e(dsk $$0) {
      if ($$0.a(dfj.gS)) {
         return dfj.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(dfj.gT) ? dfj.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   @Override
   public int b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
