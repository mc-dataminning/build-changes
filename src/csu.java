import javax.annotation.Nullable;

public class csu extends cuj implements ctf {
   private final ent a;

   public csu(ent $$0, cuj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      evm $$4 = a($$0, $$1, this.a == env.a ? dbg.b.b : dbg.b.a);
      if ($$4.c() == evo.a.a) {
         return bqu.c($$3);
      } else if ($$4.c() != evo.a.b) {
         return bqu.c($$3);
      } else {
         iz $$5 = $$4.a();
         je $$6 = $$4.b();
         iz $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bqu.d($$3);
         } else if (this.a == env.a) {
            dsb $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dff $$9) {
               cuo $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.e()) {
                  $$1.b(awj.c.b(this));
                  $$9.ar_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dwu.y, $$5);
                  cuo $$11 = cuq.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((arf)$$1, $$10);
                  }

                  return bqu.a($$11, $$0.x_());
               }
            }

            return bqu.d($$3);
         } else {
            dsb $$12 = $$0.a_($$5);
            iz $$13 = $$12.b() instanceof djp && this.a == env.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof arf) {
                  am.z.a((arf)$$1, $$13, $$3);
               }

               $$1.b(awj.c.b(this));
               return bqu.a(a($$3, $$1), $$0.x_());
            } else {
               return bqu.d($$3);
            }
         }
      }
   }

   public static cuo a(cuo $$0, cmw $$1) {
      return !$$1.fP() ? new cuo(cur.qy) : $$0;
   }

   @Override
   public void a(@Nullable cmw $$0, dbx $$1, cuo $$2, iz $$3) {
   }

   @Override
   public boolean a(@Nullable cmw $$0, dbx $$1, iz $$2, @Nullable evm $$3) {
      if (!(this.a instanceof ens $$4)) {
         return false;
      } else {
         dey $$7;
         boolean $$8;
         dsb $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof djp $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(awu.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, avz.iU, awa.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(li.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof djp $$15 && this.a == env.c) {
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

   protected void a(@Nullable cmw $$0, dby $$1, iz $$2) {
      avy $$3 = this.a.a(awu.b) ? avz.df : avz.dc;
      $$1.a($$0, $$2, $$3, awa.e, 1.0F, 1.0F);
      $$1.a($$0, dwu.z, $$2);
   }
}
