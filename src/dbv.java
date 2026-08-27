import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbv extends czo {
   public static final MapCodec<dbv> a = b(dbv::new);
   public static final dns b = dnr.bx;
   public static final dns c = dnr.A;
   private static final dnz<ij> d = dnr.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final ctq g = new ctq(10);

   public dbv(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ij.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dbv> a() {
      return a;
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return $$1.c_($$2) instanceof dkw $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dki $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
         this.a($$8, false);
      }
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return $$0.B ? null : a($$2, dkk.P, dkw::a);
   }

   private void a(@Nullable dki $$0, boolean $$1) {
      if ($$0 instanceof dkw $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      dkw $$2 = new dkw($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dnb a(csu $$0) {
      ih $$1 = $$0.d().g();

      ih $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ih.b;
      };
      return this.o().a(d, ij.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      if ($$4.B() && $$0.c_($$1) instanceof dkw $$5) {
         $$5.a($$4.z());
      }

      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      bmz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         dki $$5 = $$1.c_($$2);
         if ($$5 instanceof dkw) {
            $$3.a((dkw)$$5);
         }

         return bnd.b;
      }
   }

   protected void a(dnb $$0, apf $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dkw $$3) {
         Optional<ctg> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            ctg $$6 = $$5.get();
            cqm $$7 = $$6.a($$3, $$1.H_());
            if ($$7.b()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0);

               for (cqm $$8 : $$6.a($$3)) {
                  if (!$$8.b()) {
                     this.a($$1, $$2, $$3, $$8, $$0);
                  }
               }

               $$3.j().forEach($$0x -> {
                  if (!$$0x.b()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<ctg> a(cxb $$0, cmg $$1) {
      return g.a($$0, $$1);
   }

   private void a(cxb $$0, ib $$1, dkw $$2, cqm $$3, dnb $$4) {
      ih $$5 = $$4.c(d).a();
      bmw $$6 = dlh.a($$0, $$1.a($$5));
      cqm $$7 = $$3.q();
      if ($$6 != null && ($$6 instanceof dkw || $$3.M() > $$6.ak_())) {
         while (!$$7.b()) {
            cqm $$8 = $$7.c(1);
            cqm $$9 = dlh.a($$2, $$6, $$8, $$5.g());
            if (!$$9.b()) {
               break;
            }

            $$7.h(1);
         }
      } else if ($$6 != null) {
         while (!$$7.b()) {
            int $$10 = $$7.M();
            $$7 = dlh.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.M()) {
               break;
            }
         }
      }

      if (!$$7.b()) {
         ept $$11 = ept.b($$1).a($$5, 0.7);
         jn.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(d, c, b);
   }
}
