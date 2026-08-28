import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dvs extends dno implements duz {
   public static final MapCodec<dvs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebq.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dvs::new)
   );
   public static final eco<jc> b = drp.e;
   public static final eco<ecp> c = ecg.ai;
   public static final eco<ecz> d = ecg.bl;
   public static final ech e = ecg.I;
   private static final fgw g = fgt.a(dno.b(16.0, 0.0, 8.0), dno.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0));
   private static final fgw h = fgt.a(g, fgt.a(g, h.a(i.a, i.b)));
   private static final fgw i = fgt.a(h, fgt.a(h, h.a(i.a, i.b)));
   private static final Map<jc, fgw> D = fgt.c(g);
   private static final Map<jc, fgw> R = fgt.c(h);
   private static final Map<jc, fgw> S = fgt.c(i);
   private static final Map<jc, fgw> T = fgt.c(fgt.a(g, h.A));
   private static final Map<jc, fgw> U = fgt.c(fgt.a(h, h.A));
   private static final Map<jc, fgw> V = fgt.c(fgt.a(i, h.A));
   private final dno W;
   protected final ebq f;

   @Override
   public MapCodec<? extends dvs> a() {
      return a;
   }

   protected dvs(ebq $$0, ebp.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, jc.c).b(c, ecp.b).b(d, ecz.a).b(e, Boolean.valueOf(false)));
      this.W = $$0.b();
      this.f = $$0;
   }

   @Override
   protected boolean g_(ebq $$0) {
      return true;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      boolean $$4 = $$0.c(c) == ecp.b;
      jc $$5 = $$0.c(b);

      Map var10000 = switch ((ecz)$$0.c(d)) {
         case a -> $$4 ? R : U;
         case d, e -> $$4 ? D : T;
         case c, b -> $$4 ? S : V;
      };

      return (fgw)var10000.get(switch ((ecz)$$0.c(d)) {
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
   public ebq a(ded $$0) {
      jc $$1 = $$0.k();
      iw $$2 = $$0.a();
      eya $$3 = $$0.q().b_($$2);
      ebq $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jc.a && ($$1 == jc.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? ecp.b : ecp.a)
         .b(e, Boolean.valueOf($$3.a() == eyb.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ecz e(ebq $$0, djn $$1, iw $$2) {
      jc $$3 = $$0.c(b);
      ebq $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jc $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return ecz.d;
            }

            return ecz.e;
         }
      }

      ebq $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jc $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return ecz.b;
            }

            return ecz.c;
         }
      }

      return ecz.a;
   }

   private static boolean c(ebq $$0, djn $$1, iw $$2, jc $$3) {
      ebq $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(ebq $$0) {
      return $$0.b() instanceof dvs;
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      jc $$2 = $$0.c(b);
      ecz $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jc.a.c) {
               switch ($$3) {
                  case d:
                     return $$0.a(dui.c).b(d, ecz.e);
                  case c:
                     return $$0.a(dui.c).b(d, ecz.b);
                  case b:
                     return $$0.a(dui.c).b(d, ecz.c);
                  case e:
                     return $$0.a(dui.c).b(d, ecz.d);
                  default:
                     return $$0.a(dui.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jc.a.a) {
               switch ($$3) {
                  case a:
                     return $$0.a(dui.c);
                  case d:
                     return $$0.a(dui.c).b(d, ecz.e);
                  case c:
                     return $$0.a(dui.c).b(d, ecz.c);
                  case b:
                     return $$0.a(dui.c).b(d, ecz.b);
                  case e:
                     return $$0.a(dui.c).b(d, ecz.d);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(e) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
