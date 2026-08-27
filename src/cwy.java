import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwy extends cur {
   public static final MapCodec<cwy> a = b(cwy::new);
   public static final die b = did.bx;
   public static final die c = did.A;
   private static final dil<id> d = did.T;
   private static final int e = 6;
   private static final cou f = new cou(10);

   public cwy(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, id.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<cwy> a() {
      return a;
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return $$1.c_($$2) instanceof dfw $$4 ? $$4.w() : 0;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      boolean $$7 = $$0.c(c);
      dfi $$8 = $$1.c_($$2);
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
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return $$0.B ? null : a($$2, dfk.P, dfw::a);
   }

   private void a(@Nullable dfi $$0, boolean $$1) {
      if ($$0 instanceof dfw $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      dfw $$2 = new dfw($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dhn a(cnw $$0) {
      ib $$1 = $$0.d().g();

      ib $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ib.b;
      };
      return this.o().a(d, id.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      if ($$4.A() && $$0.c_($$1) instanceof dfw $$5) {
         $$5.a($$4.y());
      }

      if ($$2.c(c)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      bix.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         dfi $$6 = $$1.c_($$2);
         if ($$6 instanceof dfw) {
            $$3.a((dfw)$$6);
         }

         return bjb.b;
      }
   }

   protected void a(dhn $$0, ami $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dfw $$3) {
         Optional<coi> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            $$3.d(6);
            $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
            coi $$6 = $$5.get();
            clo $$7 = $$6.a($$3, $$1.I_());
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

   public static Optional<coi> a(csf $$0, chh $$1) {
      return f.a($$0, $$1);
   }

   private void a(csf $$0, hx $$1, dfw $$2, clo $$3, dhn $$4) {
      ib $$5 = $$4.c(d).a();
      biu $$6 = dgh.a($$0, $$1.a($$5));
      clo $$7 = $$3.p();
      if ($$6 instanceof dfw) {
         while (!$$7.b()) {
            clo $$8 = $$7.c(1);
            clo $$9 = dgh.a($$2, $$6, $$8, $$5.g());
            if (!$$9.b()) {
               break;
            }

            $$7.h(1);
         }
      } else if ($$6 != null) {
         while (!$$7.b()) {
            int $$10 = $$7.L();
            $$7 = dgh.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.L()) {
               break;
            }
         }
      }

      if (!$$7.b()) {
         ejz $$11 = ejz.b($$1).a($$5, 0.7);
         jh.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(d, c, b);
   }
}
