import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dld extends diw {
   public static final MapCodec<dld> a = b(dld::new);
   public static final dxm b = dxl.bA;
   public static final dxm c = dxl.H;
   private static final dxs<jp> d = dxl.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final dbg g = new dbg(10);
   private static final int h = 17;

   public dld(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jp.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dld> a() {
      return a;
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return $$1.c_($$2) instanceof dul $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dtx $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)), 2);
         this.a($$8, false);
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return $$0.C ? null : a($$2, dtz.Q, dul::a);
   }

   private void a(@Nullable dtx $$0, boolean $$1) {
      if ($$0 instanceof dul $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      dul $$2 = new dul($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dwv a(dae $$0) {
      jn $$1 = $$0.d().g();

      jn $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jn.b;
      };
      return this.m().b(d, jp.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, bvf $$3, cwn $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      bse.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dul $$5) {
         $$3.a($$5);
      }

      return bsi.a;
   }

   protected void a(dwv $$0, arc $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dul $$3) {
         daq var11 = $$3.aB_();
         Optional<dbh<dar>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dbh<dar> $$7 = $$6.get();
            cwn $$8 = $$7.b().a(var11, $$1.K_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cwn $$9 : $$7.b().a(var11)) {
                  if (!$$9.f()) {
                     this.a($$1, $$2, $$3, $$9, $$0, $$7);
                  }
               }

               $$3.f().forEach($$0x -> {
                  if (!$$0x.f()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<dbh<dar>> a(arc $$0, daq $$1) {
      return g.a($$0, $$1);
   }

   private void a(arc $$0, ji $$1, dul $$2, cwn $$3, dwv $$4, dbh<?> $$5) {
      jn $$6 = $$4.c(d).a();
      bsb $$7 = duz.a($$0, $$1.a($$6));
      cwn $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dul || $$3.M() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cwn $$9 = $$8.c(1);
            cwn $$10 = duz.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = duz.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         fay $$12 = fay.b($$1);
         fay $$13 = $$12.a($$6, 0.7);
         lb.a($$0, $$8, 6, $$6, $$13);

         for (ard $$14 : $$0.a(ard.class, fat.a($$12, 17.0, 17.0, 17.0))) {
            ap.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(d, c, b);
   }
}
