import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkx extends ddk {
   public static final MapCodec<dkx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(csh.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dkx((csh)$$0x.orElse(null), $$1))
   );
   private static final wx d = wx.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final evd f = ddy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final evd g = ddy.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final evd h = ddy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final evd i = ddy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final evd j = ddy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final evd k = ddy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<it, evd> l = ac.a(Maps.newEnumMap(it.class), $$0 -> {
      $$0.put(it.c, j);
      $$0.put(it.f, i);
      $$0.put(it.d, k);
      $$0.put(it.e, h);
      $$0.put(it.b, f);
      $$0.put(it.a, g);
   });
   public static final drz<it> b = dgb.a;
   public static final akm c = new akm("contents");
   @Nullable
   private final csh m;

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(@Nullable csh $$0, dra.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, it.b));
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpp(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return a($$2, doi.x, dpp::a);
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.b;
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else if ($$3.N_()) {
         return bpu.b;
      } else if ($$1.c_($$2) instanceof dpp $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(avr.aq);
            ckn.a($$3, true);
         }

         return bpu.b;
      } else {
         return bpu.d;
      }
   }

   private static boolean a(drb $$0, dax $$1, io $$2, dpp $$3) {
      if ($$3.l() != dpp.a.a) {
         return true;
      } else {
         euf $$4 = cji.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(b, $$0.k());
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   public drb a(dax $$0, io $$1, drb $$2, clw $$3) {
      dog $$4 = $$0.c_($$1);
      if ($$4 instanceof dpp $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cto $$6 = b(this.b());
            $$6.a($$4.s());
            cig $$7 = new cig($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cto> a(drb $$0, epi.a $$1) {
      dog $$2 = $$1.b(erx.h);
      if ($$2 instanceof dpp $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dog $$5 = $$1.c_($$2);
         if ($$5 instanceof dpp) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cto $$0, @Nullable dad $$1, List<wx> $$2, cvh $$3, @Nullable jl $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.b(kb.ad)) {
         $$2.add(d);
      }

      int $$5 = 0;
      int $$6 = 0;

      for (cto $$7 : $$0.a(kb.Z, cwk.a)) {
         $$6++;
         if ($$5 <= 4) {
            $$5++;
            $$2.add(wx.a("container.shulkerBox.itemCount", $$7.x(), $$7.I()));
         }
      }

      if ($$6 - $$5 > 0) {
         $$2.add(wx.a("container.shulkerBox.more", $$6 - $$5).a(n.u));
      }
   }

   @Override
   protected evd b_(drb $$0, dad $$1, io $$2) {
      if ($$1.c_($$2) instanceof dpp $$4 && !$$4.v()) {
         return l.get($$0.c(b).g());
      }

      return eva.b();
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      dog $$4 = $$1.c_($$2);
      return $$4 instanceof dpp ? eva.a(((dpp)$$4).a($$0)) : eva.b();
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return cot.a($$1.c_($$2));
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      cto $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, doi.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static csh b(ctj $$0) {
      return a(ddy.a($$0));
   }

   @Nullable
   public static csh a(ddy $$0) {
      return $$0 instanceof dkx ? ((dkx)$$0).b() : null;
   }

   public static ddy a(@Nullable csh $$0) {
      if ($$0 == null) {
         return dea.kP;
      } else {
         return switch ($$0) {
            case a -> dea.kQ;
            case b -> dea.kR;
            case c -> dea.kS;
            case d -> dea.kT;
            case e -> dea.kU;
            case f -> dea.kV;
            case g -> dea.kW;
            case h -> dea.kX;
            case i -> dea.kY;
            case j -> dea.kZ;
            case l -> dea.lb;
            case m -> dea.lc;
            case n -> dea.ld;
            case o -> dea.le;
            case p -> dea.lf;
            case k -> dea.la;
         };
      }
   }

   @Nullable
   public csh b() {
      return this.m;
   }

   public static cto b(@Nullable csh $$0) {
      return new cto(a($$0));
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
