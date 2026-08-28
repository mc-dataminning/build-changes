import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class drl extends djm implements dqs {
   public static final MapCodec<drl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwx.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, drl::new)
   );
   public static final dxu<jn> b = dnk.aF;
   public static final dxu<dxv> c = dxn.ai;
   public static final dxu<dyf> d = dxn.bl;
   public static final dxo e = dxn.J;
   protected static final fbu f = dqu.e;
   protected static final fbu g = dqu.d;
   protected static final fbu h = djm.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final fbu i = djm.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final fbu j = djm.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final fbu k = djm.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final fbu l = djm.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final fbu m = djm.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final fbu n = djm.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final fbu o = djm.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final fbu[] G = a(f, h, l, i, m);
   protected static final fbu[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final djm K;
   protected final dwx I;

   @Override
   public MapCodec<? extends drl> a() {
      return a;
   }

   private static fbu[] a(fbu $$0, fbu $$1, fbu $$2, fbu $$3, fbu $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(fbu[]::new);
   }

   private static fbu a(int $$0, fbu $$1, fbu $$2, fbu $$3, fbu $$4, fbu $$5) {
      fbu $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = fbr.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = fbr.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = fbr.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = fbr.a($$6, $$5);
      }

      return $$6;
   }

   protected drl(dwx $$0, dww.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jn.c).b(c, dxv.b).b(d, dyf.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(dwx $$0) {
      return true;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return ($$0.c(c) == dxv.a ? G : H)[J[this.q($$0)]];
   }

   private int q(dwx $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public dwx a(dag $$0) {
      jn $$1 = $$0.k();
      ji $$2 = $$0.a();
      esz $$3 = $$0.q().b_($$2);
      dwx $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jn.a && ($$1 == jn.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dxv.b : dxv.a)
         .b(e, Boolean.valueOf($$3.a() == eta.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static dyf e(dwx $$0, dfn $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      dwx $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jn $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dyf.d;
            }

            return dyf.e;
         }
      }

      dwx $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jn $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dyf.b;
            }

            return dyf.c;
         }
      }

      return dyf.a;
   }

   private static boolean c(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      dwx $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dwx $$0) {
      return $$0.b() instanceof drl;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      jn $$2 = $$0.c(b);
      dyf $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jn.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dqe.c).b(d, dyf.c);
                  case c:
                     return $$0.a(dqe.c).b(d, dyf.b);
                  case d:
                     return $$0.a(dqe.c).b(d, dyf.e);
                  case e:
                     return $$0.a(dqe.c).b(d, dyf.d);
                  default:
                     return $$0.a(dqe.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jn.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dqe.c).b(d, dyf.b);
                  case c:
                     return $$0.a(dqe.c).b(d, dyf.c);
                  case d:
                     return $$0.a(dqe.c).b(d, dyf.e);
                  case e:
                     return $$0.a(dqe.c).b(d, dyf.d);
                  case a:
                     return $$0.a(dqe.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(e) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
