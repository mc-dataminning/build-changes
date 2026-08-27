import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dkp extends dcv implements djw {
   public static final MapCodec<dkp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpy.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dkp::new)
   );
   public static final dqs b = dgr.aE;
   public static final dqw<dqx> c = dqo.af;
   public static final dqw<drh> d = dqo.bi;
   public static final dqp e = dqo.C;
   protected static final ety f = djy.e;
   protected static final ety g = djy.d;
   protected static final ety h = dcv.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ety i = dcv.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ety j = dcv.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ety k = dcv.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ety l = dcv.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ety m = dcv.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ety n = dcv.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ety o = dcv.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ety[] F = a(f, h, l, i, m);
   protected static final ety[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dcv J;
   protected final dpy H;

   @Override
   public MapCodec<? extends dkp> a() {
      return a;
   }

   private static ety[] a(ety $$0, ety $$1, ety $$2, ety $$3, ety $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ety[]::new);
   }

   private static ety a(int $$0, ety $$1, ety $$2, ety $$3, ety $$4, ety $$5) {
      ety $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = etv.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = etv.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = etv.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = etv.a($$6, $$5);
      }

      return $$6;
   }

   protected dkp(dpy $$0, dpx.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ir.c).a(c, dqx.b).a(d, drh.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean g_(dpy $$0) {
      return true;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return ($$0.c(c) == dqx.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dpy $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dpy a(cvl $$0) {
      ir $$1 = $$0.k();
      im $$2 = $$0.a();
      elr $$3 = $$0.q().b_($$2);
      dpy $$4 = this.n()
         .a(b, $$0.g())
         .a(c, $$1 != ir.a && ($$1 == ir.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dqx.b : dqx.a)
         .a(e, Boolean.valueOf($$3.a() == els.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static drh i(dpy $$0, cza $$1, im $$2) {
      ir $$3 = $$0.c(b);
      dpy $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         ir $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return drh.d;
            }

            return drh.e;
         }
      }

      dpy $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         ir $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return drh.b;
            }

            return drh.c;
         }
      }

      return drh.a;
   }

   private static boolean c(dpy $$0, cza $$1, im $$2, ir $$3) {
      dpy $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dpy $$0) {
      return $$0.b() instanceof dkp;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      ir $$2 = $$0.c(b);
      drh $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ir.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dji.c).a(d, drh.c);
                  case c:
                     return $$0.a(dji.c).a(d, drh.b);
                  case d:
                     return $$0.a(dji.c).a(d, drh.e);
                  case e:
                     return $$0.a(dji.c).a(d, drh.d);
                  default:
                     return $$0.a(dji.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ir.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dji.c).a(d, drh.b);
                  case c:
                     return $$0.a(dji.c).a(d, drh.c);
                  case d:
                     return $$0.a(dji.c).a(d, drh.e);
                  case e:
                     return $$0.a(dji.c).a(d, drh.d);
                  case a:
                     return $$0.a(dji.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(e) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
