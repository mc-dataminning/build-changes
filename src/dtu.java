import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dtu extends dlu implements dtb {
   public static final MapCodec<dtu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzo.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dtu::new)
   );
   public static final eam<ja> b = dpt.e;
   public static final eam<ean> c = eae.ai;
   public static final eam<eax> d = eae.bl;
   public static final eaf e = eae.I;
   private static final feq g = fen.a(dlu.b(16.0, 0.0, 8.0), dlu.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0));
   private static final feq h = fen.a(g, fen.a(g, h.a(0, 90)));
   private static final feq i = fen.a(h, fen.a(h, h.a(0, 90)));
   private static final Map<ja, feq> C = fen.c(g);
   private static final Map<ja, feq> Q = fen.c(h);
   private static final Map<ja, feq> R = fen.c(i);
   private static final Map<ja, feq> S = fen.c(fen.a(g, h.A));
   private static final Map<ja, feq> T = fen.c(fen.a(h, h.A));
   private static final Map<ja, feq> U = fen.c(fen.a(i, h.A));
   private final dlu V;
   protected final dzo f;

   @Override
   public MapCodec<? extends dtu> a() {
      return a;
   }

   protected dtu(dzo $$0, dzn.d $$1) {
      super($$1);
      this.l(this.B.b().b(b, ja.c).b(c, ean.b).b(d, eax.a).b(e, Boolean.valueOf(false)));
      this.V = $$0.b();
      this.f = $$0;
   }

   @Override
   protected boolean g_(dzo $$0) {
      return true;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      boolean $$4 = $$0.c(c) == ean.b;
      ja $$5 = $$0.c(b);

      Map var10000 = switch ((eax)$$0.c(d)) {
         case a -> $$4 ? Q : T;
         case d, e -> $$4 ? C : S;
         case c, b -> $$4 ? R : U;
      };

      return (feq)var10000.get(switch ((eax)$$0.c(d)) {
         case a, d, c -> $$5;
         case b -> $$5.i();
         case e -> $$5.h();
      });
   }

   @Override
   public float e() {
      return this.V.e();
   }

   @Override
   public dzo a(dcl $$0) {
      ja $$1 = $$0.k();
      iu $$2 = $$0.a();
      evv $$3 = $$0.q().b_($$2);
      dzo $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != ja.a && ($$1 == ja.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? ean.b : ean.a)
         .b(e, Boolean.valueOf($$3.a() == evw.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static eax e(dzo $$0, dhv $$1, iu $$2) {
      ja $$3 = $$0.c(b);
      dzo $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         ja $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return eax.d;
            }

            return eax.e;
         }
      }

      dzo $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         ja $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return eax.b;
            }

            return eax.c;
         }
      }

      return eax.a;
   }

   private static boolean c(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      dzo $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dzo $$0) {
      return $$0.b() instanceof dtu;
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      ja $$2 = $$0.c(b);
      eax $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ja.a.c) {
               switch ($$3) {
                  case d:
                     return $$0.a(dsm.c).b(d, eax.e);
                  case c:
                     return $$0.a(dsm.c).b(d, eax.b);
                  case b:
                     return $$0.a(dsm.c).b(d, eax.c);
                  case e:
                     return $$0.a(dsm.c).b(d, eax.d);
                  default:
                     return $$0.a(dsm.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ja.a.a) {
               switch ($$3) {
                  case a:
                     return $$0.a(dsm.c);
                  case d:
                     return $$0.a(dsm.c).b(d, eax.e);
                  case c:
                     return $$0.a(dsm.c).b(d, eax.c);
                  case b:
                     return $$0.a(dsm.c).b(d, eax.b);
                  case e:
                     return $$0.a(dsm.c).b(d, eax.d);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(e) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
