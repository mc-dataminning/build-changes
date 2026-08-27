import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deh extends dac implements dhc {
   public static final MapCodec<deh> a = b(deh::new);
   public static final dnv b = ddx.aE;
   public static final dns c = dnr.C;
   protected static final float d = 3.0F;
   protected static final eqm e = dac.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eqm f = dac.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eqm g = dac.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eqm h = dac.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   protected deh(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      switch ((ih)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(cwh $$0, ib $$1, ih $$2) {
      dnb $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ih $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dae.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eiq.c, eiq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      if (!$$0.c()) {
         dnb $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dnb $$2 = this.o();
      cxe $$3 = $$0.q();
      ib $$4 = $$0.a();
      eip $$5 = $$0.q().b_($$0.a());

      for (ih $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == eiq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(c) ? eiq.c.a(false) : super.c_($$0);
   }
}
