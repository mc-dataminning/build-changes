import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgt extends dem {
   public static final MapCodec<dgt> a = b(dgt::new);
   public static final dsu b = dst.bx;
   public static final dsu c = dst.A;
   private static final dtb<jg> d = dst.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cyx g = new cyx(10);
   private static final int h = 17;

   public dgt(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, jg.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dgt> a() {
      return a;
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return $$1.c_($$2) instanceof dpw $$4 ? $$4.u() : 0;
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dpi $$8 = $$1.c_($$2);
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
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return $$0.B ? null : a($$2, dpk.P, dpw::a);
   }

   private void a(@Nullable dpi $$0, boolean $$1) {
      if ($$0 instanceof dpw $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      dpw $$2 = new dpw($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dsd a(cyb $$0) {
      je $$1 = $$0.d().g();

      je $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> je.b;
      };
      return this.o().a(d, jg.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, btq $$3, cuq $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      bqr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         dpi $$5 = $$1.c_($$2);
         if ($$5 instanceof dpw) {
            $$3.a((dpw)$$5);
         }

         return bqv.c;
      }
   }

   protected void a(dsd $$0, arf $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dpw $$3) {
         Optional<cyy<cyn>> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cyy<cyn> $$6 = $$5.get();
            cuq $$7 = $$6.b().a($$3, $$1.H_());
            if ($$7.e()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0, $$6);

               for (cuq $$8 : $$6.b().a($$3)) {
                  if (!$$8.e()) {
                     this.a($$1, $$2, $$3, $$8, $$0, $$6);
                  }
               }

               $$3.j().forEach($$0x -> {
                  if (!$$0x.e()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<cyy<cyn>> a(dbz $$0, cql $$1) {
      return g.a($$0, $$1);
   }

   private void a(arf $$0, iz $$1, dpw $$2, cuq $$3, dsd $$4, cyy<cyn> $$5) {
      je $$6 = $$4.c(d).a();
      bqo $$7 = dqh.a($$0, $$1.a($$6));
      cuq $$8 = $$3.s();
      if ($$7 != null && ($$7 instanceof dpw || $$3.I() > $$7.e_($$3))) {
         while (!$$8.e()) {
            cuq $$9 = $$8.c(1);
            cuq $$10 = dqh.a($$2, $$7, $$9, $$6.g());
            if (!$$10.e()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.e()) {
            int $$11 = $$8.I();
            $$8 = dqh.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.I()) {
               break;
            }
         }
      }

      if (!$$8.e()) {
         evs $$12 = evs.b($$1);
         evs $$13 = $$12.a($$6, 0.7);
         ks.a($$0, $$8, 6, $$6, $$13);

         for (arg $$14 : $$0.a(arg.class, evn.a($$12, 17.0, 17.0, 17.0))) {
            am.ad.a($$14, $$5.a(), $$2.j());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(d, c, b);
   }
}
