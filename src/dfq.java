import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfq extends cye {
   public static final MapCodec<dfq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cnr.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.l)), u())
            .apply($$0, ($$0x, $$1) -> new dfq((cnr)$$0x.orElse(null), $$1))
   );
   private static final float d = 1.0F;
   private static final eos e = cys.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eos f = cys.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eos g = cys.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eos h = cys.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eos i = cys.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eos j = cys.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ie, eos> k = ac.a(Maps.newEnumMap(ie.class), $$0 -> {
      $$0.put(ie.c, i);
      $$0.put(ie.f, h);
      $$0.put(ie.d, j);
      $$0.put(ie.e, g);
      $$0.put(ie.b, e);
      $$0.put(ie.a, f);
   });
   public static final dmh<ie> b = dav.a;
   public static final aiy c = new aiy("contents");
   @Nullable
   private final cnr l;

   @Override
   public MapCodec<dfq> a() {
      return a;
   }

   public dfq(@Nullable cnr $$0, dli.d $$1) {
      super($$1);
      this.l = $$0;
      this.k(this.E.b().a(b, ie.b));
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dkf(this.l, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return a($$2, diz.x, dkf::a);
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.b;
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else if ($$3.P_()) {
         return blw.b;
      } else if ($$1.c_($$2) instanceof dkf $$6) {
         if (a($$0, $$1, $$2, $$6)) {
            $$3.a($$6);
            $$3.a(atv.aq);
            cgc.a($$3, true);
         }

         return blw.b;
      } else {
         return blw.d;
      }
   }

   private static boolean a(dlj $$0, cvr $$1, hz $$2, dkf $$3) {
      if ($$3.m() != dkf.a.a) {
         return true;
      } else {
         enu $$4 = cex.a(1.0F, $$0.c(b), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(b, $$0.k());
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   @Override
   public dlj a(cvr $$0, hz $$1, dlj $$2, chl $$3) {
      dix $$4 = $$0.c_($$1);
      if ($$4 instanceof dkf $$5) {
         if (!$$0.B && $$3.f() && !$$5.aj_()) {
            cpd $$6 = b(this.b());
            $$4.e($$6);
            if ($$5.ae()) {
               $$6.a($$5.af());
            }

            cdw $$7 = new cdw($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.u();
            $$0.b($$7);
         } else {
            $$5.e_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cpd> a(dlj $$0, eji.a $$1) {
      dix $$2 = $$1.b(eln.h);
      if ($$2 instanceof dkf $$3) {
         $$1 = $$1.a(c, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      if ($$4.B()) {
         dix $$5 = $$0.c_($$1);
         if ($$5 instanceof dkf) {
            ((dkf)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dix $$5 = $$1.c_($$2);
         if ($$5 instanceof dkf) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cpd $$0, @Nullable cux $$1, List<vq> $$2, cqu $$3) {
      super.a($$0, $$1, $$2, $$3);
      sw $$4 = cmw.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(vq.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            is<cpd> $$5 = is.a(27, cpd.h);
            blq.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (cpd $$8 : $$5) {
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
   protected eos b_(dlj $$0, cux $$1, hz $$2) {
      if ($$1.c_($$2) instanceof dkf $$4 && !$$4.x()) {
         return k.get($$0.c(b).g());
      }

      return eop.b();
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      dix $$4 = $$1.c_($$2);
      return $$4 instanceof dkf ? eop.a(((dkf)$$4).a($$0)) : eop.b();
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return ckf.a($$1.c_($$2));
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      cpd $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, diz.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static cnr b(coy $$0) {
      return a(cys.a($$0));
   }

   @Nullable
   public static cnr a(cys $$0) {
      return $$0 instanceof dfq ? ((dfq)$$0).b() : null;
   }

   public static cys a(@Nullable cnr $$0) {
      if ($$0 == null) {
         return cyu.kP;
      } else {
         switch ($$0) {
            case a:
               return cyu.kQ;
            case b:
               return cyu.kR;
            case c:
               return cyu.kS;
            case d:
               return cyu.kT;
            case e:
               return cyu.kU;
            case f:
               return cyu.kV;
            case g:
               return cyu.kW;
            case h:
               return cyu.kX;
            case i:
               return cyu.kY;
            case j:
               return cyu.kZ;
            case k:
            default:
               return cyu.la;
            case l:
               return cyu.lb;
            case m:
               return cyu.lc;
            case n:
               return cyu.ld;
            case o:
               return cyu.le;
            case p:
               return cyu.lf;
         }
      }
   }

   @Nullable
   public cnr b() {
      return this.l;
   }

   public static cpd b(@Nullable cnr $$0) {
      return new cpd(a($$0));
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
