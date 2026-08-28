import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmg extends det {
   public static final MapCodec<dmg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(csv.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dmg((csv)$$0x.orElse(null), $$1))
   );
   private static final wu d = wu.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final ewy f = dfh.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewy g = dfh.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ewy h = dfh.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewy i = dfh.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewy j = dfh.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewy k = dfh.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jf, ewy> l = ac.a(Maps.newEnumMap(jf.class), $$0 -> {
      $$0.put(jf.c, j);
      $$0.put(jf.f, i);
      $$0.put(jf.d, k);
      $$0.put(jf.e, h);
      $$0.put(jf.b, f);
      $$0.put(jf.a, g);
   });
   public static final dti<jf> b = dhk.a;
   public static final akk c = new akk("contents");
   @Nullable
   private final csv m;

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   public dmg(@Nullable csv $$0, dsj.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, jf.b));
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqz(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return a($$2, dpr.x, dqz::a);
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.b;
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else if ($$3.N_()) {
         return bqg.c;
      } else if ($$1.c_($$2) instanceof dqz $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(avr.aq);
            clb.a($$3, true);
         }

         return bqg.c;
      } else {
         return bqg.e;
      }
   }

   private static boolean a(dsk $$0, dcf $$1, ja $$2, dqz $$3) {
      if ($$3.l() != dqz.a.a) {
         return true;
      } else {
         ewa $$4 = cjw.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Override
   public dsk a(dcf $$0, ja $$1, dsk $$2, cmk $$3) {
      dpp $$4 = $$0.c_($$1);
      if ($$4 instanceof dqz $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cuc $$6 = b(this.b());
            $$6.b($$4.s());
            ciu $$7 = new ciu($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuc> a(dsk $$0, eqx.a $$1) {
      dpp $$2 = $$1.b(etq.h);
      if ($$2 instanceof dqz $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpp $$5 = $$1.c_($$2);
         if ($$5 instanceof dqz) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kn.ae)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cuc $$6 : $$0.a(kn.aa, cwx.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(wu.a("container.shulkerBox.itemCount", $$6.w(), $$6.H()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(wu.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected ewy b_(dsk $$0, dbl $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dqz $$4 && !$$4.v()) {
         return l.get($$0.c(b).g());
      }

      return ewv.b();
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      dpp $$4 = $$1.c_($$2);
      return $$4 instanceof dqz ? ewv.a(((dqz)$$4).a($$0)) : ewv.b();
   }

   @Override
   protected boolean a_(dsk $$0, dbl $$1, ja $$2) {
      return false;
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return cph.a($$1.c_($$2));
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      cuc $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dpr.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static csv b(ctx $$0) {
      return a(dfh.a($$0));
   }

   @Nullable
   public static csv a(dfh $$0) {
      return $$0 instanceof dmg ? ((dmg)$$0).b() : null;
   }

   public static dfh a(@Nullable csv $$0) {
      if ($$0 == null) {
         return dfj.kP;
      } else {
         return switch ($$0) {
            case a -> dfj.kQ;
            case b -> dfj.kR;
            case c -> dfj.kS;
            case d -> dfj.kT;
            case e -> dfj.kU;
            case f -> dfj.kV;
            case g -> dfj.kW;
            case h -> dfj.kX;
            case i -> dfj.kY;
            case j -> dfj.kZ;
            case l -> dfj.lb;
            case m -> dfj.lc;
            case n -> dfj.ld;
            case o -> dfj.le;
            case p -> dfj.lf;
            case k -> dfj.la;
         };
      }
   }

   @Nullable
   public csv b() {
      return this.m;
   }

   public static cuc b(@Nullable csv $$0) {
      return new cuc(a($$0));
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
