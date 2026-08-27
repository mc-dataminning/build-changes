import javax.annotation.Nullable;

public class cjp extends clj implements cka {
   private final ecw a;

   public cjp(ecw $$0, clj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      ejv $$4 = a($$0, $$1, this.a == ecy.a ? cro.b.b : cro.b.a);
      if ($$4.c() == ejx.a.a) {
         return bjc.c($$3);
      } else if ($$4.c() != ejx.a.b) {
         return bjc.c($$3);
      } else {
         hx $$5 = $$4.a();
         ib $$6 = $$4.b();
         hx $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bjc.d($$3);
         } else if (this.a == ecy.a) {
            dhn $$8 = $$0.a_($$5);
            if ($$8.b() instanceof cvm $$9) {
               clo $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(arf.c.b(this));
                  $$9.av_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dlx.y, $$5);
                  clo $$11 = clq.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     al.j.a((amj)$$1, $$10);
                  }

                  return bjc.a($$11, $$0.y_());
               }
            }

            return bjc.d($$3);
         } else {
            dhn $$12 = $$0.a_($$5);
            hx $$13 = $$12.b() instanceof czv && this.a == ecy.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof amj) {
                  al.y.a((amj)$$1, $$13, $$3);
               }

               $$1.b(arf.c.b(this));
               return bjc.a(a($$3, $$1), $$0.y_());
            } else {
               return bjc.d($$3);
            }
         }
      }
   }

   public static clo a(clo $$0, cdz $$1) {
      return !$$1.fU().d ? new clo(clr.qv) : $$0;
   }

   @Override
   public void a(@Nullable cdz $$0, csf $$1, clo $$2, hx $$3) {
   }

   @Override
   public boolean a(@Nullable cdz $$0, csf $$1, hx $$2, @Nullable ejv $$3) {
      if (!(this.a instanceof ecv $$4)) {
         return false;
      } else {
         cvf $$7;
         boolean $$8;
         dhn $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof czv $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.E_().i() && this.a.a(arp.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, aqv.ih, aqw.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(jw.S, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof czv $$15 && this.a == ecy.c) {
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

   protected void a(@Nullable cdz $$0, csg $$1, hx $$2) {
      aqu $$3 = this.a.a(arp.b) ? aqv.cy : aqv.cv;
      $$1.a($$0, $$2, $$3, aqw.e, 1.0F, 1.0F);
      $$1.a($$0, dlx.z, $$2);
   }
}
