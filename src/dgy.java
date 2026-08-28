import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgy extends der {
   public static final MapCodec<dgy> a = b(dgy::new);
   public static final dsy b = dsx.bx;
   public static final dsy c = dsx.A;
   private static final dtf<jh> d = dsx.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cyh g = new cyh(10);
   private static final int h = 17;

   public dgy(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, jh.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dgy> a() {
      return a;
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return $$1.c_($$2) instanceof dqb $$4 ? $$4.u() : 0;
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dpn $$8 = $$1.c_($$2);
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
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return $$0.B ? null : a($$2, dpp.P, dqb::a);
   }

   private void a(@Nullable dpn $$0, boolean $$1) {
      if ($$0 instanceof dqb $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      dqb $$2 = new dqb($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dsh a(cxk $$0) {
      jf $$1 = $$0.d().g();

      jf $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jf.b;
      };
      return this.o().a(d, jh.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsy $$3, cua $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      bpz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         dpn $$5 = $$1.c_($$2);
         if ($$5 instanceof dqb) {
            $$3.a((dqb)$$5);
         }

         return bqd.c;
      }
   }

   protected void a(dsh $$0, aqk $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dqb $$3) {
         cxw var11 = $$3.aA_();
         Optional<cyi<cxx>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cyi<cxx> $$7 = $$6.get();
            cua $$8 = $$7.b().a(var11, $$1.H_());
            if ($$8.e()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cua $$9 : $$7.b().a(var11)) {
                  if (!$$9.e()) {
                     this.a($$1, $$2, $$3, $$9, $$0, $$7);
                  }
               }

               $$3.j().forEach($$0x -> {
                  if (!$$0x.e()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<cyi<cxx>> a(dcd $$0, cxw $$1) {
      return g.a($$0, $$1);
   }

   private void a(aqk $$0, ja $$1, dqb $$2, cua $$3, dsh $$4, cyi<cxx> $$5) {
      jf $$6 = $$4.c(d).a();
      bpw $$7 = dqm.a($$0, $$1.a($$6));
      cua $$8 = $$3.s();
      if ($$7 != null && ($$7 instanceof dqb || $$3.H() > $$7.e_($$3))) {
         while (!$$8.e()) {
            cua $$9 = $$8.c(1);
            cua $$10 = dqm.a($$2, $$7, $$9, $$6.g());
            if (!$$10.e()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.e()) {
            int $$11 = $$8.H();
            $$8 = dqm.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.H()) {
               break;
            }
         }
      }

      if (!$$8.e()) {
         evz $$12 = evz.b($$1);
         evz $$13 = $$12.a($$6, 0.7);
         kt.a($$0, $$8, 6, $$6, $$13);

         for (aql $$14 : $$0.a(aql.class, evu.a($$12, 17.0, 17.0, 17.0))) {
            am.ad.a($$14, $$5.a(), $$2.j());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(d, c, b);
   }
}
