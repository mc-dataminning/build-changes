import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dox extends dhk {
   public static final MapCodec<dox> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cuu.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), t())
            .apply($$0, ($$0x, $$1) -> new dox((cuu)$$0x.orElse(null), $$1))
   );
   private static final xh d = xh.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final fab f = dhy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fab g = dhy.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fab h = dhy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fab i = dhy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fab j = dhy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fab k = dhy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jl, fab> l = ad.a(Maps.newEnumMap(jl.class), $$0 -> {
      $$0.put(jl.c, j);
      $$0.put(jl.f, i);
      $$0.put(jl.d, k);
      $$0.put(jl.e, h);
      $$0.put(jl.b, f);
      $$0.put(jl.a, g);
   });
   public static final dwb<jl> b = dkb.a;
   public static final alh c = alh.b("contents");
   @Nullable
   private final cuu m;

   @Override
   public MapCodec<dox> a() {
      return a;
   }

   public dox(@Nullable cuu $$0, dvc.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jl.b));
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtr(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return a($$2, dsi.x, dtr::a);
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.b;
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dtr $$5 && a($$0, $$1, $$2, $$5)) {
         $$3.a($$5);
         $$3.a(awu.aq);
         cmx.a($$3, true);
      }

      return bry.a;
   }

   private static boolean a(dvd $$0, dev $$1, jg $$2, dtr $$3) {
      if ($$3.k() != dtr.a.a) {
         return true;
      } else {
         ezc $$4 = cls.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(b, $$0.k());
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   public dvd a(dev $$0, jg $$1, dvd $$2, coh $$3) {
      dsg $$4 = $$0.c_($$1);
      if ($$4 instanceof dtr $$5) {
         if (!$$0.C && $$3.f() && !$$5.c()) {
            cvx $$6 = b(this.b());
            $$6.b($$4.r());
            ckq $$7 = new ckq($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.q();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cvx> a(dvd $$0, etz.a $$1) {
      dsg $$2 = $$1.b(ews.h);
      if ($$2 instanceof dtr $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsg $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof dtr) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kt.ao)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cvx $$6 : $$0.a(kt.ak, cyn.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xh.a("container.shulkerBox.itemCount", $$6.y(), $$6.L()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xh.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected fab b_(dvd $$0, dea $$1, jg $$2) {
      if ($$1.c_($$2) instanceof dtr $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return ezy.b();
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      dsg $$4 = $$1.c_($$2);
      return $$4 instanceof dtr ? ezy.a(((dtr)$$4).a($$0)) : ezy.b();
   }

   @Override
   protected boolean e_(dvd $$0) {
      return false;
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return crj.a($$1.c_($$2));
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      cvx $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dsi.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static cuu b(cvt $$0) {
      return a(dhy.a($$0));
   }

   @Nullable
   public static cuu a(dhy $$0) {
      return $$0 instanceof dox ? ((dox)$$0).b() : null;
   }

   public static dhy a(@Nullable cuu $$0) {
      if ($$0 == null) {
         return dia.kP;
      } else {
         return switch ($$0) {
            case a -> dia.kQ;
            case b -> dia.kR;
            case c -> dia.kS;
            case d -> dia.kT;
            case e -> dia.kU;
            case f -> dia.kV;
            case g -> dia.kW;
            case h -> dia.kX;
            case i -> dia.kY;
            case j -> dia.kZ;
            case l -> dia.lb;
            case m -> dia.lc;
            case n -> dia.ld;
            case o -> dia.le;
            case p -> dia.lf;
            case k -> dia.la;
         };
      }
   }

   @Nullable
   public cuu b() {
      return this.m;
   }

   public static cvx b(@Nullable cuu $$0) {
      return new cvx(a($$0));
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
