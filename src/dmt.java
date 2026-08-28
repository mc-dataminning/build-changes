import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dmt extends dez implements dma {
   public static final MapCodec<dmt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsc.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dmt::new)
   );
   public static final dsw b = div.aE;
   public static final dta<dtb> c = dss.af;
   public static final dta<dtl> d = dss.bi;
   public static final dst e = dss.C;
   protected static final ewk f = dmc.e;
   protected static final ewk g = dmc.d;
   protected static final ewk h = dez.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ewk i = dez.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ewk j = dez.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ewk k = dez.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ewk l = dez.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ewk m = dez.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ewk n = dez.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ewk o = dez.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ewk[] F = a(f, h, l, i, m);
   protected static final ewk[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dez J;
   protected final dsc H;

   @Override
   public MapCodec<? extends dmt> a() {
      return a;
   }

   private static ewk[] a(ewk $$0, ewk $$1, ewk $$2, ewk $$3, ewk $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ewk[]::new);
   }

   private static ewk a(int $$0, ewk $$1, ewk $$2, ewk $$3, ewk $$4, ewk $$5) {
      ewk $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ewh.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ewh.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ewh.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ewh.a($$6, $$5);
      }

      return $$6;
   }

   protected dmt(dsc $$0, dsb.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, je.c).a(c, dtb.b).a(d, dtl.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(dsc $$0) {
      return true;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return ($$0.c(c) == dtb.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dsc $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dsc a(cya $$0) {
      je $$1 = $$0.k();
      iz $$2 = $$0.a();
      env $$3 = $$0.q().b_($$2);
      dsc $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != je.a && ($$1 == je.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dtb.b : dtb.a)
         .a(e, Boolean.valueOf($$3.a() == enw.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dtl i(dsc $$0, dbe $$1, iz $$2) {
      je $$3 = $$0.c(b);
      dsc $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         je $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dtl.d;
            }

            return dtl.e;
         }
      }

      dsc $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         je $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dtl.b;
            }

            return dtl.c;
         }
      }

      return dtl.a;
   }

   private static boolean c(dsc $$0, dbe $$1, iz $$2, je $$3) {
      dsc $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dsc $$0) {
      return $$0.b() instanceof dmt;
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      je $$2 = $$0.c(b);
      dtl $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == je.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dlm.c).a(d, dtl.c);
                  case c:
                     return $$0.a(dlm.c).a(d, dtl.b);
                  case d:
                     return $$0.a(dlm.c).a(d, dtl.e);
                  case e:
                     return $$0.a(dlm.c).a(d, dtl.d);
                  default:
                     return $$0.a(dlm.c);
               }
            }
            break;
         case c:
            if ($$2.o() == je.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dlm.c).a(d, dtl.b);
                  case c:
                     return $$0.a(dlm.c).a(d, dtl.c);
                  case d:
                     return $$0.a(dlm.c).a(d, dtl.e);
                  case e:
                     return $$0.a(dlm.c).a(d, dtl.d);
                  case a:
                     return $$0.a(dlm.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(e) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
