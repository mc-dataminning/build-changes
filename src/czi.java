import javax.annotation.Nullable;

public class czi extends csd {
   public static final dfv a = dfu.E;
   private final bfy b = bfv.a(5);

   public czi(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return $$0.B ? null : a($$2, dcs.K, ddu::a);
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, cja $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
