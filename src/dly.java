import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dly extends del {
   public static final MapCodec<dly> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cti.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dly((cti)$$0x.orElse(null), $$1))
   );
   private static final xp d = xp.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final ewk f = dez.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewk g = dez.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ewk h = dez.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewk i = dez.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewk j = dez.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewk k = dez.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<je, ewk> l = ac.a(Maps.newEnumMap(je.class), $$0 -> {
      $$0.put(je.c, j);
      $$0.put(je.f, i);
      $$0.put(je.d, k);
      $$0.put(je.e, h);
      $$0.put(je.b, f);
      $$0.put(je.a, g);
   });
   public static final dta<je> b = dhc.a;
   public static final alf c = new alf("contents");
   @Nullable
   private final cti m;

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   public dly(@Nullable cti $$0, dsb.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, je.b));
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqq(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return a($$2, dpj.x, dqq::a);
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.b;
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else if ($$3.N_()) {
         return bqu.c;
      } else if ($$1.c_($$2) instanceof dqq $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(awk.aq);
            clo.a($$3, true);
         }

         return bqu.c;
      } else {
         return bqu.e;
      }
   }

   private static boolean a(dsc $$0, dby $$1, iz $$2, dqq $$3) {
      if ($$3.l() != dqq.a.a) {
         return true;
      } else {
         evm $$4 = ckj.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   public dsc a(dby $$0, iz $$1, dsc $$2, cmx $$3) {
      dph $$4 = $$0.c_($$1);
      if ($$4 instanceof dqq $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cup $$6 = b(this.b());
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
   protected List<cup> a(dsc $$0, eql.a $$1) {
      dph $$2 = $$1.b(ete.h);
      if ($$2 instanceof dqq $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dph $$5 = $$1.c_($$2);
         if ($$5 instanceof dqq) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(km.ae)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cup $$6 : $$0.a(km.aa, cxl.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xp.a("container.shulkerBox.itemCount", $$6.x(), $$6.I()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xp.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected ewk b_(dsc $$0, dbe $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqq $$4 && !$$4.v()) {
         return l.get($$0.c(b).g());
      }

      return ewh.b();
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      dph $$4 = $$1.c_($$2);
      return $$4 instanceof dqq ? ewh.a(((dqq)$$4).a($$0)) : ewh.b();
   }

   @Override
   protected boolean a_(dsc $$0, dbe $$1, iz $$2) {
      return false;
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return cpu.a($$1.c_($$2));
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      cup $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dpj.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static cti b(cuk $$0) {
      return a(dez.a($$0));
   }

   @Nullable
   public static cti a(dez $$0) {
      return $$0 instanceof dly ? ((dly)$$0).b() : null;
   }

   public static dez a(@Nullable cti $$0) {
      if ($$0 == null) {
         return dfb.kP;
      } else {
         return switch ($$0) {
            case a -> dfb.kQ;
            case b -> dfb.kR;
            case c -> dfb.kS;
            case d -> dfb.kT;
            case e -> dfb.kU;
            case f -> dfb.kV;
            case g -> dfb.kW;
            case h -> dfb.kX;
            case i -> dfb.kY;
            case j -> dfb.kZ;
            case l -> dfb.lb;
            case m -> dfb.lc;
            case n -> dfb.ld;
            case o -> dfb.le;
            case p -> dfb.lf;
            case k -> dfb.la;
         };
      }
   }

   @Nullable
   public cti b() {
      return this.m;
   }

   public static cup b(@Nullable cti $$0) {
      return new cup(a($$0));
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
