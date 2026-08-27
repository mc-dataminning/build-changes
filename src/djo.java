import com.mojang.serialization.MapCodec;

public class djo extends ddo {
   public static final MapCodec<djo> c = b(djo::new);
   public static final eqk e = daa.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<djo> a() {
      return c;
   }

   public djo(dmy.d $$0) {
      super($$0, ih.a, e, false);
   }

   @Override
   protected ddp c() {
      return (ddp)dac.oz;
   }
}
