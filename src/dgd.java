import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgd extends cyr {
   public static final MapCodec<dgd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cog.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), u())
            .apply($$0, ($$0x, $$1) -> new dgd((cog)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final epo e = czf.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final epo f = czf.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final epo g = czf.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final epo h = czf.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final epo i = czf.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final epo j = czf.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ih, epo> k = ac.a(Maps.newEnumMap(ih.class), $$0 -> {
      $$0.put(ih.c, i);
      $$0.put(ih.f, h);
      $$0.put(ih.d, j);
      $$0.put(ih.e, g);
      $$0.put(ih.b, e);
      $$0.put(ih.a, f);
   });
   public static final dnc<ih> b = dbi.a;
   public static final ajc c = new ajc("contents");
   @Nullable
   private final cog l;

   @Override
   public MapCodec<dgd> a() {
      return a;
   }

   public dgd(@Nullable cog $$0, dmd.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, ih.b));
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkt(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return a($$2, djn.x, dkt::a);
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.b;
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else if ($$3.P_()) {
         return bml.b;
      } else if ($$1.c_($$2) instanceof dkt $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(atz.aq);
            cgr.a($$3, true);
         }

         return bml.b;
      } else {
         return bml.d;
      }
   }

   private static boolean a(dme $$0, cwe $$1, ib $$2, dkt $$3) {
      if ($$3.l() != dkt.a.a) {
         return true;
      } else {
         eoq $$4 = cfm.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   public dme a(cwe $$0, ib $$1, dme $$2, cia $$3) {
      djl $$4 = $$0.c_($$1);
      if ($$4 instanceof dkt $$5) {
         if (!$$0.B && $$3.f() && !$$5.aj_()) {
            cpq $$6 = b(this.b());
            $$4.a($$6, $$0.I_());
            if ($$5.ae()) {
               $$6.a($$5.af());
            }

            cel $$7 = new cel($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.u();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cpq> a(dme $$0, eke.a $$1) {
      djl $$2 = $$1.b(emj.h);
      if ($$2 instanceof dkt $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      if ($$4.B()) {
         djl $$5 = $$0.c_($$1);
         if ($$5 instanceof dkt) {
            ((dkt)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         djl $$5 = $$1.c_($$2);
         if ($$5 instanceof dkt) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cpq $$0, @Nullable cvk $$1, List<vs> $$2, crh $$3, @Nullable iy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      sy $$5 = cnl.a($$0);
      if ($$5 != null) {
         if ($$5.b("LootTable", 8)) {
            $$2.add(vs.c("container.shulkerBox.unknownContents"));
         }

         if ($$5.b("Items", 9)) {
            iu<cpq> $$6 = iu.a(27, cpq.h);
            bmf.b($$5, $$6);
            int $$7 = 0;
            int $$8 = 0;

            for (cpq $$9 : $$6) {
               if (!$$9.b()) {
                  $$8++;
                  if ($$7 <= 4) {
                     $$7++;
                     $$2.add(vs.a("container.shulkerBox.itemCount", $$9.z(), String.valueOf($$9.M())));
                  }
               }
            }

            if ($$8 - $$7 > 0) {
               $$2.add(vs.a("container.shulkerBox.more", $$8 - $$7).a(n.u));
            }
         }
      }
   }

   @Override
   protected epo b_(dme $$0, cvk $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dkt $$4 && !$$4.t()) {
         return k.get($$0.c(b).g());
      }

      return epl.b();
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      djl $$4 = $$1.c_($$2);
      return $$4 instanceof dkt ? epl.a(((dkt)$$4).a($$0)) : epl.b();
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return cku.a($$1.c_($$2));
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      cpq $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, djn.x).ifPresent($$2x -> $$2x.a($$3, $$0.I_()));
      return $$3;
   }

   @Nullable
   public static cog b(cpl $$0) {
      return a(czf.a($$0));
   }

   @Nullable
   public static cog a(czf $$0) {
      return $$0 instanceof dgd ? ((dgd)$$0).b() : null;
   }

   public static czf a(@Nullable cog $$0) {
      if ($$0 == null) {
         return czh.kP;
      } else {
         switch ($$0) {
            case a:
               return czh.kQ;
            case b:
               return czh.kR;
            case c:
               return czh.kS;
            case d:
               return czh.kT;
            case e:
               return czh.kU;
            case f:
               return czh.kV;
            case g:
               return czh.kW;
            case h:
               return czh.kX;
            case i:
               return czh.kY;
            case j:
               return czh.kZ;
            case k:
            default:
               return czh.la;
            case l:
               return czh.lb;
            case m:
               return czh.lc;
            case n:
               return czh.ld;
            case o:
               return czh.le;
            case p:
               return czh.lf;
         }
      }
   }

   @Nullable
   public cog b() {
      return this.l;
   }

   public static cpq b(@Nullable cog $$0) {
      return new cpq(a($$0));
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
