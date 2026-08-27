import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyw extends czm implements cpm {
   public static final dnq a = dnp.w;
   private final dhb.a b;

   public cyw(dhb.a $$0, dmy.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cyw> a();

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dac.gO) || $$1.a(dac.gP) || $$1.a(dac.gQ) || $$1.a(dac.gR);
         if ($$3) {
            return a($$2, dki.p, dlr::a);
         }
      }

      return null;
   }

   public dhb.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   @Override
   public bpd i() {
      return bpd.f;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(a);
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
