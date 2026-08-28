import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dee extends dfa implements dfd {
   public static final MapCodec<dee> a = b(dee::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final ewl e = dfa.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final ewl f = dfa.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final ewl g = dfa.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dtd h = dst.aq;
   public static final dtb<dsp> i = dst.bk;
   public static final dtd j = dst.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   public dee(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, dsp.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean a_(dsd $$0, dbf $$1, iz $$2) {
      return true;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      ewl $$4 = $$0.c(i) == dsp.c ? f : e;
      evs $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   @Override
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      evs $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean c(dsd $$0, dbf $$1, iz $$2) {
      return false;
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dsd $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(awp.au)) {
            if ($$2.a(dfc.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(dfc.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dsd $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(dfc.mZ) ? this.o().a(h, $$4.c(h)) : dfc.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean d_(dsd $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
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
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return $$1.a_($$2.d()).a(awp.au);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == je.b && $$2.a(dfc.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iz $$9 = $$2.b($$4);
         dsd $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dsd $$0, cmy $$1, dbf $$2, iz $$3) {
      return $$1.eX().g() instanceof cwd ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dsd $$0, dbz $$1, iz $$2, azh $$3, int $$4) {
      dsd $$5 = $$1.a_($$2.d());
      iz $$6 = $$2.c(2);
      dsd $$7 = $$1.a_($$6);
      dsp $$8 = dsp.a;
      if ($$4 >= 1) {
         if (!$$5.a(dfc.mZ) || $$5.c(i) == dsp.a) {
            $$8 = dsp.b;
         } else if ($$5.a(dfc.mZ) && $$5.c(i) != dsp.a) {
            $$8 = dsp.c;
            if ($$7.a(dfc.mZ)) {
               $$1.a($$2.d(), $$5.a(i, dsp.b), 3);
               $$1.a($$6, $$7.a(i, dsp.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dfc.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dbf $$0, iz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dfc.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dbf $$0, iz $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dfc.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
