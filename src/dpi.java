import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpi extends dhv {
   public static final MapCodec<dpi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cvc.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), t())
            .apply($$0, ($$0x, $$1) -> new dpi((cvc)$$0x.orElse(null), $$1))
   );
   private static final xl d = xl.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final fal f = dij.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fal g = dij.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fal h = dij.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fal i = dij.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fal j = dij.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fal k = dij.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fal> l = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, j);
      $$0.put(jm.f, i);
      $$0.put(jm.d, k);
      $$0.put(jm.e, h);
      $$0.put(jm.b, f);
      $$0.put(jm.a, g);
   });
   public static final dwl<jm> b = dkm.a;
   public static final all c = all.b("contents");
   @Nullable
   private final cvc m;

   @Override
   public MapCodec<dpi> a() {
      return a;
   }

   public dpi(@Nullable cvc $$0, dvn.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jm.b));
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new duc(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return a($$2, dst.x, duc::a);
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.b;
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof duc $$5 && a($$0, $$1, $$2, $$5)) {
         $$3.a($$5);
         $$3.a(awy.aq);
         cng.a($$3, true);
      }

      return bsh.a;
   }

   private static boolean a(dvo $$0, dff $$1, jh $$2, duc $$3) {
      if ($$3.k() != duc.a.a) {
         return true;
      } else {
         ezm $$4 = cmb.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(b, $$0.k());
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   public dvo a(dff $$0, jh $$1, dvo $$2, cor $$3) {
      dsr $$4 = $$0.c_($$1);
      if ($$4 instanceof duc $$5) {
         if (!$$0.C && $$3.f() && !$$5.c()) {
            cwf $$6 = b(this.b());
            $$6.b($$4.r());
            ckz $$7 = new ckz($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.q();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwf> a(dvo $$0, euj.a $$1) {
      dsr $$2 = $$1.b(exc.h);
      if ($$2 instanceof duc $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsr $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof duc) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(ku.ap)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cwf $$6 : $$0.a(ku.al, cyx.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xl.a("container.shulkerBox.itemCount", $$6.y(), $$6.L()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xl.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected fal b_(dvo $$0, dek $$1, jh $$2) {
      if ($$1.c_($$2) instanceof duc $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return fai.b();
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      dsr $$4 = $$1.c_($$2);
      return $$4 instanceof duc ? fai.a(((duc)$$4).a($$0)) : fai.b();
   }

   @Override
   protected boolean e_(dvo $$0) {
      return false;
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return crs.a($$1.c_($$2));
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      cwf $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dst.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static cvc b(cwb $$0) {
      return a(dij.a($$0));
   }

   @Nullable
   public static cvc a(dij $$0) {
      return $$0 instanceof dpi ? ((dpi)$$0).b() : null;
   }

   public static dij a(@Nullable cvc $$0) {
      if ($$0 == null) {
         return dil.kP;
      } else {
         return switch ($$0) {
            case a -> dil.kQ;
            case b -> dil.kR;
            case c -> dil.kS;
            case d -> dil.kT;
            case e -> dil.kU;
            case f -> dil.kV;
            case g -> dil.kW;
            case h -> dil.kX;
            case i -> dil.kY;
            case j -> dil.kZ;
            case l -> dil.lb;
            case m -> dil.lc;
            case n -> dil.ld;
            case o -> dil.le;
            case p -> dil.lf;
            case k -> dil.la;
         };
      }
   }

   @Nullable
   public cvc b() {
      return this.m;
   }

   public static cwf b(@Nullable cvc $$0) {
      return new cwf(a($$0));
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
