import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyc extends cvv {
   public static final MapCodec<cyc> a = b(cyc::new);
   public static final djr b = djq.bx;
   public static final djr c = djq.A;
   private static final djy<ie> d = djq.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cpw g = new cpw(10);

   public cyc(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ie.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<cyc> a() {
      return a;
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return $$1.c_($$2) instanceof dhc $$4 ? $$4.w() : 0;
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dgo $$8 = $$1.c_($$2);
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
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return $$0.B ? null : a($$2, dgq.P, dhc::a);
   }

   private void a(@Nullable dgo $$0, boolean $$1) {
      if ($$0 instanceof dhc $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      dhc $$2 = new dhc($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dja a(cpa $$0) {
      ic $$1 = $$0.d().g();

      ic $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ic.b;
      };
      return this.o().a(d, ie.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      if ($$4.A() && $$0.c_($$1) instanceof dhc $$5) {
         $$5.a($$4.y());
      }

      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      bjr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         dgo $$6 = $$1.c_($$2);
         if ($$6 instanceof dhc) {
            $$3.a((dhc)$$6);
         }

         return bjv.b;
      }
   }

   protected void a(dja $$0, amz $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dhc $$3) {
         Optional<cpm> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            $$3.d(6);
            $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
            cpm $$6 = $$5.get();
            cmr $$7 = $$6.a($$3, $$1.I_());
            $$7.a($$1);
            this.a($$1, $$2, $$3, $$7, $$0);
            $$6.a($$3).forEach($$4x -> this.a($$1, $$2, $$3, $$4x, $$0));
            $$3.k().forEach($$0x -> {
               if (!$$0x.b()) {
                  $$0x.h(1);
               }
            });
            $$3.e();
         }
      }
   }

   public static Optional<cpm> a(cti $$0, cik $$1) {
      return g.a($$0, $$1);
   }

   private void a(cti $$0, hx $$1, dhc $$2, cmr $$3, dja $$4) {
      ic $$5 = $$4.c(d).a();
      bjo $$6 = dhn.a($$0, $$1.a($$5));
      cmr $$7 = $$3.p();
      if ($$6 != null && ($$6 instanceof dhc || $$3.L() > $$6.ak_())) {
         while (!$$7.b()) {
            cmr $$8 = $$7.c(1);
            cmr $$9 = dhn.a($$2, $$6, $$8, $$5.g());
            if (!$$9.b()) {
               break;
            }

            $$7.h(1);
         }
      } else if ($$6 != null) {
         while (!$$7.b()) {
            int $$10 = $$7.L();
            $$7 = dhn.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.L()) {
               break;
            }
         }
      }

      if (!$$7.b()) {
         elm $$11 = elm.b($$1).a($$5, 0.7);
         ji.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(d, c, b);
   }
}
