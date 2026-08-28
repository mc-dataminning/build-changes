import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class drn extends djx {
   public static final MapCodec<drn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cwl.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), t())
            .apply($$0, ($$0x, $$1) -> new drn((cwl)$$0x.orElse(null), $$1))
   );
   private static final xv d = xv.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final fcr f = dkl.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcr g = dkl.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fcr h = dkl.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcr i = dkl.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcr j = dkl.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcr k = dkl.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fcr> l = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, j);
      $$0.put(jm.f, i);
      $$0.put(jm.d, k);
      $$0.put(jm.e, h);
      $$0.put(jm.b, f);
      $$0.put(jm.a, g);
   });
   public static final dyr<jm> b = dmq.a;
   public static final alz c = alz.b("contents");
   @Nullable
   private final cwl m;

   @Override
   public MapCodec<drn> a() {
      return a;
   }

   public drn(@Nullable cwl $$0, dxt.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jm.b));
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dwi(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return a($$2, duy.y, dwi::a);
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.b;
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if ($$1 instanceof ash $$5 && $$1.c_($$2) instanceof dwi $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(axp.aq);
         col.a($$5, $$3, true);
      }

      return bti.a;
   }

   private static boolean a(dxu $$0, dhh $$1, jh $$2, dwi $$3) {
      if ($$3.k() != dwi.a.a) {
         return true;
      } else {
         fbs $$4 = cnc.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(b, $$0.k());
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Override
   public dxu a(dhh $$0, jh $$1, dxu $$2, cpw $$3) {
      duw $$4 = $$0.c_($$1);
      if ($$4 instanceof dwi $$5) {
         if (!$$0.C && $$3.b() && !$$5.c()) {
            cxo $$6 = b(this.b());
            $$6.b($$4.r());
            cma $$7 = new cma($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.s();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cxo> a(dxu $$0, ewr.a $$1) {
      duw $$2 = $$1.b(ezi.h);
      if ($$2 instanceof dwi $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         duw $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof dwi) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(ku.ap)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cxo $$6 : $$0.a(ku.al, dag.a).d()) {
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
   protected fcr b_(dxu $$0, dgm $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dwi $$4 && !$$4.u()) {
         return l.get($$0.c(b).g());
      }

      return fco.b();
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      duw $$4 = $$1.c_($$2);
      return $$4 instanceof dwi ? fco.a(((dwi)$$4).a($$0)) : fco.b();
   }

   @Override
   protected boolean e_(dxu $$0) {
      return false;
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return ctb.a($$1.c_($$2));
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      cxo $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, duy.y).ifPresent($$2x -> $$2x.a($$3, $$0.K_()));
      return $$3;
   }

   @Nullable
   public static cwl b(cxk $$0) {
      return a(dkl.a($$0));
   }

   @Nullable
   public static cwl a(dkl $$0) {
      return $$0 instanceof drn ? ((drn)$$0).b() : null;
   }

   public static dkl a(@Nullable cwl $$0) {
      if ($$0 == null) {
         return dkn.lk;
      } else {
         return switch ($$0) {
            case a -> dkn.ll;
            case b -> dkn.lm;
            case c -> dkn.ln;
            case d -> dkn.lo;
            case e -> dkn.lp;
            case f -> dkn.lq;
            case g -> dkn.lr;
            case h -> dkn.ls;
            case i -> dkn.lt;
            case j -> dkn.lu;
            case l -> dkn.lw;
            case m -> dkn.lx;
            case n -> dkn.ly;
            case o -> dkn.lz;
            case p -> dkn.lA;
            case k -> dkn.lv;
         };
      }
   }

   @Nullable
   public cwl b() {
      return this.m;
   }

   public static cxo b(@Nullable cwl $$0) {
      return new cxo(a($$0));
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
