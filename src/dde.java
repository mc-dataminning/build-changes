import com.mojang.serialization.MapCodec;

public class dde extends cwq implements ddq {
   public static final MapCodec<dde> a = b(dde::new);
   private static final int f = 1;
   private static final emm g;
   private static final emm h;
   private static final emm i = cwq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final emm j = emj.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dkh c = djx.aW;
   public static final djy d = djx.C;
   public static final djy e = djx.b;

   @Override
   public MapCodec<dde> a() {
      return a;
   }

   protected dde(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(e) ? h : g;
      } else {
         return emj.b();
      }
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2) {
      return emj.b();
   }

   @Override
   public boolean a(djh $$0, cph $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public djh a(cph $$0) {
      hx $$1 = $$0.a();
      ctp $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == ees.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      if (!$$3.y_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      int $$4 = a($$1, $$2);
      djh $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cbt.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      if ($$3.a(emj.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : emj.a();
      }
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(d) ? ees.c.a(false) : super.c_($$0);
   }

   private boolean a(csv $$0, hx $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(csv $$0, hx $$1) {
      hx.a $$2 = $$1.j().c(ic.a);
      djh $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(cws.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ic.b)) {
         return 0;
      }

      for (ic $$5 : ic.c.a) {
         djh $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(cws.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      emm $$0 = cwq.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      emm $$1 = cwq.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      emm $$2 = cwq.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      emm $$3 = cwq.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      emm $$4 = cwq.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = emj.a($$0, $$1, $$2, $$3, $$4);
      emm $$5 = cwq.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      emm $$6 = cwq.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      emm $$7 = cwq.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      emm $$8 = cwq.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = emj.a(dde.i, g, $$6, $$5, $$8, $$7);
   }
}
