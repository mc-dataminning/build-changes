import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dro extends djy {
   public static final MapCodec<dro> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cwm.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), t())
            .apply($$0, ($$0x, $$1) -> new dro((cwm)$$0x.orElse(null), $$1))
   );
   private static final xv d = xv.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final fcs f = dkm.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcs g = dkm.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fcs h = dkm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcs i = dkm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcs j = dkm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcs k = dkm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fcs> l = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, j);
      $$0.put(jm.f, i);
      $$0.put(jm.d, k);
      $$0.put(jm.e, h);
      $$0.put(jm.b, f);
      $$0.put(jm.a, g);
   });
   public static final dys<jm> b = dmr.a;
   public static final alz c = alz.b("contents");
   @Nullable
   private final cwm m;

   @Override
   public MapCodec<dro> a() {
      return a;
   }

   public dro(@Nullable cwm $$0, dxu.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jm.b));
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwj(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return a($$2, duz.y, dwj::a);
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.b;
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if ($$1 instanceof ash $$5 && $$1.c_($$2) instanceof dwj $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(axp.aq);
         com.a($$5, $$3, true);
      }

      return btj.a;
   }

   private static boolean a(dxv $$0, dhi $$1, jh $$2, dwj $$3) {
      if ($$3.k() != dwj.a.a) {
         return true;
      } else {
         fbt $$4 = cnd.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(b, $$0.k());
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   public dxv a(dhi $$0, jh $$1, dxv $$2, cpx $$3) {
      dux $$4 = $$0.c_($$1);
      if ($$4 instanceof dwj $$5) {
         if (!$$0.C && $$3.b() && !$$5.c()) {
            cxp $$6 = b(this.b());
            $$6.b($$4.r());
            cmb $$7 = new cmb($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.s();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cxp> a(dxv $$0, ews.a $$1) {
      dux $$2 = $$1.b(ezj.h);
      if ($$2 instanceof dwj $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dux $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof dwj) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(ku.ap)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cxp $$6 : $$0.a(ku.al, dah.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xv.a("container.shulkerBox.itemCount", $$6.y(), $$6.L()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xv.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected fcs b_(dxv $$0, dgn $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dwj $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return fcp.b();
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      dux $$4 = $$1.c_($$2);
      return $$4 instanceof dwj ? fcp.a(((dwj)$$4).a($$0)) : fcp.b();
   }

   @Override
   protected boolean e_(dxv $$0) {
      return false;
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return ctc.a($$1.c_($$2));
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      cxp $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, duz.y).ifPresent($$2x -> $$2x.a($$3, $$0.K_()));
      return $$3;
   }

   @Nullable
   public static cwm b(cxl $$0) {
      return a(dkm.a($$0));
   }

   @Nullable
   public static cwm a(dkm $$0) {
      return $$0 instanceof dro ? ((dro)$$0).b() : null;
   }

   public static dkm a(@Nullable cwm $$0) {
      if ($$0 == null) {
         return dko.lk;
      } else {
         return switch ($$0) {
            case a -> dko.ll;
            case b -> dko.lm;
            case c -> dko.ln;
            case d -> dko.lo;
            case e -> dko.lp;
            case f -> dko.lq;
            case g -> dko.lr;
            case h -> dko.ls;
            case i -> dko.lt;
            case j -> dko.lu;
            case l -> dko.lw;
            case m -> dko.lx;
            case n -> dko.ly;
            case o -> dko.lz;
            case p -> dko.lA;
            case k -> dko.lv;
         };
      }
   }

   @Nullable
   public cwm b() {
      return this.m;
   }

   public static cxp b(@Nullable cwm $$0) {
      return new cxp(a($$0));
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
