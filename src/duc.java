import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class duc extends dma implements dtj {
   public static final MapCodec<duc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzz.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, duc::new)
   );
   public static final eax<ja> b = dqa.e;
   public static final eax<eay> c = eap.ai;
   public static final eax<ebi> d = eap.bl;
   public static final eaq e = eap.I;
   private static final ffc g = fez.a(dma.b(16.0, 0.0, 8.0), dma.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0));
   private static final ffc h = fez.a(g, fez.a(g, h.a(0, 90)));
   private static final ffc i = fez.a(h, fez.a(h, h.a(0, 90)));
   private static final Map<ja, ffc> C = fez.c(g);
   private static final Map<ja, ffc> Q = fez.c(h);
   private static final Map<ja, ffc> R = fez.c(i);
   private static final Map<ja, ffc> S = fez.c(fez.a(g, h.A));
   private static final Map<ja, ffc> T = fez.c(fez.a(h, h.A));
   private static final Map<ja, ffc> U = fez.c(fez.a(i, h.A));
   private final dma V;
   protected final dzz f;

   @Override
   public MapCodec<? extends duc> a() {
      return a;
   }

   protected duc(dzz $$0, dzy.d $$1) {
      super($$1);
      this.l(this.B.b().b(b, ja.c).b(c, eay.b).b(d, ebi.a).b(e, Boolean.valueOf(false)));
      this.V = $$0.b();
      this.f = $$0;
   }

   @Override
   protected boolean g_(dzz $$0) {
      return true;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      boolean $$4 = $$0.c(c) == eay.b;
      ja $$5 = $$0.c(b);

      Map var10000 = switch ((ebi)$$0.c(d)) {
         case a -> $$4 ? Q : T;
         case d, e -> $$4 ? C : S;
         case c, b -> $$4 ? R : U;
      };

      return (ffc)var10000.get(switch ((ebi)$$0.c(d)) {
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
   public dzz a(dcr $$0) {
      ja $$1 = $$0.k();
      iu $$2 = $$0.a();
      ewg $$3 = $$0.q().b_($$2);
      dzz $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != ja.a && ($$1 == ja.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? eay.b : eay.a)
         .b(e, Boolean.valueOf($$3.a() == ewh.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ebi e(dzz $$0, dib $$1, iu $$2) {
      ja $$3 = $$0.c(b);
      dzz $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         ja $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return ebi.d;
            }

            return ebi.e;
         }
      }

      dzz $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         ja $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return ebi.b;
            }

            return ebi.c;
         }
      }

      return ebi.a;
   }

   private static boolean c(dzz $$0, dib $$1, iu $$2, ja $$3) {
      dzz $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dzz $$0) {
      return $$0.b() instanceof duc;
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      ja $$2 = $$0.c(b);
      ebi $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == ja.a.c) {
               switch ($$3) {
                  case d:
                     return $$0.a(dst.c).b(d, ebi.e);
                  case c:
                     return $$0.a(dst.c).b(d, ebi.b);
                  case b:
                     return $$0.a(dst.c).b(d, ebi.c);
                  case e:
                     return $$0.a(dst.c).b(d, ebi.d);
                  default:
                     return $$0.a(dst.c);
               }
            }
            break;
         case c:
            if ($$2.o() == ja.a.a) {
               switch ($$3) {
                  case a:
                     return $$0.a(dst.c);
                  case d:
                     return $$0.a(dst.c).b(d, ebi.e);
                  case c:
                     return $$0.a(dst.c).b(d, ebi.c);
                  case b:
                     return $$0.a(dst.c).b(d, ebi.b);
                  case e:
                     return $$0.a(dst.c).b(d, ebi.d);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(e) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
