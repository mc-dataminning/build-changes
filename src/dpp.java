import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dpp extends dna implements duz {
   public static final MapCodec<dpp> a = b(dpp::new);
   public static final alr b = alr.b("sherds");
   public static final eco<jc> c = ecg.T;
   public static final ech d = ecg.bz;
   public static final ech e = ecg.I;
   private static final fgw f = dno.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dpp> a() {
      return a;
   }

   protected dpp(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, jc.c).b(e, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g()).b(e, Boolean.valueOf($$1.a() == eyb.c)).b(d, Boolean.valueOf(false));
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if ($$2.c_($$3) instanceof dzg $$7) {
         if ($$2.C) {
            return bvc.a;
         } else {
            dak $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || dak.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(dzg.a.a);
               $$4.b(axi.c.b($$0.h()));
               dak $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.k();
               }

               $$2.a(null, $$3, awy.gW, awz.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof asb $$13) {
                  $$13.a(lz.ba, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, egq.c, $$3);
               return bvc.a;
            } else {
               return bvc.f;
            }
         }
      } else {
         return bvc.e;
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$1.c_($$2) instanceof dzg $$5) {
         $$1.a(null, $$2, awy.gX, awz.e, 1.0F, 1.0F);
         $$5.a(dzg.a.b);
         $$1.a($$3, egq.c, $$2);
         return bvc.a;
      } else {
         return bvc.e;
      }
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return f;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzg($$0, $$1);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      buy.a($$0, $$1, $$2);
   }

   @Override
   protected List<dak> a(ebq $$0, faw.a $$1) {
      dyo $$2 = $$1.b(fdn.h);
      if ($$2 instanceof dzg $$3) {
         $$1.a(b, $$1x -> {
            for (dag $$2x : $$3.s().a()) {
               $$1x.accept($$2x.m());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public ebq a(dkj $$0, iw $$1, ebq $$2, csi $$3) {
      dak $$4 = $$3.fb();
      ebq $$5 = $$2;
      if ($$4.a(axv.bN) && !dgz.a($$4, axp.r)) {
         $$5 = $$2.b(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 260);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(e) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvl h_(ebq $$0) {
      return $$0.c(d) ? dvl.be : dvl.bd;
   }

   @Override
   protected void a(dkj $$0, ebq $$1, ffy $$2, ctd $$3) {
      iw $$4 = $$2.b();
      if ($$0 instanceof asb $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof dzg $$4) {
         dzw $$5 = $$4.s();
         return dzg.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return cwb.a($$1.c_($$2));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
