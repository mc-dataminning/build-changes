import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmn extends dhq implements dfl, dmj {
   public static final MapCodec<dmn> c = b(dmn::new);
   private static final dtc g = dtb.C;
   public static final dtf d = dtb.R;
   protected static final float e = 6.0F;
   protected static final exa f = dfi.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dmn> a() {
      return c;
   }

   public dmn(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dth.b).a(g, Boolean.valueOf(false)).a(d, jf.c));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return f;
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.a(avw.bx) || $$1.b_($$2.c()).a(eok.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, btc $$3, cud $$4) {
      if (!$$0.x_()) {
         ja $$5 = $$1.c();
         dsl $$6 = dhq.c($$0, $$5, this.o().a(b, dth.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(g) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      if ($$0.c(b) == dth.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ja $$3 = $$2.d();
         dsl $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return true;
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      if ($$3.c(dhq.b) == dth.b) {
         ja $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dff.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ja $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
