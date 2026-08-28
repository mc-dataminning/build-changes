import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddy extends deu implements dex {
   public static final MapCodec<ddy> a = b(ddy::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final ewf e = deu.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ewf f = deu.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ewf g = deu.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dsx h = dsn.aq;
   public static final dsv<dsj> i = dsn.bk;
   public static final dsx j = dsn.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<ddy> a() {
      return a;
   }

   public ddy(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dsj.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(drx $$0, daz $$1, iz $$2) {
      return true;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      ewf $$4 = $$0.c(i) == dsj.c ? f : e;
      evm $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      evm $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(drx $$0, daz $$1, iz $$2) {
      return false;
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         drx $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(awl.au)) {
            if ($$2.a(dew.mY)) {
               return this.n().a(h, Integer.valueOf(0));
            } else if ($$2.a(dew.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.n().a(h, Integer.valueOf($$3));
            } else {
               drx $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dew.mZ) ? this.n().a(h, $$4.c(h)) : dew.mY.n();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(drx $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$0.c(j) == 0) {
         if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return $$1.a_($$2.d()).a(awl.au);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == je.b && $$2.a(dew.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iz $$9 = $$2.b($$4);
         drx $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(drx $$0, cms $$1, daz $$2, iz $$3) {
      return $$1.eX().g() instanceof cvx ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(drx $$0, dbt $$1, iz $$2, azc $$3, int $$4) {
      drx $$5 = $$1.a_($$2.d());
      iz $$6 = $$2.c(2);
      drx $$7 = $$1.a_($$6);
      dsj $$8 = dsj.a;
      if ($$4 >= 1) {
         if (!$$5.a(dew.mZ) || $$5.c(i) == dsj.a) {
            $$8 = dsj.b;
         } else if ($$5.a(dew.mZ) && $$5.c(i) != dsj.a) {
            $$8 = dsj.c;
            if ($$7.a(dew.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dsj.b), 3);
               $$1.a($$6, $$7.a(i, dsj.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dew.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.n().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(daz $$0, iz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dew.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(daz $$0, iz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dew.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
