import com.mojang.serialization.MapCodec;

public class dlj extends deu implements dlv {
   public static final MapCodec<dlj> a = b(dlj::new);
   private static final int f = 1;
   private static final ewf g;
   private static final ewf h;
   private static final ewf i = deu.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ewf j = ewc.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dsx c = dsn.aW;
   public static final dso d = dsn.C;
   public static final dso e = dsn.b;

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   protected dlj(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      if (!$$3.a($$0.b().r())) {
         return $$0.c(e) ? h : g;
      } else {
         return ewc.b();
      }
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2) {
      return ewc.b();
   }

   @Override
   protected boolean a(drx $$0, cxv $$1) {
      return $$1.n().a(this.r());
   }

   @Override
   public drx a(cxv $$0) {
      iz $$1 = $$0.a();
      dbt $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.n().a(d, Boolean.valueOf($$2.b_($$1).a() == enr.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      int $$4 = a($$1, $$2);
      drx $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cjb.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      if ($$3.a(ewc.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ewc.a();
      }
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(d) ? enr.c.a(false) : super.b_($$0);
   }

   private boolean a(daz $$0, iz $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(daz $$0, iz $$1) {
      iz.a $$2 = $$1.j().c(je.a);
      drx $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dew.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, je.b)) {
         return 0;
      }

      for (je $$5 : je.c.a) {
         drx $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dew.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ewf $$0 = deu.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ewf $$1 = deu.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ewf $$2 = deu.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ewf $$3 = deu.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ewf $$4 = deu.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ewc.a($$0, $$1, $$2, $$3, $$4);
      ewf $$5 = deu.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ewf $$6 = deu.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ewf $$7 = deu.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ewf $$8 = deu.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ewc.a(dlj.i, g, $$6, $$5, $$8, $$7);
   }
}
