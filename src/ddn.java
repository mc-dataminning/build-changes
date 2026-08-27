import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddn extends cwb {
   public static final MapCodec<ddn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cll.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), u())
            .apply($$0, ($$0x, $$1) -> new ddn((cll)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final eml e = cwp.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eml f = cwp.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eml g = cwp.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eml h = cwp.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eml i = cwp.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eml j = cwp.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ic, eml> k = ac.a(Maps.newEnumMap(ic.class), $$0 -> {
      $$0.put(ic.c, i);
      $$0.put(ic.f, h);
      $$0.put(ic.d, j);
      $$0.put(ic.e, g);
      $$0.put(ic.b, e);
      $$0.put(ic.a, f);
   });
   public static final dke<ic> b = cys.a;
   public static final ahg c = new ahg("contents");
   @Nullable
   private final cll l;

   @Override
   public MapCodec<ddn> a() {
      return a;
   }

   public ddn(@Nullable cll $$0, djf.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, ic.b));
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dic(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return a($$2, dgw.x, dic::a);
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.b;
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else if ($$3.P_()) {
         return bka.b;
      } else if ($$1.c_($$2) instanceof dic $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(asb.aq);
            cdy.a($$3, true);
         }

         return bka.b;
      } else {
         return bka.d;
      }
   }

   private static boolean a(djg $$0, cto $$1, hx $$2, dic $$3) {
      if ($$3.m() != dic.a.a) {
         return true;
      } else {
         eln $$4 = ccu.a($$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public djg a(cto $$0, hx $$1, djg $$2, cfh $$3) {
      dgu $$4 = $$0.c_($$1);
      if ($$4 instanceof dic $$5) {
         if (!$$0.B && $$3.f() && !$$5.ai_()) {
            cmx $$6 = b(this.b());
            $$4.e($$6);
            if ($$5.ae()) {
               $$6.a($$5.af());
            }

            cbt $$7 = new cbt($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.u();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cmx> a(djg $$0, ehb.a $$1) {
      dgu $$2 = $$1.b(ejg.h);
      if ($$2 instanceof dic $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      if ($$4.A()) {
         dgu $$5 = $$0.c_($$1);
         if ($$5 instanceof dic) {
            ((dic)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgu $$5 = $$1.c_($$2);
         if ($$5 instanceof dic) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cmx $$0, @Nullable csu $$1, List<vf> $$2, cop $$3) {
      super.a($$0, $$1, $$2, $$3);
      sn $$4 = ckq.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(vf.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            iq<cmx> $$5 = iq.a(27, cmx.f);
            bju.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (cmx $$8 : $$5) {
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
   public eml b_(djg $$0, csu $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dic $$4 && !$$4.x()) {
         return k.get($$0.c(b).g());
      }

      return emi.b();
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      dgu $$4 = $$1.c_($$2);
      return $$4 instanceof dic ? emi.a(((dic)$$4).a($$0)) : emi.b();
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return cia.a($$1.c_($$2));
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      cmx $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dgw.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static cll b(cms $$0) {
      return a(cwp.a($$0));
   }

   @Nullable
   public static cll a(cwp $$0) {
      return $$0 instanceof ddn ? ((ddn)$$0).b() : null;
   }

   public static cwp a(@Nullable cll $$0) {
      if ($$0 == null) {
         return cwr.kP;
      } else {
         switch ($$0) {
            case a:
               return cwr.kQ;
            case b:
               return cwr.kR;
            case c:
               return cwr.kS;
            case d:
               return cwr.kT;
            case e:
               return cwr.kU;
            case f:
               return cwr.kV;
            case g:
               return cwr.kW;
            case h:
               return cwr.kX;
            case i:
               return cwr.kY;
            case j:
               return cwr.kZ;
            case k:
            default:
               return cwr.la;
            case l:
               return cwr.lb;
            case m:
               return cwr.lc;
            case n:
               return cwr.ld;
            case o:
               return cwr.le;
            case p:
               return cwr.lf;
         }
      }
   }

   @Nullable
   public cll b() {
      return this.l;
   }

   public static cmx b(@Nullable cll $$0) {
      return new cmx(a($$0));
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
