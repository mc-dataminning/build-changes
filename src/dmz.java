import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dmz extends dff implements dmg {
   public static final MapCodec<dmz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsh.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dmz::new)
   );
   public static final dtb b = djb.aE;
   public static final dtf<dtg> c = dsx.af;
   public static final dtf<dtq> d = dsx.bi;
   public static final dsy e = dsx.C;
   protected static final ews f = dmi.e;
   protected static final ews g = dmi.d;
   protected static final ews h = dff.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ews i = dff.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ews j = dff.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ews k = dff.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ews l = dff.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ews m = dff.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ews n = dff.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ews o = dff.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ews[] F = a(f, h, l, i, m);
   protected static final ews[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dff J;
   protected final dsh H;

   @Override
   public MapCodec<? extends dmz> a() {
      return a;
   }

   private static ews[] a(ews $$0, ews $$1, ews $$2, ews $$3, ews $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ews[]::new);
   }

   private static ews a(int $$0, ews $$1, ews $$2, ews $$3, ews $$4, ews $$5) {
      ews $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ewp.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ewp.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ewp.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ewp.a($$6, $$5);
      }

      return $$6;
   }

   protected dmz(dsh $$0, dsg.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, jf.c).a(c, dtg.b).a(d, dtq.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(dsh $$0) {
      return true;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return ($$0.c(c) == dtg.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dsh $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dsh a(cxk $$0) {
      jf $$1 = $$0.k();
      ja $$2 = $$0.a();
      eob $$3 = $$0.q().b_($$2);
      dsh $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != jf.a && ($$1 == jf.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dtg.b : dtg.a)
         .a(e, Boolean.valueOf($$3.a() == eoc.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dtq i(dsh $$0, dbj $$1, ja $$2) {
      jf $$3 = $$0.c(b);
      dsh $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         jf $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dtq.d;
            }

            return dtq.e;
         }
      }

      dsh $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         jf $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dtq.b;
            }

            return dtq.c;
         }
      }

      return dtq.a;
   }

   private static boolean c(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      dsh $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dsh $$0) {
      return $$0.b() instanceof dmz;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      jf $$2 = $$0.c(b);
      dtq $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jf.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dls.c).a(d, dtq.c);
                  case c:
                     return $$0.a(dls.c).a(d, dtq.b);
                  case d:
                     return $$0.a(dls.c).a(d, dtq.e);
                  case e:
                     return $$0.a(dls.c).a(d, dtq.d);
                  default:
                     return $$0.a(dls.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jf.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dls.c).a(d, dtq.b);
                  case c:
                     return $$0.a(dls.c).a(d, dtq.c);
                  case d:
                     return $$0.a(dls.c).a(d, dtq.e);
                  case e:
                     return $$0.a(dls.c).a(d, dtq.d);
                  case a:
                     return $$0.a(dls.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(e) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
