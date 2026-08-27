import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnp extends den implements dio {
   public static final MapCodec<dnp> a = b(dnp::new);
   public static final dua<dum> b = dts.bj;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   protected dnp(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dum.b));
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new drw($$0, $$1);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      dqc $$5 = $$1.c_($$2);
      if ($$5 instanceof drw) {
         return ((drw)$$5).a($$3) ? bqa.a($$1.C) : bqa.d;
      } else {
         return bqa.d;
      }
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, @Nullable bso $$3, cuh $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dqc $$5 = $$0.c_($$1);
            if ($$5 instanceof drw) {
               ((drw)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if ($$1 instanceof aqt) {
         if ($$1.c_($$2) instanceof drw $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.C();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aqt)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aqt $$0, drw $$1) {
      switch ($$1.u()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.A();
         case d:
      }
   }
}
