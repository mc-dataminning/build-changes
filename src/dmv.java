import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dmv extends dkg implements dsb {
   public static final MapCodec<dmv> a = b(dmv::new);
   public static final ald b = ald.b("sherds");
   public static final dzk<jo> c = dzc.T;
   public static final dzd d = dzc.bz;
   public static final dzd e = dzc.I;
   private static final fdo f = dku.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   protected dmv(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, jo.c).b(e, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g()).b(e, Boolean.valueOf($$1.a() == euu.c)).b(d, Boolean.valueOf(false));
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if ($$2.c_($$3) instanceof dwd $$7) {
         if ($$2.C) {
            return btq.a;
         } else {
            cxy $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cxy.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(dwd.a.a);
               $$4.b(awu.c.b($$0.h()));
               cxy $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.k();
               }

               $$2.a(null, $$3, awk.gT, awl.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arn $$13) {
                  $$13.a(lv.ba, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, edm.c, $$3);
               return btq.a;
            } else {
               return btq.f;
            }
         }
      } else {
         return btq.e;
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$1.c_($$2) instanceof dwd $$5) {
         $$1.a(null, $$2, awk.gU, awl.e, 1.0F, 1.0F);
         $$5.a(dwd.a.b);
         $$1.a($$3, edm.c, $$2);
         return btq.a;
      } else {
         return btq.e;
      }
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return f;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwd($$0, $$1);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      btm.a($$0, $$1, $$2);
   }

   @Override
   protected List<cxy> a(dym $$0, exo.a $$1) {
      dvl $$2 = $$1.b(faf.h);
      if ($$2 instanceof dwd $$3) {
         $$1.a(b, $$1x -> {
            for (cxu $$2x : $$3.s().a()) {
               $$1x.accept($$2x.n());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dym a(dhp $$0, jj $$1, dym $$2, cqi $$3) {
      cxy $$4 = $$3.fa();
      dym $$5 = $$2;
      if ($$4.a(axi.bL) && !dej.a($$4, axc.r)) {
         $$5 = $$2.b(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 260);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(e) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsn h_(dym $$0) {
      return $$0.c(d) ? dsn.bd : dsn.bc;
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      super.a($$0, $$1, $$2, $$3);
      dwt $$4 = $$0.a(kx.am, dwt.a);
      if (!$$4.equals(dwt.a)) {
         $$2.add(wu.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cxy($$1x.orElse(cyc.rw), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dhp $$0, dym $$1, fcq $$2, crb $$3) {
      jj $$4 = $$2.b();
      if ($$0 instanceof arn $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof dwd $$4) {
         dwt $$5 = $$4.s();
         return dwd.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return ctn.a($$1.c_($$2));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
