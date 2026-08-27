import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dka extends dch implements djh {
   public static final MapCodec<dka> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpi.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dka::new)
   );
   public static final dqc b = dgc.aE;
   public static final dqg<dqh> c = dpy.af;
   public static final dqg<dqr> d = dpy.bi;
   public static final dpz e = dpy.C;
   protected static final etc f = djj.e;
   protected static final etc g = djj.d;
   protected static final etc h = dch.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final etc i = dch.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final etc j = dch.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final etc k = dch.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final etc l = dch.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final etc m = dch.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final etc n = dch.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final etc o = dch.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final etc[] F = a(f, h, l, i, m);
   protected static final etc[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dch J;
   protected final dpi H;

   @Override
   public MapCodec<? extends dka> a() {
      return a;
   }

   private static etc[] a(etc $$0, etc $$1, etc $$2, etc $$3, etc $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(etc[]::new);
   }

   private static etc a(int $$0, etc $$1, etc $$2, etc $$3, etc $$4, etc $$5) {
      etc $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = esz.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = esz.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = esz.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = esz.a($$6, $$5);
      }

      return $$6;
   }

   protected dka(dpi $$0, dph.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ij.c).a(c, dqh.b).a(d, dqr.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean g_(dpi $$0) {
      return true;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return ($$0.c(c) == dqh.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dpi $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dpi a(cux $$0) {
      ij $$1 = $$0.k();
      id $$2 = $$0.a();
      elb $$3 = $$0.q().b_($$2);
      dpi $$4 = this.n()
         .a(b, $$0.g())
         .a(c, $$1 != ij.a && ($$1 == ij.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dqh.b : dqh.a)
         .a(e, Boolean.valueOf($$3.a() == elc.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dqr i(dpi $$0, cym $$1, id $$2) {
      ij $$3 = $$0.c(b);
      dpi $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         ij $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dqr.d;
            }

            return dqr.e;
         }
      }

      dpi $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         ij $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dqr.b;
            }

            return dqr.c;
         }
      }

      return dqr.a;
   }

   private static boolean c(dpi $$0, cym $$1, id $$2, ij $$3) {
      dpi $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dpi $$0) {
      return $$0.b() instanceof dka;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      ij $$2 = $$0.c(b);
      dqr $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ij.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dit.c).a(d, dqr.c);
                  case c:
                     return $$0.a(dit.c).a(d, dqr.b);
                  case d:
                     return $$0.a(dit.c).a(d, dqr.e);
                  case e:
                     return $$0.a(dit.c).a(d, dqr.d);
                  default:
                     return $$0.a(dit.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ij.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dit.c).a(d, dqr.b);
                  case c:
                     return $$0.a(dit.c).a(d, dqr.c);
                  case d:
                     return $$0.a(dit.c).a(d, dqr.e);
                  case e:
                     return $$0.a(dit.c).a(d, dqr.d);
                  case a:
                     return $$0.a(dit.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(e) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
