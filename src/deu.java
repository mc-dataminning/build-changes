import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class deu extends dfk implements cts {
   public static final dtt a = dts.w;
   private final dnb.a b;

   public deu(dnb.a $$0, dtb.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends deu> a();

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dru($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dga.gO) || $$1.a(dga.gP) || $$1.a(dga.gQ) || $$1.a(dga.gR);
         if ($$3) {
            return a($$2, dqj.p, dru::a);
         }
      }

      return null;
   }

   public dnb.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   public bsy m() {
      return bsy.f;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(a);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
