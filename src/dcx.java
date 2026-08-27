import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcx extends cvl {
   public static final MapCodec<dcx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ckv.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), u())
            .apply($$0, ($$0x, $$1) -> new dcx((ckv)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final elu e = cvz.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final elu f = cvz.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final elu g = cvz.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final elu h = cvz.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final elu i = cvz.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final elu j = cvz.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ia, elu> k = ac.a(Maps.newEnumMap(ia.class), $$0 -> {
      $$0.put(ia.c, i);
      $$0.put(ia.f, h);
      $$0.put(ia.d, j);
      $$0.put(ia.e, g);
      $$0.put(ia.b, e);
      $$0.put(ia.a, f);
   });
   public static final djn<ia> b = cyc.a;
   public static final agt c = new agt("contents");
   @Nullable
   private final ckv l;

   @Override
   public MapCodec<dcx> a() {
      return a;
   }

   public dcx(@Nullable ckv $$0, dio.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, ia.b));
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhl(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return a($$2, dgf.x, dhl::a);
   }

   @Override
   public dce b_(dip $$0) {
      return dce.b;
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else if ($$3.P_()) {
         return bjl.b;
      } else if ($$1.c_($$2) instanceof dhl $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(arm.aq);
            cdi.a($$3, true);
         }

         return bjl.b;
      } else {
         return bjl.d;
      }
   }

   private static boolean a(dip $$0, csy $$1, hv $$2, dhl $$3) {
      if ($$3.m() != dhl.a.a) {
         return true;
      } else {
         ekw $$4 = ccf.a($$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public dip a(csy $$0, hv $$1, dip $$2, cer $$3) {
      dgd $$4 = $$0.c_($$1);
      if ($$4 instanceof dhl $$5) {
         if (!$$0.B && $$3.f() && !$$5.ai_()) {
            cmh $$6 = b(this.b());
            $$4.e($$6);
            if ($$5.ae()) {
               $$6.a($$5.af());
            }

            cbe $$7 = new cbe($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.u();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cmh> a(dip $$0, egk.a $$1) {
      dgd $$2 = $$1.b(eip.h);
      if ($$2 instanceof dhl $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      if ($$4.A()) {
         dgd $$5 = $$0.c_($$1);
         if ($$5 instanceof dhl) {
            ((dhl)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgd $$5 = $$1.c_($$2);
         if ($$5 instanceof dhl) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cmh $$0, @Nullable cse $$1, List<vb> $$2, cny $$3) {
      super.a($$0, $$1, $$2, $$3);
      sj $$4 = cka.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(vb.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            io<cmh> $$5 = io.a(27, cmh.f);
            bjf.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (cmh $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     $$2.add(vb.a("container.shulkerBox.itemCount", $$8.y(), String.valueOf($$8.L())));
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(vb.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public elu b_(dip $$0, cse $$1, hv $$2) {
      if ($$1.c_($$2) instanceof dhl $$4 && !$$4.x()) {
         return k.get($$0.c(b).g());
      }

      return elr.b();
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      dgd $$4 = $$1.c_($$2);
      return $$4 instanceof dhl ? elr.a(((dhl)$$4).a($$0)) : elr.b();
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return chk.a($$1.c_($$2));
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      cmh $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dgf.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static ckv b(cmc $$0) {
      return a(cvz.a($$0));
   }

   @Nullable
   public static ckv a(cvz $$0) {
      return $$0 instanceof dcx ? ((dcx)$$0).b() : null;
   }

   public static cvz a(@Nullable ckv $$0) {
      if ($$0 == null) {
         return cwb.kP;
      } else {
         switch ($$0) {
            case a:
               return cwb.kQ;
            case b:
               return cwb.kR;
            case c:
               return cwb.kS;
            case d:
               return cwb.kT;
            case e:
               return cwb.kU;
            case f:
               return cwb.kV;
            case g:
               return cwb.kW;
            case h:
               return cwb.kX;
            case i:
               return cwb.kY;
            case j:
               return cwb.kZ;
            case k:
            default:
               return cwb.la;
            case l:
               return cwb.lb;
            case m:
               return cwb.lc;
            case n:
               return cwb.ld;
            case o:
               return cwb.le;
            case p:
               return cwb.lf;
         }
      }
   }

   @Nullable
   public ckv b() {
      return this.l;
   }

   public static cmh b(@Nullable ckv $$0) {
      return new cmh(a($$0));
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
