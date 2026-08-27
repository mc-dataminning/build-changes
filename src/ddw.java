import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddw extends cwk {
   public static final MapCodec<ddw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(clv.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), u())
            .apply($$0, ($$0x, $$1) -> new ddw((clv)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final emv e = cwy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final emv f = cwy.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final emv g = cwy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final emv h = cwy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final emv i = cwy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final emv j = cwy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ic, emv> k = ac.a(Maps.newEnumMap(ic.class), $$0 -> {
      $$0.put(ic.c, i);
      $$0.put(ic.f, h);
      $$0.put(ic.d, j);
      $$0.put(ic.e, g);
      $$0.put(ic.b, e);
      $$0.put(ic.a, f);
   });
   public static final dkn<ic> b = czb.a;
   public static final ahh c = new ahh("contents");
   @Nullable
   private final clv l;

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   public ddw(@Nullable clv $$0, djo.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, ic.b));
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dil(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return a($$2, dhf.x, dil::a);
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.b;
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else if ($$3.P_()) {
         return bkc.b;
      } else if ($$1.c_($$2) instanceof dil $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(asd.aq);
            ceh.a($$3, true);
         }

         return bkc.b;
      } else {
         return bkc.d;
      }
   }

   private static boolean a(djp $$0, ctx $$1, hx $$2, dil $$3) {
      if ($$3.m() != dil.a.a) {
         return true;
      } else {
         elx $$4 = cdc.a($$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public djp a(ctx $$0, hx $$1, djp $$2, cfq $$3) {
      dhd $$4 = $$0.c_($$1);
      if ($$4 instanceof dil $$5) {
         if (!$$0.B && $$3.f() && !$$5.aj_()) {
            cng $$6 = b(this.b());
            $$4.e($$6);
            if ($$5.ae()) {
               $$6.a($$5.af());
            }

            ccb $$7 = new ccb($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.u();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cng> a(djp $$0, ehl.a $$1) {
      dhd $$2 = $$1.b(ejq.h);
      if ($$2 instanceof dil $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      if ($$4.A()) {
         dhd $$5 = $$0.c_($$1);
         if ($$5 instanceof dil) {
            ((dil)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dhd $$5 = $$1.c_($$2);
         if ($$5 instanceof dil) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cng $$0, @Nullable ctd $$1, List<vg> $$2, coy $$3) {
      super.a($$0, $$1, $$2, $$3);
      so $$4 = cla.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(vg.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            iq<cng> $$5 = iq.a(27, cng.f);
            bjw.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (cng $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     $$2.add(vg.a("container.shulkerBox.itemCount", $$8.y(), String.valueOf($$8.L())));
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(vg.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public emv b_(djp $$0, ctd $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dil $$4 && !$$4.x()) {
         return k.get($$0.c(b).g());
      }

      return ems.b();
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      dhd $$4 = $$1.c_($$2);
      return $$4 instanceof dil ? ems.a(((dil)$$4).a($$0)) : ems.b();
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return cij.a($$1.c_($$2));
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      cng $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dhf.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static clv b(cnb $$0) {
      return a(cwy.a($$0));
   }

   @Nullable
   public static clv a(cwy $$0) {
      return $$0 instanceof ddw ? ((ddw)$$0).b() : null;
   }

   public static cwy a(@Nullable clv $$0) {
      if ($$0 == null) {
         return cxa.kP;
      } else {
         switch ($$0) {
            case a:
               return cxa.kQ;
            case b:
               return cxa.kR;
            case c:
               return cxa.kS;
            case d:
               return cxa.kT;
            case e:
               return cxa.kU;
            case f:
               return cxa.kV;
            case g:
               return cxa.kW;
            case h:
               return cxa.kX;
            case i:
               return cxa.kY;
            case j:
               return cxa.kZ;
            case k:
            default:
               return cxa.la;
            case l:
               return cxa.lb;
            case m:
               return cxa.lc;
            case n:
               return cxa.ld;
            case o:
               return cxa.le;
            case p:
               return cxa.lf;
         }
      }
   }

   @Nullable
   public clv b() {
      return this.l;
   }

   public static cng b(@Nullable clv $$0) {
      return new cng(a($$0));
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
