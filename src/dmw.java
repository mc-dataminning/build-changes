import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmw extends dfi {
   public static final MapCodec<dmw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ctg.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dmw((ctg)$$0x.orElse(null), $$1))
   );
   private static final wy d = wy.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final exp f = dfw.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final exp g = dfw.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final exp h = dfw.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final exp i = dfw.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final exp j = dfw.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final exp k = dfw.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ji, exp> l = ad.a(Maps.newEnumMap(ji.class), $$0 -> {
      $$0.put(ji.c, j);
      $$0.put(ji.f, i);
      $$0.put(ji.d, k);
      $$0.put(ji.e, h);
      $$0.put(ji.b, f);
      $$0.put(ji.a, g);
   });
   public static final dty<ji> b = dhz.a;
   public static final akq c = akq.b("contents");
   @Nullable
   private final ctg m;

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   public dmw(@Nullable ctg $$0, dsz.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, ji.b));
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drp(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return a($$2, dqh.x, drp::a);
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.b;
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else if ($$3.N_()) {
         return bqq.c;
      } else if ($$1.c_($$2) instanceof drp $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(avy.aq);
            clm.a($$3, true);
         }

         return bqq.c;
      } else {
         return bqq.e;
      }
   }

   private static boolean a(dta $$0, dcu $$1, jd $$2, drp $$3) {
      if ($$3.l() != drp.a.a) {
         return true;
      } else {
         ewr $$4 = ckh.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   public dta a(dcu $$0, jd $$1, dta $$2, cmv $$3) {
      dqf $$4 = $$0.c_($$1);
      if ($$4 instanceof drp $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cuo $$6 = b(this.b());
            $$6.b($$4.s());
            cjf $$7 = new cjf($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuo> a(dta $$0, ero.a $$1) {
      dqf $$2 = $$1.b(euh.h);
      if ($$2 instanceof drp $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dqf $$5 = $$1.c_($$2);
         if ($$5 instanceof drp) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kq.af)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cuo $$6 : $$0.a(kq.ab, cxm.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(wy.a("container.shulkerBox.itemCount", $$6.w(), $$6.H()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(wy.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected exp b_(dta $$0, dca $$1, jd $$2) {
      if ($$1.c_($$2) instanceof drp $$4 && !$$4.v()) {
         return l.get($$0.c(b).g());
      }

      return exm.b();
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      dqf $$4 = $$1.c_($$2);
      return $$4 instanceof drp ? exm.a(((drp)$$4).a($$0)) : exm.b();
   }

   @Override
   protected boolean a_(dta $$0, dca $$1, jd $$2) {
      return false;
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return cps.a($$1.c_($$2));
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      cuo $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dqh.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static ctg b(cuj $$0) {
      return a(dfw.a($$0));
   }

   @Nullable
   public static ctg a(dfw $$0) {
      return $$0 instanceof dmw ? ((dmw)$$0).b() : null;
   }

   public static dfw a(@Nullable ctg $$0) {
      if ($$0 == null) {
         return dfy.kP;
      } else {
         return switch ($$0) {
            case a -> dfy.kQ;
            case b -> dfy.kR;
            case c -> dfy.kS;
            case d -> dfy.kT;
            case e -> dfy.kU;
            case f -> dfy.kV;
            case g -> dfy.kW;
            case h -> dfy.kX;
            case i -> dfy.kY;
            case j -> dfy.kZ;
            case l -> dfy.lb;
            case m -> dfy.lc;
            case n -> dfy.ld;
            case o -> dfy.le;
            case p -> dfy.lf;
            case k -> dfy.la;
         };
      }
   }

   @Nullable
   public ctg b() {
      return this.m;
   }

   public static cuo b(@Nullable ctg $$0) {
      return new cuo(a($$0));
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
