import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dft extends ddm {
   public static final MapCodec<dft> a = b(dft::new);
   public static final dru b = drt.bx;
   public static final dru c = drt.A;
   private static final dsb<iv> d = drt.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cxx g = new cxx(10);
   private static final int h = 17;

   public dft(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, iv.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dft> a() {
      return a;
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return $$1.c_($$2) instanceof dow $$4 ? $$4.u() : 0;
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      doi $$8 = $$1.c_($$2);
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
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return $$0.B ? null : a($$2, dok.P, dow::a);
   }

   private void a(@Nullable doi $$0, boolean $$1) {
      if ($$0 instanceof dow $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public doi a(io $$0, drd $$1) {
      dow $$2 = new dow($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public drd a(cxb $$0) {
      it $$1 = $$0.d().g();

      it $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> it.b;
      };
      return this.n().a(d, iv.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, bsq $$3, ctq $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      bps.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         doi $$5 = $$1.c_($$2);
         if ($$5 instanceof dow) {
            $$3.a((dow)$$5);
         }

         return bpw.b;
      }
   }

   protected void a(drd $$0, aqn $$1, io $$2) {
      if ($$1.c_($$2) instanceof dow $$3) {
         Optional<cxy<cxn>> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cxy<cxn> $$6 = $$5.get();
            ctq $$7 = $$6.b().a($$3, $$1.H_());
            if ($$7.e()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0, $$6);

               for (ctq $$8 : $$6.b().a($$3)) {
                  if (!$$8.e()) {
                     this.a($$1, $$2, $$3, $$8, $$0, $$6);
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

   public static Optional<cxy<cxn>> a(daz $$0, cpl $$1) {
      return g.a($$0, $$1);
   }

   private void a(aqn $$0, io $$1, dow $$2, ctq $$3, drd $$4, cxy<cxn> $$5) {
      it $$6 = $$4.c(d).a();
      bpp $$7 = dph.a($$0, $$1.a($$6));
      ctq $$8 = $$3.s();
      if ($$7 != null && ($$7 instanceof dow || $$3.I() > $$7.e_($$3))) {
         while (!$$8.e()) {
            ctq $$9 = $$8.c(1);
            ctq $$10 = dph.a($$2, $$7, $$9, $$6.g());
            if (!$$10.e()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.e()) {
            int $$11 = $$8.I();
            $$8 = dph.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.I()) {
               break;
            }
         }
      }

      if (!$$8.e()) {
         eum $$12 = eum.b($$1);
         eum $$13 = $$12.a($$6, 0.7);
         kh.a($$0, $$8, 6, $$6, $$13);

         for (aqo $$14 : $$0.a(aqo.class, euh.a($$12, 17.0, 17.0, 17.0))) {
            am.ad.a($$14, $$5.a(), $$2.j());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(d, c, b);
   }
}
