import java.util.List;
import java.util.Map;

public class dbm extends csx {
   public static final dgc a = dgb.w;
   public static final dgc b = dgb.a;
   public static final dgc c = dgb.d;
   public static final dgc d = cyj.a;
   public static final dgc e = cyj.b;
   public static final dgc f = cyj.c;
   public static final dgc g = cyj.d;
   private static final Map<hc, dgc> j = cup.f;
   protected static final eii h = csx.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final eii i = csx.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int k = 10;
   private final dbn l;

   public dbm(dbn $$0, dfk.d $$1) {
      super($$1);
      this.k(
         this.C
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
      );
      this.l = $$0;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return $$0.c(b) ? h : i;
   }

   @Override
   public dfl a(clp $$0) {
      cpd $$1 = $$0.q();
      gw $$2 = $$0.a();
      return this.n()
         .a(d, Boolean.valueOf(this.a($$1.a_($$2.e()), hc.c)))
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.h()), hc.f)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.f()), hc.d)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.g()), hc.e)));
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1.o().d() ? $$0.a(j.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(a, Boolean.valueOf(true)));
      }
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, cbw $$3) {
      if (!$$0.B && !$$3.eS().b() && $$3.eS().a(cjk.rg)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$3, djv.M, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(cpx $$0, gw $$1, dfl $$2) {
      for (hc $$3 : new hc[]{hc.d, hc.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            gw $$5 = $$1.a($$3, $$4);
            dfl $$6 = $$0.a_($$5);
            if ($$6.a(this.l)) {
               if ($$6.c(dbn.a) == $$3.g()) {
                  this.l.a($$0, $$5, $$6, false, true, $$4, $$2);
               }
               break;
            }

            if (!$$6.a(this)) {
               break;
            }
         }
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if (!$$1.B) {
         if (!$$0.c(a)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$1.a_($$2).c(a)) {
         this.a($$1, $$2);
      }
   }

   private void a(cpx $$0, gw $$1) {
      dfl $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(a);
      boolean $$4 = false;
      List<? extends bis> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (bis $$6 : $$5) {
            if (!$$6.p_()) {
               $$4 = true;
               break;
            }
         }
      }

      if ($$4 != $$3) {
         $$2 = $$2.a(a, Boolean.valueOf($$4));
         $$0.a($$1, $$2, 3);
         this.a($$0, $$1, $$2);
      }

      if ($$4) {
         $$0.a(new gw($$1), this, 10);
      }
   }

   public boolean a(dfl $$0, hc $$1) {
      return $$0.a(this.l) ? $$0.c(dbn.a) == $$1.g() : $$0.a(this);
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      switch ($$1) {
         case c:
            return $$0.a(d, $$0.c(f)).a(e, $$0.c(g)).a(f, $$0.c(d)).a(g, $$0.c(e));
         case d:
            return $$0.a(d, $$0.c(e)).a(e, $$0.c(f)).a(f, $$0.c(g)).a(g, $$0.c(d));
         case b:
            return $$0.a(d, $$0.c(g)).a(e, $$0.c(d)).a(f, $$0.c(e)).a(g, $$0.c(f));
         default:
            return $$0;
      }
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      switch ($$1) {
         case b:
            return $$0.a(d, $$0.c(f)).a(f, $$0.c(d));
         case c:
            return $$0.a(e, $$0.c(g)).a(g, $$0.c(e));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b, c, d, e, g, f);
   }
}
