import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dvg extends dnc implements dun {
   public static final MapCodec<dvg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebe.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dvg::new)
   );
   public static final ecc<jb> b = drd.e;
   public static final ecc<ecd> c = ebu.ai;
   public static final ecc<ecn> d = ebu.bl;
   public static final ebv e = ebu.I;
   private static final fgk g = fgh.a(dnc.b(16.0, 0.0, 8.0), dnc.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0));
   private static final fgk h = fgh.a(g, fgh.a(g, h.a(i.a, i.b)));
   private static final fgk i = fgh.a(h, fgh.a(h, h.a(i.a, i.b)));
   private static final Map<jb, fgk> D = fgh.c(g);
   private static final Map<jb, fgk> R = fgh.c(h);
   private static final Map<jb, fgk> S = fgh.c(i);
   private static final Map<jb, fgk> T = fgh.c(fgh.a(g, h.A));
   private static final Map<jb, fgk> U = fgh.c(fgh.a(h, h.A));
   private static final Map<jb, fgk> V = fgh.c(fgh.a(i, h.A));
   private final dnc W;
   protected final ebe f;

   @Override
   public MapCodec<? extends dvg> a() {
      return a;
   }

   protected dvg(ebe $$0, ebd.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, jb.c).b(c, ecd.b).b(d, ecn.a).b(e, Boolean.valueOf(false)));
      this.W = $$0.b();
      this.f = $$0;
   }

   @Override
   protected boolean g_(ebe $$0) {
      return true;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      boolean $$4 = $$0.c(c) == ecd.b;
      jb $$5 = $$0.c(b);

      Map var10000 = switch ((ecn)$$0.c(d)) {
         case a -> $$4 ? R : U;
         case d, e -> $$4 ? D : T;
         case c, b -> $$4 ? S : V;
      };

      return (fgk)var10000.get(switch ((ecn)$$0.c(d)) {
         case a, d, c -> $$5;
         case b -> $$5.i();
         case e -> $$5.h();
      });
   }

   @Override
   public float e() {
      return this.W.e();
   }

   @Override
   public ebe a(ddr $$0) {
      jb $$1 = $$0.k();
      iv $$2 = $$0.a();
      exo $$3 = $$0.q().b_($$2);
      ebe $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jb.a && ($$1 == jb.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? ecd.b : ecd.a)
         .b(e, Boolean.valueOf($$3.a() == exp.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ecn e(ebe $$0, djb $$1, iv $$2) {
      jb $$3 = $$0.c(b);
      ebe $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jb $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return ecn.d;
            }

            return ecn.e;
         }
      }

      ebe $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jb $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return ecn.b;
            }

            return ecn.c;
         }
      }

      return ecn.a;
   }

   private static boolean c(ebe $$0, djb $$1, iv $$2, jb $$3) {
      ebe $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(ebe $$0) {
      return $$0.b() instanceof dvg;
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      jb $$2 = $$0.c(b);
      ecn $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jb.a.c) {
               switch ($$3) {
                  case d:
                     return $$0.a(dtw.c).b(d, ecn.e);
                  case c:
                     return $$0.a(dtw.c).b(d, ecn.b);
                  case b:
                     return $$0.a(dtw.c).b(d, ecn.c);
                  case e:
                     return $$0.a(dtw.c).b(d, ecn.d);
                  default:
                     return $$0.a(dtw.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jb.a.a) {
               switch ($$3) {
                  case a:
                     return $$0.a(dtw.c);
                  case d:
                     return $$0.a(dtw.c).b(d, ecn.e);
                  case c:
                     return $$0.a(dtw.c).b(d, ecn.c);
                  case b:
                     return $$0.a(dtw.c).b(d, ecn.b);
                  case e:
                     return $$0.a(dtw.c).b(d, ecn.d);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(e) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
