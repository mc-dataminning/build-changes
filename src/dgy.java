import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgy extends czm {
   public static final MapCodec<dgy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cpb.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), u())
            .apply($$0, ($$0x, $$1) -> new dgy((cpb)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final eqk e = daa.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqk f = daa.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eqk g = daa.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eqk h = daa.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqk i = daa.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eqk j = daa.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ih, eqk> k = ac.a(Maps.newEnumMap(ih.class), $$0 -> {
      $$0.put(ih.c, i);
      $$0.put(ih.f, h);
      $$0.put(ih.d, j);
      $$0.put(ih.e, g);
      $$0.put(ih.b, e);
      $$0.put(ih.a, f);
   });
   public static final dnx<ih> b = dcd.a;
   public static final ajh c = new ajh("contents");
   @Nullable
   private final cpb l;

   @Override
   public MapCodec<dgy> a() {
      return a;
   }

   public dgy(@Nullable cpb $$0, dmy.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, ih.b));
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlo(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return a($$2, dki.x, dlo::a);
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.b;
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else if ($$3.N_()) {
         return bnc.b;
      } else if ($$1.c_($$2) instanceof dlo $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(aui.aq);
            chj.a($$3, true);
         }

         return bnc.b;
      } else {
         return bnc.d;
      }
   }

   private static boolean a(dmz $$0, cwz $$1, ib $$2, dlo $$3) {
      if ($$3.l() != dlo.a.a) {
         return true;
      } else {
         epm $$4 = cge.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   public dmz a(cwz $$0, ib $$1, dmz $$2, cis $$3) {
      dkg $$4 = $$0.c_($$1);
      if ($$4 instanceof dlo $$5) {
         if (!$$0.B && $$3.f() && !$$5.ai_()) {
            cqk $$6 = b(this.b());
            $$4.a($$6, $$0.H_());
            if ($$5.ae()) {
               $$6.a($$5.af());
            }

            cfd $$7 = new cfd($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.s();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cqk> a(dmz $$0, ela.a $$1) {
      dkg $$2 = $$1.b(enf.h);
      if ($$2 instanceof dlo $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      if ($$4.B()) {
         dkg $$5 = $$0.c_($$1);
         if ($$5 instanceof dlo) {
            ((dlo)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dkg $$5 = $$1.c_($$2);
         if ($$5 instanceof dlo) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cqk $$0, @Nullable cwf $$1, List<vu> $$2, csb $$3, @Nullable iz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      ta $$5 = cof.a($$0);
      if ($$5 != null) {
         if ($$5.b("LootTable", 8)) {
            $$2.add(vu.c("container.shulkerBox.unknownContents"));
         }

         if ($$5.b("Items", 9)) {
            iu<cqk> $$6 = iu.a(27, cqk.h);
            bmw.b($$5, $$6);
            int $$7 = 0;
            int $$8 = 0;

            for (cqk $$9 : $$6) {
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
   protected eqk b_(dmz $$0, cwf $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dlo $$4 && !$$4.t()) {
         return k.get($$0.c(b).g());
      }

      return eqh.b();
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      dkg $$4 = $$1.c_($$2);
      return $$4 instanceof dlo ? eqh.a(((dlo)$$4).a($$0)) : eqh.b();
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return clo.a($$1.c_($$2));
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      cqk $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dki.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static cpb b(cqf $$0) {
      return a(daa.a($$0));
   }

   @Nullable
   public static cpb a(daa $$0) {
      return $$0 instanceof dgy ? ((dgy)$$0).b() : null;
   }

   public static daa a(@Nullable cpb $$0) {
      if ($$0 == null) {
         return dac.kP;
      } else {
         switch ($$0) {
            case a:
               return dac.kQ;
            case b:
               return dac.kR;
            case c:
               return dac.kS;
            case d:
               return dac.kT;
            case e:
               return dac.kU;
            case f:
               return dac.kV;
            case g:
               return dac.kW;
            case h:
               return dac.kX;
            case i:
               return dac.kY;
            case j:
               return dac.kZ;
            case k:
            default:
               return dac.la;
            case l:
               return dac.lb;
            case m:
               return dac.lc;
            case n:
               return dac.ld;
            case o:
               return dac.le;
            case p:
               return dac.lf;
         }
      }
   }

   @Nullable
   public cpb b() {
      return this.l;
   }

   public static cqk b(@Nullable cpb $$0) {
      return new cqk(a($$0));
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
