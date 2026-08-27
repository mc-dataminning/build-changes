import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dbh extends cwy implements ddy {
   public static final MapCodec<dbh> b = b(dbh::new);
   public static final int c = 7;
   public static final dkp d = dkf.aC;
   public static final dkg e = dkf.v;
   public static final dkg f = dkf.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dbh> a() {
      return b;
   }

   public dbh(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public emv b_(djp $$0, ctd $$1, hx $$2) {
      return ems.a();
   }

   @Override
   public boolean e_(djp $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (this.h($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean h(djp $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   public int g(djp $$0, ctd $$1, hx $$2) {
      return 1;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static djp a(djp $$0, cty $$1, hx $$2) {
      int $$3 = 7;
      hx.a $$4 = new hx.a();

      for (ic $$5 : ic.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(djp $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(djp $$0) {
      if ($$0.a(asi.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(f) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            hx $$4 = $$2.d();
            djp $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ic.b)) {
               aus.a($$1, $$2, $$3, jx.m);
            }
         }
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      djp $$2 = this.o().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == efa.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
