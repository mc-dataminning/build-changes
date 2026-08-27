import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddo extends cwc {
   public static final MapCodec<ddo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(clm.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), u())
            .apply($$0, ($$0x, $$1) -> new ddo((clm)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final emm e = cwq.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final emm f = cwq.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final emm g = cwq.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final emm h = cwq.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final emm i = cwq.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final emm j = cwq.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ic, emm> k = ac.a(Maps.newEnumMap(ic.class), $$0 -> {
      $$0.put(ic.c, i);
      $$0.put(ic.f, h);
      $$0.put(ic.d, j);
      $$0.put(ic.e, g);
      $$0.put(ic.b, e);
      $$0.put(ic.a, f);
   });
   public static final dkf<ic> b = cyt.a;
   public static final ahg c = new ahg("contents");
   @Nullable
   private final clm l;

   @Override
   public MapCodec<ddo> a() {
      return a;
   }

   public ddo(@Nullable clm $$0, djg.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, ic.b));
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new did(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return a($$2, dgx.x, did::a);
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.b;
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else if ($$3.P_()) {
         return bkb.b;
      } else if ($$1.c_($$2) instanceof did $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(asc.aq);
            cdz.a($$3, true);
         }

         return bkb.b;
      } else {
         return bkb.d;
      }
   }

   private static boolean a(djh $$0, ctp $$1, hx $$2, did $$3) {
      if ($$3.m() != did.a.a) {
         return true;
      } else {
         elo $$4 = ccv.a($$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public djh a(ctp $$0, hx $$1, djh $$2, cfi $$3) {
      dgv $$4 = $$0.c_($$1);
      if ($$4 instanceof did $$5) {
         if (!$$0.B && $$3.f() && !$$5.ai_()) {
            cmy $$6 = b(this.b());
            $$4.e($$6);
            if ($$5.ae()) {
               $$6.a($$5.af());
            }

            cbu $$7 = new cbu($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.u();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cmy> a(djh $$0, ehc.a $$1) {
      dgv $$2 = $$1.b(ejh.h);
      if ($$2 instanceof did $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      if ($$4.A()) {
         dgv $$5 = $$0.c_($$1);
         if ($$5 instanceof did) {
            ((did)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgv $$5 = $$1.c_($$2);
         if ($$5 instanceof did) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cmy $$0, @Nullable csv $$1, List<vf> $$2, coq $$3) {
      super.a($$0, $$1, $$2, $$3);
      sn $$4 = ckr.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(vf.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            iq<cmy> $$5 = iq.a(27, cmy.f);
            bjv.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (cmy $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     $$2.add(vf.a("container.shulkerBox.itemCount", $$8.y(), String.valueOf($$8.L())));
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(vf.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public emm b_(djh $$0, csv $$1, hx $$2) {
      if ($$1.c_($$2) instanceof did $$4 && !$$4.x()) {
         return k.get($$0.c(b).g());
      }

      return emj.b();
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      dgv $$4 = $$1.c_($$2);
      return $$4 instanceof did ? emj.a(((did)$$4).a($$0)) : emj.b();
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return cib.a($$1.c_($$2));
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      cmy $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dgx.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static clm b(cmt $$0) {
      return a(cwq.a($$0));
   }

   @Nullable
   public static clm a(cwq $$0) {
      return $$0 instanceof ddo ? ((ddo)$$0).b() : null;
   }

   public static cwq a(@Nullable clm $$0) {
      if ($$0 == null) {
         return cws.kP;
      } else {
         switch ($$0) {
            case a:
               return cws.kQ;
            case b:
               return cws.kR;
            case c:
               return cws.kS;
            case d:
               return cws.kT;
            case e:
               return cws.kU;
            case f:
               return cws.kV;
            case g:
               return cws.kW;
            case h:
               return cws.kX;
            case i:
               return cws.kY;
            case j:
               return cws.kZ;
            case k:
            default:
               return cws.la;
            case l:
               return cws.lb;
            case m:
               return cws.lc;
            case n:
               return cws.ld;
            case o:
               return cws.le;
            case p:
               return cws.lf;
         }
      }
   }

   @Nullable
   public clm b() {
      return this.l;
   }

   public static cmy b(@Nullable clm $$0) {
      return new cmy(a($$0));
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
