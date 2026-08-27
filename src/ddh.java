import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddh extends cvv {
   public static final MapCodec<ddh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(clf.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), u())
            .apply($$0, ($$0x, $$1) -> new ddh((clf)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final emf e = cwj.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final emf f = cwj.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final emf g = cwj.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final emf h = cwj.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final emf i = cwj.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final emf j = cwj.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ic, emf> k = ac.a(Maps.newEnumMap(ic.class), $$0 -> {
      $$0.put(ic.c, i);
      $$0.put(ic.f, h);
      $$0.put(ic.d, j);
      $$0.put(ic.e, g);
      $$0.put(ic.b, e);
      $$0.put(ic.a, f);
   });
   public static final djy<ic> b = cym.a;
   public static final ahd c = new ahd("contents");
   @Nullable
   private final clf l;

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   public ddh(@Nullable clf $$0, diz.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, ic.b));
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhw(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return a($$2, dgq.x, dhw::a);
   }

   @Override
   public dco b_(dja $$0) {
      return dco.b;
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else if ($$3.P_()) {
         return bjv.b;
      } else if ($$1.c_($$2) instanceof dhw $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(arw.aq);
            cds.a($$3, true);
         }

         return bjv.b;
      } else {
         return bjv.d;
      }
   }

   private static boolean a(dja $$0, cti $$1, hx $$2, dhw $$3) {
      if ($$3.m() != dhw.a.a) {
         return true;
      } else {
         elh $$4 = ccp.a($$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public dja a(cti $$0, hx $$1, dja $$2, cfb $$3) {
      dgo $$4 = $$0.c_($$1);
      if ($$4 instanceof dhw $$5) {
         if (!$$0.B && $$3.f() && !$$5.ai_()) {
            cmr $$6 = b(this.b());
            $$4.e($$6);
            if ($$5.ae()) {
               $$6.a($$5.af());
            }

            cbo $$7 = new cbo($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.u();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cmr> a(dja $$0, egv.a $$1) {
      dgo $$2 = $$1.b(eja.h);
      if ($$2 instanceof dhw $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      if ($$4.A()) {
         dgo $$5 = $$0.c_($$1);
         if ($$5 instanceof dhw) {
            ((dhw)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgo $$5 = $$1.c_($$2);
         if ($$5 instanceof dhw) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cmr $$0, @Nullable cso $$1, List<vd> $$2, coi $$3) {
      super.a($$0, $$1, $$2, $$3);
      sl $$4 = ckk.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(vd.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            iq<cmr> $$5 = iq.a(27, cmr.f);
            bjp.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (cmr $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     $$2.add(vd.a("container.shulkerBox.itemCount", $$8.y(), String.valueOf($$8.L())));
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(vd.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public emf b_(dja $$0, cso $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dhw $$4 && !$$4.x()) {
         return k.get($$0.c(b).g());
      }

      return emc.b();
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      dgo $$4 = $$1.c_($$2);
      return $$4 instanceof dhw ? emc.a(((dhw)$$4).a($$0)) : emc.b();
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return chu.a($$1.c_($$2));
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      cmr $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dgq.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static clf b(cmm $$0) {
      return a(cwj.a($$0));
   }

   @Nullable
   public static clf a(cwj $$0) {
      return $$0 instanceof ddh ? ((ddh)$$0).b() : null;
   }

   public static cwj a(@Nullable clf $$0) {
      if ($$0 == null) {
         return cwl.kP;
      } else {
         switch ($$0) {
            case a:
               return cwl.kQ;
            case b:
               return cwl.kR;
            case c:
               return cwl.kS;
            case d:
               return cwl.kT;
            case e:
               return cwl.kU;
            case f:
               return cwl.kV;
            case g:
               return cwl.kW;
            case h:
               return cwl.kX;
            case i:
               return cwl.kY;
            case j:
               return cwl.kZ;
            case k:
            default:
               return cwl.la;
            case l:
               return cwl.lb;
            case m:
               return cwl.lc;
            case n:
               return cwl.ld;
            case o:
               return cwl.le;
            case p:
               return cwl.lf;
         }
      }
   }

   @Nullable
   public clf b() {
      return this.l;
   }

   public static cmr b(@Nullable clf $$0) {
      return new cmr(a($$0));
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
