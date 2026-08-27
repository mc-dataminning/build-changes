import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dct extends cva implements dca {
   public static final MapCodec<dct> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhi.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dct::new)
   );
   public static final dic b = cyv.aE;
   public static final dig<dih> c = dhy.af;
   public static final dig<dir> d = dhy.bi;
   public static final dhz e = dhy.C;
   protected static final ekn f = dcc.e;
   protected static final ekn g = dcc.d;
   protected static final ekn h = cva.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final ekn i = cva.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final ekn j = cva.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final ekn k = cva.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final ekn l = cva.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final ekn m = cva.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final ekn n = cva.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final ekn o = cva.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final ekn[] F = a(f, h, l, i, m);
   protected static final ekn[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final cva J;
   protected final dhi H;

   @Override
   public MapCodec<? extends dct> a() {
      return a;
   }

   private static ekn[] a(ekn $$0, ekn $$1, ekn $$2, ekn $$3, ekn $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(ekn[]::new);
   }

   private static ekn a(int $$0, ekn $$1, ekn $$2, ekn $$3, ekn $$4, ekn $$5) {
      ekn $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = ekk.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = ekk.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = ekk.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = ekk.a($$6, $$5);
      }

      return $$6;
   }

   protected dct(dhi $$0, dhh.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, hx.c).a(c, dih.b).a(d, dir.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dhi $$0) {
      return true;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return ($$0.c(c) == dih.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dhi $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dhi a(cnr $$0) {
      hx $$1 = $$0.k();
      ht $$2 = $$0.a();
      ecs $$3 = $$0.q().b_($$2);
      dhi $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != hx.a && ($$1 == hx.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dih.b : dih.a)
         .a(e, Boolean.valueOf($$3.a() == ect.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dir i(dhi $$0, crg $$1, ht $$2) {
      hx $$3 = $$0.c(b);
      dhi $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(c) == $$4.c(c)) {
         hx $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dir.d;
            }

            return dir.e;
         }
      }

      dhi $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(c) == $$6.c(c)) {
         hx $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dir.b;
            }

            return dir.c;
         }
      }

      return dir.a;
   }

   private static boolean c(dhi $$0, crg $$1, ht $$2, hx $$3) {
      dhi $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean h(dhi $$0) {
      return $$0.b() instanceof dct;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      hx $$2 = $$0.c(b);
      dir $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == hx.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dbm.c).a(d, dir.c);
                  case c:
                     return $$0.a(dbm.c).a(d, dir.b);
                  case d:
                     return $$0.a(dbm.c).a(d, dir.e);
                  case e:
                     return $$0.a(dbm.c).a(d, dir.d);
                  default:
                     return $$0.a(dbm.c);
               }
            }
            break;
         case c:
            if ($$2.o() == hx.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dbm.c).a(d, dir.b);
                  case c:
                     return $$0.a(dbm.c).a(d, dir.c);
                  case d:
                     return $$0.a(dbm.c).a(d, dir.e);
                  case e:
                     return $$0.a(dbm.c).a(d, dir.d);
                  case a:
                     return $$0.a(dbm.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(e) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
