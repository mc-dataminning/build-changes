import com.mojang.serialization.MapCodec;

public class dww extends drh {
   public static final MapCodec<dww> c = b(dww::new);
   private static final fgw g = dno.b(8.0, 0.0, 15.0);

   @Override
   public MapCodec<dww> a() {
      return c;
   }

   public dww(ebp.d $$0) {
      super($$0, jc.b, g, false, 0.1);
   }

   @Override
   protected int a(bai $$0) {
      return dtb.a($$0);
   }

   @Override
   protected dno b() {
      return dnq.pi;
   }

   @Override
   protected boolean h(ebq $$0) {
      return dtb.a($$0);
   }
}
