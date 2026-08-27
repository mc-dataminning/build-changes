import com.mojang.serialization.MapCodec;

public class ddd extends cwp implements ddp {
   public static final MapCodec<ddd> a = b(ddd::new);
   private static final int f = 1;
   private static final eml g;
   private static final eml h;
   private static final eml i = cwp.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final eml j = emi.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dkg c = djw.aW;
   public static final djx d = djw.C;
   public static final djx e = djw.b;

   @Override
   public MapCodec<ddd> a() {
      return a;
   }

   protected ddd(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(e) ? h : g;
      } else {
         return emi.b();
      }
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2) {
      return emi.b();
   }

   @Override
   public boolean a(djg $$0, cpg $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public djg a(cpg $$0) {
      hx $$1 = $$0.a();
      cto $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == eer.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      if (!$$3.y_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      int $$4 = a($$1, $$2);
      djg $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cbs.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      if ($$3.a(emi.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : emi.a();
      }
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(d) ? eer.c.a(false) : super.c_($$0);
   }

   private boolean a(csu $$0, hx $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(csu $$0, hx $$1) {
      hx.a $$2 = $$1.j().c(ic.a);
      djg $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(cwr.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ic.b)) {
         return 0;
      }

      for (ic $$5 : ic.c.a) {
         djg $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(cwr.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      eml $$0 = cwp.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      eml $$1 = cwp.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      eml $$2 = cwp.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      eml $$3 = cwp.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      eml $$4 = cwp.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = emi.a($$0, $$1, $$2, $$3, $$4);
      eml $$5 = cwp.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      eml $$6 = cwp.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      eml $$7 = cwp.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      eml $$8 = cwp.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = emi.a(ddd.i, g, $$6, $$5, $$8, $$7);
   }
}
