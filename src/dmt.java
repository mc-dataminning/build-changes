import com.mojang.serialization.MapCodec;

public class dmt extends dhp {
   public static final MapCodec<dmt> c = b(dmt::new);
   public static final evf g = dea.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dmt> a() {
      return c;
   }

   public dmt(drc.d $$0) {
      super($$0, it.b, g, false, 0.1);
   }

   @Override
   protected int a(aym $$0) {
      return djg.a($$0);
   }

   @Override
   protected dea b() {
      return dec.oC;
   }

   @Override
   protected boolean g(drd $$0) {
      return djg.a($$0);
   }
}
