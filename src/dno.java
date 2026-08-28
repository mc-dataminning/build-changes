import com.mojang.serialization.MapCodec;

public class dno extends doc {
   public static final MapCodec<dno> a = b(dno::new);

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   public dno(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(aF);
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(aF, $$0.g().g());
   }
}
