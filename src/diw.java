import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class diw extends dbk {
   public static final MapCodec<diw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cqc.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new diw((cqc)$$0x.orElse(null), $$1))
   );
   private static final wg d = wg.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final est f = dby.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final est g = dby.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final est h = dby.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final est i = dby.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final est j = dby.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final est k = dby.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ih, est> l = ac.a(Maps.newEnumMap(ih.class), $$0 -> {
      $$0.put(ih.c, j);
      $$0.put(ih.f, i);
      $$0.put(ih.d, k);
      $$0.put(ih.e, h);
      $$0.put(ih.b, f);
      $$0.put(ih.a, g);
   });
   public static final dpx<ih> b = deb.a;
   public static final ajt c = new ajt("contents");
   @Nullable
   private final cqc m;

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   public diw(@Nullable cqc $$0, doy.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, ih.b));
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dno(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return a($$2, dmh.x, dno::a);
   }

   @Override
   protected did b_(doz $$0) {
      return did.b;
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else if ($$3.N_()) {
         return boa.b;
      } else if ($$1.c_($$2) instanceof dno $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(auw.aq);
            cik.a($$3, true);
         }

         return boa.b;
      } else {
         return boa.d;
      }
   }

   private static boolean a(doz $$0, cyx $$1, ib $$2, dno $$3) {
      if ($$3.l() != dno.a.a) {
         return true;
      } else {
         erv $$4 = chf.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(b, $$0.k());
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   public doz a(cyx $$0, ib $$1, doz $$2, cjt $$3) {
      dmf $$4 = $$0.c_($$1);
      if ($$4 instanceof dno $$5) {
         if (!$$0.B && $$3.f() && !$$5.ah_()) {
            crj $$6 = b(this.b());
            $$6.a($$4.s());
            cgd $$7 = new cgd($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<crj> a(doz $$0, enh.a $$1) {
      dmf $$2 = $$1.b(epo.h);
      if ($$2 instanceof dno $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dmf $$5 = $$1.c_($$2);
         if ($$5 instanceof dno) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(crj $$0, @Nullable cyd $$1, List<wg> $$2, csz $$3, @Nullable iz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.b(jp.U)) {
         $$2.add(d);
      }

      int $$5 = 0;
      int $$6 = 0;

      for (crj $$7 : $$0.a(jp.Q, cua.a)) {
         $$6++;
         if ($$5 <= 4) {
            $$5++;
            $$2.add(wg.a("container.shulkerBox.itemCount", $$7.w(), $$7.G()));
         }
      }

      if ($$6 - $$5 > 0) {
         $$2.add(wg.a("container.shulkerBox.more", $$6 - $$5).a(n.u));
      }
   }

   @Override
   protected est b_(doz $$0, cyd $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dno $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return esq.b();
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      dmf $$4 = $$1.c_($$2);
      return $$4 instanceof dno ? esq.a(((dno)$$4).a($$0)) : esq.b();
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return cmp.a($$1.c_($$2));
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      crj $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dmh.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static cqc b(cre $$0) {
      return a(dby.a($$0));
   }

   @Nullable
   public static cqc a(dby $$0) {
      return $$0 instanceof diw ? ((diw)$$0).b() : null;
   }

   public static dby a(@Nullable cqc $$0) {
      if ($$0 == null) {
         return dca.kP;
      } else {
         return switch ($$0) {
            case a -> dca.kQ;
            case b -> dca.kR;
            case c -> dca.kS;
            case d -> dca.kT;
            case e -> dca.kU;
            case f -> dca.kV;
            case g -> dca.kW;
            case h -> dca.kX;
            case i -> dca.kY;
            case j -> dca.kZ;
            case l -> dca.lb;
            case m -> dca.lc;
            case n -> dca.ld;
            case o -> dca.le;
            case p -> dca.lf;
            case k -> dca.la;
         };
      }
   }

   @Nullable
   public cqc b() {
      return this.m;
   }

   public static crj b(@Nullable cqc $$0) {
      return new crj(a($$0));
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
