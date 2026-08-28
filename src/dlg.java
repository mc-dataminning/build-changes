import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlg extends diz {
   public static final MapCodec<dlg> a = b(dlg::new);
   public static final dxp b = dxo.bA;
   public static final dxp c = dxo.H;
   private static final dxv<jp> d = dxo.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final dbj g = new dbj(10);
   private static final int h = 17;

   public dlg(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jp.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dlg> a() {
      return a;
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return $$1.c_($$2) instanceof duo $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dua $$8 = $$1.c_($$2);
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
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return $$0.C ? null : a($$2, duc.Q, duo::a);
   }

   private void a(@Nullable dua $$0, boolean $$1) {
      if ($$0 instanceof duo $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      duo $$2 = new duo($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dwy a(dah $$0) {
      jn $$1 = $$0.d().g();

      jn $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jn.b;
      };
      return this.m().b(d, jp.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bvi $$3, cwq $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      bsh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof duo $$5) {
         $$3.a($$5);
      }

      return bsl.a;
   }

   protected void a(dwy $$0, ard $$1, ji $$2) {
      if ($$1.c_($$2) instanceof duo $$3) {
         dat var11 = $$3.aB_();
         Optional<dbk<dau>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dbk<dau> $$7 = $$6.get();
            cwq $$8 = $$7.b().a(var11, $$1.K_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cwq $$9 : $$7.b().a(var11)) {
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

   public static Optional<dbk<dau>> a(ard $$0, dat $$1) {
      return g.a($$0, $$1);
   }

   private void a(ard $$0, ji $$1, duo $$2, cwq $$3, dwy $$4, dbk<?> $$5) {
      jn $$6 = $$4.c(d).a();
      bse $$7 = dvc.a($$0, $$1.a($$6));
      cwq $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof duo || $$3.M() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cwq $$9 = $$8.c(1);
            cwq $$10 = dvc.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = dvc.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         fbb $$12 = fbb.b($$1);
         fbb $$13 = $$12.a($$6, 0.7);
         lb.a($$0, $$8, 6, $$6, $$13);

         for (are $$14 : $$0.a(are.class, faw.a($$12, 17.0, 17.0, 17.0))) {
            ap.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(d, c, b);
   }
}
