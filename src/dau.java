import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dau extends ctc implements dab {
   public static final MapCodec<dau> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfd.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), t()).apply($$0, dau::new)
   );
   public static final dfx b = cww.aE;
   public static final dgb<dgc> c = dft.af;
   public static final dgb<dgm> d = dft.bi;
   public static final dfu e = dft.C;
   protected static final eia f = dad.e;
   protected static final eia g = dad.d;
   protected static final eia h = ctc.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final eia i = ctc.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final eia j = ctc.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final eia k = ctc.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final eia l = ctc.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final eia m = ctc.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final eia n = ctc.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final eia o = ctc.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final eia[] F = a(f, h, l, i, m);
   protected static final eia[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final ctc J;
   protected final dfd H;

   @Override
   public MapCodec<? extends dau> a() {
      return a;
   }

   private static eia[] a(eia $$0, eia $$1, eia $$2, eia $$3, eia $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(eia[]::new);
   }

   private static eia a(int $$0, eia $$1, eia $$2, eia $$3, eia $$4, eia $$5) {
      eia $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ehx.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ehx.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ehx.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ehx.a($$6, $$5);
      }

      return $$6;
   }

   protected dau(dfd $$0, dfc.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ha.c).a(c, dgc.b).a(d, dgm.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dfd $$0) {
      return true;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return ($$0.c(c) == dgc.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dfd $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dfd a(clt $$0) {
      ha $$1 = $$0.k();
      gw $$2 = $$0.a();
      eag $$3 = $$0.q().b_($$2);
      dfd $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ha.a && ($$1 == ha.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dgc.b : dgc.a)
         .a(e, Boolean.valueOf($$3.a() == eah.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dgm i(dfd $$0, cph $$1, gw $$2) {
      ha $$3 = $$0.c(b);
      dfd $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(c) == $$4.c(c)) {
         ha $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dgm.d;
            }

            return dgm.e;
         }
      }

      dfd $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(c) == $$6.c(c)) {
         ha $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dgm.b;
            }

            return dgm.c;
         }
      }

      return dgm.a;
   }

   private static boolean c(dfd $$0, cph $$1, gw $$2, ha $$3) {
      dfd $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean h(dfd $$0) {
      return $$0.b() instanceof dau;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      ha $$2 = $$0.c(b);
      dgm $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ha.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(czn.c).a(d, dgm.c);
                  case c:
                     return $$0.a(czn.c).a(d, dgm.b);
                  case d:
                     return $$0.a(czn.c).a(d, dgm.e);
                  case e:
                     return $$0.a(czn.c).a(d, dgm.d);
                  default:
                     return $$0.a(czn.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ha.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(czn.c).a(d, dgm.b);
                  case c:
                     return $$0.a(czn.c).a(d, dgm.c);
                  case d:
                     return $$0.a(czn.c).a(d, dgm.e);
                  case e:
                     return $$0.a(czn.c).a(d, dgm.d);
                  case a:
                     return $$0.a(czn.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(e) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
