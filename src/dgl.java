import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dgl extends cys implements dfs {
   public static final MapCodec<dgl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlj.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dgl::new)
   );
   public static final dmd b = dcn.aE;
   public static final dmh<dmi> c = dlz.af;
   public static final dmh<dms> d = dlz.bi;
   public static final dma e = dlz.C;
   protected static final eos f = dfu.e;
   protected static final eos g = dfu.d;
   protected static final eos h = cys.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final eos i = cys.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final eos j = cys.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final eos k = cys.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final eos l = cys.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final eos m = cys.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final eos n = cys.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final eos o = cys.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final eos[] F = a(f, h, l, i, m);
   protected static final eos[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final cys J;
   protected final dlj H;

   @Override
   public MapCodec<? extends dgl> a() {
      return a;
   }

   private static eos[] a(eos $$0, eos $$1, eos $$2, eos $$3, eos $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(eos[]::new);
   }

   private static eos a(int $$0, eos $$1, eos $$2, eos $$3, eos $$4, eos $$5) {
      eos $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = eop.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = eop.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = eop.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = eop.a($$6, $$5);
      }

      return $$6;
   }

   protected dgl(dlj $$0, dli.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ie.c).a(c, dmi.b).a(d, dms.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean g_(dlj $$0) {
      return true;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return ($$0.c(c) == dmi.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dlj $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dlj a(crk $$0) {
      ie $$1 = $$0.k();
      hz $$2 = $$0.a();
      egw $$3 = $$0.q().b_($$2);
      dlj $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ie.a && ($$1 == ie.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dmi.b : dmi.a)
         .a(e, Boolean.valueOf($$3.a() == egx.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dms i(dlj $$0, cux $$1, hz $$2) {
      ie $$3 = $$0.c(b);
      dlj $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         ie $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dms.d;
            }

            return dms.e;
         }
      }

      dlj $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         ie $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dms.b;
            }

            return dms.c;
         }
      }

      return dms.a;
   }

   private static boolean c(dlj $$0, cux $$1, hz $$2, ie $$3) {
      dlj $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dlj $$0) {
      return $$0.b() instanceof dgl;
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      ie $$2 = $$0.c(b);
      dms $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ie.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dfe.c).a(d, dms.c);
                  case c:
                     return $$0.a(dfe.c).a(d, dms.b);
                  case d:
                     return $$0.a(dfe.c).a(d, dms.e);
                  case e:
                     return $$0.a(dfe.c).a(d, dms.d);
                  default:
                     return $$0.a(dfe.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ie.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dfe.c).a(d, dms.b);
                  case c:
                     return $$0.a(dfe.c).a(d, dms.c);
                  case d:
                     return $$0.a(dfe.c).a(d, dms.e);
                  case e:
                     return $$0.a(dfe.c).a(d, dms.d);
                  case a:
                     return $$0.a(dfe.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(e) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
