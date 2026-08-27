import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cuu extends cvl {
   public static final djj a = czu.aE;
   public static final djg b = djf.r;

   protected cuu(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ia.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cuu> a();

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         this.a($$1, $$2, $$3);
         return bjl.b;
      }
   }

   protected abstract void a(csy var1, hv var2, cer var3);

   @Override
   public dip a(coq $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      if ($$4.A()) {
         dgd $$5 = $$0.c_($$1);
         if ($$5 instanceof dfs) {
            ((dfs)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgd $$5 = $$1.c_($$2);
         if ($$5 instanceof dfs) {
            if ($$1 instanceof amp) {
               bjh.a($$1, $$2, (dfs)$$5);
               ((dfs)$$5).a((amp)$$1, elb.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return chk.a($$1.c_($$2));
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dgd> dge<T> a(csy $$0, dgf<T> $$1, dgf<? extends dfs> $$2) {
      return $$0.B ? null : a($$1, $$2, dfs::a);
   }
}
