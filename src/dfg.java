import com.mojang.serialization.MapCodec;

public class dfg extends cys implements dfs {
   public static final MapCodec<dfg> a = b(dfg::new);
   private static final int f = 1;
   private static final eos g;
   private static final eos h;
   private static final eos i = cys.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final eos j = eop.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dmj c = dlz.aW;
   public static final dma d = dlz.C;
   public static final dma e = dlz.b;

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   protected dfg(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return eop.b();
      }
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2) {
      return eop.b();
   }

   @Override
   protected boolean a(dlj $$0, crk $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dlj a(crk $$0) {
      hz $$1 = $$0.a();
      cvr $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == egx.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      if (!$$3.y_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      int $$4 = a($$1, $$2);
      dlj $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cdv.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      if ($$3.a(eop.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : eop.a();
      }
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(d) ? egx.c.a(false) : super.c_($$0);
   }

   private boolean a(cux $$0, hz $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cux $$0, hz $$1) {
      hz.a $$2 = $$1.j().c(ie.a);
      dlj $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(cyu.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ie.b)) {
         return 0;
      }

      for (ie $$5 : ie.c.a) {
         dlj $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(cyu.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      eos $$0 = cys.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      eos $$1 = cys.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      eos $$2 = cys.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      eos $$3 = cys.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      eos $$4 = cys.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = eop.a($$0, $$1, $$2, $$3, $$4);
      eos $$5 = cys.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      eos $$6 = cys.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      eos $$7 = cys.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      eos $$8 = cys.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = eop.a(dfg.i, g, $$6, $$5, $$8, $$7);
   }
}
