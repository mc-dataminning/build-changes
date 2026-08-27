import javax.annotation.Nullable;

public class cje extends chv {
   public cje(brn<? extends cje> $$0, dad $$1) {
      super($$0, $$1);
      this.a(emr.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bT.a(3, new caq<>(this, cjw.class, true));
      super.z();
   }

   @Override
   protected avb v() {
      return avc.Co;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.Cq;
   }

   @Override
   protected avb o_() {
      return avc.Cp;
   }

   @Override
   avb u() {
      return avc.Cr;
   }

   @Override
   protected void a(bqf $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof chz $$4 && $$4.gq()) {
         $$4.gr();
         this.a((dac)ctc.um);
      }
   }

   @Override
   protected void a(ayg $$0, bpk $$1) {
      this.a(bro.a, new csz(ctc.oQ));
   }

   @Override
   protected void b(ayg $$0, bpk $$1) {
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      bss $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(bth.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(brh $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bsa) {
            ((bsa)$$0).b(new bqt(bqv.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cln b(csz $$0, float $$1) {
      cln $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bqt $$0) {
      return $$0.a(bqv.t) ? false : super.c($$0);
   }
}
