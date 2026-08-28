import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqp extends dix {
   public static final MapCodec<dqp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cvl.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), t())
            .apply($$0, ($$0x, $$1) -> new dqp((cvl)$$0x.orElse(null), $$1))
   );
   private static final wp d = wp.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final fbt f = djl.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbt g = djl.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fbt h = djl.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbt i = djl.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbt j = djl.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbt k = djl.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jn, fbt> l = af.a(Maps.newEnumMap(jn.class), $$0 -> {
      $$0.put(jn.c, j);
      $$0.put(jn.f, i);
      $$0.put(jn.d, k);
      $$0.put(jn.e, h);
      $$0.put(jn.b, f);
      $$0.put(jn.a, g);
   });
   public static final dxt<jn> b = dlp.a;
   public static final akv c = akv.b("contents");
   @Nullable
   private final cvl m;

   @Override
   public MapCodec<dqp> a() {
      return a;
   }

   public dqp(@Nullable cvl $$0, dwv.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jn.b));
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvk(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return a($$2, dua.y, dvk::a);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if ($$1 instanceof ard $$5 && $$1.c_($$2) instanceof dvk $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(awk.aq);
         cnl.a($$5, $$3, true);
      }

      return bsj.a;
   }

   private static boolean a(dww $$0, dgh $$1, ji $$2, dvk $$3) {
      if ($$3.k() != dvk.a.a) {
         return true;
      } else {
         fau $$4 = cmd.a(1.0F, $$0.c(b), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(b, $$0.k());
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   public dww a(dgh $$0, ji $$1, dww $$2, cow $$3) {
      dty $$4 = $$0.c_($$1);
      if ($$4 instanceof dvk $$5) {
         if (!$$0.C && $$3.b() && !$$5.c()) {
            cwo $$6 = b(this.b());
            $$6.b($$4.q());
            clb $$7 = new clb($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.s();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwo> a(dww $$0, evt.a $$1) {
      dty $$2 = $$1.b(eyk.h);
      if ($$2 instanceof dvk $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dty $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof dvk) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kv.ap)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cwo $$6 : $$0.a(kv.al, czg.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(wp.a("container.shulkerBox.itemCount", $$6.y(), $$6.M()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(wp.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected fbt b_(dww $$0, dfm $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dvk $$4 && !$$4.t()) {
         return l.get($$0.c(b).g());
      }

      return fbq.b();
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return $$1.c_($$2) instanceof dvk $$5 ? fbq.a($$5.a($$0)) : fbq.b();
   }

   @Override
   protected boolean e_(dww $$0) {
      return false;
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return csb.a($$1.c_($$2));
   }

   public static djl a(@Nullable cvl $$0) {
      if ($$0 == null) {
         return djn.lr;
      } else {
         return switch ($$0) {
            case a -> djn.ls;
            case b -> djn.lt;
            case c -> djn.lu;
            case d -> djn.lv;
            case e -> djn.lw;
            case f -> djn.lx;
            case g -> djn.ly;
            case h -> djn.lz;
            case i -> djn.lA;
            case j -> djn.lB;
            case l -> djn.lD;
            case m -> djn.lE;
            case n -> djn.lF;
            case o -> djn.lG;
            case p -> djn.lH;
            case k -> djn.lC;
         };
      }
   }

   @Nullable
   public cvl b() {
      return this.m;
   }

   public static cwo b(@Nullable cvl $$0) {
      return new cwo(a($$0));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
