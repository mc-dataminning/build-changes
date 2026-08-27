import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvu extends cwq implements cwt {
   public static final MapCodec<cvu> a = b(cvu::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final emm e = cwq.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final emm f = cwq.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final emm g = cwq.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dkh h = djx.aq;
   public static final dkf<djt> i = djx.bk;
   public static final dkh j = djx.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<cvu> a() {
      return a;
   }

   public cvu(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, djt.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   public boolean a_(djh $$0, csv $$1, hx $$2) {
      return true;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      emm $$4 = $$0.c(i) == djt.c ? f : e;
      elt $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      elt $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean c(djh $$0, csv $$1, hx $$2) {
      return false;
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         djh $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(ash.at)) {
            if ($$2.a(cws.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(cws.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               djh $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(cws.mZ) ? this.o().a(h, $$4.c(h)) : cws.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(djh $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
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
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return $$1.a_($$2.d()).a(ash.at);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ic.b && $$2.a(cws.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         hx $$9 = $$2.b($$4);
         djh $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   public float a(djh $$0, cfi $$1, csv $$2, hx $$3) {
      return $$1.eT().d() instanceof coj ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(djh $$0, ctp $$1, hx $$2, auv $$3, int $$4) {
      djh $$5 = $$1.a_($$2.d());
      hx $$6 = $$2.c(2);
      djh $$7 = $$1.a_($$6);
      djt $$8 = djt.a;
      if ($$4 >= 1) {
         if (!$$5.a(cws.mZ) || $$5.c(i) == djt.a) {
            $$8 = djt.b;
         } else if ($$5.a(cws.mZ) && $$5.c(i) != djt.a) {
            $$8 = djt.c;
            if ($$7.a(cws.mZ)) {
               $$1.a($$2.d(), $$5.a(i, djt.b), 3);
               $$1.a($$6, $$7.a(i, djt.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(cws.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(csv $$0, hx $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(cws.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(csv $$0, hx $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(cws.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
