import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dea extends dbt {
   public static final MapCodec<dea> a = b(dea::new);
   public static final dpz b = dpy.bx;
   public static final dpz c = dpy.A;
   private static final dqg<il> d = dpy.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cvt g = new cvt(10);

   public dea(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, il.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dea> a() {
      return a;
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return $$1.c_($$2) instanceof dnc $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dmo $$8 = $$1.c_($$2);
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
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return $$0.B ? null : a($$2, dmq.P, dnc::a);
   }

   private void a(@Nullable dmo $$0, boolean $$1) {
      if ($$0 instanceof dnc $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      dnc $$2 = new dnc($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dpi a(cux $$0) {
      ij $$1 = $$0.d().g();

      ij $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ij.b;
      };
      return this.n().a(d, il.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqt $$3, crs $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      bob.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         dmo $$5 = $$1.c_($$2);
         if ($$5 instanceof dnc) {
            $$3.a((dnc)$$5);
         }

         return bof.b;
      }
   }

   protected void a(dpi $$0, apu $$1, id $$2) {
      if ($$1.c_($$2) instanceof dnc $$3) {
         Optional<cvj> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cvj $$6 = $$5.get();
            crs $$7 = $$6.a($$3, $$1.H_());
            if ($$7.d()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0);

               for (crs $$8 : $$6.a($$3)) {
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

   public static Optional<cvj> a(czg $$0, cnm $$1) {
      return g.a($$0, $$1);
   }

   private void a(czg $$0, id $$1, dnc $$2, crs $$3, dpi $$4) {
      ij $$5 = $$4.c(d).a();
      bny $$6 = dnn.a($$0, $$1.a($$5));
      crs $$7 = $$3.r();
      if ($$6 != null && ($$6 instanceof dnc || $$3.G() > $$6.ah_())) {
         while (!$$7.d()) {
            crs $$8 = $$7.c(1);
            crs $$9 = dnn.a($$2, $$6, $$8, $$5.g());
            if (!$$9.d()) {
               break;
            }

            $$7.g(1);
         }
      } else if ($$6 != null) {
         while (!$$7.d()) {
            int $$10 = $$7.G();
            $$7 = dnn.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.G()) {
               break;
            }
         }
      }

      if (!$$7.d()) {
         esj $$11 = esj.b($$1).a($$5, 0.7);
         jy.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(d, c, b);
   }
}
