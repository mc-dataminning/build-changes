import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class cwn extends dak implements cws, ddp {
   public static final MapCodec<cwn> a = b(cwn::new);
   private static final djx f = djw.C;
   private static final int g = 6;
   protected static final eml b = cwp.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final eml c = cwp.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final eml d = cwp.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final eml e = cwp.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<cwn> a() {
      return a;
   }

   protected cwn(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ic.c));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
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
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(f, aE);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(f) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      hx $$3 = $$2.d();
      djg $$4 = $$1.a_($$3);
      djg $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(asg.bx)) && ($$5.a(this) || $$5.a(cwr.sD));
   }

   protected static boolean a(ctp $$0, hx $$1, eeq $$2, ic $$3) {
      djg $$4 = cwr.sE.o().a(f, Boolean.valueOf($$2.a(eer.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if (($$1 == ic.a || $$1 == ic.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      Optional<hx> $$3 = l.a($$0, $$1, $$2.b(), ic.b, cwr.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         hx $$4 = $$3.get().c();
         djg $$5 = $$0.a_($$4);
         return cwm.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      Optional<hx> $$4 = l.a($$0, $$2, $$3.b(), ic.b, cwr.sD);
      if (!$$4.isEmpty()) {
         hx $$5 = $$4.get();
         hx $$6 = $$5.c();
         ic $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         cwm.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return new cmx(cwr.sD);
   }
}
