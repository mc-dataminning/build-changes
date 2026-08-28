import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlx extends dek {
   public static final MapCodec<dlx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cth.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dlx((cth)$$0x.orElse(null), $$1))
   );
   private static final xo d = xo.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final ewj f = dey.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewj g = dey.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ewj h = dey.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewj i = dey.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewj j = dey.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewj k = dey.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<je, ewj> l = ac.a(Maps.newEnumMap(je.class), $$0 -> {
      $$0.put(je.c, j);
      $$0.put(je.f, i);
      $$0.put(je.d, k);
      $$0.put(je.e, h);
      $$0.put(je.b, f);
      $$0.put(je.a, g);
   });
   public static final dsz<je> b = dhb.a;
   public static final ale c = new ale("contents");
   @Nullable
   private final cth m;

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   public dlx(@Nullable cth $$0, dsa.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, je.b));
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqp(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return a($$2, dpi.x, dqp::a);
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.b;
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else if ($$3.N_()) {
         return bqt.c;
      } else if ($$1.c_($$2) instanceof dqp $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(awj.aq);
            cln.a($$3, true);
         }

         return bqt.c;
      } else {
         return bqt.e;
      }
   }

   private static boolean a(dsb $$0, dbx $$1, iz $$2, dqp $$3) {
      if ($$3.l() != dqp.a.a) {
         return true;
      } else {
         evl $$4 = cki.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   public dsb a(dbx $$0, iz $$1, dsb $$2, cmw $$3) {
      dpg $$4 = $$0.c_($$1);
      if ($$4 instanceof dqp $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cuo $$6 = b(this.b());
            $$6.b($$4.s());
            cjg $$7 = new cjg($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuo> a(dsb $$0, eqk.a $$1) {
      dpg $$2 = $$1.b(etd.h);
      if ($$2 instanceof dqp $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpg $$5 = $$1.c_($$2);
         if ($$5 instanceof dqp) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(km.ae)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cuo $$6 : $$0.a(km.aa, cxk.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(xo.a("container.shulkerBox.itemCount", $$6.x(), $$6.I()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(xo.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected ewj b_(dsb $$0, dbd $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqp $$4 && !$$4.v()) {
         return l.get($$0.c(b).g());
      }

      return ewg.b();
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      dpg $$4 = $$1.c_($$2);
      return $$4 instanceof dqp ? ewg.a(((dqp)$$4).a($$0)) : ewg.b();
   }

   @Override
   protected boolean a_(dsb $$0, dbd $$1, iz $$2) {
      return false;
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return cpt.a($$1.c_($$2));
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      cuo $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dpi.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static cth b(cuj $$0) {
      return a(dey.a($$0));
   }

   @Nullable
   public static cth a(dey $$0) {
      return $$0 instanceof dlx ? ((dlx)$$0).b() : null;
   }

   public static dey a(@Nullable cth $$0) {
      if ($$0 == null) {
         return dfa.kP;
      } else {
         return switch ($$0) {
            case a -> dfa.kQ;
            case b -> dfa.kR;
            case c -> dfa.kS;
            case d -> dfa.kT;
            case e -> dfa.kU;
            case f -> dfa.kV;
            case g -> dfa.kW;
            case h -> dfa.kX;
            case i -> dfa.kY;
            case j -> dfa.kZ;
            case l -> dfa.lb;
            case m -> dfa.lc;
            case n -> dfa.ld;
            case o -> dfa.le;
            case p -> dfa.lf;
            case k -> dfa.la;
         };
      }
   }

   @Nullable
   public cth b() {
      return this.m;
   }

   public static cuo b(@Nullable cth $$0) {
      return new cuo(a($$0));
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
