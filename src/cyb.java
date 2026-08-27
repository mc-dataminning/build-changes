import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyb extends cyr implements cos {
   public static final dmv a = dmu.w;
   private final dgg.a b;

   public cyb(dgg.a $$0, dmd.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cyb> a();

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(czh.gO) || $$1.a(czh.gP) || $$1.a(czh.gQ) || $$1.a(czh.gR);
         if ($$3) {
            return a($$2, djn.p, dkw::a);
         }
      }

      return null;
   }

   public dgg.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   @Override
   public bom i() {
      return bom.f;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(a);
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
