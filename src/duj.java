import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class duj extends dmf implements dtq {
   public static final MapCodec<duj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eah.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, duj::new)
   );
   public static final ebf<ja> b = dqg.e;
   public static final ebf<ebg> c = eax.ai;
   public static final ebf<ebq> d = eax.bl;
   public static final eay e = eax.I;
   private static final ffk g = ffh.a(dmf.b(16.0, 0.0, 8.0), dmf.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0));
   private static final ffk h = ffh.a(g, ffh.a(g, h.a(0, 90)));
   private static final ffk i = ffh.a(h, ffh.a(h, h.a(0, 90)));
   private static final Map<ja, ffk> D = ffh.c(g);
   private static final Map<ja, ffk> R = ffh.c(h);
   private static final Map<ja, ffk> S = ffh.c(i);
   private static final Map<ja, ffk> T = ffh.c(ffh.a(g, h.A));
   private static final Map<ja, ffk> U = ffh.c(ffh.a(h, h.A));
   private static final Map<ja, ffk> V = ffh.c(ffh.a(i, h.A));
   private final dmf W;
   protected final eah f;

   @Override
   public MapCodec<? extends duj> a() {
      return a;
   }

   protected duj(eah $$0, eag.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, ja.c).b(c, ebg.b).b(d, ebq.a).b(e, Boolean.valueOf(false)));
      this.W = $$0.b();
      this.f = $$0;
   }

   @Override
   protected boolean g_(eah $$0) {
      return true;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      boolean $$4 = $$0.c(c) == ebg.b;
      ja $$5 = $$0.c(b);

      Map var10000 = switch ((ebq)$$0.c(d)) {
         case a -> $$4 ? R : U;
         case d, e -> $$4 ? D : T;
         case c, b -> $$4 ? S : V;
      };

      return (ffk)var10000.get(switch ((ebq)$$0.c(d)) {
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
   public eah a(dcw $$0) {
      ja $$1 = $$0.k();
      iu $$2 = $$0.a();
      ewo $$3 = $$0.q().b_($$2);
      eah $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != ja.a && ($$1 == ja.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? ebg.b : ebg.a)
         .b(e, Boolean.valueOf($$3.a() == ewp.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ebq e(eah $$0, dig $$1, iu $$2) {
      ja $$3 = $$0.c(b);
      eah $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         ja $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return ebq.d;
            }

            return ebq.e;
         }
      }

      eah $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         ja $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return ebq.b;
            }

            return ebq.c;
         }
      }

      return ebq.a;
   }

   private static boolean c(eah $$0, dig $$1, iu $$2, ja $$3) {
      eah $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(eah $$0) {
      return $$0.b() instanceof duj;
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      ja $$2 = $$0.c(b);
      ebq $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ja.a.c) {
               switch ($$3) {
                  case d:
                     return $$0.a(dsz.c).b(d, ebq.e);
                  case c:
                     return $$0.a(dsz.c).b(d, ebq.b);
                  case b:
                     return $$0.a(dsz.c).b(d, ebq.c);
                  case e:
                     return $$0.a(dsz.c).b(d, ebq.d);
                  default:
                     return $$0.a(dsz.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ja.a.a) {
               switch ($$3) {
                  case a:
                     return $$0.a(dsz.c);
                  case d:
                     return $$0.a(dsz.c).b(d, ebq.e);
                  case c:
                     return $$0.a(dsz.c).b(d, ebq.c);
                  case b:
                     return $$0.a(dsz.c).b(d, ebq.b);
                  case e:
                     return $$0.a(dsz.c).b(d, ebq.d);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(e) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
