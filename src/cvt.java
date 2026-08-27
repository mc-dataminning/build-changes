import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvt extends cwp implements cws {
   public static final MapCodec<cvt> a = b(cvt::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final eml e = cwp.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final eml f = cwp.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final eml g = cwp.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dkg h = djw.aq;
   public static final dke<djs> i = djw.bk;
   public static final dkg j = djw.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<cvt> a() {
      return a;
   }

   public cvt(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, djs.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   public boolean a_(djg $$0, csu $$1, hx $$2) {
      return true;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      eml $$4 = $$0.c(i) == djs.c ? f : e;
      els $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      els $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean c(djg $$0, csu $$1, hx $$2) {
      return false;
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         djg $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(asg.at)) {
            if ($$2.a(cwr.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(cwr.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               djg $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(cwr.mZ) ? this.o().a(h, $$4.c(h)) : cwr.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(djg $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
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
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return $$1.a_($$2.d()).a(asg.at);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ic.b && $$2.a(cwr.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         hx $$9 = $$2.b($$4);
         djg $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   public float a(djg $$0, cfh $$1, csu $$2, hx $$3) {
      return $$1.eT().d() instanceof coi ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(djg $$0, cto $$1, hx $$2, auu $$3, int $$4) {
      djg $$5 = $$1.a_($$2.d());
      hx $$6 = $$2.c(2);
      djg $$7 = $$1.a_($$6);
      djs $$8 = djs.a;
      if ($$4 >= 1) {
         if (!$$5.a(cwr.mZ) || $$5.c(i) == djs.a) {
            $$8 = djs.b;
         } else if ($$5.a(cwr.mZ) && $$5.c(i) != djs.a) {
            $$8 = djs.c;
            if ($$7.a(cwr.mZ)) {
               $$1.a($$2.d(), $$5.a(i, djs.b), 3);
               $$1.a($$6, $$7.a(i, djs.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(cwr.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(csu $$0, hx $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(cwr.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(csu $$0, hx $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(cwr.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
