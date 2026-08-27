import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbc extends dgn implements dhc {
   public static final MapCodec<dbc> a = b(dbc::new);
   public static final dns b = dnr.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final eqm e = dac.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final eqm f = dac.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final eqm g = dac.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   public dbc(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ih.a.b));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      switch ((ih.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eiq.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(b) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
