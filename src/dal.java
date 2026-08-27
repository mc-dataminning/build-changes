import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dal extends cye {
   public static final MapCodec<dal> a = b(dal::new);
   public static final dma b = dlz.bx;
   public static final dma c = dlz.A;
   private static final dmh<ih> d = dlz.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final csg g = new csg(10);

   public dal(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ih.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dal> a() {
      return a;
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return $$1.c_($$2) instanceof djl $$4 ? $$4.w() : 0;
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dix $$8 = $$1.c_($$2);
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
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return $$0.B ? null : a($$2, diz.P, djl::a);
   }

   private void a(@Nullable dix $$0, boolean $$1) {
      if ($$0 instanceof djl $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      djl $$2 = new djl($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dlj a(crk $$0) {
      ie $$1 = $$0.d().g();

      ie $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ie.b;
      };
      return this.o().a(d, ih.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      if ($$4.B() && $$0.c_($$1) instanceof djl $$5) {
         $$5.a($$4.z());
      }

      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      bls.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         dix $$5 = $$1.c_($$2);
         if ($$5 instanceof djl) {
            $$3.a((djl)$$5);
         }

         return blw.b;
      }
   }

   protected void a(dlj $$0, aow $$1, hz $$2) {
      if ($$1.c_($$2) instanceof djl $$3) {
         Optional<crw> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            crw $$6 = $$5.get();
            cpd $$7 = $$6.a($$3, $$1.I_());
            if ($$7.b()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0);

               for (cpd $$8 : $$6.a($$3)) {
                  if (!$$8.b()) {
                     this.a($$1, $$2, $$3, $$8, $$0);
                  }
               }

               $$3.k().forEach($$0x -> {
                  if (!$$0x.b()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<crw> a(cvr $$0, ckv $$1) {
      return g.a($$0, $$1);
   }

   private void a(cvr $$0, hz $$1, djl $$2, cpd $$3, dlj $$4) {
      ie $$5 = $$4.c(d).a();
      blp $$6 = djw.a($$0, $$1.a($$5));
      cpd $$7 = $$3.q();
      if ($$6 != null && ($$6 instanceof djl || $$3.M() > $$6.al_())) {
         while (!$$7.b()) {
            cpd $$8 = $$7.c(1);
            cpd $$9 = djw.a($$2, $$6, $$8, $$5.g());
            if (!$$9.b()) {
               break;
            }

            $$7.h(1);
         }
      } else if ($$6 != null) {
         while (!$$7.b()) {
            int $$10 = $$7.M();
            $$7 = djw.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.M()) {
               break;
            }
         }
      }

      if (!$$7.b()) {
         enz $$11 = enz.b($$1).a($$5, 0.7);
         jk.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(d, c, b);
   }
}
