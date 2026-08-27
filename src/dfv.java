import com.mojang.serialization.MapCodec;

public class dfv extends czy {
   public static final MapCodec<dfv> c = b(dfv::new);
   protected static final emf g = cwj.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dfv> a() {
      return c;
   }

   public dfv(diz.d $$0) {
      super($$0, ic.a, g, false, 0.1);
   }

   @Override
   protected int a(aup $$0) {
      return dbo.a($$0);
   }

   @Override
   protected cwj b() {
      return cwl.oA;
   }

   @Override
   protected boolean g(dja $$0) {
      return dbo.a($$0);
   }
}
