import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class don extends dly implements dtx {
   public static final MapCodec<don> a = b(don::new);
   public static final alg b = alg.b("sherds");
   public static final ebm<jb> c = ebe.T;
   public static final ebf d = ebe.bz;
   public static final ebf e = ebe.I;
   private static final ffr f = dmm.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<don> a() {
      return a;
   }

   protected don(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, jb.c).b(e, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g()).b(e, Boolean.valueOf($$1.a() == eww.c)).b(d, Boolean.valueOf(false));
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if ($$2.c_($$3) instanceof dye $$7) {
         if ($$2.C) {
            return bug.a;
         } else {
            czk $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || czk.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(dye.a.a);
               $$4.b(awx.c.b($$0.h()));
               czk $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.k();
               }

               $$2.a(null, $$3, awn.gW, awo.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arq $$13) {
                  $$13.a(ly.ba, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, efo.c, $$3);
               return bug.a;
            } else {
               return bug.f;
            }
         }
      } else {
         return bug.e;
      }
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$1.c_($$2) instanceof dye $$5) {
         $$1.a(null, $$2, awn.gX, awo.e, 1.0F, 1.0F);
         $$5.a(dye.a.b);
         $$1.a($$3, efo.c, $$2);
         return bug.a;
      } else {
         return bug.e;
      }
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return f;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dye($$0, $$1);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected List<czk> a(eao $$0, ezr.a $$1) {
      dxm $$2 = $$1.b(fci.h);
      if ($$2 instanceof dye $$3) {
         $$1.a(b, $$1x -> {
            for (czg $$2x : $$3.s().a()) {
               $$1x.accept($$2x.m());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public eao a(djh $$0, iv $$1, eao $$2, crj $$3) {
      czk $$4 = $$3.fa();
      eao $$5 = $$2;
      if ($$4.a(axk.bM) && !dfz.a($$4, axe.r)) {
         $$5 = $$2.b(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 260);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(e) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected duj h_(eao $$0) {
      return $$0.c(d) ? duj.be : duj.bd;
   }

   @Override
   protected void a(djh $$0, eao $$1, fet $$2, cse $$3) {
      iv $$4 = $$2.b();
      if ($$0 instanceof arq $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof dye $$4) {
         dyu $$5 = $$4.s();
         return dye.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return cvc.a($$1.c_($$2));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
