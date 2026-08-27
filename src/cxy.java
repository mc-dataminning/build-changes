import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxy extends cye {
   public static final MapCodec<cxy> a = b(cxy::new);
   public static final dmd b = dlz.P;
   public static final dma c = dlz.u;

   @Override
   public MapCodec<cxy> a() {
      return a;
   }

   public cxy(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         dix $$5 = $$1.c_($$2);
         if ($$5 instanceof diq) {
            $$3.a((diq)$$5);
            $$3.a(atv.ar);
            cgc.a($$3, true);
         }

         return blw.b;
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      bls.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      dix $$4 = $$1.c_($$2);
      if ($$4 instanceof diq) {
         ((diq)$$4).m();
      }
   }

   @Nullable
   @Override
   public dix a(hz $$0, dlj $$1) {
      return new diq($$0, $$1);
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, @Nullable boi $$3, cpd $$4) {
      if ($$4.B()) {
         dix $$5 = $$0.c_($$1);
         if ($$5 instanceof diq) {
            ((diq)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return ckf.a($$1.c_($$2));
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
