import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqo extends diw {
   public static final MapCodec<dqo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cvk.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), t())
            .apply($$0, ($$0x, $$1) -> new dqo((cvk)$$0x.orElse(null), $$1))
   );
   private static final wo d = wo.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final fbs f = djk.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbs g = djk.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fbs h = djk.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbs i = djk.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbs j = djk.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbs k = djk.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jn, fbs> l = af.a(Maps.newEnumMap(jn.class), $$0 -> {
      $$0.put(jn.c, j);
      $$0.put(jn.f, i);
      $$0.put(jn.d, k);
      $$0.put(jn.e, h);
      $$0.put(jn.b, f);
      $$0.put(jn.a, g);
   });
   public static final dxs<jn> b = dlo.a;
   public static final aku c = aku.b("contents");
   @Nullable
   private final cvk m;

   @Override
   public MapCodec<dqo> a() {
      return a;
   }

   public dqo(@Nullable cvk $$0, dwu.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jn.b));
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvj(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return a($$2, dtz.y, dvj::a);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if ($$1 instanceof arc $$5 && $$1.c_($$2) instanceof dvj $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(awj.aq);
         cnk.a($$5, $$3, true);
      }

      return bsi.a;
   }

   private static boolean a(dwv $$0, dgg $$1, ji $$2, dvj $$3) {
      if ($$3.k() != dvj.a.a) {
         return true;
      } else {
         fat $$4 = cmc.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(b, $$0.k());
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   public dwv a(dgg $$0, ji $$1, dwv $$2, cov $$3) {
      dtx $$4 = $$0.c_($$1);
      if ($$4 instanceof dvj $$5) {
         if (!$$0.C && $$3.b() && !$$5.c()) {
            cwn $$6 = b(this.b());
            $$6.b($$4.q());
            cla $$7 = new cla($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.s();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwn> a(dwv $$0, evs.a $$1) {
      dtx $$2 = $$1.b(eyj.h);
      if ($$2 instanceof dvj $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dtx $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof dvj) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kv.ap)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cwn $$6 : $$0.a(kv.al, czf.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(wo.a("container.shulkerBox.itemCount", $$6.y(), $$6.M()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(wo.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected fbs b_(dwv $$0, dfl $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dvj $$4 && !$$4.t()) {
         return l.get($$0.c(b).g());
      }

      return fbp.b();
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      dtx $$4 = $$1.c_($$2);
      return $$4 instanceof dvj ? fbp.a(((dvj)$$4).a($$0)) : fbp.b();
   }

   @Override
   protected boolean e_(dwv $$0) {
      return false;
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return csa.a($$1.c_($$2));
   }

   public static djk a(@Nullable cvk $$0) {
      if ($$0 == null) {
         return djm.lr;
      } else {
         return switch ($$0) {
            case a -> djm.ls;
            case b -> djm.lt;
            case c -> djm.lu;
            case d -> djm.lv;
            case e -> djm.lw;
            case f -> djm.lx;
            case g -> djm.ly;
            case h -> djm.lz;
            case i -> djm.lA;
            case j -> djm.lB;
            case l -> djm.lD;
            case m -> djm.lE;
            case n -> djm.lF;
            case o -> djm.lG;
            case p -> djm.lH;
            case k -> djm.lC;
         };
      }
   }

   @Nullable
   public cvk b() {
      return this.m;
   }

   public static cwn b(@Nullable cvk $$0) {
      return new cwn(a($$0));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
