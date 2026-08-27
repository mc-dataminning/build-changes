import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.IntStream;

public class dky extends dde implements dkf {
   public static final MapCodec<dky> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqh.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dky::new)
   );
   public static final drb b = dha.aE;
   public static final drf<drg> c = dqx.af;
   public static final drf<drq> d = dqx.bi;
   public static final dqy e = dqx.C;
   protected static final eui f = dkh.e;
   protected static final eui g = dkh.d;
   protected static final eui h = dde.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final eui i = dde.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final eui j = dde.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final eui k = dde.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final eui l = dde.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final eui m = dde.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final eui n = dde.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final eui o = dde.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final eui[] F = a(f, h, l, i, m);
   protected static final eui[] G = a(g, j, n, k, o);
   private static final int[] I = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final dde J;
   protected final dqh H;

   @Override
   public MapCodec<? extends dky> a() {
      return a;
   }

   private static eui[] a(eui $$0, eui $$1, eui $$2, eui $$3, eui $$4) {
      return IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray(eui[]::new);
   }

   private static eui a(int $$0, eui $$1, eui $$2, eui $$3, eui $$4, eui $$5) {
      eui $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = euf.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = euf.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = euf.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = euf.a($$6, $$5);
      }

      return $$6;
   }

   protected dky(dqh $$0, dqg.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, is.c).a(c, drg.b).a(d, drq.a).a(e, Boolean.valueOf(false)));
      this.J = $$0.b();
      this.H = $$0;
   }

   @Override
   protected boolean f_(dqh $$0) {
      return true;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return ($$0.c(c) == drg.a ? F : G)[I[this.n($$0)]];
   }

   private int n(dqh $$0) {
      return $$0.c(d).ordinal() * 4 + $$0.c(b).e();
   }

   @Override
   public float e() {
      return this.J.e();
   }

   @Override
   public dqh a(cwi $$0) {
      is $$1 = $$0.k();
      in $$2 = $$0.a();
      ema $$3 = $$0.q().b_($$2);
      dqh $$4 = this.n()
         .a(b, $$0.g())
         .a(c, $$1 != is.a && ($$1 == is.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? drg.b : drg.a)
         .a(e, Boolean.valueOf($$3.a() == emb.c));
      return $$4.a(d, i($$4, $$0.q(), $$2));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(d, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static drq i(dqh $$0, czj $$1, in $$2) {
      is $$3 = $$0.c(b);
      dqh $$4 = $$1.a_($$2.a($$3));
      if (m($$4) && $$0.c(c) == $$4.c(c)) {
         is $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return drq.d;
            }

            return drq.e;
         }
      }

      dqh $$6 = $$1.a_($$2.a($$3.g()));
      if (m($$6) && $$0.c(c) == $$6.c(c)) {
         is $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return drq.b;
            }

            return drq.c;
         }
      }

      return drq.a;
   }

   private static boolean c(dqh $$0, czj $$1, in $$2, is $$3) {
      dqh $$4 = $$1.a_($$2.a($$3));
      return !m($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean m(dqh $$0) {
      return $$0.b() instanceof dky;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      is $$2 = $$0.c(b);
      drq $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == is.a.c) {
               switch ($$3) {
                  case b:
                     return $$0.a(djr.c).a(d, drq.c);
                  case c:
                     return $$0.a(djr.c).a(d, drq.b);
                  case d:
                     return $$0.a(djr.c).a(d, drq.e);
                  case e:
                     return $$0.a(djr.c).a(d, drq.d);
                  default:
                     return $$0.a(djr.c);
               }
            }
            break;
         case c:
            if ($$2.o() == is.a.a) {
               switch ($$3) {
                  case b:
                     return $$0.a(djr.c).a(d, drq.b);
                  case c:
                     return $$0.a(djr.c).a(d, drq.c);
                  case d:
                     return $$0.a(djr.c).a(d, drq.e);
                  case e:
                     return $$0.a(djr.c).a(d, drq.d);
                  case a:
                     return $$0.a(djr.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(e) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
