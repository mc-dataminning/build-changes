import com.mojang.serialization.MapCodec;

public class dso extends dlu implements dtb {
   public static final MapCodec<dso> a = b(dso::new);
   private static final int f = 1;
   private static final feq g = fen.a(dlu.b(16.0, 14.0, 16.0), fen.c(dlu.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0)).values().stream().reduce(fen.a(), fen::a));
   private static final feq h = dlu.b(16.0, 0.0, 2.0);
   private static final feq i = fen.a(g, h, fen.c(dlu.a(16.0, 0.0, 2.0, 0.0, 2.0)).values().stream().reduce(fen.a(), fen::a));
   private static final feq C = fen.b().a(0.0, -1.0, 0.0).d();
   public static final int b = 7;
   public static final eao c = eae.aZ;
   public static final eaf d = eae.I;
   public static final eaf e = eae.d;

   @Override
   public MapCodec<dso> a() {
      return a;
   }

   protected dso(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      if (!$$3.a($$0.b().h())) {
         return $$0.c(e) ? i : g;
      } else {
         return fen.b();
      }
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2) {
      return fen.b();
   }

   @Override
   protected boolean a(dzo $$0, dcl $$1) {
      return $$1.n().a(this.h());
   }

   @Override
   public dzo a(dcl $$0) {
      iu $$1 = $$0.a();
      dip $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == evw.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      if (!$$1.w_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      int $$4 = a($$1, $$2);
      dzo $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cmw.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      if ($$3.a(fen.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(C, $$2, true) ? h : fen.a();
      }
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(d) ? evw.c.a(false) : super.b_($$0);
   }

   private boolean a(dhv $$0, iu $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dhv $$0, iu $$1) {
      iu.a $$2 = $$1.k().c(ja.a);
      dzo $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dlw.ou)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, ja.b)) {
         return 0;
      }

      for (ja $$5 : ja.c.a) {
         dzo $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dlw.ou)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }
}
