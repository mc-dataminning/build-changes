import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deq extends cvz {
   public static final MapCodec<deq> a = b(deq::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final elu g = cvz.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final elu h = cvz.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final djp e = djf.aE;
   public static final djp f = djf.aD;

   @Override
   public MapCodec<deq> a() {
      return a;
   }

   public deq(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blf $$3) {
      if (!$$3.bT()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(csy $$0, dip $$1, hv $$2, blf $$3, float $$4) {
      if (!($$3 instanceof ccs)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(csy $$0, dip $$1, hv $$2, blf $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(cwb.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(csy $$0, hv $$1, dip $$2) {
      $$0.a(null, $$1, arc.zl, ard.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dmz.f, $$1, dmz.a.a($$2));
         $$0.c(2001, $$1, cvz.i($$2));
      }
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, arc.zm, ard.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dmz.c, $$2, dmz.a.a($$0));
         } else {
            $$1.a(null, $$2, arc.zn, ard.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dmz.f, $$2, dmz.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, cvz.i($$0));
               byj $$6 = blj.be.a((csy)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.i($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(cse $$0, hv $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(cse $$0, hv $$1) {
      return $$0.a_($$1).a(arr.H);
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2005, $$2, 0);
      }
   }

   private boolean a(csy $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(csy $$0, cer $$1, hv $$2, dip $$3, @Nullable dgd $$4, cmh $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   public boolean a(dip $$0, coq $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(e, f);
   }

   private boolean a(csy $$0, blf $$1) {
      if ($$1 instanceof byj || $$1 instanceof bxd) {
         return false;
      } else {
         return !($$1 instanceof blv) ? false : $$1 instanceof cer || $$0.Y().b(csu.c);
      }
   }
}
