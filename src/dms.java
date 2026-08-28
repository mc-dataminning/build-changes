import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dms extends dey implements dlz {
   public static final MapCodec<dms> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsb.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dms::new)
   );
   public static final dsv b = diu.aE;
   public static final dsz<dta> c = dsr.af;
   public static final dsz<dtk> d = dsr.bi;
   public static final dss e = dsr.C;
   protected static final ewj f = dmb.e;
   protected static final ewj g = dmb.d;
   protected static final ewj h = dey.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ewj i = dey.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ewj j = dey.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ewj k = dey.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ewj l = dey.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ewj m = dey.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ewj n = dey.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ewj o = dey.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ewj[] F = a(f, h, l, i, m);
   protected static final ewj[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dey J;
   protected final dsb H;

   @Override
   public MapCodec<? extends dms> a() {
      return a;
   }

   private static ewj[] a(ewj $$0, ewj $$1, ewj $$2, ewj $$3, ewj $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ewj[]::new);
   }

   private static ewj a(int $$0, ewj $$1, ewj $$2, ewj $$3, ewj $$4, ewj $$5) {
      ewj $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ewg.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ewg.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ewg.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ewg.a($$6, $$5);
      }

      return $$6;
   }

   protected dms(dsb $$0, dsa.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, je.c).a(c, dta.b).a(d, dtk.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(dsb $$0) {
      return true;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return ($$0.c(c) == dta.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dsb $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dsb a(cxz $$0) {
      je $$1 = $$0.k();
      iz $$2 = $$0.a();
      enu $$3 = $$0.q().b_($$2);
      dsb $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != je.a && ($$1 == je.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dta.b : dta.a)
         .a(e, Boolean.valueOf($$3.a() == env.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dtk i(dsb $$0, dbd $$1, iz $$2) {
      je $$3 = $$0.c(b);
      dsb $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         je $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dtk.d;
            }

            return dtk.e;
         }
      }

      dsb $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         je $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dtk.b;
            }

            return dtk.c;
         }
      }

      return dtk.a;
   }

   private static boolean c(dsb $$0, dbd $$1, iz $$2, je $$3) {
      dsb $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dsb $$0) {
      return $$0.b() instanceof dms;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      je $$2 = $$0.c(b);
      dtk $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == je.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dll.c).a(d, dtk.c);
                  case c:
                     return $$0.a(dll.c).a(d, dtk.b);
                  case d:
                     return $$0.a(dll.c).a(d, dtk.e);
                  case e:
                     return $$0.a(dll.c).a(d, dtk.d);
                  default:
                     return $$0.a(dll.c);
               }
            }
            break;
         case c:
            if ($$2.o() == je.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dll.c).a(d, dtk.b);
                  case c:
                     return $$0.a(dll.c).a(d, dtk.c);
                  case d:
                     return $$0.a(dll.c).a(d, dtk.e);
                  case e:
                     return $$0.a(dll.c).a(d, dtk.d);
                  case a:
                     return $$0.a(dll.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(e) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
