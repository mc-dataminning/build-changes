import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class drj extends djq {
   public static final MapCodec<drj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cwe.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.f)), t())
            .apply($$0, ($$0x, $$1) -> new drj((cwe)$$0x.orElse(null), $$1))
   );
   private static final wp e = wp.c("container.shulkerBox.unknownContents");
   public static final Map<jn, fcr> b = fco.d(dke.c(16.0, 0.0, 1.0));
   public static final dyo<jn> c = dmi.a;
   public static final aku d = aku.b("contents");
   @Nullable
   private final cwe f;

   @Override
   public MapCodec<drj> a() {
      return a;
   }

   public drj(@Nullable cwe $$0, dxp.d $$1) {
      super($$1);
      this.f = $$0;
      this.l(this.B.b().b(c, jn.b));
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwe(this.f, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return a($$2, duu.y, dwe::a);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if ($$1 instanceof ard $$5 && $$1.c_($$2) instanceof dwe $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(awk.aq);
         cog.a($$5, $$3, true);
      }

      return bsy.a;
   }

   private static boolean a(dxq $$0, dgz $$1, ji $$2, dwe $$3) {
      if ($$3.k() != dwe.a.a) {
         return true;
      } else {
         fbs $$4 = cmy.a(1.0F, $$0.c(c), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(c, $$0.k());
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c);
   }

   @Override
   public dxq a(dgz $$0, ji $$1, dxq $$2, cpr $$3) {
      dus $$4 = $$0.c_($$1);
      if ($$4 instanceof dwe $$5) {
         if (!$$0.C && $$3.gn() && !$$5.c()) {
            cxh $$6 = b(this.b());
            $$6.b($$4.q());
            clw $$7 = new clw($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.j();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cxh> a(dxq $$0, ewr.a $$1) {
      dus $$2 = $$1.b(ezi.h);
      if ($$2 instanceof dwe $$3) {
         $$1 = $$1.a(d, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      bsu.a($$0, $$1, $$2);
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kv.ar)) {
         $$2.add(e);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cxh $$6 : $$0.a(kv.an, czx.a).d()) {
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
   protected fcr b_(dxq $$0, dgf $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dwe $$4 && !$$4.t()) {
         return b.get($$0.c(c).g());
      }

      return fco.b();
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return $$1.c_($$2) instanceof dwe $$5 ? fco.a($$5.a($$0)) : fco.b();
   }

   @Override
   protected boolean e_(dxq $$0) {
      return false;
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return csw.a($$1.c_($$2));
   }

   public static dke a(@Nullable cwe $$0) {
      if ($$0 == null) {
         return dkg.lr;
      } else {
         return switch ($$0) {
            case a -> dkg.ls;
            case b -> dkg.lt;
            case c -> dkg.lu;
            case d -> dkg.lv;
            case e -> dkg.lw;
            case f -> dkg.lx;
            case g -> dkg.ly;
            case h -> dkg.lz;
            case i -> dkg.lA;
            case j -> dkg.lB;
            case l -> dkg.lD;
            case m -> dkg.lE;
            case n -> dkg.lF;
            case o -> dkg.lG;
            case p -> dkg.lH;
            case k -> dkg.lC;
         };
      }
   }

   @Nullable
   public cwe b() {
      return this.f;
   }

   public static cxh b(@Nullable cwe $$0) {
      return new cxh(a($$0));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
