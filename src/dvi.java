import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dvi extends dne implements dup {
   public static final MapCodec<dvi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebg.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dvi::new)
   );
   public static final ece<jc> b = drf.e;
   public static final ece<ecf> c = ebw.ai;
   public static final ece<ecp> d = ebw.bl;
   public static final ebx e = ebw.I;
   private static final fgm g = fgj.a(dne.b(16.0, 0.0, 8.0), dne.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0));
   private static final fgm h = fgj.a(g, fgj.a(g, h.a(i.a, i.b)));
   private static final fgm i = fgj.a(h, fgj.a(h, h.a(i.a, i.b)));
   private static final Map<jc, fgm> D = fgj.c(g);
   private static final Map<jc, fgm> R = fgj.c(h);
   private static final Map<jc, fgm> S = fgj.c(i);
   private static final Map<jc, fgm> T = fgj.c(fgj.a(g, h.A));
   private static final Map<jc, fgm> U = fgj.c(fgj.a(h, h.A));
   private static final Map<jc, fgm> V = fgj.c(fgj.a(i, h.A));
   private final dne W;
   protected final ebg f;

   @Override
   public MapCodec<? extends dvi> a() {
      return a;
   }

   protected dvi(ebg $$0, ebf.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, jc.c).b(c, ecf.b).b(d, ecp.a).b(e, Boolean.valueOf(false)));
      this.W = $$0.b();
      this.f = $$0;
   }

   @Override
   protected boolean g_(ebg $$0) {
      return true;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      boolean $$4 = $$0.c(c) == ecf.b;
      jc $$5 = $$0.c(b);

      Map var10000 = switch ((ecp)$$0.c(d)) {
         case a -> $$4 ? R : U;
         case d, e -> $$4 ? D : T;
         case c, b -> $$4 ? S : V;
      };

      return (fgm)var10000.get(switch ((ecp)$$0.c(d)) {
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
   public ebg a(ddt $$0) {
      jc $$1 = $$0.k();
      iw $$2 = $$0.a();
      exq $$3 = $$0.q().b_($$2);
      ebg $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jc.a && ($$1 == jc.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? ecf.b : ecf.a)
         .b(e, Boolean.valueOf($$3.a() == exr.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ecp e(ebg $$0, djd $$1, iw $$2) {
      jc $$3 = $$0.c(b);
      ebg $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jc $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return ecp.d;
            }

            return ecp.e;
         }
      }

      ebg $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jc $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return ecp.b;
            }

            return ecp.c;
         }
      }

      return ecp.a;
   }

   private static boolean c(ebg $$0, djd $$1, iw $$2, jc $$3) {
      ebg $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(ebg $$0) {
      return $$0.b() instanceof dvi;
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      jc $$2 = $$0.c(b);
      ecp $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jc.a.c) {
               switch ($$3) {
                  case d:
                     return $$0.a(dty.c).b(d, ecp.e);
                  case c:
                     return $$0.a(dty.c).b(d, ecp.b);
                  case b:
                     return $$0.a(dty.c).b(d, ecp.c);
                  case e:
                     return $$0.a(dty.c).b(d, ecp.d);
                  default:
                     return $$0.a(dty.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jc.a.a) {
               switch ($$3) {
                  case a:
                     return $$0.a(dty.c);
                  case d:
                     return $$0.a(dty.c).b(d, ecp.e);
                  case c:
                     return $$0.a(dty.c).b(d, ecp.c);
                  case b:
                     return $$0.a(dty.c).b(d, ecp.b);
                  case e:
                     return $$0.a(dty.c).b(d, ecp.d);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(e) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
