import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dds extends cvz implements dcz {
   public static final MapCodec<dds> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dip.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dds::new)
   );
   public static final djj b = czu.aE;
   public static final djn<djo> c = djf.af;
   public static final djn<djy> d = djf.bi;
   public static final djg e = djf.C;
   protected static final elu f = ddb.e;
   protected static final elu g = ddb.d;
   protected static final elu h = cvz.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final elu i = cvz.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final elu j = cvz.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final elu k = cvz.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final elu l = cvz.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final elu m = cvz.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final elu n = cvz.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final elu o = cvz.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final elu[] F = a(f, h, l, i, m);
   protected static final elu[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final cvz J;
   protected final dip H;

   @Override
   public MapCodec<? extends dds> a() {
      return a;
   }

   private static elu[] a(elu $$0, elu $$1, elu $$2, elu $$3, elu $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(elu[]::new);
   }

   private static elu a(int $$0, elu $$1, elu $$2, elu $$3, elu $$4, elu $$5) {
      elu $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = elr.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = elr.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = elr.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = elr.a($$6, $$5);
      }

      return $$6;
   }

   protected dds(dip $$0, dio.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ia.c).a(c, djo.b).a(d, djy.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dip $$0) {
      return true;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return ($$0.c(c) == djo.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dip $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dip a(coq $$0) {
      ia $$1 = $$0.k();
      hv $$2 = $$0.a();
      edz $$3 = $$0.q().b_($$2);
      dip $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != ia.a && ($$1 == ia.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? djo.b : djo.a)
         .a(e, Boolean.valueOf($$3.a() == eea.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static djy i(dip $$0, cse $$1, hv $$2) {
      ia $$3 = $$0.c(b);
      dip $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(c) == $$4.c(c)) {
         ia $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return djy.d;
            }

            return djy.e;
         }
      }

      dip $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(c) == $$6.c(c)) {
         ia $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return djy.b;
            }

            return djy.c;
         }
      }

      return djy.a;
   }

   private static boolean c(dip $$0, cse $$1, hv $$2, ia $$3) {
      dip $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean h(dip $$0) {
      return $$0.b() instanceof dds;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      ia $$2 = $$0.c(b);
      djy $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ia.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dcl.c).a(d, djy.c);
                  case c:
                     return $$0.a(dcl.c).a(d, djy.b);
                  case d:
                     return $$0.a(dcl.c).a(d, djy.e);
                  case e:
                     return $$0.a(dcl.c).a(d, djy.d);
                  default:
                     return $$0.a(dcl.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ia.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dcl.c).a(d, djy.b);
                  case c:
                     return $$0.a(dcl.c).a(d, djy.c);
                  case d:
                     return $$0.a(dcl.c).a(d, djy.e);
                  case e:
                     return $$0.a(dcl.c).a(d, djy.d);
                  case a:
                     return $$0.a(dcl.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(e) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
