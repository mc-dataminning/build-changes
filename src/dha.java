import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dha extends czo {
   public static final MapCodec<dha> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cpd.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), u())
            .apply($$0, ($$0x, $$1) -> new dha((cpd)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final eqm e = dac.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqm f = dac.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eqm g = dac.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eqm h = dac.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqm i = dac.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eqm j = dac.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ih, eqm> k = ac.a(Maps.newEnumMap(ih.class), $$0 -> {
      $$0.put(ih.c, i);
      $$0.put(ih.f, h);
      $$0.put(ih.d, j);
      $$0.put(ih.e, g);
      $$0.put(ih.b, e);
      $$0.put(ih.a, f);
   });
   public static final dnz<ih> b = dcf.a;
   public static final ajh c = new ajh("contents");
   @Nullable
   private final cpd l;

   @Override
   public MapCodec<dha> a() {
      return a;
   }

   public dha(@Nullable cpd $$0, dna.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, ih.b));
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlq(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return a($$2, dkk.x, dlq::a);
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.b;
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else if ($$3.N_()) {
         return bnd.b;
      } else if ($$1.c_($$2) instanceof dlq $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(aui.aq);
            chl.a($$3, true);
         }

         return bnd.b;
      } else {
         return bnd.d;
      }
   }

   private static boolean a(dnb $$0, cxb $$1, ib $$2, dlq $$3) {
      if ($$3.l() != dlq.a.a) {
         return true;
      } else {
         epo $$4 = cgg.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Override
   public dnb a(cxb $$0, ib $$1, dnb $$2, ciu $$3) {
      dki $$4 = $$0.c_($$1);
      if ($$4 instanceof dlq $$5) {
         if (!$$0.B && $$3.f() && !$$5.ai_()) {
            cqm $$6 = b(this.b());
            $$4.a($$6, $$0.H_());
            if ($$5.ae()) {
               $$6.a($$5.af());
            }

            cfe $$7 = new cfe($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.s();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cqm> a(dnb $$0, elc.a $$1) {
      dki $$2 = $$1.b(enh.h);
      if ($$2 instanceof dlq $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      if ($$4.B()) {
         dki $$5 = $$0.c_($$1);
         if ($$5 instanceof dlq) {
            ((dlq)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dki $$5 = $$1.c_($$2);
         if ($$5 instanceof dlq) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cqm $$0, @Nullable cwh $$1, List<vu> $$2, csd $$3, @Nullable iz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      ta $$5 = coh.a($$0);
      if ($$5 != null) {
         if ($$5.b("LootTable", 8)) {
            $$2.add(vu.c("container.shulkerBox.unknownContents"));
         }

         if ($$5.b("Items", 9)) {
            iu<cqm> $$6 = iu.a(27, cqm.h);
            bmx.b($$5, $$6);
            int $$7 = 0;
            int $$8 = 0;

            for (cqm $$9 : $$6) {
               if (!$$9.b()) {
                  $$8++;
                  if ($$7 <= 4) {
                     $$7++;
                     $$2.add(vu.a("container.shulkerBox.itemCount", $$9.z(), String.valueOf($$9.M())));
                  }
               }
            }

            if ($$8 - $$7 > 0) {
               $$2.add(vu.a("container.shulkerBox.more", $$8 - $$7).a(n.u));
            }
         }
      }
   }

   @Override
   protected eqm b_(dnb $$0, cwh $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dlq $$4 && !$$4.t()) {
         return k.get($$0.c(b).g());
      }

      return eqj.b();
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      dki $$4 = $$1.c_($$2);
      return $$4 instanceof dlq ? eqj.a(((dlq)$$4).a($$0)) : eqj.b();
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return clq.a($$1.c_($$2));
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      cqm $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dkk.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static cpd b(cqh $$0) {
      return a(dac.a($$0));
   }

   @Nullable
   public static cpd a(dac $$0) {
      return $$0 instanceof dha ? ((dha)$$0).b() : null;
   }

   public static dac a(@Nullable cpd $$0) {
      if ($$0 == null) {
         return dae.kP;
      } else {
         switch ($$0) {
            case a:
               return dae.kQ;
            case b:
               return dae.kR;
            case c:
               return dae.kS;
            case d:
               return dae.kT;
            case e:
               return dae.kU;
            case f:
               return dae.kV;
            case g:
               return dae.kW;
            case h:
               return dae.kX;
            case i:
               return dae.kY;
            case j:
               return dae.kZ;
            case k:
            default:
               return dae.la;
            case l:
               return dae.lb;
            case m:
               return dae.lc;
            case n:
               return dae.ld;
            case o:
               return dae.le;
            case p:
               return dae.lf;
         }
      }
   }

   @Nullable
   public cpd b() {
      return this.l;
   }

   public static cqm b(@Nullable cpd $$0) {
      return new cqm(a($$0));
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
