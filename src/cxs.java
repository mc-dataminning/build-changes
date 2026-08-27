import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxs extends cvl {
   public static final MapCodec<cxs> a = b(cxs::new);
   public static final djg b = djf.bx;
   public static final djg c = djf.A;
   private static final djn<ic> d = djf.T;
   private static final int e = 6;
   private static final cpm f = new cpm(10);

   public cxs(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ic.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<cxs> a() {
      return a;
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return $$1.c_($$2) instanceof dgr $$4 ? $$4.w() : 0;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      boolean $$7 = $$0.c(c);
      dgd $$8 = $$1.c_($$2);
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
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return $$0.B ? null : a($$2, dgf.P, dgr::a);
   }

   private void a(@Nullable dgd $$0, boolean $$1) {
      if ($$0 instanceof dgr $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      dgr $$2 = new dgr($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dip a(coq $$0) {
      ia $$1 = $$0.d().g();

      ia $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ia.b;
      };
      return this.o().a(d, ic.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      if ($$4.A() && $$0.c_($$1) instanceof dgr $$5) {
         $$5.a($$4.y());
      }

      if ($$2.c(c)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      bjh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         dgd $$6 = $$1.c_($$2);
         if ($$6 instanceof dgr) {
            $$3.a((dgr)$$6);
         }

         return bjl.b;
      }
   }

   protected void a(dip $$0, amp $$1, hv $$2) {
      if ($$1.c_($$2) instanceof dgr $$3) {
         Optional<cpc> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            $$3.d(6);
            $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
            cpc $$6 = $$5.get();
            cmh $$7 = $$6.a($$3, $$1.I_());
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

   public static Optional<cpc> a(csy $$0, cia $$1) {
      return f.a($$0, $$1);
   }

   private void a(csy $$0, hv $$1, dgr $$2, cmh $$3, dip $$4) {
      ia $$5 = $$4.c(d).a();
      bje $$6 = dhc.a($$0, $$1.a($$5));
      cmh $$7 = $$3.p();
      if ($$6 instanceof dgr) {
         while (!$$7.b()) {
            cmh $$8 = $$7.c(1);
            cmh $$9 = dhc.a($$2, $$6, $$8, $$5.g());
            if (!$$9.b()) {
               break;
            }

            $$7.h(1);
         }
      } else if ($$6 != null) {
         while (!$$7.b()) {
            int $$10 = $$7.L();
            $$7 = dhc.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.L()) {
               break;
            }
         }
      }

      if (!$$7.b()) {
         elb $$11 = elb.b($$1).a($$5, 0.7);
         jg.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(d, c, b);
   }
}
