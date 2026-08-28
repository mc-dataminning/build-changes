import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlr extends dfd implements dex, dlv {
   public static final MapCodec<dlr> a = b(dlr::new);
   public static final int b = 4;
   public static final dsx c = dsn.aS;
   public static final dso d = dsn.C;
   protected static final ewf e = deu.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final ewf f = deu.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final ewf g = deu.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final ewf h = deu.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   protected dlr(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         enq $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == enr.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(drx $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return !$$0.k($$1, $$2).a(je.b).c() || $$0.d($$1, $$2, je.b);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         return dew.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, enr.c, enr.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(drx $$0, cxv $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      switch ($$0.c(c)) {
         case 1:
         default:
            return e;
         case 2:
            return f;
         case 3:
            return g;
         case 4:
            return h;
      }
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(d) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return true;
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(awl.aq)) {
         int $$4 = 5;
         int $$5 = 1;
         int $$6 = 2;
         int $$7 = 0;
         int $$8 = $$2.u() - 2;
         int $$9 = 0;

         for (int $$10 = 0; $$10 < 5; $$10++) {
            for (int $$11 = 0; $$11 < $$5; $$11++) {
               int $$12 = 2 + $$2.v() - 1;

               for (int $$13 = $$12 - 2; $$13 < $$12; $$13++) {
                  iz $$14 = new iz($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dew.G)) {
                     drx $$15 = $$0.a_($$14.d());
                     if ($$15.a(awl.aq)) {
                        $$0.a($$14, dew.mV.n().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
                     }
                  }
               }
            }

            if ($$7 < 2) {
               $$5 += 2;
               $$9++;
            } else {
               $$5 -= 2;
               $$9--;
            }

            $$7++;
         }

         $$0.a($$2, $$3.a(c, Integer.valueOf(4)), 2);
      }
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
