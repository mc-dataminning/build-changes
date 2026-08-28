import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class duq extends dmm implements dtx {
   public static final MapCodec<duq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eao.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, duq::new)
   );
   public static final ebm<jb> b = dqn.e;
   public static final ebm<ebn> c = ebe.ai;
   public static final ebm<ebx> d = ebe.bl;
   public static final ebf e = ebe.I;
   private static final ffr g = ffo.a(dmm.b(16.0, 0.0, 8.0), dmm.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0));
   private static final ffr h = ffo.a(g, ffo.a(g, h.a(i.a, i.b)));
   private static final ffr i = ffo.a(h, ffo.a(h, h.a(i.a, i.b)));
   private static final Map<jb, ffr> D = ffo.c(g);
   private static final Map<jb, ffr> R = ffo.c(h);
   private static final Map<jb, ffr> S = ffo.c(i);
   private static final Map<jb, ffr> T = ffo.c(ffo.a(g, h.A));
   private static final Map<jb, ffr> U = ffo.c(ffo.a(h, h.A));
   private static final Map<jb, ffr> V = ffo.c(ffo.a(i, h.A));
   private final dmm W;
   protected final eao f;

   @Override
   public MapCodec<? extends duq> a() {
      return a;
   }

   protected duq(eao $$0, ean.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, jb.c).b(c, ebn.b).b(d, ebx.a).b(e, Boolean.valueOf(false)));
      this.W = $$0.b();
      this.f = $$0;
   }

   @Override
   protected boolean g_(eao $$0) {
      return true;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      boolean $$4 = $$0.c(c) == ebn.b;
      jb $$5 = $$0.c(b);

      Map var10000 = switch ((ebx)$$0.c(d)) {
         case a -> $$4 ? R : U;
         case d, e -> $$4 ? D : T;
         case c, b -> $$4 ? S : V;
      };

      return (ffr)var10000.get(switch ((ebx)$$0.c(d)) {
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
   public eao a(ddd $$0) {
      jb $$1 = $$0.k();
      iv $$2 = $$0.a();
      ewv $$3 = $$0.q().b_($$2);
      eao $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jb.a && ($$1 == jb.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? ebn.b : ebn.a)
         .b(e, Boolean.valueOf($$3.a() == eww.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ebx e(eao $$0, din $$1, iv $$2) {
      jb $$3 = $$0.c(b);
      eao $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jb $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return ebx.d;
            }

            return ebx.e;
         }
      }

      eao $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jb $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return ebx.b;
            }

            return ebx.c;
         }
      }

      return ebx.a;
   }

   private static boolean c(eao $$0, din $$1, iv $$2, jb $$3) {
      eao $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(eao $$0) {
      return $$0.b() instanceof duq;
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      jb $$2 = $$0.c(b);
      ebx $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jb.a.c) {
               switch ($$3) {
                  case d:
                     return $$0.a(dtg.c).b(d, ebx.e);
                  case c:
                     return $$0.a(dtg.c).b(d, ebx.b);
                  case b:
                     return $$0.a(dtg.c).b(d, ebx.c);
                  case e:
                     return $$0.a(dtg.c).b(d, ebx.d);
                  default:
                     return $$0.a(dtg.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jb.a.a) {
               switch ($$3) {
                  case a:
                     return $$0.a(dtg.c);
                  case d:
                     return $$0.a(dtg.c).b(d, ebx.e);
                  case c:
                     return $$0.a(dtg.c).b(d, ebx.c);
                  case b:
                     return $$0.a(dtg.c).b(d, ebx.b);
                  case e:
                     return $$0.a(dtg.c).b(d, ebx.d);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(e) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
