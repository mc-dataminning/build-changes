import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dee extends czo {
   public static final MapCodec<dee> a = b(dee::new);
   public static final dns b = dnr.n;

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   protected dee(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, @Nullable bpp $$3, cqm $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      ta $$5 = coh.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dlj $$5) {
         $$5.l();
         return bnd.a($$1.B);
      } else {
         return bnd.d;
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dlj $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlj($$0, $$1);
   }

   @Override
   public boolean f_(dnb $$0) {
      return true;
   }

   @Override
   public int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      if ($$1.c_($$2) instanceof dlj $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dlj $$3 && $$3.f().d() instanceof cre $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return $$1.c(b) ? a($$2, dkk.e, dlj::a) : null;
   }
}
