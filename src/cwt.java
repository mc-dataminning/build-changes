import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwt extends cum {
   public static final MapCodec<cwt> a = b(cwt::new);
   public static final dhz b = dhy.bx;
   public static final dhz c = dhy.A;
   private static final dig<hz> d = dhy.T;
   private static final int e = 6;
   private static final cop f = new cop(10);

   public cwt(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, hz.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<cwt> a() {
      return a;
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return $$1.c_($$2) instanceof dfr $$4 ? $$4.j() : 0;
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      boolean $$7 = $$0.c(c);
      dfd $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 1);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
         this.a($$8, false);
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return $$0.B ? null : a($$2, dff.P, dfr::a);
   }

   private void a(@Nullable dfd $$0, boolean $$1) {
      if ($$0 instanceof dfr $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      dfr $$2 = new dfr($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dhi a(cnr $$0) {
      hx $$1 = $$0.d().g();

      hx $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> hx.b;
      };
      return this.o().a(d, hz.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      if ($$4.A() && $$0.c_($$1) instanceof dfr $$5) {
         $$5.a($$4.y());
      }

      if ($$2.c(c)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      bit.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         dfd $$6 = $$1.c_($$2);
         if ($$6 instanceof dfr) {
            $$3.a((dfr)$$6);
         }

         return bix.b;
      }
   }

   protected void a(dhi $$0, ame $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dfr $$3) {
         Optional<cod> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            $$3.d(6);
            $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
            cod $$6 = $$5.get();
            clj $$7 = $$6.a($$3, $$1.H_());
            $$7.a($$1);
            this.a($$1, $$2, $$3, $$7, $$0);
            $$6.a($$3).forEach($$4x -> this.a($$1, $$2, $$3, $$4x, $$0));
            $$3.f().forEach($$0x -> {
               if (!$$0x.b()) {
                  $$0x.h(1);
               }
            });
            $$3.e();
         }
      }
   }

   public static Optional<cod> a(csa $$0, chc $$1) {
      return f.a($$0, $$1);
   }

   private void a(csa $$0, ht $$1, dfr $$2, clj $$3, dhi $$4) {
      hx $$5 = $$4.c(d).a();
      biq $$6 = dgc.a($$0, $$1.a($$5));
      clj $$7 = $$3.p();
      if ($$6 instanceof dfr) {
         while (!$$7.b()) {
            clj $$8 = $$7.c(1);
            clj $$9 = dgc.a($$2, $$6, $$8, $$5.g());
            if (!$$9.b()) {
               break;
            }

            $$7.h(1);
         }
      } else if ($$6 != null) {
         while (!$$7.b()) {
            int $$10 = $$7.L();
            $$7 = dgc.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.L()) {
               break;
            }
         }
      }

      if (!$$7.b()) {
         eju $$11 = eju.b($$1).a($$5, 0.7);
         jd.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(d, c, b);
   }
}
