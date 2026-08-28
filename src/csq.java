import javax.annotation.Nullable;

public class csq extends cuf implements ctb {
   private final enp a;

   public csq(enp $$0, cuf.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      evi $$4 = a($$0, $$1, this.a == enr.a ? dbc.b.b : dbc.b.a);
      if ($$4.c() == evk.a.a) {
         return bqq.c($$3);
      } else if ($$4.c() != evk.a.b) {
         return bqq.c($$3);
      } else {
         iz $$5 = $$4.a();
         je $$6 = $$4.b();
         iz $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bqq.d($$3);
         } else if (this.a == enr.a) {
            drx $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dfb $$9) {
               cuk $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.e()) {
                  $$1.b(awg.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dwq.y, $$5);
                  cuk $$11 = cum.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((arc)$$1, $$10);
                  }

                  return bqq.a($$11, $$0.x_());
               }
            }

            return bqq.d($$3);
         } else {
            drx $$12 = $$0.a_($$5);
            iz $$13 = $$12.b() instanceof djl && this.a == enr.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof arc) {
                  am.z.a((arc)$$1, $$13, $$3);
               }

               $$1.b(awg.c.b(this));
               return bqq.a(a($$3, $$1), $$0.x_());
            } else {
               return bqq.d($$3);
            }
         }
      }
   }

   public static cuk a(cuk $$0, cms $$1) {
      return !$$1.fP() ? new cuk(cun.qy) : $$0;
   }

   @Override
   public void a(@Nullable cms $$0, dbt $$1, cuk $$2, iz $$3) {
   }

   @Override
   public boolean a(@Nullable cms $$0, dbt $$1, iz $$2, @Nullable evi $$3) {
      if (!(this.a instanceof eno $$4)) {
         return false;
      } else {
         deu $$7;
         boolean $$8;
         drx $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof djl $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
                  break label70;
               }

               var10000 = false;
               break label82;
            }

            var10000 = true;
         }

         boolean $$10 = var10000;
         if (!$$10) {
            return $$3 != null && this.a($$0, $$1, $$3.a().a($$3.b()), null);
         } else if ($$1.D_().i() && this.a.a(awr.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, avw.iU, avx.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lj.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof djl $$15 && this.a == enr.c) {
               $$15.a($$1, $$2, $$6, $$4.a(false));
               this.a($$0, $$1, $$2);
               return true;
            }

            if (!$$1.B && $$8 && !$$6.k()) {
               $$1.b($$2, true);
            }

            if (!$$1.a($$2, this.a.g().g(), 11) && !$$6.u().b()) {
               return false;
            } else {
               this.a($$0, $$1, $$2);
               return true;
            }
         }
      }
   }

   protected void a(@Nullable cms $$0, dbu $$1, iz $$2) {
      avv $$3 = this.a.a(awr.b) ? avw.df : avw.dc;
      $$1.a($$0, $$2, $$3, avx.e, 1.0F, 1.0F);
      $$1.a($$0, dwq.z, $$2);
   }
}
