import com.mojang.serialization.MapCodec;

public class djt extends dde implements dkf {
   public static final MapCodec<djt> a = b(djt::new);
   private static final int f = 1;
   private static final eui g;
   private static final eui h;
   private static final eui i = dde.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final eui j = euf.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final drh c = dqx.aW;
   public static final dqy d = dqx.C;
   public static final dqy e = dqx.b;

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   protected djt(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      if (!$$3.a($$0.b().q())) {
         return $$0.c(e) ? h : g;
      } else {
         return euf.b();
      }
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2) {
      return euf.b();
   }

   @Override
   protected boolean a(dqh $$0, cwi $$1) {
      return $$1.n().a(this.q());
   }

   @Override
   public dqh a(cwi $$0) {
      in $$1 = $$0.a();
      dad $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.n().a(d, Boolean.valueOf($$2.b_($$1).a() == emb.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      int $$4 = a($$1, $$2);
      dqh $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            chq.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      if ($$3.a(euf.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : euf.a();
      }
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(d) ? emb.c.a(false) : super.b_($$0);
   }

   private boolean a(czj $$0, in $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(czj $$0, in $$1) {
      in.a $$2 = $$1.j().c(is.a);
      dqh $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(ddg.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, is.b)) {
         return 0;
      }

      for (is $$5 : is.c.a) {
         dqh $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(ddg.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      eui $$0 = dde.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      eui $$1 = dde.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      eui $$2 = dde.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      eui $$3 = dde.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      eui $$4 = dde.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = euf.a($$0, $$1, $$2, $$3, $$4);
      eui $$5 = dde.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      eui $$6 = dde.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      eui $$7 = dde.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      eui $$8 = dde.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = euf.a(djt.i, g, $$6, $$5, $$8, $$7);
   }
}
