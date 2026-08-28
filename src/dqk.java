import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dqk extends diq implements dpr {
   public static final MapCodec<dqk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvv.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dqk::new)
   );
   public static final dws<jm> b = dml.aF;
   public static final dws<dwt> c = dwl.af;
   public static final dws<dxd> d = dwl.bi;
   public static final dwm e = dwl.C;
   protected static final fas f = dpt.e;
   protected static final fas g = dpt.d;
   protected static final fas h = diq.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final fas i = diq.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final fas j = diq.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final fas k = diq.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final fas l = diq.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final fas m = diq.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final fas n = diq.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final fas o = diq.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final fas[] G = a(f, h, l, i, m);
   protected static final fas[] H = a(g, j, n, k, o);
   private static final int[] J = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final diq K;
   protected final dvv I;

   @Override
   public MapCodec<? extends dqk> a() {
      return a;
   }

   private static fas[] a(fas $$0, fas $$1, fas $$2, fas $$3, fas $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(fas[]::new);
   }

   private static fas a(int $$0, fas $$1, fas $$2, fas $$3, fas $$4, fas $$5) {
      fas $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = fap.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = fap.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = fap.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = fap.a($$6, $$5);
      }

      return $$6;
   }

   protected dqk(dvv $$0, dvu.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, dwt.b).b(d, dxd.a).b(e, Boolean.valueOf(false)));
      this.K = $$0.b();
      this.I = $$0;
   }

   @Override
   protected boolean g_(dvv $$0) {
      return true;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return ($$0.c(c) == dwt.a ? G : H)[J[this.q($$0)]];
   }

   private int q(dvv $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.K.e();
   }

   @Override
   public dvv a(dad $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      erv $$3 = $$0.q().b_($$2);
      dvv $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jm.a && ($$1 == jm.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dwt.b : dwt.a)
         .b(e, Boolean.valueOf($$3.a() == erw.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static dxd e(dvv $$0, der $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      dvv $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jm $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dxd.d;
            }

            return dxd.e;
         }
      }

      dvv $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jm $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dxd.b;
            }

            return dxd.c;
         }
      }

      return dxd.a;
   }

   private static boolean c(dvv $$0, der $$1, jh $$2, jm $$3) {
      dvv $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dvv $$0) {
      return $$0.b() instanceof dqk;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      jm $$2 = $$0.c(b);
      dxd $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jm.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dpd.c).b(d, dxd.c);
                  case c:
                     return $$0.a(dpd.c).b(d, dxd.b);
                  case d:
                     return $$0.a(dpd.c).b(d, dxd.e);
                  case e:
                     return $$0.a(dpd.c).b(d, dxd.d);
                  default:
                     return $$0.a(dpd.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jm.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dpd.c).b(d, dxd.b);
                  case c:
                     return $$0.a(dpd.c).b(d, dxd.c);
                  case d:
                     return $$0.a(dpd.c).b(d, dxd.e);
                  case e:
                     return $$0.a(dpd.c).b(d, dxd.d);
                  case a:
                     return $$0.a(dpd.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(e) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
