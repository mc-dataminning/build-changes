import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dpd extends dmo implements dun {
   public static final MapCodec<dpd> a = b(dpd::new);
   public static final ali b = ali.b("sherds");
   public static final ecc<jb> c = ebu.T;
   public static final ebv d = ebu.bz;
   public static final ebv e = ebu.I;
   private static final fgk f = dnc.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dpd> a() {
      return a;
   }

   protected dpd(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, jb.c).b(e, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g()).b(e, Boolean.valueOf($$1.a() == exp.c)).b(d, Boolean.valueOf(false));
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if ($$2.c_($$3) instanceof dyu $$7) {
         if ($$2.C) {
            return bur.a;
         } else {
            czy $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || czy.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(dyu.a.a);
               $$4.b(awz.c.b($$0.h()));
               czy $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.k();
               }

               $$2.a(null, $$3, awp.gW, awq.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof ars $$13) {
                  $$13.a(ly.ba, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, ege.c, $$3);
               return bur.a;
            } else {
               return bur.f;
            }
         }
      } else {
         return bur.e;
      }
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$1.c_($$2) instanceof dyu $$5) {
         $$1.a(null, $$2, awp.gX, awq.e, 1.0F, 1.0F);
         $$5.a(dyu.a.b);
         $$1.a($$3, ege.c, $$2);
         return bur.a;
      } else {
         return bur.e;
      }
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return f;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dyu($$0, $$1);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      bun.a($$0, $$1, $$2);
   }

   @Override
   protected List<czy> a(ebe $$0, fak.a $$1) {
      dyc $$2 = $$1.b(fdb.h);
      if ($$2 instanceof dyu $$3) {
         $$1.a(b, $$1x -> {
            for (czu $$2x : $$3.s().a()) {
               $$1x.accept($$2x.m());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public ebe a(djx $$0, iv $$1, ebe $$2, crx $$3) {
      czy $$4 = $$3.fb();
      ebe $$5 = $$2;
      if ($$4.a(axm.bM) && !dgn.a($$4, axg.r)) {
         $$5 = $$2.b(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 260);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(e) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected duz h_(ebe $$0) {
      return $$0.c(d) ? duz.be : duz.bd;
   }

   @Override
   protected void a(djx $$0, ebe $$1, ffm $$2, css $$3) {
      iv $$4 = $$2.b();
      if ($$0 instanceof ars $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof dyu $$4) {
         dzk $$5 = $$4.s();
         return dyu.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return cvq.a($$1.c_($$2));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
