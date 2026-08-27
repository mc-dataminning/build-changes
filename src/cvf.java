public class cvf extends cwd {
   public static final dfp a = dfo.u;
   public static final dfp b = dfo.w;
   public static final dfp c = dfo.q;
   protected static final ehy d = csk.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ehy e = csk.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ehy f = csk.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ehy g = csk.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ehy h = csk.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ehy i = csk.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ehy j = csk.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ehy k = csk.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ehy l = ehv.a(csk.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), csk.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ehy m = ehv.a(csk.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), csk.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ehy n = ehv.a(csk.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), csk.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ehy D = ehv.a(csk.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), csk.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dgl E;

   public cvf(dex.d $$0, dgl $$1) {
      super($$0.a($$1.d()));
      this.E = $$1;
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == hb.a.a ? g : f;
      } else {
         return $$0.c(aC).o() == hb.a.a ? e : d;
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      hb.a $$6 = $$1.o();
      if ($$0.c(aC).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(c, Boolean.valueOf($$7));
      }
   }

   @Override
   public ehy b_(dey $$0, coq $$1, gv $$2) {
      if ($$0.c(a)) {
         return ehv.a();
      } else {
         return $$0.c(aC).o() == hb.a.c ? j : k;
      }
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      if ($$0.c(a)) {
         return ehv.a();
      } else {
         return $$0.c(aC).o() == hb.a.c ? h : i;
      }
   }

   @Override
   public ehy f(dey $$0, coq $$1, gv $$2) {
      if ($$0.c(c)) {
         return $$0.c(aC).o() == hb.a.a ? D : n;
      } else {
         return $$0.c(aC).o() == hb.a.a ? m : l;
      }
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      switch ($$3) {
         case a:
            return $$0.c(a);
         case b:
            return false;
         case c:
            return $$0.c(a);
         default:
            return false;
      }
   }

   @Override
   public dey a(cle $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      boolean $$3 = $$1.B($$2);
      hb $$4 = $$0.g();
      hb.a $$5 = $$4.o();
      boolean $$6 = $$5 == hb.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == hb.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.n().a(aC, $$4).a(a, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$6));
   }

   private boolean h(dey $$0) {
      return $$0.a(apj.L);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$0.c(a)) {
         $$0 = $$0.a(a, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         hb $$6 = $$3.cD();
         if ($$0.c(aC) == $$6.g()) {
            $$0 = $$0.a(aC, $$6);
         }

         $$0 = $$0.a(a, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$7 = $$0.c(a);
      $$1.a($$3, $$2, $$7 ? this.E.g() : this.E.f(), aov.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$7 ? dji.h : dji.d, $$2);
      return bgo.a($$1.B);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$0.c(b) != $$6) {
            $$1.a($$2, $$0.a(b, Boolean.valueOf($$6)).a(a, Boolean.valueOf($$6)), 2);
            if ($$0.c(a) != $$6) {
               $$1.a(null, $$2, $$6 ? this.E.g() : this.E.f(), aov.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dji.h : dji.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(aC, a, b, c);
   }

   public static boolean a(dey $$0, hb $$1) {
      return $$0.c(aC).o() == $$1.h().o();
   }
}
