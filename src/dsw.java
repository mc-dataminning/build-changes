import com.mojang.serialization.MapCodec;

public class dsw extends dma implements dtj {
   public static final MapCodec<dsw> a = b(dsw::new);
   private static final int f = 1;
   private static final ffc g = fez.a(dma.b(16.0, 14.0, 16.0), fez.c(dma.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0)).values().stream().reduce(fez.a(), fez::a));
   private static final ffc h = dma.b(16.0, 0.0, 2.0);
   private static final ffc i = fez.a(g, h, fez.c(dma.a(16.0, 0.0, 2.0, 0.0, 2.0)).values().stream().reduce(fez.a(), fez::a));
   private static final ffc C = fez.b().a(0.0, -1.0, 0.0).d();
   public static final int b = 7;
   public static final eaz c = eap.aZ;
   public static final eaq d = eap.I;
   public static final eaq e = eap.d;

   @Override
   public MapCodec<dsw> a() {
      return a;
   }

   protected dsw(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      if (!$$3.a($$0.b().h())) {
         return $$0.c(e) ? i : g;
      } else {
         return fez.b();
      }
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2) {
      return fez.b();
   }

   @Override
   protected boolean a(dzz $$0, dcr $$1) {
      return $$1.n().a(this.h());
   }

   @Override
   public dzz a(dcr $$0) {
      iu $$1 = $$0.a();
      div $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == ewh.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      if (!$$1.w_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      int $$4 = a($$1, $$2);
      dzz $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cnc.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      if ($$3.a(fez.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(C, $$2, true) ? h : fez.a();
      }
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(d) ? ewh.c.a(false) : super.b_($$0);
   }

   private boolean a(dib $$0, iu $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dib $$0, iu $$1) {
      iu.a $$2 = $$1.k().c(ja.a);
      dzz $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dmc.ov)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, ja.b)) {
         return 0;
      }

      for (ja $$5 : ja.c.a) {
         dzz $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dmc.ov)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }
}
