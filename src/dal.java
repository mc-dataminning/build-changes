import com.mojang.serialization.MapCodec;

public class dal extends csp {
   public static final MapCodec<dal> c = b(dal::new);

   @Override
   public MapCodec<dal> a() {
      return c;
   }

   public dal(dfc.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : cte.a.o();
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return h($$1.a_($$2.d()));
   }

   public static boolean h(dfd $$0) {
      return $$0.a(apv.aS);
   }

   @Override
   protected boolean f(dfd $$0) {
      return true;
   }
}
