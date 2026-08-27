import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvd extends cvz implements cwc {
   public static final MapCodec<cvd> a = b(cvd::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final elu e = cvz.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final elu f = cvz.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final elu g = cvz.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final djp h = djf.aq;
   public static final djn<djb> i = djf.bk;
   public static final djp j = djf.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<cvd> a() {
      return a;
   }

   public cvd(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(h, Integer.valueOf(0)).a(i, djb.a).a(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   public boolean a_(dip $$0, cse $$1, hv $$2) {
      return true;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      elu $$4 = $$0.c(i) == djb.c ? f : e;
      elb $$5 = $$0.n($$1, $$2);
      return $$4.a($$5.c, $$5.d, $$5.e);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      elb $$4 = $$0.n($$1, $$2);
      return g.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean c(dip $$0, cse $$1, hv $$2) {
      return false;
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dip $$2 = $$0.q().a_($$0.a().d());
         if ($$2.a(arr.at)) {
            if ($$2.a(cwb.mY)) {
               return this.o().a(h, Integer.valueOf(0));
            } else if ($$2.a(cwb.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.o().a(h, Integer.valueOf($$3));
            } else {
               dip $$4 = $$0.q().a_($$0.a().c());
               return $$4.a(cwb.mZ) ? this.o().a(h, $$4.c(h)) : cwb.mY.o();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dip $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$0.c(j) == 0) {
         if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return $$1.a_($$2.d()).a(arr.at);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == ia.b && $$2.a(cwb.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         hv $$9 = $$2.b($$4);
         dip $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.t($$9.c())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   public float a(dip $$0, cer $$1, cse $$2, hv $$3) {
      return $$1.eT().d() instanceof cns ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dip $$0, csy $$1, hv $$2, auf $$3, int $$4) {
      dip $$5 = $$1.a_($$2.d());
      hv $$6 = $$2.c(2);
      dip $$7 = $$1.a_($$6);
      djb $$8 = djb.a;
      if ($$4 >= 1) {
         if (!$$5.a(cwb.mZ) || $$5.c(i) == djb.a) {
            $$8 = djb.b;
         } else if ($$5.a(cwb.mZ) && $$5.c(i) != djb.a) {
            $$8 = djb.c;
            if ($$7.a(cwb.mZ)) {
               $$1.a($$2.d(), $$5.a(i, djb.b), 3);
               $$1.a($$6, $$7.a(i, djb.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(cwb.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.c(), this.o().a(h, Integer.valueOf($$9)).a(i, $$8).a(j, Integer.valueOf($$10)), 3);
   }

   protected int a(cse $$0, hv $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(cwb.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(cse $$0, hv $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(cwb.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
