import java.util.stream.IntStream;

public class cxh extends cpn implements cwo {
   public static final dcv a = ctg.aC;
   public static final dcz<dda> b = dcr.af;
   public static final dcz<ddk> c = dcr.bi;
   public static final dcs d = dcr.C;
   protected static final efb e = cwq.d;
   protected static final efb f = cwq.c;
   protected static final efb g = cpn.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final efb h = cpn.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final efb i = cpn.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final efb j = cpn.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final efb k = cpn.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final efb l = cpn.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final efb m = cpn.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final efb n = cpn.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final efb[] D = a(e, g, k, h, l);
   protected static final efb[] E = a(f, i, m, j, n);
   private static final int[] F = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final cpn G;
   private final dcb H;

   private static efb[] a(efb $$0, efb $$1, efb $$2, efb $$3, efb $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(efb[]::new);
   }

   private static efb a(int $$0, efb $$1, efb $$2, efb $$3, efb $$4, efb $$5) {
      efb $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = eey.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = eey.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = eey.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = eey.a($$6, $$5);
      }

      return $$6;
   }

   protected cxh(dcb $$0, dca.d $$1) {
      super($$1);
      this.k(this.C.b().a(a, ha.c).a(b, dda.b).a(c, ddk.a).a(d, Boolean.valueOf(false)));
      this.G = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dcb $$0) {
      return true;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return ($$0.c(b) == dda.a ? D : E)[F[this.n($$0)]];
   }

   private int n(dcb $$0) {
      return $$0.c(c).ordinal() * 4 + $$0.c(a).e();
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, byo $$3) {
      this.H.a($$1, $$2, $$3);
   }

   @Override
   public void a(cmn $$0, gu $$1, dcb $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public float d() {
      return this.G.d();
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$0.b())) {
         $$1.a(this.H, $$2, cpo.a, $$2, false);
         this.G.b(this.H, $$1, $$2, $$3, false);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         this.H.b($$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfj $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dcb $$0) {
      return this.G.e_($$0);
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      this.G.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      return this.H.a($$1, $$3, $$4, $$5);
   }

   @Override
   public void a(cmm $$0, gu $$1, cme $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public dcb a(cih $$0) {
      ha $$1 = $$0.k();
      gu $$2 = $$0.a();
      dxe $$3 = $$0.q().b_($$2);
      dcb $$4 = this.n()
         .a(a, $$0.g())
         .a(b, $$1 != ha.a && ($$1 == ha.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dda.b : dda.a)
         .a(d, Boolean.valueOf($$3.a() == dxf.c));
      return $$4.a(c, i($$4, $$0.q(), $$2));
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(c, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static ddk i(dcb $$0, cls $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      dcb $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(b) == $$4.c(b)) {
         ha $$5 = $$4.c(a);
         if ($$5.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return ddk.d;
            }

            return ddk.e;
         }
      }

      dcb $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(b) == $$6.c(b)) {
         ha $$7 = $$6.c(a);
         if ($$7.o() != $$0.c(a).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return ddk.b;
            }

            return ddk.c;
         }
      }

      return ddk.a;
   }

   private static boolean c(dcb $$0, cls $$1, gu $$2, ha $$3) {
      dcb $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(a) != $$0.c(a) || $$4.c(b) != $$0.c(b);
   }

   public static boolean h(dcb $$0) {
      return $$0.b() instanceof cxh;
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      ha $$2 = $$0.c(a);
      ddk $$3 = $$0.c(c);
      switch ($$1) {
         case b:
            if ($$2.o() == ha.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(cvz.c).a(c, ddk.c);
                  case c:
                     return $$0.a(cvz.c).a(c, ddk.b);
                  case d:
                     return $$0.a(cvz.c).a(c, ddk.e);
                  case e:
                     return $$0.a(cvz.c).a(c, ddk.d);
                  default:
                     return $$0.a(cvz.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ha.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(cvz.c).a(c, ddk.b);
                  case c:
                     return $$0.a(cvz.c).a(c, ddk.c);
                  case d:
                     return $$0.a(cvz.c).a(c, ddk.e);
                  case e:
                     return $$0.a(cvz.c).a(c, ddk.d);
                  case a:
                     return $$0.a(cvz.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b, c, d);
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(d) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
