import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class deo extends dch {
   public static final MapCodec<deo> a = b(deo::new);
   public static final dqp b = dqo.bx;
   public static final dqp c = dqo.A;
   private static final dqw<it> d = dqo.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cwh g = new cwh(10);

   public deo(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, it.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<deo> a() {
      return a;
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return $$1.c_($$2) instanceof dnr $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dnd $$8 = $$1.c_($$2);
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
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return $$0.B ? null : a($$2, dnf.P, dnr::a);
   }

   private void a(@Nullable dnd $$0, boolean $$1) {
      if ($$0 instanceof dnr $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      dnr $$2 = new dnr($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dpy a(cvl $$0) {
      ir $$1 = $$0.d().g();

      ir $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ir.b;
      };
      return this.n().a(d, it.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bre $$3, csd $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      bom.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         dnd $$5 = $$1.c_($$2);
         if ($$5 instanceof dnr) {
            $$3.a((dnr)$$5);
         }

         return boq.b;
      }
   }

   protected void a(dpy $$0, aqe $$1, im $$2) {
      if ($$1.c_($$2) instanceof dnr $$3) {
         Optional<cvx> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cvx $$6 = $$5.get();
            csd $$7 = $$6.a($$3, $$1.H_());
            if ($$7.d()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0);

               for (csd $$8 : $$6.a($$3)) {
                  if (!$$8.d()) {
                     this.a($$1, $$2, $$3, $$8, $$0);
                  }
               }

               $$3.j().forEach($$0x -> {
                  if (!$$0x.d()) {
                     $$0x.g(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<cvx> a(czu $$0, cnx $$1) {
      return g.a($$0, $$1);
   }

   private void a(czu $$0, im $$1, dnr $$2, csd $$3, dpy $$4) {
      ir $$5 = $$4.c(d).a();
      boj $$6 = doc.a($$0, $$1.a($$5));
      csd $$7 = $$3.r();
      if ($$6 != null && ($$6 instanceof dnr || $$3.G() > $$6.ah_())) {
         while (!$$7.d()) {
            csd $$8 = $$7.c(1);
            csd $$9 = doc.a($$2, $$6, $$8, $$5.g());
            if (!$$9.d()) {
               break;
            }

            $$7.g(1);
         }
      } else if ($$6 != null) {
         while (!$$7.d()) {
            int $$10 = $$7.G();
            $$7 = doc.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.G()) {
               break;
            }
         }
      }

      if (!$$7.d()) {
         etf $$11 = etf.b($$1).a($$5, 0.7);
         kg.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(d, c, b);
   }
}
