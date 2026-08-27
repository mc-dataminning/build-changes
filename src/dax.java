import javax.annotation.Nullable;

public class dax extends cwd implements czl {
   public static final dfp a = dfo.u;
   public static final dfw<dfx> b = dfo.af;
   public static final dfp c = dfo.w;
   public static final dfp d = dfo.C;
   protected static final int e = 3;
   protected static final ehy f = csk.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ehy g = csk.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehy h = csk.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ehy i = csk.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ehy j = csk.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ehy k = csk.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dfn l;

   protected dax(dex.d $$0, dfn $$1) {
      super($$0.a($$1.d()));
      this.l = $$1;
      this.k(this.C.b().a(aC, hb.c).a(a, Boolean.valueOf(false)).a(b, dfx.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      if (!$$0.c(a)) {
         return $$0.c(b) == dfx.a ? k : j;
      } else {
         switch ((hb)$$0.c(aC)) {
            case c:
            default:
               return i;
            case d:
               return h;
            case e:
               return g;
            case f:
               return f;
         }
      }
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      switch ($$3) {
         case a:
            return $$0.c(a);
         case b:
            return $$0.c(d);
         case c:
            return $$0.c(a);
         default:
            return false;
      }
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if (!this.l.c()) {
         return bgo.d;
      } else {
         $$0 = $$0.a(a);
         $$1.a($$2, $$0, 2);
         if ($$0.c(d)) {
            $$1.a($$2, eac.c, eac.c.a((cpn)$$1));
         }

         this.a($$3, $$1, $$2, $$0.c(a));
         return bgo.a($$1.B);
      }
   }

   protected void a(@Nullable cbl $$0, cpk $$1, gv $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.h() : this.l.g(), aov.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dji.h : dji.d, $$2);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(c)) {
            if ($$0.c(a) != $$6) {
               $$0 = $$0.a(a, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 2);
            if ($$0.c(d)) {
               $$1.a($$2, eac.c, eac.c.a((cpn)$$1));
            }
         }
      }
   }

   @Override
   public dey a(cle $$0) {
      dey $$1 = this.n();
      eab $$2 = $$0.q().b_($$0.a());
      hb $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aC, $$3).a(b, $$0.l().d - (double)$$0.a().v() > 0.5 ? dfx.a : dfx.b);
      } else {
         $$1 = $$1.a(aC, $$0.g().g()).a(b, $$3 == hb.b ? dfx.b : dfx.a);
      }

      if ($$0.q().B($$0.a())) {
         $$1 = $$1.a(a, Boolean.valueOf(true)).a(c, Boolean.valueOf(true));
      }

      return $$1.a(d, Boolean.valueOf($$2.a() == eac.c));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(aC, a, b, c, d);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(d) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
