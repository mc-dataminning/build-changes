import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dsu extends dku implements dsb {
   public static final MapCodec<dsu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dym.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dsu::new)
   );
   public static final dzk<jo> b = dot.e;
   public static final dzk<dzl> c = dzc.ai;
   public static final dzk<dzv> d = dzc.bl;
   public static final dzd e = dzc.I;
   private static final fdo g = fdl.a(dku.b(16.0, 0.0, 8.0), dku.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0));
   private static final fdo h = fdl.a(g, fdl.a(g, h.a(0, 90)));
   private static final fdo i = fdl.a(h, fdl.a(h, h.a(0, 90)));
   private static final Map<jo, fdo> C = fdl.c(g);
   private static final Map<jo, fdo> Q = fdl.c(h);
   private static final Map<jo, fdo> R = fdl.c(i);
   private static final Map<jo, fdo> S = fdl.c(fdl.a(g, h.A));
   private static final Map<jo, fdo> T = fdl.c(fdl.a(h, h.A));
   private static final Map<jo, fdo> U = fdl.c(fdl.a(i, h.A));
   private final dku V;
   protected final dym f;

   @Override
   public MapCodec<? extends dsu> a() {
      return a;
   }

   protected dsu(dym $$0, dyl.d $$1) {
      super($$1);
      this.l(this.B.b().b(b, jo.c).b(c, dzl.b).b(d, dzv.a).b(e, Boolean.valueOf(false)));
      this.V = $$0.b();
      this.f = $$0;
   }

   @Override
   protected boolean g_(dym $$0) {
      return true;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      boolean $$4 = $$0.c(c) == dzl.b;
      jo $$5 = $$0.c(b);

      Map var10000 = switch ((dzv)$$0.c(d)) {
         case a -> $$4 ? Q : T;
         case d, e -> $$4 ? C : S;
         case c, b -> $$4 ? R : U;
      };

      return (fdo)var10000.get(switch ((dzv)$$0.c(d)) {
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
   public dym a(dbn $$0) {
      jo $$1 = $$0.k();
      jj $$2 = $$0.a();
      eut $$3 = $$0.q().b_($$2);
      dym $$4 = this.m()
         .b(b, $$0.g())
         .b(c, $$1 != jo.a && ($$1 == jo.b || !($$0.l().e - (double)$$2.v() > 0.5)) ? dzl.b : dzl.a)
         .b(e, Boolean.valueOf($$3.a() == euu.c));
      return $$4.b(d, e($$4, $$0.q(), $$2));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(d, e($$0, $$1, $$3)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static dzv e(dym $$0, dgv $$1, jj $$2) {
      jo $$3 = $$0.c(b);
      dym $$4 = $$1.a_($$2.a($$3));
      if (o($$4) && $$0.c(c) == $$4.c(c)) {
         jo $$5 = $$4.c(b);
         if ($$5.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return dzv.d;
            }

            return dzv.e;
         }
      }

      dym $$6 = $$1.a_($$2.a($$3.g()));
      if (o($$6) && $$0.c(c) == $$6.c(c)) {
         jo $$7 = $$6.c(b);
         if ($$7.o() != $$0.c(b).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return dzv.b;
            }

            return dzv.c;
         }
      }

      return dzv.a;
   }

   private static boolean c(dym $$0, dgv $$1, jj $$2, jo $$3) {
      dym $$4 = $$1.a_($$2.a($$3));
      return !o($$4) || $$4.c(b) != $$0.c(b) || $$4.c(c) != $$0.c(c);
   }

   public static boolean o(dym $$0) {
      return $$0.b() instanceof dsu;
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      jo $$2 = $$0.c(b);
      dzv $$3 = $$0.c(d);
      switch ($$1) {
         case b:
            if ($$2.o() == jo.a.c) {
               switch ($$3) {
                  case d:
                     return $$0.a(drm.c).b(d, dzv.e);
                  case c:
                     return $$0.a(drm.c).b(d, dzv.b);
                  case b:
                     return $$0.a(drm.c).b(d, dzv.c);
                  case e:
                     return $$0.a(drm.c).b(d, dzv.d);
                  default:
                     return $$0.a(drm.c);
               }
            }
            break;
         case c:
            if ($$2.o() == jo.a.a) {
               switch ($$3) {
                  case a:
                     return $$0.a(drm.c);
                  case d:
                     return $$0.a(drm.c).b(d, dzv.e);
                  case c:
                     return $$0.a(drm.c).b(d, dzv.c);
                  case b:
                     return $$0.a(drm.c).b(d, dzv.b);
                  case e:
                     return $$0.a(drm.c).b(d, dzv.d);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(e) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
