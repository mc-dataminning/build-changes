import com.mojang.serialization.MapCodec;

public class dir extends dll {
   public static final MapCodec<dir> a = b(dir::new);

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, je.a.b));
   }

   @Override
   public void a(dby $$0, dsc $$1, iz $$2, bsu $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.aj().k());
   }
}
