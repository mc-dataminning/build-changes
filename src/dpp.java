import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpp extends dic {
   public static final MapCodec<dpp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cvj.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), t())
            .apply($$0, ($$0x, $$1) -> new dpp((cvj)$$0x.orElse(null), $$1))
   );
   private static final xj d = xj.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final fas f = diq.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fas g = diq.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fas h = diq.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fas i = diq.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fas j = diq.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fas k = diq.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fas> l = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, j);
      $$0.put(jm.f, i);
      $$0.put(jm.d, k);
      $$0.put(jm.e, h);
      $$0.put(jm.b, f);
      $$0.put(jm.a, g);
   });
   public static final dws<jm> b = dkt.a;
   public static final alj c = alj.b("contents");
   @Nullable
   private final cvj m;

   @Override
   public MapCodec<dpp> a() {
      return a;
   }

   public dpp(@Nullable cvj $$0, dvu.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jm.b));
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new duj(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return a($$2, dta.x, duj::a);
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.b;
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if ($$1 instanceof arp $$5 && $$1.c_($$2) instanceof duj $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(awx.aq);
         cnj.a($$5, $$3, true);
      }

      return bsk.a;
   }

   private static boolean a(dvv $$0, dfm $$1, jh $$2, duj $$3) {
      if ($$3.k() != duj.a.a) {
         return true;
      } else {
         ezt $$4 = cme.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(b, $$0.k());
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   public dvv a(dfm $$0, jh $$1, dvv $$2, cou $$3) {
      dsy $$4 = $$0.c_($$1);
      if ($$4 instanceof duj $$5) {
         if (!$$0.C && $$3.b() && !$$5.c()) {
            cwm $$6 = b(this.b());
            $$6.b($$4.r());
            clc $$7 = new clc($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.n();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwm> a(dvv $$0, euq.a $$1) {
      dsy $$2 = $$1.b(exj.h);
      if ($$2 instanceof duj $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsy $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof duj) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(ku.ap)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cwm $$6 : $$0.a(ku.al, cze.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xj.a("container.shulkerBox.itemCount", $$6.y(), $$6.L()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xj.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected fas b_(dvv $$0, der $$1, jh $$2) {
      if ($$1.c_($$2) instanceof duj $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return fap.b();
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      dsy $$4 = $$1.c_($$2);
      return $$4 instanceof duj ? fap.a(((duj)$$4).a($$0)) : fap.b();
   }

   @Override
   protected boolean e_(dvv $$0) {
      return false;
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return crz.a($$1.c_($$2));
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      cwm $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dta.x).ifPresent($$2x -> $$2x.a($$3, $$0.J_()));
      return $$3;
   }

   @Nullable
   public static cvj b(cwi $$0) {
      return a(diq.a($$0));
   }

   @Nullable
   public static cvj a(diq $$0) {
      return $$0 instanceof dpp ? ((dpp)$$0).b() : null;
   }

   public static diq a(@Nullable cvj $$0) {
      if ($$0 == null) {
         return dis.kP;
      } else {
         return switch ($$0) {
            case a -> dis.kQ;
            case b -> dis.kR;
            case c -> dis.kS;
            case d -> dis.kT;
            case e -> dis.kU;
            case f -> dis.kV;
            case g -> dis.kW;
            case h -> dis.kX;
            case i -> dis.kY;
            case j -> dis.kZ;
            case l -> dis.lb;
            case m -> dis.lc;
            case n -> dis.ld;
            case o -> dis.le;
            case p -> dis.lf;
            case k -> dis.la;
         };
      }
   }

   @Nullable
   public cvj b() {
      return this.m;
   }

   public static cwm b(@Nullable cvj $$0) {
      return new cwm(a($$0));
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
