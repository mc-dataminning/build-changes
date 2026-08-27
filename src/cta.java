import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class cta extends cww implements ctf, dab {
   public static final MapCodec<cta> a = b(cta::new);
   private static final dfu f = dft.C;
   private static final int g = 6;
   protected static final eia b = ctc.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final eia c = ctc.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final eia d = ctc.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final eia e = ctc.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<cta> a() {
      return a;
   }

   protected cta(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ha.c));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      switch ((ha)$$0.c(aE)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(f, aE);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(f) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfd $$4 = $$1.a_($$3);
      dfd $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(apv.bx)) && ($$5.a(this) || $$5.a(cte.rC));
   }

   protected static boolean a(cqc $$0, gw $$1, eag $$2, ha $$3) {
      dfd $$4 = cte.rD.o().a(f, Boolean.valueOf($$2.a(eah.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if (($$1 == ha.a || $$1 == ha.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      Optional<gw> $$3 = l.a($$0, $$1, $$2.b(), ha.b, cte.rC);
      if ($$3.isEmpty()) {
         return false;
      } else {
         gw $$4 = $$3.get().c();
         dfd $$5 = $$0.a_($$4);
         return csz.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      Optional<gw> $$4 = l.a($$0, $$2, $$3.b(), ha.b, cte.rC);
      if (!$$4.isEmpty()) {
         gw $$5 = $$4.get();
         gw $$6 = $$5.c();
         ha $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         csz.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl(cte.rC);
   }
}
