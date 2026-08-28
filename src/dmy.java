import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmy extends dfk {
   public static final MapCodec<dmy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cti.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dmy((cti)$$0x.orElse(null), $$1))
   );
   private static final wz d = wz.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final exv f = dfy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final exv g = dfy.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final exv h = dfy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final exv i = dfy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final exv j = dfy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final exv k = dfy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ji, exv> l = ad.a(Maps.newEnumMap(ji.class), $$0 -> {
      $$0.put(ji.c, j);
      $$0.put(ji.f, i);
      $$0.put(ji.d, k);
      $$0.put(ji.e, h);
      $$0.put(ji.b, f);
      $$0.put(ji.a, g);
   });
   public static final dua<ji> b = dib.a;
   public static final akr c = akr.b("contents");
   @Nullable
   private final cti m;

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   public dmy(@Nullable cti $$0, dtb.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, ji.b));
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drr(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return a($$2, dqj.x, drr::a);
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.b;
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$1.B) {
         return bqr.a;
      } else if ($$3.R_()) {
         return bqr.c;
      } else if ($$1.c_($$2) instanceof drr $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(avz.aq);
            clo.a($$3, true);
         }

         return bqr.c;
      } else {
         return bqr.e;
      }
   }

   private static boolean a(dtc $$0, dcw $$1, jd $$2, drr $$3) {
      if ($$3.l() != drr.a.a) {
         return true;
      } else {
         ewx $$4 = ckj.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   public dtc a(dcw $$0, jd $$1, dtc $$2, cmx $$3) {
      dqh $$4 = $$0.c_($$1);
      if ($$4 instanceof drr $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cuq $$6 = b(this.b());
            $$6.b($$4.s());
            cjh $$7 = new cjh($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuq> a(dtc $$0, eru.a $$1) {
      dqh $$2 = $$1.b(eun.h);
      if ($$2 instanceof drr $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dqh $$5 = $$1.c_($$2);
         if ($$5 instanceof drr) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kq.af)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cuq $$6 : $$0.a(kq.ab, cxo.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(wz.a("container.shulkerBox.itemCount", $$6.w(), $$6.H()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(wz.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected exv b_(dtc $$0, dcc $$1, jd $$2) {
      if ($$1.c_($$2) instanceof drr $$4 && !$$4.v()) {
         return l.get($$0.c(b).g());
      }

      return exs.b();
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      dqh $$4 = $$1.c_($$2);
      return $$4 instanceof drr ? exs.a(((drr)$$4).a($$0)) : exs.b();
   }

   @Override
   protected boolean a_(dtc $$0, dcc $$1, jd $$2) {
      return false;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return cpu.a($$1.c_($$2));
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      cuq $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dqj.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static cti b(cul $$0) {
      return a(dfy.a($$0));
   }

   @Nullable
   public static cti a(dfy $$0) {
      return $$0 instanceof dmy ? ((dmy)$$0).b() : null;
   }

   public static dfy a(@Nullable cti $$0) {
      if ($$0 == null) {
         return dga.kP;
      } else {
         return switch ($$0) {
            case a -> dga.kQ;
            case b -> dga.kR;
            case c -> dga.kS;
            case d -> dga.kT;
            case e -> dga.kU;
            case f -> dga.kV;
            case g -> dga.kW;
            case h -> dga.kX;
            case i -> dga.kY;
            case j -> dga.kZ;
            case l -> dga.lb;
            case m -> dga.lc;
            case n -> dga.ld;
            case o -> dga.le;
            case p -> dga.lf;
            case k -> dga.la;
         };
      }
   }

   @Nullable
   public cti b() {
      return this.m;
   }

   public static cuq b(@Nullable cti $$0) {
      return new cuq(a($$0));
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
