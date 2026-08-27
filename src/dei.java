import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dei extends dac implements dhc {
   public static final MapCodec<dei> a = b(dei::new);
   public static final dns b = dnr.j;
   public static final dns c = dnr.C;
   protected static final eqm d = eqj.a(dac.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dac.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final eqm e = eqj.a(dac.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dac.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dei> a() {
      return a;
   }

   public dei(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());

      for (ih $$2 : $$0.f()) {
         if ($$2.o() == ih.a.b) {
            dnb $$3 = this.o().a(b, Boolean.valueOf($$2 == ih.b));
            if ($$3.a((cxe)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == eiq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ih $$3 = m($$0).g();
      return dac.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ih m(dnb $$0) {
      return $$0.c(b) ? ih.a : ih.b;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(c) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
