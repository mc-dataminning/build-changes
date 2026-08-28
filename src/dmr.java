import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dmr extends dex implements dly {
   public static final MapCodec<dmr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsa.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dmr::new)
   );
   public static final dsu b = dit.aE;
   public static final dsy<dsz> c = dsq.af;
   public static final dsy<dtj> d = dsq.bi;
   public static final dsr e = dsq.C;
   protected static final ewi f = dma.e;
   protected static final ewi g = dma.d;
   protected static final ewi h = dex.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ewi i = dex.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ewi j = dex.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ewi k = dex.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ewi l = dex.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ewi m = dex.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ewi n = dex.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ewi o = dex.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ewi[] F = a(f, h, l, i, m);
   protected static final ewi[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dex J;
   protected final dsa H;

   @Override
   public MapCodec<? extends dmr> a() {
      return a;
   }

   private static ewi[] a(ewi $$0, ewi $$1, ewi $$2, ewi $$3, ewi $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ewi[]::new);
   }

   private static ewi a(int $$0, ewi $$1, ewi $$2, ewi $$3, ewi $$4, ewi $$5) {
      ewi $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ewf.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ewf.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ewf.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ewf.a($$6, $$5);
      }

      return $$6;
   }

   protected dmr(dsa $$0, drz.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, je.c).a(c, dsz.b).a(d, dtj.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(dsa $$0) {
      return true;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return ($$0.c(c) == dsz.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dsa $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dsa a(cxy $$0) {
      je $$1 = $$0.k();
      iz $$2 = $$0.a();
      ent $$3 = $$0.q().b_($$2);
      dsa $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != je.a && ($$1 == je.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dsz.b : dsz.a)
         .a(e, Boolean.valueOf($$3.a() == enu.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dtj i(dsa $$0, dbc $$1, iz $$2) {
      je $$3 = $$0.c(b);
      dsa $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         je $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dtj.d;
            }

            return dtj.e;
         }
      }

      dsa $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         je $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dtj.b;
            }

            return dtj.c;
         }
      }

      return dtj.a;
   }

   private static boolean c(dsa $$0, dbc $$1, iz $$2, je $$3) {
      dsa $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dsa $$0) {
      return $$0.b() instanceof dmr;
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      je $$2 = $$0.c(b);
      dtj $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == je.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dlk.c).a(d, dtj.c);
                  case c:
                     return $$0.a(dlk.c).a(d, dtj.b);
                  case d:
                     return $$0.a(dlk.c).a(d, dtj.e);
                  case e:
                     return $$0.a(dlk.c).a(d, dtj.d);
                  default:
                     return $$0.a(dlk.c);
               }
            }
            break;
         case c:
            if ($$2.o() == je.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dlk.c).a(d, dtj.b);
                  case c:
                     return $$0.a(dlk.c).a(d, dtj.c);
                  case d:
                     return $$0.a(dlk.c).a(d, dtj.e);
                  case e:
                     return $$0.a(dlk.c).a(d, dtj.d);
                  case a:
                     return $$0.a(dlk.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(e) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
