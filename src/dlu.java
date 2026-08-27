import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dlu extends dea implements dlb {
   public static final MapCodec<dlu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drd.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dlu::new)
   );
   public static final drx b = dhw.aE;
   public static final dsb<dsc> c = drt.af;
   public static final dsb<dsm> d = drt.bi;
   public static final dru e = drt.C;
   protected static final evf f = dld.e;
   protected static final evf g = dld.d;
   protected static final evf h = dea.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final evf i = dea.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final evf j = dea.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final evf k = dea.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final evf l = dea.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final evf m = dea.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final evf n = dea.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final evf o = dea.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final evf[] F = a(f, h, l, i, m);
   protected static final evf[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dea J;
   protected final drd H;

   @Override
   public MapCodec<? extends dlu> a() {
      return a;
   }

   private static evf[] a(evf $$0, evf $$1, evf $$2, evf $$3, evf $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(evf[]::new);
   }

   private static evf a(int $$0, evf $$1, evf $$2, evf $$3, evf $$4, evf $$5) {
      evf $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = evc.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = evc.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = evc.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = evc.a($$6, $$5);
      }

      return $$6;
   }

   protected dlu(drd $$0, drc.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, it.c).a(c, dsc.b).a(d, dsm.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(drd $$0) {
      return true;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return ($$0.c(c) == dsc.a ? F : G)[I[this.n($$0)]];
   }

   private int n(drd $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public drd a(cxb $$0) {
      it $$1 = $$0.k();
      io $$2 = $$0.a();
      emw $$3 = $$0.q().b_($$2);
      drd $$4 = this.n()
         .a(b, $$0.g())
         .a(c, $$1 != it.a && ($$1 == it.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dsc.b : dsc.a)
         .a(e, Boolean.valueOf($$3.a() == emx.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dsm i(drd $$0, daf $$1, io $$2) {
      it $$3 = $$0.c(b);
      drd $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         it $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dsm.d;
            }

            return dsm.e;
         }
      }

      drd $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         it $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dsm.b;
            }

            return dsm.c;
         }
      }

      return dsm.a;
   }

   private static boolean c(drd $$0, daf $$1, io $$2, it $$3) {
      drd $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(drd $$0) {
      return $$0.b() instanceof dlu;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      it $$2 = $$0.c(b);
      dsm $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == it.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dkn.c).a(d, dsm.c);
                  case c:
                     return $$0.a(dkn.c).a(d, dsm.b);
                  case d:
                     return $$0.a(dkn.c).a(d, dsm.e);
                  case e:
                     return $$0.a(dkn.c).a(d, dsm.d);
                  default:
                     return $$0.a(dkn.c);
               }
            }
            break;
         case c:
            if ($$2.o() == it.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dkn.c).a(d, dsm.b);
                  case c:
                     return $$0.a(dkn.c).a(d, dsm.c);
                  case d:
                     return $$0.a(dkn.c).a(d, dsm.e);
                  case e:
                     return $$0.a(dkn.c).a(d, dsm.d);
                  case a:
                     return $$0.a(dkn.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(e) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
