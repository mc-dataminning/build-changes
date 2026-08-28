import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlt extends deg {
   public static final MapCodec<dlt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ctd.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dlt((ctd)$$0x.orElse(null), $$1))
   );
   private static final xl d = xl.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final ewf f = deu.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewf g = deu.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ewf h = deu.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewf i = deu.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewf j = deu.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewf k = deu.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<je, ewf> l = ac.a(Maps.newEnumMap(je.class), $$0 -> {
      $$0.put(je.c, j);
      $$0.put(je.f, i);
      $$0.put(je.d, k);
      $$0.put(je.e, h);
      $$0.put(je.b, f);
      $$0.put(je.a, g);
   });
   public static final dsv<je> b = dgx.a;
   public static final alb c = new alb("contents");
   @Nullable
   private final ctd m;

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(@Nullable ctd $$0, drw.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, je.b));
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dql(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return a($$2, dpe.x, dql::a);
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.b;
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else if ($$3.N_()) {
         return bqp.c;
      } else if ($$1.c_($$2) instanceof dql $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(awg.aq);
            clj.a($$3, true);
         }

         return bqp.c;
      } else {
         return bqp.e;
      }
   }

   private static boolean a(drx $$0, dbt $$1, iz $$2, dql $$3) {
      if ($$3.l() != dql.a.a) {
         return true;
      } else {
         evh $$4 = cke.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(b, $$0.k());
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Override
   public drx a(dbt $$0, iz $$1, drx $$2, cms $$3) {
      dpc $$4 = $$0.c_($$1);
      if ($$4 instanceof dql $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cuk $$6 = b(this.b());
            $$6.b($$4.s());
            cjc $$7 = new cjc($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuk> a(drx $$0, eqg.a $$1) {
      dpc $$2 = $$1.b(esz.h);
      if ($$2 instanceof dql $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpc $$5 = $$1.c_($$2);
         if ($$5 instanceof dql) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(km.ad)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cuk $$6 : $$0.a(km.Z, cxg.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xl.a("container.shulkerBox.itemCount", $$6.x(), $$6.I()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xl.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected ewf b_(drx $$0, daz $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dql $$4 && !$$4.v()) {
         return l.get($$0.c(b).g());
      }

      return ewc.b();
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      dpc $$4 = $$1.c_($$2);
      return $$4 instanceof dql ? ewc.a(((dql)$$4).a($$0)) : ewc.b();
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return cpp.a($$1.c_($$2));
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      cuk $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dpe.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static ctd b(cuf $$0) {
      return a(deu.a($$0));
   }

   @Nullable
   public static ctd a(deu $$0) {
      return $$0 instanceof dlt ? ((dlt)$$0).b() : null;
   }

   public static deu a(@Nullable ctd $$0) {
      if ($$0 == null) {
         return dew.kP;
      } else {
         return switch ($$0) {
            case a -> dew.kQ;
            case b -> dew.kR;
            case c -> dew.kS;
            case d -> dew.kT;
            case e -> dew.kU;
            case f -> dew.kV;
            case g -> dew.kW;
            case h -> dew.kX;
            case i -> dew.kY;
            case j -> dew.kZ;
            case l -> dew.lb;
            case m -> dew.lc;
            case n -> dew.ld;
            case o -> dew.le;
            case p -> dew.lf;
            case k -> dew.la;
         };
      }
   }

   @Nullable
   public ctd b() {
      return this.m;
   }

   public static cuk b(@Nullable ctd $$0) {
      return new cuk(a($$0));
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
