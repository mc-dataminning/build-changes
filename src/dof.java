import com.mojang.serialization.MapCodec;

public class dof extends dot {
   public static final MapCodec<dof> a = b(dof::new);

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   public dof(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(e);
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(e, $$0.g().g());
   }
}
