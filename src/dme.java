import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dme extends der {
   public static final MapCodec<dme> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cst.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dme((cst)$$0x.orElse(null), $$1))
   );
   private static final wu d = wu.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final ews f = dff.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ews g = dff.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ews h = dff.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ews i = dff.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ews j = dff.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ews k = dff.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jf, ews> l = ac.a(Maps.newEnumMap(jf.class), $$0 -> {
      $$0.put(jf.c, j);
      $$0.put(jf.f, i);
      $$0.put(jf.d, k);
      $$0.put(jf.e, h);
      $$0.put(jf.b, f);
      $$0.put(jf.a, g);
   });
   public static final dtf<jf> b = dhi.a;
   public static final akk c = new akk("contents");
   @Nullable
   private final cst m;

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   public dme(@Nullable cst $$0, dsg.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, jf.b));
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqw(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return a($$2, dpp.x, dqw::a);
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.b;
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else if ($$3.N_()) {
         return bqd.c;
      } else if ($$1.c_($$2) instanceof dqw $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(avp.aq);
            cky.a($$3, true);
         }

         return bqd.c;
      } else {
         return bqd.e;
      }
   }

   private static boolean a(dsh $$0, dcd $$1, ja $$2, dqw $$3) {
      if ($$3.l() != dqw.a.a) {
         return true;
      } else {
         evu $$4 = cjt.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Override
   public dsh a(dcd $$0, ja $$1, dsh $$2, cmh $$3) {
      dpn $$4 = $$0.c_($$1);
      if ($$4 instanceof dqw $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            cua $$6 = b(this.b());
            $$6.b($$4.s());
            cir $$7 = new cir($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cua> a(dsh $$0, eqr.a $$1) {
      dpn $$2 = $$1.b(etk.h);
      if ($$2 instanceof dqw $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpn $$5 = $$1.c_($$2);
         if ($$5 instanceof dqw) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kn.ae)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (cua $$6 : $$0.a(kn.aa, cwv.a).d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(wu.a("container.shulkerBox.itemCount", $$6.w(), $$6.H()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(wu.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected ews b_(dsh $$0, dbj $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dqw $$4 && !$$4.v()) {
         return l.get($$0.c(b).g());
      }

      return ewp.b();
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      dpn $$4 = $$1.c_($$2);
      return $$4 instanceof dqw ? ewp.a(((dqw)$$4).a($$0)) : ewp.b();
   }

   @Override
   protected boolean a_(dsh $$0, dbj $$1, ja $$2) {
      return false;
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return cpe.a($$1.c_($$2));
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      cua $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dpp.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static cst b(ctv $$0) {
      return a(dff.a($$0));
   }

   @Nullable
   public static cst a(dff $$0) {
      return $$0 instanceof dme ? ((dme)$$0).b() : null;
   }

   public static dff a(@Nullable cst $$0) {
      if ($$0 == null) {
         return dfh.kP;
      } else {
         return switch ($$0) {
            case a -> dfh.kQ;
            case b -> dfh.kR;
            case c -> dfh.kS;
            case d -> dfh.kT;
            case e -> dfh.kU;
            case f -> dfh.kV;
            case g -> dfh.kW;
            case h -> dfh.kX;
            case i -> dfh.kY;
            case j -> dfh.kZ;
            case l -> dfh.lb;
            case m -> dfh.lc;
            case n -> dfh.ld;
            case o -> dfh.le;
            case p -> dfh.lf;
            case k -> dfh.la;
         };
      }
   }

   @Nullable
   public cst b() {
      return this.m;
   }

   public static cua b(@Nullable cst $$0) {
      return new cua(a($$0));
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
