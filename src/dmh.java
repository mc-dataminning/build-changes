import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmh extends deu {
   public static final MapCodec<dmh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(csw.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dmh((csw)$$0x.orElse(null), $$1))
   );
   private static final wu d = wu.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final exa f = dfi.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final exa g = dfi.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final exa h = dfi.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final exa i = dfi.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final exa j = dfi.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final exa k = dfi.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jf, exa> l = ac.a(Maps.newEnumMap(jf.class), $$0 -> {
      $$0.put(jf.c, j);
      $$0.put(jf.f, i);
      $$0.put(jf.d, k);
      $$0.put(jf.e, h);
      $$0.put(jf.b, f);
      $$0.put(jf.a, g);
   });
   public static final dtj<jf> b = dhl.a;
   public static final akk c = new akk("contents");
   @Nullable
   private final csw m;

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   public dmh(@Nullable csw $$0, dsk.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, jf.b));
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dra(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return a($$2, dps.x, dra::a);
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.b;
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else if ($$3.N_()) {
         return bqh.c;
      } else if ($$1.c_($$2) instanceof dra $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(avr.aq);
            clc.a($$3, true);
         }

         return bqh.c;
      } else {
         return bqh.e;
      }
   }

   private static boolean a(dsl $$0, dcg $$1, ja $$2, dra $$3) {
      if ($$3.l() != dra.a.a) {
         return true;
      } else {
         ewc $$4 = cjx.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   @Override
   public dsl a(dcg $$0, ja $$1, dsl $$2, cml $$3) {
      dpq $$4 = $$0.c_($$1);
      if ($$4 instanceof dra $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cud $$6 = b(this.b());
            $$6.b($$4.s());
            civ $$7 = new civ($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cud> a(dsl $$0, eqz.a $$1) {
      dpq $$2 = $$1.b(ets.h);
      if ($$2 instanceof dra $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpq $$5 = $$1.c_($$2);
         if ($$5 instanceof dra) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kn.ae)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cud $$6 : $$0.a(kn.aa, cwy.a).d()) {
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
   protected exa b_(dsl $$0, dbm $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dra $$4 && !$$4.v()) {
         return l.get($$0.c(b).g());
      }

      return ewx.b();
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      dpq $$4 = $$1.c_($$2);
      return $$4 instanceof dra ? ewx.a(((dra)$$4).a($$0)) : ewx.b();
   }

   @Override
   protected boolean a_(dsl $$0, dbm $$1, ja $$2) {
      return false;
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return cpi.a($$1.c_($$2));
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      cud $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dps.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static csw b(cty $$0) {
      return a(dfi.a($$0));
   }

   @Nullable
   public static csw a(dfi $$0) {
      return $$0 instanceof dmh ? ((dmh)$$0).b() : null;
   }

   public static dfi a(@Nullable csw $$0) {
      if ($$0 == null) {
         return dfk.kP;
      } else {
         return switch ($$0) {
            case a -> dfk.kQ;
            case b -> dfk.kR;
            case c -> dfk.kS;
            case d -> dfk.kT;
            case e -> dfk.kU;
            case f -> dfk.kV;
            case g -> dfk.kW;
            case h -> dfk.kX;
            case i -> dfk.kY;
            case j -> dfk.kZ;
            case l -> dfk.lb;
            case m -> dfk.lc;
            case n -> dfk.ld;
            case o -> dfk.le;
            case p -> dfk.lf;
            case k -> dfk.la;
         };
      }
   }

   @Nullable
   public csw b() {
      return this.m;
   }

   public static cud b(@Nullable csw $$0) {
      return new cud(a($$0));
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
