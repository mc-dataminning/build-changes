import com.mojang.serialization.MapCodec;

public class dcv extends cyr {
   public static final MapCodec<dcv> a = b(dcv::new);
   public static final djx b = djw.s;
   public static final dkg e = djw.aA;

   @Override
   public MapCodec<dcv> a() {
      return a;
   }

   protected dcv(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ic.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if (!$$3.fT().e) {
         return bka.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bka.a($$1.B);
      }
   }

   @Override
   protected int g(djg $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public djg a(cpg $$0) {
      djg $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a && !this.b($$3, $$5, $$2)) {
         return cwr.a.o();
      } else {
         return !$$3.y_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(ctr $$0, hx $$1, djg $$2) {
      return this.a((cue)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      if ($$0.c(d)) {
         ic $$4 = $$0.c(aE);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(e) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(jr.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(aE, e, b, d);
   }
}
