import java.util.stream.IntStream;

public class dar extends csx implements czy {
   public static final dgf a = cwq.aC;
   public static final dgj<dgk> b = dgb.af;
   public static final dgj<dgu> c = dgb.bi;
   public static final dgc d = dgb.C;
   protected static final eii e = daa.d;
   protected static final eii f = daa.c;
   protected static final eii g = csx.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final eii h = csx.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final eii i = csx.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final eii j = csx.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final eii k = csx.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final eii l = csx.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final eii m = csx.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final eii n = csx.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final eii[] D = a(e, g, k, h, l);
   protected static final eii[] E = a(f, i, m, j, n);
   private static final int[] F = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final csx G;
   private final dfl H;

   private static eii[] a(eii $$0, eii $$1, eii $$2, eii $$3, eii $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(eii[]::new);
   }

   private static eii a(int $$0, eii $$1, eii $$2, eii $$3, eii $$4, eii $$5) {
      eii $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = eif.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = eif.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = eif.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = eif.a($$6, $$5);
      }

      return $$6;
   }

   protected dar(dfl $$0, dfk.d $$1) {
      super($$1);
      this.k(this.C.b().a(a, hc.c).a(b, dgk.b).a(c, dgu.a).a(d, Boolean.valueOf(false)));
      this.G = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dfl $$0) {
      return true;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return ($$0.c(b) == dgk.a ? D : E)[F[this.n($$0)]];
   }

   private int n(dfl $$0) {
      return $$0.c(c).ordinal() * 4 + $$0.c(a).e();
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, cbw $$3) {
      this.H.a($$1, $$2, $$3);
   }

   @Override
   public void a(cpy $$0, gw $$1, dfl $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public float d() {
      return this.G.d();
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$0.b())) {
         $$1.a(this.H, $$2, csy.a, $$2, false);
         this.G.b(this.H, $$1, $$2, $$3, false);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         this.H.b($$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bis $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dfl $$0) {
      return this.G.e_($$0);
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      this.G.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      return this.H.a($$1, $$3, $$4, $$5);
   }

   @Override
   public void a(cpx $$0, gw $$1, cpp $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public dfl a(clp $$0) {
      hc $$1 = $$0.k();
      gw $$2 = $$0.a();
      eao $$3 = $$0.q().b_($$2);
      dfl $$4 = this.n()
         .a(a, $$0.g())
         .a(b, $$1 != hc.a && ($$1 == hc.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dgk.b : dgk.a)
         .a(d, Boolean.valueOf($$3.a() == eap.c));
      return $$4.a(c, i($$4, $$0.q(), $$2));
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(c, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dgu i(dfl $$0, cpd $$1, gw $$2) {
      hc $$3 = $$0.c(a);
      dfl $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(b) == $$4.c(b)) {
         hc $$5 = $$4.c(a);
         if ($$5.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dgu.d;
            }

            return dgu.e;
         }
      }

      dfl $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(b) == $$6.c(b)) {
         hc $$7 = $$6.c(a);
         if ($$7.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dgu.b;
            }

            return dgu.c;
         }
      }

      return dgu.a;
   }

   private static boolean c(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      dfl $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(a) != $$0.c(a) || $$4.c(b) != $$0.c(b);
   }

   public static boolean h(dfl $$0) {
      return $$0.b() instanceof dar;
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      hc $$2 = $$0.c(a);
      dgu $$3 = $$0.c(c);
      switch ($$1) {
         case b:
            if ($$2.o() == hc.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(czj.c).a(c, dgu.c);
                  case c:
                     return $$0.a(czj.c).a(c, dgu.b);
                  case d:
                     return $$0.a(czj.c).a(c, dgu.e);
                  case e:
                     return $$0.a(czj.c).a(c, dgu.d);
                  default:
                     return $$0.a(czj.c);
               }
            }
            break;
         case c:
            if ($$2.o() == hc.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(czj.c).a(c, dgu.b);
                  case c:
                     return $$0.a(czj.c).a(c, dgu.c);
                  case d:
                     return $$0.a(czj.c).a(c, dgu.e);
                  case e:
                     return $$0.a(czj.c).a(c, dgu.d);
                  case a:
                     return $$0.a(czj.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b, c, d);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(d) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
