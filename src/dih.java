import com.mojang.serialization.MapCodec;

public class dih extends diu {
   public static final MapCodec<dih> a = b(dih::new);

   @Override
   public MapCodec<dih> a() {
      return a;
   }

   public dih(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(aE);
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
