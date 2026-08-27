import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class czk extends cry {
   private static final float c = 1.0F;
   private static final ehw d = csl.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehw e = csl.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ehw f = csl.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ehw g = csl.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehw h = csl.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ehw i = csl.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ha, ehw> j = ac.a(Maps.newEnumMap(ha.class), $$0 -> {
      $$0.put(ha.c, h);
      $$0.put(ha.f, g);
      $$0.put(ha.d, i);
      $$0.put(ha.e, f);
      $$0.put(ha.b, d);
      $$0.put(ha.a, e);
   });
   public static final dfx<ha> a = cuk.a;
   public static final aer b = new aer("contents");
   @Nullable
   private final chl k;

   public czk(@Nullable chl $$0, dey.d $$1) {
      super($$1);
      this.k = $$0;
      this.k(this.C.b().a(a, ha.b));
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dds(this.k, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return a($$2, dcn.x, dds::a);
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.b;
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         return bgq.a;
      } else if ($$3.G_()) {
         return bgq.b;
      } else if ($$1.c_($$2) instanceof dds $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(apg.aq);
            cad.a($$3, true);
         }

         return bgq.b;
      } else {
         return bgq.d;
      }
   }

   private static boolean a(dez $$0, cpl $$1, gu $$2, dds $$3) {
      if ($$3.i() != dds.a.a) {
         return true;
      } else {
         egy $$4 = bzg.a($$0.c(a), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dez a(clf $$0) {
      return this.n().a(a, $$0.k());
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, cbm $$3) {
      dcl $$4 = $$0.c_($$1);
      if ($$4 instanceof dds $$5) {
         if (!$$0.B && $$3.f() && !$$5.aa_()) {
            cix $$6 = b(this.a());
            $$4.e($$6);
            if ($$5.ac()) {
               $$6.a($$5.ad());
            }

            byf $$7 = new byf($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.o();
            $$0.b($$7);
         } else {
            $$5.e($$3);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cix> a(dez $$0, ecm.a $$1) {
      dcl $$2 = $$1.b(eer.h);
      if ($$2 instanceof dds $$3) {
         $$1 = $$1.a(b, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
      if ($$4.A()) {
         dcl $$5 = $$0.c_($$1);
         if ($$5 instanceof dds) {
            ((dds)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcl $$5 = $$1.c_($$2);
         if ($$5 instanceof dds) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cix $$0, @Nullable cor $$1, List<tf> $$2, cko $$3) {
      super.a($$0, $$1, $$2, $$3);
      qr $$4 = cgq.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(tf.b("???????"));
         }

         if ($$4.b("Items", 9)) {
            hn<cix> $$5 = hn.a(27, cix.b);
            bgk.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (cix $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     ts $$9 = $$8.y().e();
                     $$9.f(" x").f(String.valueOf($$8.L()));
                     $$2.add($$9);
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(tf.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public ehw b_(dez $$0, cor $$1, gu $$2) {
      if ($$1.c_($$2) instanceof dds $$4 && !$$4.v()) {
         return j.get($$0.c(a).g());
      }

      return eht.b();
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      dcl $$4 = $$1.c_($$2);
      return $$4 instanceof dds ? eht.a(((dds)$$4).a($$0)) : eht.b();
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      return ced.b((bgj)$$1.c_($$2));
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      cix $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dcn.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static chl b(cis $$0) {
      return a(csl.a($$0));
   }

   @Nullable
   public static chl a(csl $$0) {
      return $$0 instanceof czk ? ((czk)$$0).a() : null;
   }

   public static csl a(@Nullable chl $$0) {
      if ($$0 == null) {
         return csm.kP;
      } else {
         switch ($$0) {
            case a:
               return csm.kQ;
            case b:
               return csm.kR;
            case c:
               return csm.kS;
            case d:
               return csm.kT;
            case e:
               return csm.kU;
            case f:
               return csm.kV;
            case g:
               return csm.kW;
            case h:
               return csm.kX;
            case i:
               return csm.kY;
            case j:
               return csm.kZ;
            case k:
            default:
               return csm.la;
            case l:
               return csm.lb;
            case m:
               return csm.lc;
            case n:
               return csm.ld;
            case o:
               return csm.le;
            case p:
               return csm.lf;
         }
      }
   }

   @Nullable
   public chl a() {
      return this.k;
   }

   public static cix b(@Nullable chl $$0) {
      return new cix(a($$0));
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }
}
