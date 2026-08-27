import com.mojang.serialization.MapCodec;

public class dcx extends cwj implements ddj {
   public static final MapCodec<dcx> a = b(dcx::new);
   private static final int f = 1;
   private static final emf g;
   private static final emf h;
   private static final emf i = cwj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final emf j = emc.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dka c = djq.aW;
   public static final djr d = djq.C;
   public static final djr e = djq.b;

   @Override
   public MapCodec<dcx> a() {
      return a;
   }

   protected dcx(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(e) ? h : g;
      } else {
         return emc.b();
      }
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2) {
      return emc.b();
   }

   @Override
   public boolean a(dja $$0, cpa $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public dja a(cpa $$0) {
      hx $$1 = $$0.a();
      cti $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == eel.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      if (!$$3.y_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      int $$4 = a($$1, $$2);
      dja $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cbn.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      if ($$3.a(emc.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : emc.a();
      }
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(d) ? eel.c.a(false) : super.c_($$0);
   }

   private boolean a(cso $$0, hx $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cso $$0, hx $$1) {
      hx.a $$2 = $$1.j().c(ic.a);
      dja $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(cwl.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ic.b)) {
         return 0;
      }

      for (ic $$5 : ic.c.a) {
         dja $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(cwl.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      emf $$0 = cwj.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      emf $$1 = cwj.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      emf $$2 = cwj.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      emf $$3 = cwj.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      emf $$4 = cwj.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = emc.a($$0, $$1, $$2, $$3, $$4);
      emf $$5 = cwj.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      emf $$6 = cwj.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      emf $$7 = cwj.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      emf $$8 = cwj.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = emc.a(dcx.i, g, $$6, $$5, $$8, $$7);
   }
}
