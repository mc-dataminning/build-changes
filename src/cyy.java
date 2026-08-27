import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyy extends czo implements cpo {
   public static final dns a = dnr.w;
   private final dhd.a b;

   public cyy(dhd.a $$0, dna.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cyy> a();

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dae.gO) || $$1.a(dae.gP) || $$1.a(dae.gQ) || $$1.a(dae.gR);
         if ($$3) {
            return a($$2, dkk.p, dlt::a);
         }
      }

      return null;
   }

   public dhd.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   @Override
   public bpe i() {
      return bpe.f;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(a);
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
