import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dbs extends cua implements daz {
   public static final MapCodec<dbs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgb.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), t()).apply($$0, dbs::new)
   );
   public static final dgv b = cxu.aE;
   public static final dgz<dha> c = dgr.af;
   public static final dgz<dhk> d = dgr.bi;
   public static final dgs e = dgr.C;
   protected static final eiy f = dbb.e;
   protected static final eiy g = dbb.d;
   protected static final eiy h = cua.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final eiy i = cua.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final eiy j = cua.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final eiy k = cua.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final eiy l = cua.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final eiy m = cua.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final eiy n = cua.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final eiy o = cua.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final eiy[] F = a(f, h, l, i, m);
   protected static final eiy[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final cua J;
   protected final dgb H;

   @Override
   public MapCodec<? extends dbs> a() {
      return a;
   }

   private static eiy[] a(eiy $$0, eiy $$1, eiy $$2, eiy $$3, eiy $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(eiy[]::new);
   }

   private static eiy a(int $$0, eiy $$1, eiy $$2, eiy $$3, eiy $$4, eiy $$5) {
      eiy $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = eiv.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = eiv.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = eiv.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = eiv.a($$6, $$5);
      }

      return $$6;
   }

   protected dbs(dgb $$0, dga.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, hx.c).a(c, dha.b).a(d, dhk.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   public boolean g_(dgb $$0) {
      return true;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return ($$0.c(c) == dha.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dgb $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dgb a(cmr $$0) {
      hx $$1 = $$0.k();
      ht $$2 = $$0.a();
      ebe $$3 = $$0.q().b_($$2);
      dgb $$4 = this.o()
         .a(b, $$0.g())
         .a(c, $$1 != hx.a && ($$1 == hx.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? dha.b : dha.a)
         .a(e, Boolean.valueOf($$3.a() == ebf.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static dhk i(dgb $$0, cqf $$1, ht $$2) {
      hx $$3 = $$0.c(b);
      dgb $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(c) == $$4.c(c)) {
         hx $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dhk.d;
            }

            return dhk.e;
         }
      }

      dgb $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(c) == $$6.c(c)) {
         hx $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dhk.b;
            }

            return dhk.c;
         }
      }

      return dhk.a;
   }

   private static boolean c(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      dgb $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean h(dgb $$0) {
      return $$0.b() instanceof dbs;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      hx $$2 = $$0.c(b);
      dhk $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == hx.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(dal.c).a(d, dhk.c);
                  case c:
                     return $$0.a(dal.c).a(d, dhk.b);
                  case d:
                     return $$0.a(dal.c).a(d, dhk.e);
                  case e:
                     return $$0.a(dal.c).a(d, dhk.d);
                  default:
                     return $$0.a(dal.c);
               }
            }
            break;
         case c:
            if ($$2.o() == hx.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(dal.c).a(d, dhk.b);
                  case c:
                     return $$0.a(dal.c).a(d, dhk.c);
                  case d:
                     return $$0.a(dal.c).a(d, dhk.e);
                  case e:
                     return $$0.a(dal.c).a(d, dhk.d);
                  case a:
                     return $$0.a(dal.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(e) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
