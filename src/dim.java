import com.mojang.serialization.MapCodec;

public class dim extends dlg {
   public static final MapCodec<dim> a = b(dim::new);

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   public dim(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, je.a.b));
   }

   @Override
   public void a(dbt $$0, drx $$1, iz $$2, bsp $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.aj().k());
   }
}
