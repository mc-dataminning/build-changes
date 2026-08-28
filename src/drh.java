import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class drh extends djp {
   public static final MapCodec<drh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cwd.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), t())
            .apply($$0, ($$0x, $$1) -> new drh((cwd)$$0x.orElse(null), $$1))
   );
   private static final xk d = xk.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final fcl f = dkd.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcl g = dkd.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fcl h = dkd.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcl i = dkd.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcl j = dkd.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcl k = dkd.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fcl> l = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, j);
      $$0.put(jm.f, i);
      $$0.put(jm.d, k);
      $$0.put(jm.e, h);
      $$0.put(jm.b, f);
      $$0.put(jm.a, g);
   });
   public static final dyl<jm> b = dmh.a;
   public static final alp c = alp.b("contents");
   @Nullable
   private final cwd m;

   @Override
   public MapCodec<drh> a() {
      return a;
   }

   public drh(@Nullable cwd $$0, dxn.d $$1) {
      super($$1);
      this.m = $$0;
      this.l(this.F.b().b(b, jm.b));
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dwc(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return a($$2, dus.y, dwc::a);
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.b;
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if ($$1 instanceof arx $$5 && $$1.c_($$2) instanceof dwc $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(axf.aq);
         cod.a($$5, $$3, true);
      }

      return bta.a;
   }

   private static boolean a(dxo $$0, dgz $$1, jh $$2, dwc $$3) {
      if ($$3.k() != dwc.a.a) {
         return true;
      } else {
         fbm $$4 = cmu.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(b, $$0.k());
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   public dxo a(dgz $$0, jh $$1, dxo $$2, cpo $$3) {
      duq $$4 = $$0.c_($$1);
      if ($$4 instanceof dwc $$5) {
         if (!$$0.C && $$3.b() && !$$5.c()) {
            cxg $$6 = b(this.b());
            $$6.b($$4.q());
            cls $$7 = new cls($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.s();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cxg> a(dxo $$0, ewl.a $$1) {
      duq $$2 = $$1.b(ezc.h);
      if ($$2 instanceof dwc $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         duq $$5 = $$1.c_($$2);
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof dwc) {
            $$1.c($$2, $$0.b());
         }
      }
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(ku.ap)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cxg $$6 : $$0.a(ku.al, czy.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xk.a("container.shulkerBox.itemCount", $$6.y(), $$6.M()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xk.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected fcl b_(dxo $$0, dge $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dwc $$4 && !$$4.t()) {
         return l.get($$0.c(b).g());
      }

      return fci.b();
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      duq $$4 = $$1.c_($$2);
      return $$4 instanceof dwc ? fci.a(((dwc)$$4).a($$0)) : fci.b();
   }

   @Override
   protected boolean e_(dxo $$0) {
      return false;
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return cst.a($$1.c_($$2));
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      cxg $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dus.y).ifPresent($$2x -> $$2x.a($$3, $$0.K_()));
      return $$3;
   }

   @Nullable
   public static cwd b(cxc $$0) {
      return a(dkd.a($$0));
   }

   @Nullable
   public static cwd a(dkd $$0) {
      return $$0 instanceof drh ? ((drh)$$0).b() : null;
   }

   public static dkd a(@Nullable cwd $$0) {
      if ($$0 == null) {
         return dkf.lr;
      } else {
         return switch ($$0) {
            case a -> dkf.ls;
            case b -> dkf.lt;
            case c -> dkf.lu;
            case d -> dkf.lv;
            case e -> dkf.lw;
            case f -> dkf.lx;
            case g -> dkf.ly;
            case h -> dkf.lz;
            case i -> dkf.lA;
            case j -> dkf.lB;
            case l -> dkf.lD;
            case m -> dkf.lE;
            case n -> dkf.lF;
            case o -> dkf.lG;
            case p -> dkf.lH;
            case k -> dkf.lC;
         };
      }
   }

   @Nullable
   public cwd b() {
      return this.m;
   }

   public static cxg b(@Nullable cwd $$0) {
      return new cxg(a($$0));
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
