import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyr extends cwk {
   public static final MapCodec<cyr> a = b(cyr::new);
   public static final dkg b = dkf.bx;
   public static final dkg c = dkf.A;
   private static final dkn<ie> d = dkf.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cql g = new cql(10);

   public cyr(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ie.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<cyr> a() {
      return a;
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return $$1.c_($$2) instanceof dhr $$4 ? $$4.w() : 0;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dhd $$8 = $$1.c_($$2);
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
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return $$0.B ? null : a($$2, dhf.P, dhr::a);
   }

   private void a(@Nullable dhd $$0, boolean $$1) {
      if ($$0 instanceof dhr $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      dhr $$2 = new dhr($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public djp a(cpp $$0) {
      ic $$1 = $$0.d().g();

      ic $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ic.b;
      };
      return this.o().a(d, ie.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      if ($$4.A() && $$0.c_($$1) instanceof dhr $$5) {
         $$5.a($$4.y());
      }

      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      bjy.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         dhd $$5 = $$1.c_($$2);
         if ($$5 instanceof dhr) {
            $$3.a((dhr)$$5);
         }

         return bkc.b;
      }
   }

   protected void a(djp $$0, ane $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dhr $$3) {
         Optional<cqb> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            $$3.d(6);
            $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
            cqb $$6 = $$5.get();
            cng $$7 = $$6.a($$3, $$1.I_());
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

   public static Optional<cqb> a(ctx $$0, ciz $$1) {
      return g.a($$0, $$1);
   }

   private void a(ctx $$0, hx $$1, dhr $$2, cng $$3, djp $$4) {
      ic $$5 = $$4.c(d).a();
      bjv $$6 = dic.a($$0, $$1.a($$5));
      cng $$7 = $$3.p();
      if ($$6 != null && ($$6 instanceof dhr || $$3.L() > $$6.al_())) {
         while (!$$7.b()) {
            cng $$8 = $$7.c(1);
            cng $$9 = dic.a($$2, $$6, $$8, $$5.g());
            if (!$$9.b()) {
               break;
            }

            $$7.h(1);
         }
      } else if ($$6 != null) {
         while (!$$7.b()) {
            int $$10 = $$7.L();
            $$7 = dic.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.L()) {
               break;
            }
         }
      }

      if (!$$7.b()) {
         emc $$11 = emc.b($$1).a($$5, 0.7);
         ji.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(d, c, b);
   }
}
