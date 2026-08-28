import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dse extends dke implements drl {
   public static final MapCodec<dse> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxq.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dse::new)
   );
   public static final dyo<jn> b = dod.e;
   public static final dyo<dyp> c = dyg.ai;
   public static final dyo<dyz> d = dyg.bl;
   public static final dyh e = dyg.I;
   private static final fcr g = fco.a(dke.b(16.0, 0.0, 8.0), dke.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0));
   private static final fcr h = fco.a(g, fco.a(g, h.a(0, 90)));
   private static final fcr i = fco.a(h, fco.a(h, h.a(0, 90)));
   private static final Map<jn, fcr> C = fco.c(g);
   private static final Map<jn, fcr> Q = fco.c(h);
   private static final Map<jn, fcr> R = fco.c(i);
   private static final Map<jn, fcr> S = fco.c(fco.a(g, h.A));
   private static final Map<jn, fcr> T = fco.c(fco.a(h, h.A));
   private static final Map<jn, fcr> U = fco.c(fco.a(i, h.A));
   private final dke V;
   protected final dxq f;

   @Override
   public MapCodec<? extends dse> a() {
      return a;
   }

   protected dse(dxq $$0, dxp.d $$1) {
      super($$1);
      this.l(this.B.b().b(b, jn.c).b(c, dyp.b).b(d, dyz.a).b(e, Boolean.valueOf(false)));
      this.V = $$0.b();
      this.f = $$0;
   }

   @Override
   protected boolean g_(dxq $$0) {
      return true;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      boolean $$4 = $$0.c(c) == dyp.b;
      jn $$5 = $$0.c(b);

      Map var10000 = switch ((dyz)$$0.c(d)) {
         case a -> $$4 ? Q : T;
         case d, e -> $$4 ? C : S;
         case c, b -> $$4 ? R : U;
      };

      return (fcr)var10000.get(switch ((dyz)$$0.c(d)) {
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
   public dxq a(dax $$0) {
      jn $$1 = $$0.k();
      ji $$2 = $$0.a();
      etw $$3 = $$0.q().b_($$2);
      dxq $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jn.a && ($$1 == jn.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dyp.b : dyp.a)
         .b(e, Boolean.valueOf($$3.a() == etx.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static dyz e(dxq $$0, dgf $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      dxq $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jn $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dyz.d;
            }

            return dyz.e;
         }
      }

      dxq $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jn $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dyz.b;
            }

            return dyz.c;
         }
      }

      return dyz.a;
   }

   private static boolean c(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      dxq $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dxq $$0) {
      return $$0.b() instanceof dse;
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      jn $$2 = $$0.c(b);
      dyz $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jn.a.c) {
               switch ($$3) {
                  case d:
                     return $$0.a(dqw.c).b(d, dyz.e);
                  case c:
                     return $$0.a(dqw.c).b(d, dyz.b);
                  case b:
                     return $$0.a(dqw.c).b(d, dyz.c);
                  case e:
                     return $$0.a(dqw.c).b(d, dyz.d);
                  default:
                     return $$0.a(dqw.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jn.a.a) {
               switch ($$3) {
                  case a:
                     return $$0.a(dqw.c);
                  case d:
                     return $$0.a(dqw.c).b(d, dyz.e);
                  case c:
                     return $$0.a(dqw.c).b(d, dyz.c);
                  case b:
                     return $$0.a(dqw.c).b(d, dyz.b);
                  case e:
                     return $$0.a(dqw.c).b(d, dyz.d);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(e) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
