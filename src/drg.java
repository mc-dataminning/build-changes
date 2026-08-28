import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class drg extends djq {
   public static final MapCodec<drg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cwh.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), t())
            .apply($$0, ($$0x, $$1) -> new drg((cwh)$$0x.orElse(null), $$1))
   );
   private static final xv d = xv.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final fcm f = dke.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcm g = dke.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fcm h = dke.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcm i = dke.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcm j = dke.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcm k = dke.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fcm> l = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, j);
      $$0.put(jm.f, i);
      $$0.put(jm.d, k);
      $$0.put(jm.e, h);
      $$0.put(jm.b, f);
      $$0.put(jm.a, g);
   });
   public static final dyk<jm> b = dmj.a;
   public static final alz c = alz.b("contents");
   @Nullable
   private final cwh m;

   @Override
   public MapCodec<drg> a() {
      return a;
   }

   public drg(@Nullable cwh $$0, dxm.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jm.b));
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dwb(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return a($$2, dur.y, dwb::a);
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.b;
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if ($$1 instanceof ash $$5 && $$1.c_($$2) instanceof dwb $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(axp.aq);
         coh.a($$5, $$3, true);
      }

      return bte.a;
   }

   private static boolean a(dxn $$0, dha $$1, jh $$2, dwb $$3) {
      if ($$3.k() != dwb.a.a) {
         return true;
      } else {
         fbn $$4 = cmy.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(b, $$0.k());
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   public dxn a(dha $$0, jh $$1, dxn $$2, cps $$3) {
      dup $$4 = $$0.c_($$1);
      if ($$4 instanceof dwb $$5) {
         if (!$$0.C && $$3.b() && !$$5.c()) {
            cxk $$6 = b(this.b());
            $$6.b($$4.r());
            clw $$7 = new clw($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.s();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cxk> a(dxn $$0, ewk.a $$1) {
      dup $$2 = $$1.b(ezd.h);
      if ($$2 instanceof dwb $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dup $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof dwb) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(ku.ap)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cxk $$6 : $$0.a(ku.al, dac.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xv.a("container.shulkerBox.itemCount", $$6.y(), $$6.L()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xv.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected fcm b_(dxn $$0, dgf $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dwb $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return fcj.b();
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      dup $$4 = $$1.c_($$2);
      return $$4 instanceof dwb ? fcj.a(((dwb)$$4).a($$0)) : fcj.b();
   }

   @Override
   protected boolean e_(dxn $$0) {
      return false;
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return csx.a($$1.c_($$2));
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      cxk $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dur.y).ifPresent($$2x -> $$2x.a($$3, $$0.K_()));
      return $$3;
   }

   @Nullable
   public static cwh b(cxg $$0) {
      return a(dke.a($$0));
   }

   @Nullable
   public static cwh a(dke $$0) {
      return $$0 instanceof drg ? ((drg)$$0).b() : null;
   }

   public static dke a(@Nullable cwh $$0) {
      if ($$0 == null) {
         return dkg.lk;
      } else {
         return switch ($$0) {
            case a -> dkg.ll;
            case b -> dkg.lm;
            case c -> dkg.ln;
            case d -> dkg.lo;
            case e -> dkg.lp;
            case f -> dkg.lq;
            case g -> dkg.lr;
            case h -> dkg.ls;
            case i -> dkg.lt;
            case j -> dkg.lu;
            case l -> dkg.lw;
            case m -> dkg.lx;
            case n -> dkg.ly;
            case o -> dkg.lz;
            case p -> dkg.lA;
            case k -> dkg.lv;
         };
      }
   }

   @Nullable
   public cwh b() {
      return this.m;
   }

   public static cxk b(@Nullable cwh $$0) {
      return new cxk(a($$0));
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
