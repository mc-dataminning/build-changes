import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddh extends cyr {
   public static final MapCodec<ddh> a = b(ddh::new);
   public static final dmv b = dmu.n;

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   protected ddh(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, @Nullable box $$3, cpq $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      sy $$5 = cnl.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dkm $$5) {
         $$5.l();
         return bml.a($$1.B);
      } else {
         return bml.d;
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dkm $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkm($$0, $$1);
   }

   @Override
   public boolean f_(dme $$0) {
      return true;
   }

   @Override
   public int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      if ($$1.c_($$2) instanceof dkm $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dkm $$3 && $$3.f().d() instanceof cqi $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return $$1.c(b) ? a($$2, djn.e, dkm::a) : null;
   }
}
