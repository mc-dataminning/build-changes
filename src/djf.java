import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class djf extends dbt {
   public static final MapCodec<djf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cql.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new djf((cql)$$0x.orElse(null), $$1))
   );
   private static final wi d = wi.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final etc f = dch.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final etc g = dch.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final etc h = dch.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final etc i = dch.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final etc j = dch.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final etc k = dch.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ij, etc> l = ac.a(Maps.newEnumMap(ij.class), $$0 -> {
      $$0.put(ij.c, j);
      $$0.put(ij.f, i);
      $$0.put(ij.d, k);
      $$0.put(ij.e, h);
      $$0.put(ij.b, f);
      $$0.put(ij.a, g);
   });
   public static final dqg<ij> b = dek.a;
   public static final ajv c = new ajv("contents");
   @Nullable
   private final cql m;

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   public djf(@Nullable cql $$0, dph.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, ij.b));
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dnx(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return a($$2, dmq.x, dnx::a);
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.b;
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else if ($$3.N_()) {
         return bof.b;
      } else if ($$1.c_($$2) instanceof dnx $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(auz.aq);
            cir.a($$3, true);
         }

         return bof.b;
      } else {
         return bof.d;
      }
   }

   private static boolean a(dpi $$0, czg $$1, id $$2, dnx $$3) {
      if ($$3.l() != dnx.a.a) {
         return true;
      } else {
         ese $$4 = chm.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(b, $$0.k());
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   public dpi a(czg $$0, id $$1, dpi $$2, cka $$3) {
      dmo $$4 = $$0.c_($$1);
      if ($$4 instanceof dnx $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            crs $$6 = b(this.b());
            $$6.a($$4.s());
            cgk $$7 = new cgk($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<crs> a(dpi $$0, enq.a $$1) {
      dmo $$2 = $$1.b(epx.h);
      if ($$2 instanceof dnx $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dmo $$5 = $$1.c_($$2);
         if ($$5 instanceof dnx) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(crs $$0, @Nullable cym $$1, List<wi> $$2, cti $$3, @Nullable jb $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.b(jr.U)) {
         $$2.add(d);
      }

      int $$5 = 0;
      int $$6 = 0;

      for (crs $$7 : $$0.a(jr.Q, cuj.a)) {
         $$6++;
         if ($$5 <= 4) {
            $$5++;
            $$2.add(wi.a("container.shulkerBox.itemCount", $$7.w(), $$7.G()));
         }
      }

      if ($$6 - $$5 > 0) {
         $$2.add(wi.a("container.shulkerBox.more", $$6 - $$5).a(n.u));
      }
   }

   @Override
   protected etc b_(dpi $$0, cym $$1, id $$2) {
      if ($$1.c_($$2) instanceof dnx $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return esz.b();
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      dmo $$4 = $$1.c_($$2);
      return $$4 instanceof dnx ? esz.a(((dnx)$$4).a($$0)) : esz.b();
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return cmw.a($$1.c_($$2));
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      crs $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dmq.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static cql b(crn $$0) {
      return a(dch.a($$0));
   }

   @Nullable
   public static cql a(dch $$0) {
      return $$0 instanceof djf ? ((djf)$$0).b() : null;
   }

   public static dch a(@Nullable cql $$0) {
      if ($$0 == null) {
         return dcj.kP;
      } else {
         return switch ($$0) {
            case a -> dcj.kQ;
            case b -> dcj.kR;
            case c -> dcj.kS;
            case d -> dcj.kT;
            case e -> dcj.kU;
            case f -> dcj.kV;
            case g -> dcj.kW;
            case h -> dcj.kX;
            case i -> dcj.kY;
            case j -> dcj.kZ;
            case l -> dcj.lb;
            case m -> dcj.lc;
            case n -> dcj.ld;
            case o -> dcj.le;
            case p -> dcj.lf;
            case k -> dcj.la;
         };
      }
   }

   @Nullable
   public cql b() {
      return this.m;
   }

   public static crs b(@Nullable cql $$0) {
      return new crs(a($$0));
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
