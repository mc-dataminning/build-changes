import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djj extends den {
   public static final MapCodec<djj> a = b(djj::new);
   public static final dtt b = dts.n;

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   protected djj(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, @Nullable bso $$3, cuh $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cxf $$5 = $$4.a(ke.O, cxf.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof drf $$5) {
         $$5.l();
         return bqa.a($$1.C);
      } else {
         return bqa.d;
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof drf $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new drf($$0, $$1);
   }

   @Override
   public boolean e_(dtc $$0) {
      return true;
   }

   @Override
   public int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      if ($$1.c_($$2) instanceof drf $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      if ($$1.c_($$2) instanceof drf $$3 && $$3.f().f() instanceof cvk $$4) {
         return $$4.d();
      }

      return 0;
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return $$1.c(b) ? a($$2, dqe.f, drf::a) : null;
   }
}
