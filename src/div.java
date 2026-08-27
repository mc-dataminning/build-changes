import com.mojang.serialization.MapCodec;

public class div extends dch implements djh {
   public static final MapCodec<div> a = b(div::new);
   private static final int f = 1;
   private static final etc g;
   private static final etc h;
   private static final etc i = dch.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final etc j = esz.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dqi c = dpy.aW;
   public static final dpz d = dpy.C;
   public static final dpz e = dpy.b;

   @Override
   public MapCodec<div> a() {
      return a;
   }

   protected div(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      if (!$$3.a($$0.b().p())) {
         return $$0.c(e) ? h : g;
      } else {
         return esz.b();
      }
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2) {
      return esz.b();
   }

   @Override
   protected boolean a(dpi $$0, cux $$1) {
      return $$1.n().a(this.p());
   }

   @Override
   public dpi a(cux $$0) {
      id $$1 = $$0.a();
      czg $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.n().a(d, Boolean.valueOf($$2.b_($$1).a() == elc.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      int $$4 = a($$1, $$2);
      dpi $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cgj.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      if ($$3.a(esz.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : esz.a();
      }
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(d) ? elc.c.a(false) : super.c_($$0);
   }

   private boolean a(cym $$0, id $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cym $$0, id $$1) {
      id.a $$2 = $$1.j().c(ij.a);
      dpi $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dcj.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ij.b)) {
         return 0;
      }

      for (ij $$5 : ij.c.a) {
         dpi $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dcj.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      etc $$0 = dch.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      etc $$1 = dch.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      etc $$2 = dch.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      etc $$3 = dch.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      etc $$4 = dch.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = esz.a($$0, $$1, $$2, $$3, $$4);
      etc $$5 = dch.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      etc $$6 = dch.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      etc $$7 = dch.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      etc $$8 = dch.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = esz.a(div.i, g, $$6, $$5, $$8, $$7);
   }
}
