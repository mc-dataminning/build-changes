import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dls extends ddy implements dkz {
   public static final MapCodec<dls> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drb.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dls::new)
   );
   public static final drv b = dhu.aE;
   public static final drz<dsa> c = drr.af;
   public static final drz<dsk> d = drr.bi;
   public static final drs e = drr.C;
   protected static final evd f = dlb.e;
   protected static final evd g = dlb.d;
   protected static final evd h = ddy.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final evd i = ddy.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final evd j = ddy.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final evd k = ddy.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final evd l = ddy.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final evd m = ddy.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final evd n = ddy.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final evd o = ddy.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final evd[] F = a(f, h, l, i, m);
   protected static final evd[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final ddy J;
   protected final drb H;

   @Override
   public MapCodec<? extends dls> a() {
      return a;
   }

   private static evd[] a(evd $$0, evd $$1, evd $$2, evd $$3, evd $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(evd[]::new);
   }

   private static evd a(int $$0, evd $$1, evd $$2, evd $$3, evd $$4, evd $$5) {
      evd $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = eva.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = eva.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = eva.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = eva.a($$6, $$5);
      }

      return $$6;
   }

   protected dls(drb $$0, dra.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, it.c).a(c, dsa.b).a(d, dsk.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(drb $$0) {
      return true;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return ($$0.c(c) == dsa.a ? F : G)[I[this.n($$0)]];
   }

   private int n(drb $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public drb a(cwz $$0) {
      it $$1 = $$0.k();
      io $$2 = $$0.a();
      emu $$3 = $$0.q().b_($$2);
      drb $$4 = this.n()
         .a(b, $$0.g())
         .a(c, $$1 != it.a && ($$1 == it.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dsa.b : dsa.a)
         .a(e, Boolean.valueOf($$3.a() == emv.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dsk i(drb $$0, dad $$1, io $$2) {
      it $$3 = $$0.c(b);
      drb $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         it $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dsk.d;
            }

            return dsk.e;
         }
      }

      drb $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         it $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dsk.b;
            }

            return dsk.c;
         }
      }

      return dsk.a;
   }

   private static boolean c(drb $$0, dad $$1, io $$2, it $$3) {
      drb $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(drb $$0) {
      return $$0.b() instanceof dls;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      it $$2 = $$0.c(b);
      dsk $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == it.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dkl.c).a(d, dsk.c);
                  case c:
                     return $$0.a(dkl.c).a(d, dsk.b);
                  case d:
                     return $$0.a(dkl.c).a(d, dsk.e);
                  case e:
                     return $$0.a(dkl.c).a(d, dsk.d);
                  default:
                     return $$0.a(dkl.c);
               }
            }
            break;
         case c:
            if ($$2.o() == it.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dkl.c).a(d, dsk.b);
                  case c:
                     return $$0.a(dkl.c).a(d, dsk.c);
                  case d:
                     return $$0.a(dkl.c).a(d, dsk.e);
                  case e:
                     return $$0.a(dkl.c).a(d, dsk.d);
                  case a:
                     return $$0.a(dkl.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(e) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
