import com.mojang.serialization.MapCodec;

public class dir extends dje {
   public static final MapCodec<dir> a = b(dir::new);

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(aE);
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
