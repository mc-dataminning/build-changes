import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dcy extends cvf implements dcf {
   public static final MapCodec<dcy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhn.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dcy::new)
   );
   public static final dih b = cza.aE;
   public static final dil<dim> c = did.af;
   public static final dil<diw> d = did.bi;
   public static final die e = did.C;
   protected static final eks f = dch.e;
   protected static final eks g = dch.d;
   protected static final eks h = cvf.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final eks i = cvf.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final eks j = cvf.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final eks k = cvf.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final eks l = cvf.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final eks m = cvf.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final eks n = cvf.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final eks o = cvf.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final eks[] F = a(f, h, l, i, m);
   protected static final eks[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final cvf J;
   protected final dhn H;

   @Override
   public MapCodec<? extends dcy> a() {
      return a;
   }

   private static eks[] a(eks $$0, eks $$1, eks $$2, eks $$3, eks $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(eks[]::new);
   }

   private static eks a(int $$0, eks $$1, eks $$2, eks $$3, eks $$4, eks $$5) {
      eks $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ekp.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ekp.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ekp.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ekp.a($$6, $$5);
      }

      return $$6;
   }

   protected dcy(dhn $$0, dhm.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ib.c).a(c, dim.b).a(d, diw.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dhn $$0) {
      return true;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return ($$0.c(c) == dim.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dhn $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dhn a(cnw $$0) {
      ib $$1 = $$0.k();
      hx $$2 = $$0.a();
      ecx $$3 = $$0.q().b_($$2);
      dhn $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ib.a && ($$1 == ib.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dim.b : dim.a)
         .a(e, Boolean.valueOf($$3.a() == ecy.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static diw i(dhn $$0, crl $$1, hx $$2) {
      ib $$3 = $$0.c(b);
      dhn $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(c) == $$4.c(c)) {
         ib $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return diw.d;
            }

            return diw.e;
         }
      }

      dhn $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(c) == $$6.c(c)) {
         ib $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return diw.b;
            }

            return diw.c;
         }
      }

      return diw.a;
   }

   private static boolean c(dhn $$0, crl $$1, hx $$2, ib $$3) {
      dhn $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean h(dhn $$0) {
      return $$0.b() instanceof dcy;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      ib $$2 = $$0.c(b);
      diw $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ib.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dbr.c).a(d, diw.c);
                  case c:
                     return $$0.a(dbr.c).a(d, diw.b);
                  case d:
                     return $$0.a(dbr.c).a(d, diw.e);
                  case e:
                     return $$0.a(dbr.c).a(d, diw.d);
                  default:
                     return $$0.a(dbr.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ib.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dbr.c).a(d, diw.b);
                  case c:
                     return $$0.a(dbr.c).a(d, diw.c);
                  case d:
                     return $$0.a(dbr.c).a(d, diw.e);
                  case e:
                     return $$0.a(dbr.c).a(d, diw.d);
                  case a:
                     return $$0.a(dbr.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(e) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
