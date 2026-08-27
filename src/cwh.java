import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class cwh extends dae implements cwm, ddj {
   public static final MapCodec<cwh> a = b(cwh::new);
   private static final djr f = djq.C;
   private static final int g = 6;
   protected static final emf b = cwj.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final emf c = cwj.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final emf d = cwj.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final emf e = cwj.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<cwh> a() {
      return a;
   }

   protected cwh(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ic.c));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      switch ((ic)$$0.c(aE)) {
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
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(f, aE);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(f) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      hx $$3 = $$2.d();
      dja $$4 = $$1.a_($$3);
      dja $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(asb.bx)) && ($$5.a(this) || $$5.a(cwl.sD));
   }

   protected static boolean a(ctj $$0, hx $$1, eek $$2, ic $$3) {
      dja $$4 = cwl.sE.o().a(f, Boolean.valueOf($$2.a(eel.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if (($$1 == ic.a || $$1 == ic.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      Optional<hx> $$3 = l.a($$0, $$1, $$2.b(), ic.b, cwl.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hx $$4 = $$3.get().c();
         dja $$5 = $$0.a_($$4);
         return cwg.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      Optional<hx> $$4 = l.a($$0, $$2, $$3.b(), ic.b, cwl.sD);
      if (!$$4.isEmpty()) {
         hx $$5 = $$4.get();
         hx $$6 = $$5.c();
         ic $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         cwg.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return new cmr(cwl.sD);
   }
}
