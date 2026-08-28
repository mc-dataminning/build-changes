import com.mojang.serialization.MapCodec;

public class dxu extends drg {
   public static final MapCodec<dxu> c = b(dxu::new);
   private static final fgw e = dno.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dxu> a() {
      return c;
   }

   public dxu(ebp.d $$0) {
      super($$0, jc.a, e, false);
   }

   @Override
   protected drh c() {
      return (drh)dnq.pf;
   }
}
