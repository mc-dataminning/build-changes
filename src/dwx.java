import com.mojang.serialization.MapCodec;

public class dwx extends drg {
   public static final MapCodec<dwx> c = b(dwx::new);
   private static final fgw e = dno.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dwx> a() {
      return c;
   }

   public dwx(ebp.d $$0) {
      super($$0, jc.b, e, false);
   }

   @Override
   protected drh c() {
      return (drh)dnq.ph;
   }
}
