import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class djf extends dgy {
   public static final MapCodec<djf> a = b(djf::new);
   public static final dvj b = dvi.bx;
   public static final dvj c = dvi.A;
   private static final dvq<jm> d = dvi.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final dal g = new dal(10);
   private static final int h = 17;

   public djf(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jm.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<djf> a() {
      return a;
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return $$1.c_($$2) instanceof dsj $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      drv $$8 = $$1.c_($$2);
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
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return $$0.B ? null : a($$2, drx.P, dsj::a);
   }

   private void a(@Nullable drv $$0, boolean $$1) {
      if ($$0 instanceof dsj $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      dsj $$2 = new dsj($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dus a(czn $$0) {
      jk $$1 = $$0.d().g();

      jk $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jk.b;
      };
      return this.n().b(d, jm.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, bun $$3, cvs $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      bro.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dsj $$5) {
         $$3.a($$5);
      }

      return brs.a;
   }

   protected void a(dus $$0, arj $$1, jf $$2) {
      if ($$1.c_($$2) instanceof dsj $$3) {
         czz var11 = $$3.aD_();
         Optional<dam<daa>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dam<daa> $$7 = $$6.get();
            cvs $$8 = $$7.b().a(var11, $$1.G_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cvs $$9 : $$7.b().a(var11)) {
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

   public static Optional<dam<daa>> a(dej $$0, czz $$1) {
      return g.a($$0, $$1);
   }

   private void a(arj $$0, jf $$1, dsj $$2, cvs $$3, dus $$4, dam<daa> $$5) {
      jk $$6 = $$4.c(d).a();
      brl $$7 = dsw.a($$0, $$1.a($$6));
      cvs $$8 = $$3.u();
      if ($$7 != null && ($$7 instanceof dsj || $$3.K() > $$7.f_($$3))) {
         while (!$$8.f()) {
            cvs $$9 = $$8.c(1);
            cvs $$10 = dsw.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.K();
            $$8 = dsw.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.K()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         eyw $$12 = eyw.b($$1);
         eyw $$13 = $$12.a($$6, 0.7);
         ky.a($$0, $$8, 6, $$6, $$13);

         for (ark $$14 : $$0.a(ark.class, eyr.a($$12, 17.0, 17.0, 17.0))) {
            an.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(d, c, b);
   }
}
