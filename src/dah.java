import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dah extends cya {
   public static final MapCodec<dah> a = b(dah::new);
   public static final dlw b = dlv.bx;
   public static final dlw c = dlv.A;
   private static final dmd<ih> d = dlv.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final csc g = new csc(10);

   public dah(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ih.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dah> a() {
      return a;
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return $$1.c_($$2) instanceof djh $$4 ? $$4.w() : 0;
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dit $$8 = $$1.c_($$2);
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
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return $$0.B ? null : a($$2, div.P, djh::a);
   }

   private void a(@Nullable dit $$0, boolean $$1) {
      if ($$0 instanceof djh $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      djh $$2 = new djh($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dlf a(crg $$0) {
      ie $$1 = $$0.d().g();

      ie $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ie.b;
      };
      return this.o().a(d, ih.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
      if ($$4.B() && $$0.c_($$1) instanceof djh $$5) {
         $$5.a($$4.z());
      }

      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      blq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         dit $$5 = $$1.c_($$2);
         if ($$5 instanceof djh) {
            $$3.a((djh)$$5);
         }

         return blu.b;
      }
   }

   protected void a(dlf $$0, aov $$1, hz $$2) {
      if ($$1.c_($$2) instanceof djh $$3) {
         Optional<crs> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            crs $$6 = $$5.get();
            coz $$7 = $$6.a($$3, $$1.I_());
            if ($$7.b()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0);

               for (coz $$8 : $$6.a($$3)) {
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

   public static Optional<crs> a(cvn $$0, ckr $$1) {
      return g.a($$0, $$1);
   }

   private void a(cvn $$0, hz $$1, djh $$2, coz $$3, dlf $$4) {
      ie $$5 = $$4.c(d).a();
      bln $$6 = djs.a($$0, $$1.a($$5));
      coz $$7 = $$3.q();
      if ($$6 != null && ($$6 instanceof djh || $$3.M() > $$6.al_())) {
         while (!$$7.b()) {
            coz $$8 = $$7.c(1);
            coz $$9 = djs.a($$2, $$6, $$8, $$5.g());
            if (!$$9.b()) {
               break;
            }

            $$7.h(1);
         }
      } else if ($$6 != null) {
         while (!$$7.b()) {
            int $$10 = $$7.M();
            $$7 = djs.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.M()) {
               break;
            }
         }
      }

      if (!$$7.b()) {
         ens $$11 = ens.b($$1).a($$5, 0.7);
         jk.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(d, c, b);
   }
}
