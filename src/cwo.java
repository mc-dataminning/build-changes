import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class cwo extends dal implements cwt, ddq {
   public static final MapCodec<cwo> a = b(cwo::new);
   private static final djy f = djx.C;
   private static final int g = 6;
   protected static final emm b = cwq.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final emm c = cwq.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final emm d = cwq.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final emm e = cwq.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<cwo> a() {
      return a;
   }

   protected cwo(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ic.c));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
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
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(f, aE);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(f) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.d();
      djh $$4 = $$1.a_($$3);
      djh $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(ash.bx)) && ($$5.a(this) || $$5.a(cws.sD));
   }

   protected static boolean a(ctq $$0, hx $$1, eer $$2, ic $$3) {
      djh $$4 = cws.sE.o().a(f, Boolean.valueOf($$2.a(ees.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if (($$1 == ic.a || $$1 == ic.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      Optional<hx> $$3 = l.a($$0, $$1, $$2.b(), ic.b, cws.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hx $$4 = $$3.get().c();
         djh $$5 = $$0.a_($$4);
         return cwn.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      Optional<hx> $$4 = l.a($$0, $$2, $$3.b(), ic.b, cws.sD);
      if (!$$4.isEmpty()) {
         hx $$5 = $$4.get();
         hx $$6 = $$5.c();
         ic $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         cwn.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return new cmy(cws.sD);
   }
}
