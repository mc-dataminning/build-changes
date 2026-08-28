import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dnr extends dfw implements dmy {
   public static final MapCodec<dnr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dta.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dnr::new)
   );
   public static final dtu b = djs.aE;
   public static final dty<dtz> c = dtq.af;
   public static final dty<duj> d = dtq.bi;
   public static final dtr e = dtq.C;
   protected static final exp f = dna.e;
   protected static final exp g = dna.d;
   protected static final exp h = dfw.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final exp i = dfw.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final exp j = dfw.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final exp k = dfw.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final exp l = dfw.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final exp m = dfw.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final exp n = dfw.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final exp o = dfw.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final exp[] F = a(f, h, l, i, m);
   protected static final exp[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dfw J;
   protected final dta H;

   @Override
   public MapCodec<? extends dnr> a() {
      return a;
   }

   private static exp[] a(exp $$0, exp $$1, exp $$2, exp $$3, exp $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(exp[]::new);
   }

   private static exp a(int $$0, exp $$1, exp $$2, exp $$3, exp $$4, exp $$5) {
      exp $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = exm.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = exm.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = exm.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = exm.a($$6, $$5);
      }

      return $$6;
   }

   protected dnr(dta $$0, dsz.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ji.c).a(c, dtz.b).a(d, duj.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(dta $$0) {
      return true;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return ($$0.c(c) == dtz.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dta $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dta a(cyb $$0) {
      ji $$1 = $$0.k();
      jd $$2 = $$0.a();
      eoy $$3 = $$0.q().b_($$2);
      dta $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ji.a && ($$1 == ji.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dtz.b : dtz.a)
         .a(e, Boolean.valueOf($$3.a() == eoz.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static duj i(dta $$0, dca $$1, jd $$2) {
      ji $$3 = $$0.c(b);
      dta $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         ji $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return duj.d;
            }

            return duj.e;
         }
      }

      dta $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         ji $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return duj.b;
            }

            return duj.c;
         }
      }

      return duj.a;
   }

   private static boolean c(dta $$0, dca $$1, jd $$2, ji $$3) {
      dta $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dta $$0) {
      return $$0.b() instanceof dnr;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      ji $$2 = $$0.c(b);
      duj $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ji.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dmk.c).a(d, duj.c);
                  case c:
                     return $$0.a(dmk.c).a(d, duj.b);
                  case d:
                     return $$0.a(dmk.c).a(d, duj.e);
                  case e:
                     return $$0.a(dmk.c).a(d, duj.d);
                  default:
                     return $$0.a(dmk.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ji.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dmk.c).a(d, duj.b);
                  case c:
                     return $$0.a(dmk.c).a(d, duj.c);
                  case d:
                     return $$0.a(dmk.c).a(d, duj.e);
                  case e:
                     return $$0.a(dmk.c).a(d, duj.d);
                  case a:
                     return $$0.a(dmk.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(e) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
