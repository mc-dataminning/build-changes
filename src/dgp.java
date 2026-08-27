import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgp extends cye implements dca {
   public static final MapCodec<dgp> a = b(dgp::new);
   public static final dmh<dmt> b = dlz.bj;

   @Override
   public MapCodec<dgp> a() {
      return a;
   }

   protected dgp(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dmt.b));
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dkl($$0, $$1);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      dix $$5 = $$1.c_($$2);
      if ($$5 instanceof dkl) {
         return ((dkl)$$5).a($$3) ? blw.a($$1.B) : blw.d;
      } else {
         return blw.d;
      }
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, @Nullable boi $$3, cpd $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dix $$5 = $$0.c_($$1);
            if ($$5 instanceof dkl) {
               ((dkl)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      if ($$1 instanceof aow) {
         if ($$1.c_($$2) instanceof dkl $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.F();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aow)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aow $$0, dkl $$1) {
      switch ($$1.x()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.D();
         case d:
      }
   }
}
