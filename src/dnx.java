import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnx extends dfk implements djg {
   public static final MapCodec<dnx> a = b(dnx::new);
   public static final dua<dum> b = dts.bj;

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   protected dnx(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dum.b));
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drx($$0, $$1);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      dqh $$5 = $$1.c_($$2);
      if ($$5 instanceof drx) {
         return ((drx)$$5).a($$3) ? bqr.a($$1.B) : bqr.e;
      } else {
         return bqr.e;
      }
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, @Nullable btn $$3, cuq $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dqh $$5 = $$0.c_($$1);
            if ($$5 instanceof drx) {
               ((drx)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if ($$1 instanceof aqu) {
         if ($$1.c_($$2) instanceof drx $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aqu)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aqu $$0, drx $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}
