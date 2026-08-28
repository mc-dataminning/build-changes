import javax.annotation.Nullable;

public class csi extends ctx implements cst {
   private final eog a;

   public csi(eog $$0, ctx.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      ewb $$4 = a($$0, $$1, this.a == eoi.a ? dbo.b.b : dbo.b.a);
      if ($$4.c() == ewd.a.a) {
         return bqh.c($$3);
      } else if ($$4.c() != ewd.a.b) {
         return bqh.c($$3);
      } else {
         ja $$5 = $$4.a();
         jf $$6 = $$4.b();
         ja $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bqh.d($$3);
         } else if (this.a == eoi.a) {
            dsk $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dfo $$9) {
               cuc $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.e()) {
                  $$1.b(avr.c.b(this));
                  $$9.as_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dxg.y, $$5);
                  cuc $$11 = cue.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((aqn)$$1, $$10);
                  }

                  return bqh.a($$11, $$0.x_());
               }
            }

            return bqh.d($$3);
         } else {
            dsk $$12 = $$0.a_($$5);
            ja $$13 = $$12.b() instanceof djy && this.a == eoi.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aqn) {
                  am.z.a((aqn)$$1, $$13, $$3);
               }

               $$1.b(avr.c.b(this));
               cuc $$14 = cue.a($$3, $$1, a($$3, $$1));
               return bqh.a($$14, $$0.x_());
            } else {
               return bqh.d($$3);
            }
         }
      }
   }

   public static cuc a(cuc $$0, cmk $$1) {
      return !$$1.fM() ? new cuc(cuf.qy) : $$0;
   }

   @Override
   public void a(@Nullable cmk $$0, dcf $$1, cuc $$2, ja $$3) {
   }

   @Override
   public boolean a(@Nullable cmk $$0, dcf $$1, ja $$2, @Nullable ewb $$3) {
      if (!(this.a instanceof eof $$4)) {
         return false;
      } else {
         dfh $$7;
         boolean $$8;
         dsk $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof djy $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(awc.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, avh.iU, avi.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lj.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof djy $$15 && this.a == eoi.c) {
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

   protected void a(@Nullable cmk $$0, dcg $$1, ja $$2) {
      avg $$3 = this.a.a(awc.b) ? avh.df : avh.dc;
      $$1.a($$0, $$2, $$3, avi.e, 1.0F, 1.0F);
      $$1.a($$0, dxg.z, $$2);
   }
}
