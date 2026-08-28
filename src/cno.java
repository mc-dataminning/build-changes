import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cno extends cnj implements cmz {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<btb> c = $$0 -> $$0.fm() || $$0.bR();

   public cno(bsm<? extends cno> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cno(dcf $$0, btb $$1) {
      super(bsm.aE, $$1, $$0);
   }

   public cno(dcf $$0, double $$1, double $$2, double $$3) {
      super(bsm.aE, $$1, $$2, $$3, $$0);
   }

   @Override
   protected ctx u() {
      return cuf.vo;
   }

   @Override
   protected double aZ() {
      return 0.05;
   }

   @Override
   protected void a(ewb $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         cuc $$1 = this.p();
         jf $$2 = $$0.b();
         ja $$3 = $$0.a();
         ja $$4 = $$3.a($$2);
         cwd $$5 = $$1.a(kn.G, cwd.a);
         if ($$5.a(cwe.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jf $$6 : jf.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         cuc $$1 = this.p();
         cwd $$2 = $$1.a(kn.G, cwd.a);
         if ($$2.a(cwe.a)) {
            this.v();
         } else if ($$2.c()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == ewd.a.c ? ((ewc)$$0).a() : null);
            }
         }

         int $$3 = $$2.e().isPresent() && $$2.e().get().a().b() ? 2007 : 2002;
         this.dQ().c($$3, this.dq(), $$2.b());
         this.ap();
      }
   }

   private void v() {
      ewa $$0 = this.cL().c(4.0, 2.0, 4.0);

      for (btb $$2 : this.dQ().a(btb.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fm()) {
               $$2.a(this.dR().c(this, this.s()), 1.0F);
            }

            if ($$2.bR() && $$2.bE()) {
               $$2.aI();
            }
         }
      }

      for (cgd $$5 : this.dQ().a(cgd.class, $$0)) {
         $$5.s();
      }
   }

   private void a(Iterable<bro> $$0, @Nullable bsg $$1) {
      ewa $$2 = this.cL().c(4.0, 2.0, 4.0);
      List<btb> $$3 = this.dQ().a(btb.class, $$2);
      if (!$$3.isEmpty()) {
         bsg $$4 = this.I();

         for (btb $$5 : $$3) {
            if ($$5.fD()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bro $$9 : $$0) {
                     jj<brm> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bro $$12 = new bro($$10, $$11, $$9.e(), $$9.f(), $$9.g());
                        if (!$$12.a(20)) {
                           $$5.b($$12, $$4);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void a(cwd $$0) {
      bsc $$1 = new bsc(this.dQ(), this.dv(), this.dx(), this.dB());
      if (this.s() instanceof btb $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.j());
      $$1.a($$0);
      this.dQ().b($$1);
   }

   private boolean w() {
      return this.p().a(cuf.vr);
   }

   private void a(ja $$0) {
      dsk $$1 = this.dQ().a_($$0);
      if ($$1.a(avw.aK)) {
         this.dQ().a($$0, false, this);
      } else if (ddz.c($$1)) {
         ddz.a(null, $$1, this.dQ(), $$0);
      } else if (dfv.g($$1)) {
         this.dQ().a(null, 1009, $$0, 0);
         dfv.a(this.s(), this.dQ(), $$0, $$1);
         this.dQ().b($$0, $$1.a(dfv.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(btb $$0, bqz $$1) {
      double $$2 = $$0.do().c - this.do().c;
      double $$3 = $$0.do().e - this.do().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
