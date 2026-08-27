import java.util.List;
import java.util.Map;

public class daz extends csk {
   public static final dfp a = dfo.w;
   public static final dfp b = dfo.a;
   public static final dfp c = dfo.d;
   public static final dfp d = cxw.a;
   public static final dfp e = cxw.b;
   public static final dfp f = cxw.c;
   public static final dfp g = cxw.d;
   private static final Map<hb, dfp> j = cuc.f;
   protected static final ehy h = csk.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final ehy i = csk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int k = 10;
   private final dba l;

   public daz(dba $$0, dex.d $$1) {
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
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return $$0.c(b) ? h : i;
   }

   @Override
   public dey a(cle $$0) {
      coq $$1 = $$0.q();
      gv $$2 = $$0.a();
      return this.n()
         .a(d, Boolean.valueOf(this.a($$1.a_($$2.e()), hb.c)))
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.h()), hb.f)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.f()), hb.d)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.g()), hb.e)));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1.o().d() ? $$0.a(j.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(a, Boolean.valueOf(true)));
      }
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, cbl $$3) {
      if (!$$0.B && !$$3.eR().b() && $$3.eR().a(ciz.rg)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$3, dji.M, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(cpk $$0, gv $$1, dey $$2) {
      for (hb $$3 : new hb[]{hb.d, hb.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            gv $$5 = $$1.a($$3, $$4);
            dey $$6 = $$0.a_($$5);
            if ($$6.a(this.l)) {
               if ($$6.c(dba.a) == $$3.g()) {
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
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if (!$$1.B) {
         if (!$$0.c(a)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$1.a_($$2).c(a)) {
         this.a($$1, $$2);
      }
   }

   private void a(cpk $$0, gv $$1) {
      dey $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(a);
      boolean $$4 = false;
      List<? extends big> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (big $$6 : $$5) {
            if (!$$6.d_()) {
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
         $$0.a(new gv($$1), this, 10);
      }
   }

   public boolean a(dey $$0, hb $$1) {
      return $$0.a(this.l) ? $$0.c(dba.a) == $$1.g() : $$0.a(this);
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
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
   public dey a(dey $$0, cxf $$1) {
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
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, c, d, e, g, f);
   }
}
