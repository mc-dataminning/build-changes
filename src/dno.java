import com.mojang.serialization.MapCodec;

public class dno extends dhp {
   public static final MapCodec<dno> c = b(dno::new);
   protected static final evf g = dea.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dno> a() {
      return c;
   }

   public dno(drc.d $$0) {
      super($$0, it.a, g, false, 0.1);
   }

   @Override
   protected int a(aym $$0) {
      return djg.a($$0);
   }

   @Override
   protected dea b() {
      return dec.oA;
   }

   @Override
   protected boolean g(drd $$0) {
      return djg.a($$0);
   }
}
