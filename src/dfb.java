import com.mojang.serialization.MapCodec;

public class dfb extends czy {
   public static final MapCodec<dfb> c = b(dfb::new);
   public static final emf g = cwj.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dfb> a() {
      return c;
   }

   public dfb(diz.d $$0) {
      super($$0, ic.b, g, false, 0.1);
   }

   @Override
   protected int a(aup $$0) {
      return dbo.a($$0);
   }

   @Override
   protected cwj b() {
      return cwl.oC;
   }

   @Override
   protected boolean g(dja $$0) {
      return dbo.a($$0);
   }
}
