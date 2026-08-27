import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvm extends cwc implements clz {
   public static final djy a = djx.w;
   private final ddr.a b;

   public cvm(ddr.a $$0, djg.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cvm> a();

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dig($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(cws.gO) || $$1.a(cws.gP) || $$1.a(cws.gQ) || $$1.a(cws.gR);
         if ($$3) {
            return a($$2, dgx.p, dig::a);
         }
      }

      return null;
   }

   public ddr.a b() {
      return this.b;
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   @Override
   public bma g() {
      return bma.f;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(a);
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
