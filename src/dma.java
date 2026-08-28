import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dma extends den {
   public static final MapCodec<dma> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ctk.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dma((ctk)$$0x.orElse(null), $$1))
   );
   private static final xp d = xp.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final ewm f = dfb.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewm g = dfb.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ewm h = dfb.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewm i = dfb.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewm j = dfb.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewm k = dfb.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<je, ewm> l = ac.a(Maps.newEnumMap(je.class), $$0 -> {
      $$0.put(je.c, j);
      $$0.put(je.f, i);
      $$0.put(je.d, k);
      $$0.put(je.e, h);
      $$0.put(je.b, f);
      $$0.put(je.a, g);
   });
   public static final dtc<je> b = dhe.a;
   public static final alf c = new alf("contents");
   @Nullable
   private final ctk m;

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   public dma(@Nullable ctk $$0, dsd.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, je.b));
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqs(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return a($$2, dpl.x, dqs::a);
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.b;
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else if ($$3.N_()) {
         return bqw.c;
      } else if ($$1.c_($$2) instanceof dqs $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(awk.aq);
            clq.a($$3, true);
         }

         return bqw.c;
      } else {
         return bqw.e;
      }
   }

   private static boolean a(dse $$0, dca $$1, iz $$2, dqs $$3) {
      if ($$3.l() != dqs.a.a) {
         return true;
      } else {
         evo $$4 = ckl.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   public dse a(dca $$0, iz $$1, dse $$2, cmz $$3) {
      dpj $$4 = $$0.c_($$1);
      if ($$4 instanceof dqs $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cur $$6 = b(this.b());
            $$6.b($$4.s());
            cjj $$7 = new cjj($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cur> a(dse $$0, eqn.a $$1) {
      dpj $$2 = $$1.b(etg.h);
      if ($$2 instanceof dqs $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpj $$5 = $$1.c_($$2);
         if ($$5 instanceof dqs) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(km.ae)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cur $$6 : $$0.a(km.aa, cxn.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xp.a("container.shulkerBox.itemCount", $$6.x(), $$6.I()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xp.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected ewm b_(dse $$0, dbg $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqs $$4 && !$$4.v()) {
         return l.get($$0.c(b).g());
      }

      return ewj.b();
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      dpj $$4 = $$1.c_($$2);
      return $$4 instanceof dqs ? ewj.a(((dqs)$$4).a($$0)) : ewj.b();
   }

   @Override
   protected boolean a_(dse $$0, dbg $$1, iz $$2) {
      return false;
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return cpw.a($$1.c_($$2));
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      cur $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dpl.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static ctk b(cum $$0) {
      return a(dfb.a($$0));
   }

   @Nullable
   public static ctk a(dfb $$0) {
      return $$0 instanceof dma ? ((dma)$$0).b() : null;
   }

   public static dfb a(@Nullable ctk $$0) {
      if ($$0 == null) {
         return dfd.kP;
      } else {
         return switch ($$0) {
            case a -> dfd.kQ;
            case b -> dfd.kR;
            case c -> dfd.kS;
            case d -> dfd.kT;
            case e -> dfd.kU;
            case f -> dfd.kV;
            case g -> dfd.kW;
            case h -> dfd.kX;
            case i -> dfd.kY;
            case j -> dfd.kZ;
            case l -> dfd.lb;
            case m -> dfd.lc;
            case n -> dfd.ld;
            case o -> dfd.le;
            case p -> dfd.lf;
            case k -> dfd.la;
         };
      }
   }

   @Nullable
   public ctk b() {
      return this.m;
   }

   public static cur b(@Nullable ctk $$0) {
      return new cur(a($$0));
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
