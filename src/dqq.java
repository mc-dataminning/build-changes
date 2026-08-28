import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqq extends diy {
   public static final MapCodec<dqq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cvm.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), t())
            .apply($$0, ($$0x, $$1) -> new dqq((cvm)$$0x.orElse(null), $$1))
   );
   private static final wp d = wp.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final fbu f = djm.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbu g = djm.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fbu h = djm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbu i = djm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbu j = djm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbu k = djm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jn, fbu> l = af.a(Maps.newEnumMap(jn.class), $$0 -> {
      $$0.put(jn.c, j);
      $$0.put(jn.f, i);
      $$0.put(jn.d, k);
      $$0.put(jn.e, h);
      $$0.put(jn.b, f);
      $$0.put(jn.a, g);
   });
   public static final dxu<jn> b = dlq.a;
   public static final akv c = akv.b("contents");
   @Nullable
   private final cvm m;

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   public dqq(@Nullable cvm $$0, dww.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jn.b));
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvl(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return a($$2, dub.y, dvl::a);
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if ($$1 instanceof ard $$5 && $$1.c_($$2) instanceof dvl $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(awk.aq);
         cnm.a($$5, $$3, true);
      }

      return bsk.a;
   }

   private static boolean a(dwx $$0, dgi $$1, ji $$2, dvl $$3) {
      if ($$3.k() != dvl.a.a) {
         return true;
      } else {
         fav $$4 = cme.a(1.0F, $$0.c(b), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(b, $$0.k());
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Override
   public dwx a(dgi $$0, ji $$1, dwx $$2, cox $$3) {
      dtz $$4 = $$0.c_($$1);
      if ($$4 instanceof dvl $$5) {
         if (!$$0.C && $$3.b() && !$$5.c()) {
            cwp $$6 = b(this.b());
            $$6.b($$4.q());
            clc $$7 = new clc($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.s();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cwp> a(dwx $$0, evu.a $$1) {
      dtz $$2 = $$1.b(eyl.h);
      if ($$2 instanceof dvl $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dtz $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof dvl) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wp> $$2, cyh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kv.ap)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cwp $$6 : $$0.a(kv.al, czh.a).d()) {
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
   protected fbu b_(dwx $$0, dfn $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dvl $$4 && !$$4.t()) {
         return l.get($$0.c(b).g());
      }

      return fbr.b();
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return $$1.c_($$2) instanceof dvl $$5 ? fbr.a($$5.a($$0)) : fbr.b();
   }

   @Override
   protected boolean e_(dwx $$0) {
      return false;
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return csc.a($$1.c_($$2));
   }

   public static djm a(@Nullable cvm $$0) {
      if ($$0 == null) {
         return djo.lr;
      } else {
         return switch ($$0) {
            case a -> djo.ls;
            case b -> djo.lt;
            case c -> djo.lu;
            case d -> djo.lv;
            case e -> djo.lw;
            case f -> djo.lx;
            case g -> djo.ly;
            case h -> djo.lz;
            case i -> djo.lA;
            case j -> djo.lB;
            case l -> djo.lD;
            case m -> djo.lE;
            case n -> djo.lF;
            case o -> djo.lG;
            case p -> djo.lH;
            case k -> djo.lC;
         };
      }
   }

   @Nullable
   public cvm b() {
      return this.m;
   }

   public static cwp b(@Nullable cvm $$0) {
      return new cwp(a($$0));
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
