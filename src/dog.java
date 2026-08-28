import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dog extends dlr implements dtq {
   public static final MapCodec<dog> a = b(dog::new);
   public static final alg b = alg.b("sherds");
   public static final ebf<ja> c = eax.T;
   public static final eay d = eax.bz;
   public static final eay e = eax.I;
   private static final ffk f = dmf.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dog> a() {
      return a;
   }

   protected dog(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, ja.c).b(e, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g()).b(e, Boolean.valueOf($$1.a() == ewp.c)).b(d, Boolean.valueOf(false));
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if ($$2.c_($$3) instanceof dxx $$7) {
         if ($$2.C) {
            return bud.a;
         } else {
            czd $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || czd.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(dxx.a.a);
               $$4.b(awx.c.b($$0.h()));
               czd $$10 = $$0.b(1, $$4);
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
                  $$13.a(lx.ba, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, efh.c, $$3);
               return bud.a;
            } else {
               return bud.f;
            }
         }
      } else {
         return bud.e;
      }
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$1.c_($$2) instanceof dxx $$5) {
         $$1.a(null, $$2, awn.gX, awo.e, 1.0F, 1.0F);
         $$5.a(dxx.a.b);
         $$1.a($$3, efh.c, $$2);
         return bud.a;
      } else {
         return bud.e;
      }
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return f;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dxx($$0, $$1);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      btz.a($$0, $$1, $$2);
   }

   @Override
   protected List<czd> a(eah $$0, ezk.a $$1) {
      dxf $$2 = $$1.b(fcb.h);
      if ($$2 instanceof dxx $$3) {
         $$1.a(b, $$1x -> {
            for (cyz $$2x : $$3.s().a()) {
               $$1x.accept($$2x.m());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public eah a(dja $$0, iu $$1, eah $$2, crc $$3) {
      czd $$4 = $$3.fb();
      eah $$5 = $$2;
      if ($$4.a(axk.bM) && !dfs.a($$4, axe.r)) {
         $$5 = $$2.b(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 260);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(e) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected duc h_(eah $$0) {
      return $$0.c(d) ? duc.be : duc.bd;
   }

   @Override
   protected void a(dja $$0, eah $$1, fem $$2, crx $$3) {
      iu $$4 = $$2.b();
      if ($$0 instanceof arq $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof dxx $$4) {
         dyn $$5 = $$4.s();
         return dxx.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return cuv.a($$1.c_($$2));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
