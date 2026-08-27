import com.mojang.serialization.MapCodec;

public class dhx extends dcu {
   public static final MapCodec<dhx> c = b(dhx::new);
   public static final epo g = czf.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dhx> a() {
      return c;
   }

   public dhx(dmd.d $$0) {
      super($$0, ih.b, g, false, 0.1);
   }

   @Override
   protected int a(awt $$0) {
      return dek.a($$0);
   }

   @Override
   protected czf b() {
      return czh.oC;
   }

   @Override
   protected boolean g(dme $$0) {
      return dek.a($$0);
   }
}
