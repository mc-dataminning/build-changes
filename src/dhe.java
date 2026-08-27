import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhe extends dac implements dhc {
   public static final MapCodec<dhe> a = b(dhe::new);
   public static final dnz<doj> b = dnr.bh;
   public static final dns c = dnr.C;
   protected static final eqm d = dac.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final eqm e = dac.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dhe> a() {
      return a;
   }

   public dhe(dna.d $$0) {
      super($$0);
      this.k(this.o().a(b, doj.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dnb $$0) {
      return $$0.c(b) != doj.c;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      doj $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return eqj.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      ib $$1 = $$0.a();
      dnb $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, doj.c).a(c, Boolean.valueOf(false));
      } else {
         eip $$3 = $$0.q().b_($$1);
         dnb $$4 = this.o().a(b, doj.b).a(c, Boolean.valueOf($$3.a() == eiq.c));
         ih $$5 = $$0.k();
         return $$5 != ih.a && ($$5 == ih.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, doj.a);
      }
   }

   @Override
   protected boolean a(dnb $$0, csu $$1) {
      cqm $$2 = $$1.n();
      doj $$3 = $$0.c(b);
      if ($$3 == doj.c || !$$2.a(this.l())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ih $$5 = $$1.k();
         return $$3 == doj.b ? $$5 == ih.b || $$4 && $$5.o().d() : $$5 == ih.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(c) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cxc $$0, ib $$1, dnb $$2, eip $$3) {
      return $$2.c(b) != doj.c ? dhc.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable ciu $$0, cwh $$1, ib $$2, dnb $$3, eio $$4) {
      return $$3.c(b) != doj.c ? dhc.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(aus.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
