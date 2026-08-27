import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkd extends dcq {
   public static final MapCodec<dkd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(crs.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dkd((crs)$$0x.orElse(null), $$1))
   );
   private static final wu d = wu.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final eui f = dde.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eui g = dde.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eui h = dde.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eui i = dde.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eui j = dde.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eui k = dde.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<is, eui> l = ac.a(Maps.newEnumMap(is.class), $$0 -> {
      $$0.put(is.c, j);
      $$0.put(is.f, i);
      $$0.put(is.d, k);
      $$0.put(is.e, h);
      $$0.put(is.b, f);
      $$0.put(is.a, g);
   });
   public static final drf<is> b = dfh.a;
   public static final akh c = new akh("contents");
   @Nullable
   private final crs m;

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   public dkd(@Nullable crs $$0, dqg.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, is.b));
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dov(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return a($$2, dno.x, dov::a);
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.b;
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else if ($$3.N_()) {
         return bpm.b;
      } else if ($$1.c_($$2) instanceof dov $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(avm.aq);
            cjy.a($$3, true);
         }

         return bpm.b;
      } else {
         return bpm.d;
      }
   }

   private static boolean a(dqh $$0, dad $$1, in $$2, dov $$3) {
      if ($$3.l() != dov.a.a) {
         return true;
      } else {
         etk $$4 = cit.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(b, $$0.k());
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   public dqh a(dad $$0, in $$1, dqh $$2, clh $$3) {
      dnm $$4 = $$0.c_($$1);
      if ($$4 instanceof dov $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            csz $$6 = b(this.b());
            $$6.a($$4.s());
            chr $$7 = new chr($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<csz> a(dqh $$0, eoo.a $$1) {
      dnm $$2 = $$1.b(erc.h);
      if ($$2 instanceof dov $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dnm $$5 = $$1.c_($$2);
         if ($$5 instanceof dov) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(csz $$0, @Nullable czj $$1, List<wu> $$2, cuq $$3, @Nullable jk $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.b(ka.ab)) {
         $$2.add(d);
      }

      int $$5 = 0;
      int $$6 = 0;

      for (csz $$7 : $$0.a(ka.X, cvt.a)) {
         $$6++;
         if ($$5 <= 4) {
            $$5++;
            $$2.add(wu.a("container.shulkerBox.itemCount", $$7.w(), $$7.G()));
         }
      }

      if ($$6 - $$5 > 0) {
         $$2.add(wu.a("container.shulkerBox.more", $$6 - $$5).a(n.u));
      }
   }

   @Override
   protected eui b_(dqh $$0, czj $$1, in $$2) {
      if ($$1.c_($$2) instanceof dov $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return euf.b();
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      dnm $$4 = $$1.c_($$2);
      return $$4 instanceof dov ? euf.a(((dov)$$4).a($$0)) : euf.b();
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return cod.a($$1.c_($$2));
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      csz $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dno.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static crs b(csu $$0) {
      return a(dde.a($$0));
   }

   @Nullable
   public static crs a(dde $$0) {
      return $$0 instanceof dkd ? ((dkd)$$0).b() : null;
   }

   public static dde a(@Nullable crs $$0) {
      if ($$0 == null) {
         return ddg.kP;
      } else {
         return switch ($$0) {
            case a -> ddg.kQ;
            case b -> ddg.kR;
            case c -> ddg.kS;
            case d -> ddg.kT;
            case e -> ddg.kU;
            case f -> ddg.kV;
            case g -> ddg.kW;
            case h -> ddg.kX;
            case i -> ddg.kY;
            case j -> ddg.kZ;
            case l -> ddg.lb;
            case m -> ddg.lc;
            case n -> ddg.ld;
            case o -> ddg.le;
            case p -> ddg.lf;
            case k -> ddg.la;
         };
      }
   }

   @Nullable
   public crs b() {
      return this.m;
   }

   public static csz b(@Nullable crs $$0) {
      return new csz(a($$0));
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
