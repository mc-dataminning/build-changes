import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfm extends cya {
   public static final MapCodec<dfm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cnn.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), u())
            .apply($$0, ($$0x, $$1) -> new dfm((cnn)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final eol e = cyo.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eol f = cyo.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eol g = cyo.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eol h = cyo.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eol i = cyo.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eol j = cyo.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ie, eol> k = ac.a(Maps.newEnumMap(ie.class), $$0 -> {
      $$0.put(ie.c, i);
      $$0.put(ie.f, h);
      $$0.put(ie.d, j);
      $$0.put(ie.e, g);
      $$0.put(ie.b, e);
      $$0.put(ie.a, f);
   });
   public static final dmd<ie> b = dar.a;
   public static final aiy c = new aiy("contents");
   @Nullable
   private final cnn l;

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   public dfm(@Nullable cnn $$0, dle.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, ie.b));
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dkb(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return a($$2, div.x, dkb::a);
   }

   @Override
   protected det b_(dlf $$0) {
      return det.b;
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else if ($$3.P_()) {
         return blu.b;
      } else if ($$1.c_($$2) instanceof dkb $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(atu.aq);
            cfy.a($$3, true);
         }

         return blu.b;
      } else {
         return blu.d;
      }
   }

   private static boolean a(dlf $$0, cvn $$1, hz $$2, dkb $$3) {
      if ($$3.m() != dkb.a.a) {
         return true;
      } else {
         enn $$4 = cet.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Override
   public dlf a(cvn $$0, hz $$1, dlf $$2, chh $$3) {
      dit $$4 = $$0.c_($$1);
      if ($$4 instanceof dkb $$5) {
         if (!$$0.B && $$3.f() && !$$5.aj_()) {
            coz $$6 = b(this.b());
            $$4.e($$6);
            if ($$5.ae()) {
               $$6.a($$5.af());
            }

            cds $$7 = new cds($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.u();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<coz> a(dlf $$0, ejb.a $$1) {
      dit $$2 = $$1.b(elg.h);
      if ($$2 instanceof dkb $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
      if ($$4.B()) {
         dit $$5 = $$0.c_($$1);
         if ($$5 instanceof dkb) {
            ((dkb)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dit $$5 = $$1.c_($$2);
         if ($$5 instanceof dkb) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(coz $$0, @Nullable cut $$1, List<vq> $$2, cqq $$3) {
      super.a($$0, $$1, $$2, $$3);
      sw $$4 = cms.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(vq.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            is<coz> $$5 = is.a(27, coz.h);
            blo.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (coz $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     $$2.add(vq.a("container.shulkerBox.itemCount", $$8.z(), String.valueOf($$8.M())));
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(vq.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   protected eol b_(dlf $$0, cut $$1, hz $$2) {
      if ($$1.c_($$2) instanceof dkb $$4 && !$$4.x()) {
         return k.get($$0.c(b).g());
      }

      return eoi.b();
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      dit $$4 = $$1.c_($$2);
      return $$4 instanceof dkb ? eoi.a(((dkb)$$4).a($$0)) : eoi.b();
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return ckb.a($$1.c_($$2));
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      coz $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, div.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static cnn b(cou $$0) {
      return a(cyo.a($$0));
   }

   @Nullable
   public static cnn a(cyo $$0) {
      return $$0 instanceof dfm ? ((dfm)$$0).b() : null;
   }

   public static cyo a(@Nullable cnn $$0) {
      if ($$0 == null) {
         return cyq.kP;
      } else {
         switch ($$0) {
            case a:
               return cyq.kQ;
            case b:
               return cyq.kR;
            case c:
               return cyq.kS;
            case d:
               return cyq.kT;
            case e:
               return cyq.kU;
            case f:
               return cyq.kV;
            case g:
               return cyq.kW;
            case h:
               return cyq.kX;
            case i:
               return cyq.kY;
            case j:
               return cyq.kZ;
            case k:
            default:
               return cyq.la;
            case l:
               return cyq.lb;
            case m:
               return cyq.lc;
            case n:
               return cyq.ld;
            case o:
               return cyq.le;
            case p:
               return cyq.lf;
         }
      }
   }

   @Nullable
   public cnn b() {
      return this.l;
   }

   public static coz b(@Nullable cnn $$0) {
      return new coz(a($$0));
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
