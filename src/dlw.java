import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlw extends dej {
   public static final MapCodec<dlw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ctg.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dlw((ctg)$$0x.orElse(null), $$1))
   );
   private static final xo d = xo.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final ewi f = dex.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewi g = dex.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ewi h = dex.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewi i = dex.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewi j = dex.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewi k = dex.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<je, ewi> l = ac.a(Maps.newEnumMap(je.class), $$0 -> {
      $$0.put(je.c, j);
      $$0.put(je.f, i);
      $$0.put(je.d, k);
      $$0.put(je.e, h);
      $$0.put(je.b, f);
      $$0.put(je.a, g);
   });
   public static final dsy<je> b = dha.a;
   public static final ale c = new ale("contents");
   @Nullable
   private final ctg m;

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   public dlw(@Nullable ctg $$0, drz.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, je.b));
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqo(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return a($$2, dph.x, dqo::a);
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.b;
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else if ($$3.N_()) {
         return bqs.c;
      } else if ($$1.c_($$2) instanceof dqo $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(awj.aq);
            clm.a($$3, true);
         }

         return bqs.c;
      } else {
         return bqs.e;
      }
   }

   private static boolean a(dsa $$0, dbw $$1, iz $$2, dqo $$3) {
      if ($$3.l() != dqo.a.a) {
         return true;
      } else {
         evk $$4 = ckh.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   @Override
   public dsa a(dbw $$0, iz $$1, dsa $$2, cmv $$3) {
      dpf $$4 = $$0.c_($$1);
      if ($$4 instanceof dqo $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cun $$6 = b(this.b());
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
   protected List<cun> a(dsa $$0, eqj.a $$1) {
      dpf $$2 = $$1.b(etc.h);
      if ($$2 instanceof dqo $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpf $$5 = $$1.c_($$2);
         if ($$5 instanceof dqo) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(km.ad)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cun $$6 : $$0.a(km.Z, cxj.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xo.a("container.shulkerBox.itemCount", $$6.x(), $$6.I()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xo.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected ewi b_(dsa $$0, dbc $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqo $$4 && !$$4.v()) {
         return l.get($$0.c(b).g());
      }

      return ewf.b();
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      dpf $$4 = $$1.c_($$2);
      return $$4 instanceof dqo ? ewf.a(((dqo)$$4).a($$0)) : ewf.b();
   }

   @Override
   protected boolean a_(dsa $$0, dbc $$1, iz $$2) {
      return false;
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return cps.a($$1.c_($$2));
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      cun $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dph.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static ctg b(cui $$0) {
      return a(dex.a($$0));
   }

   @Nullable
   public static ctg a(dex $$0) {
      return $$0 instanceof dlw ? ((dlw)$$0).b() : null;
   }

   public static dex a(@Nullable ctg $$0) {
      if ($$0 == null) {
         return dez.kP;
      } else {
         return switch ($$0) {
            case a -> dez.kQ;
            case b -> dez.kR;
            case c -> dez.kS;
            case d -> dez.kT;
            case e -> dez.kU;
            case f -> dez.kV;
            case g -> dez.kW;
            case h -> dez.kX;
            case i -> dez.kY;
            case j -> dez.kZ;
            case l -> dez.lb;
            case m -> dez.lc;
            case n -> dez.ld;
            case o -> dez.le;
            case p -> dez.lf;
            case k -> dez.la;
         };
      }
   }

   @Nullable
   public ctg b() {
      return this.m;
   }

   public static cun b(@Nullable ctg $$0) {
      return new cun(a($$0));
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
