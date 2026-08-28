import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dmv extends dfb implements dmc {
   public static final MapCodec<dmv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dse.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dmv::new)
   );
   public static final dsy b = dix.aE;
   public static final dtc<dtd> c = dsu.af;
   public static final dtc<dtn> d = dsu.bi;
   public static final dsv e = dsu.C;
   protected static final ewm f = dme.e;
   protected static final ewm g = dme.d;
   protected static final ewm h = dfb.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ewm i = dfb.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ewm j = dfb.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ewm k = dfb.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ewm l = dfb.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ewm m = dfb.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ewm n = dfb.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ewm o = dfb.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ewm[] F = a(f, h, l, i, m);
   protected static final ewm[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dfb J;
   protected final dse H;

   @Override
   public MapCodec<? extends dmv> a() {
      return a;
   }

   private static ewm[] a(ewm $$0, ewm $$1, ewm $$2, ewm $$3, ewm $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ewm[]::new);
   }

   private static ewm a(int $$0, ewm $$1, ewm $$2, ewm $$3, ewm $$4, ewm $$5) {
      ewm $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ewj.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ewj.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ewj.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ewj.a($$6, $$5);
      }

      return $$6;
   }

   protected dmv(dse $$0, dsd.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, je.c).a(c, dtd.b).a(d, dtn.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(dse $$0) {
      return true;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return ($$0.c(c) == dtd.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dse $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dse a(cyc $$0) {
      je $$1 = $$0.k();
      iz $$2 = $$0.a();
      enx $$3 = $$0.q().b_($$2);
      dse $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != je.a && ($$1 == je.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dtd.b : dtd.a)
         .a(e, Boolean.valueOf($$3.a() == eny.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dtn i(dse $$0, dbg $$1, iz $$2) {
      je $$3 = $$0.c(b);
      dse $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         je $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dtn.d;
            }

            return dtn.e;
         }
      }

      dse $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         je $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dtn.b;
            }

            return dtn.c;
         }
      }

      return dtn.a;
   }

   private static boolean c(dse $$0, dbg $$1, iz $$2, je $$3) {
      dse $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dse $$0) {
      return $$0.b() instanceof dmv;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      je $$2 = $$0.c(b);
      dtn $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == je.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dlo.c).a(d, dtn.c);
                  case c:
                     return $$0.a(dlo.c).a(d, dtn.b);
                  case d:
                     return $$0.a(dlo.c).a(d, dtn.e);
                  case e:
                     return $$0.a(dlo.c).a(d, dtn.d);
                  default:
                     return $$0.a(dlo.c);
               }
            }
            break;
         case c:
            if ($$2.o() == je.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dlo.c).a(d, dtn.b);
                  case c:
                     return $$0.a(dlo.c).a(d, dtn.c);
                  case d:
                     return $$0.a(dlo.c).a(d, dtn.e);
                  case e:
                     return $$0.a(dlo.c).a(d, dtn.d);
                  case a:
                     return $$0.a(dlo.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(e) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
