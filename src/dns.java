import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dns extends diz {
   public static final MapCodec<dns> a = b(dns::new);
   public static final dxp b = dxo.r;

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   protected dns(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, @Nullable bvi $$3, cwq $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cyz $$5 = $$4.a(kv.Y, cyz.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dve $$5) {
         $$5.s();
         return bsl.a;
      } else {
         return bsl.e;
      }
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if ($$1.c(b)) {
         return bsl.f;
      } else {
         cwq $$7 = $$4.b($$5);
         bsl $$8 = cwv.a($$2, $$3, $$7, $$4);
         return (bsl)(!$$8.a() ? bsl.f : $$8);
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dve $$5) {
            $$5.s();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dve($$0, $$1);
   }

   @Override
   public boolean f_(dwy $$0) {
      return true;
   }

   @Override
   public int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      if ($$1.c_($$2) instanceof dve $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return $$1.c_($$2) instanceof dve $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return $$1.c(b) ? a($$2, duc.e, dve::a) : null;
   }
}
