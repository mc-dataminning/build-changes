import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddw extends cvl implements czh {
   public static final MapCodec<ddw> a = b(ddw::new);
   public static final djn<djz> b = djf.bj;

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   protected ddw(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, djz.b));
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhr($$0, $$1);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      dgd $$6 = $$1.c_($$2);
      if ($$6 instanceof dhr) {
         return ((dhr)$$6).a($$3) ? bjl.a($$1.B) : bjl.d;
      } else {
         return bjl.d;
      }
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, @Nullable blv $$3, cmh $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dgd $$5 = $$0.c_($$1);
            if ($$5 instanceof dhr) {
               ((dhr)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if ($$1 instanceof amp) {
         if ($$1.c_($$2) instanceof dhr $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.F();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((amp)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(amp $$0, dhr $$1) {
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
