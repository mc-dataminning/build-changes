import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkz extends ddm {
   public static final MapCodec<dkz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(csj.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.m)), u())
            .apply($$0, ($$0x, $$1) -> new dkz((csj)$$0x.orElse(null), $$1))
   );
   private static final wx d = wx.c("container.shulkerBox.unknownContents");
   private static final float e = 1.0F;
   private static final evf f = dea.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final evf g = dea.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final evf h = dea.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final evf i = dea.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final evf j = dea.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final evf k = dea.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<it, evf> l = ac.a(Maps.newEnumMap(it.class), $$0 -> {
      $$0.put(it.c, j);
      $$0.put(it.f, i);
      $$0.put(it.d, k);
      $$0.put(it.e, h);
      $$0.put(it.b, f);
      $$0.put(it.a, g);
   });
   public static final dsb<it> b = dgd.a;
   public static final akn c = new akn("contents");
   @Nullable
   private final csj m;

   @Override
   public MapCodec<dkz> a() {
      return a;
   }

   public dkz(@Nullable csj $$0, drc.d $$1) {
      super($$1);
      this.m = $$0;
      this.k(this.E.b().a(b, it.b));
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpr(this.m, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return a($$2, dok.x, dpr::a);
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.b;
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else if ($$3.N_()) {
         return bpw.b;
      } else if ($$1.c_($$2) instanceof dpr $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(avs.aq);
            ckp.a($$3, true);
         }

         return bpw.b;
      } else {
         return bpw.d;
      }
   }

   private static boolean a(drd $$0, daz $$1, io $$2, dpr $$3) {
      if ($$3.l() != dpr.a.a) {
         return true;
      } else {
         euh $$4 = cjk.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(b, $$0.k());
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   @Override
   public drd a(daz $$0, io $$1, drd $$2, cly $$3) {
      doi $$4 = $$0.c_($$1);
      if ($$4 instanceof dpr $$5) {
         if (!$$0.B && $$3.f() && !$$5.c()) {
            ctq $$6 = b(this.b());
            $$6.a($$4.s());
            cii $$7 = new cii($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.v();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<ctq> a(drd $$0, epk.a $$1) {
      doi $$2 = $$1.b(erz.h);
      if ($$2 instanceof dpr $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         doi $$5 = $$1.c_($$2);
         if ($$5 instanceof dpr) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.b(kb.ad)) {
         $$2.add(d);
      }

      int $$4 = 0;
      int $$5 = 0;

      for (ctq $$6 : $$0.a(kb.Z, cwm.a)) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$2.add(wx.a("container.shulkerBox.itemCount", $$6.x(), $$6.I()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$2.add(wx.a("container.shulkerBox.more", $$5 - $$4).a(n.u));
      }
   }

   @Override
   protected evf b_(drd $$0, daf $$1, io $$2) {
      if ($$1.c_($$2) instanceof dpr $$4 && !$$4.v()) {
         return l.get($$0.c(b).g());
      }

      return evc.b();
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      doi $$4 = $$1.c_($$2);
      return $$4 instanceof dpr ? evc.a(((dpr)$$4).a($$0)) : evc.b();
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return cov.a($$1.c_($$2));
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      ctq $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dok.x).ifPresent($$2x -> $$2x.a($$3, $$0.H_()));
      return $$3;
   }

   @Nullable
   public static csj b(ctl $$0) {
      return a(dea.a($$0));
   }

   @Nullable
   public static csj a(dea $$0) {
      return $$0 instanceof dkz ? ((dkz)$$0).b() : null;
   }

   public static dea a(@Nullable csj $$0) {
      if ($$0 == null) {
         return dec.kP;
      } else {
         return switch ($$0) {
            case a -> dec.kQ;
            case b -> dec.kR;
            case c -> dec.kS;
            case d -> dec.kT;
            case e -> dec.kU;
            case f -> dec.kV;
            case g -> dec.kW;
            case h -> dec.kX;
            case i -> dec.kY;
            case j -> dec.kZ;
            case l -> dec.lb;
            case m -> dec.lc;
            case n -> dec.ld;
            case o -> dec.le;
            case p -> dec.lf;
            case k -> dec.la;
         };
      }
   }

   @Nullable
   public csj b() {
      return this.m;
   }

   public static ctq b(@Nullable csj $$0) {
      return new ctq(a($$0));
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
