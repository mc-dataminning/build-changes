import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class czj extends crx {
   private static final float c = 1.0F;
   private static final ehy d = csk.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehy e = csk.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ehy f = csk.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ehy g = csk.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehy h = csk.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ehy i = csk.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<hb, ehy> j = ac.a(Maps.newEnumMap(hb.class), $$0 -> {
      $$0.put(hb.c, h);
      $$0.put(hb.f, g);
      $$0.put(hb.d, i);
      $$0.put(hb.e, f);
      $$0.put(hb.b, d);
      $$0.put(hb.a, e);
   });
   public static final dfw<hb> a = cuj.a;
   public static final aep b = new aep("contents");
   @Nullable
   private final chk k;

   public czj(@Nullable chk $$0, dex.d $$1) {
      super($$1);
      this.k = $$0;
      this.k(this.C.b().a(a, hb.b));
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddr(this.k, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return a($$2, dcm.x, ddr::a);
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.b;
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         return bgo.a;
      } else if ($$3.G_()) {
         return bgo.b;
      } else if ($$1.c_($$2) instanceof ddr $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(ape.aq);
            cac.a($$3, true);
         }

         return bgo.b;
      } else {
         return bgo.d;
      }
   }

   private static boolean a(dey $$0, cpk $$1, gv $$2, ddr $$3) {
      if ($$3.i() != ddr.a.a) {
         return true;
      } else {
         eha $$4 = bzf.a($$0.c(a), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dey a(cle $$0) {
      return this.n().a(a, $$0.k());
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, cbl $$3) {
      dck $$4 = $$0.c_($$1);
      if ($$4 instanceof ddr $$5) {
         if (!$$0.B && $$3.f() && !$$5.ab_()) {
            ciw $$6 = b(this.a());
            $$4.e($$6);
            if ($$5.ac()) {
               $$6.a($$5.ad());
            }

            bye $$7 = new bye($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.o();
            $$0.b($$7);
         } else {
            $$5.e($$3);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<ciw> a(dey $$0, ecn.a $$1) {
      dck $$2 = $$1.b(eet.h);
      if ($$2 instanceof ddr $$3) {
         $$1 = $$1.a(b, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      if ($$4.A()) {
         dck $$5 = $$0.c_($$1);
         if ($$5 instanceof ddr) {
            ((ddr)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dck $$5 = $$1.c_($$2);
         if ($$5 instanceof ddr) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(ciw $$0, @Nullable coq $$1, List<te> $$2, ckn $$3) {
      super.a($$0, $$1, $$2, $$3);
      qs $$4 = cgp.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(te.b("???????"));
         }

         if ($$4.b("Items", 9)) {
            ho<ciw> $$5 = ho.a(27, ciw.b);
            bgi.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (ciw $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     tr $$9 = $$8.y().e();
                     $$9.f(" x").f(String.valueOf($$8.L()));
                     $$2.add($$9);
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(te.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public ehy b_(dey $$0, coq $$1, gv $$2) {
      if ($$1.c_($$2) instanceof ddr $$4 && !$$4.v()) {
         return j.get($$0.c(a).g());
      }

      return ehv.b();
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      dck $$4 = $$1.c_($$2);
      return $$4 instanceof ddr ? ehv.a(((ddr)$$4).a($$0)) : ehv.b();
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return cec.b((bgh)$$1.c_($$2));
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      ciw $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dcm.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static chk b(cir $$0) {
      return a(csk.a($$0));
   }

   @Nullable
   public static chk a(csk $$0) {
      return $$0 instanceof czj ? ((czj)$$0).a() : null;
   }

   public static csk a(@Nullable chk $$0) {
      if ($$0 == null) {
         return csl.kP;
      } else {
         switch ($$0) {
            case a:
               return csl.kQ;
            case b:
               return csl.kR;
            case c:
               return csl.kS;
            case d:
               return csl.kT;
            case e:
               return csl.kU;
            case f:
               return csl.kV;
            case g:
               return csl.kW;
            case h:
               return csl.kX;
            case i:
               return csl.kY;
            case j:
               return csl.kZ;
            case k:
            default:
               return csl.la;
            case l:
               return csl.lb;
            case m:
               return csl.lc;
            case n:
               return csl.ld;
            case o:
               return csl.le;
            case p:
               return csl.lf;
         }
      }
   }

   @Nullable
   public chk a() {
      return this.k;
   }

   public static ciw b(@Nullable chk $$0) {
      return new ciw(a($$0));
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }
}
