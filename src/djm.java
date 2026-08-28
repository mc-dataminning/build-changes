import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class djm extends dgy implements doo {
   public static final MapCodec<djm> a = b(djm::new);
   public static final ale b = ale.b("sherds");
   private static final ezq d = dhm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dvm e = dvi.R;
   public static final dvj c = dvi.bw;
   private static final dvj f = dvi.C;

   @Override
   public MapCodec<djm> a() {
      return a;
   }

   protected djm(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jk.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      return this.n().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == equ.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if ($$2.c_($$3) instanceof dsl $$7) {
         if ($$2.B) {
            return brs.a;
         } else {
            cvs $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cvs.c($$9, $$0) && $$9.K() < $$9.k())) {
               $$7.a(dsl.a.a);
               $$4.b(awq.c.b($$0.h()));
               cvs $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.K() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.K() / (float)$$9.k();
               }

               $$2.a(null, $$3, awg.gz, awh.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arj $$13) {
                  $$13.a(lo.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dzp.c, $$3);
               return brs.a;
            } else {
               return brs.f;
            }
         }
      } else {
         return brs.e;
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if ($$1.c_($$2) instanceof dsl $$5) {
         $$1.a(null, $$2, awg.gA, awh.e, 1.0F, 1.0F);
         $$5.a(dsl.a.b);
         $$1.a($$3, dzp.c, $$2);
         return brs.a;
      } else {
         return brs.e;
      }
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return d;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsl($$0, $$1);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      bro.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cvs> a(dus $$0, eto.a $$1) {
      drv $$2 = $$1.b(ewh.h);
      if ($$2 instanceof dsl $$3) {
         $$1.a(b, $$1x -> {
            for (cvn $$2x : $$3.t().a()) {
               $$1x.accept($$2x.v());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dus a(dej $$0, jf $$1, dus $$2, cnx $$3) {
      cvs $$4 = $$3.eW();
      dus $$5 = $$2;
      if ($$4.a(axe.bA) && !dbp.a($$4, awy.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(f) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected dpa h_(dus $$0) {
      return $$0.c(c) ? dpa.bc : dpa.bb;
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      super.a($$0, $$1, $$2, $$3);
      dtb $$4 = $$0.a(ks.af, dtb.a);
      if (!$$4.equals(dtb.a)) {
         $$2.add(xd.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cvs($$1x.orElse(cvw.qM), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dej $$0, dus $$1, eys $$2, cor $$3) {
      jf $$4 = $$2.b();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return $$0.c_($$1) instanceof dsl $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return cqz.a($$1.c_($$2));
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
