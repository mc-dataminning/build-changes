import com.mojang.serialization.MapCodec;

public class dno extends dqz {
   public static final MapCodec<dno> b = b(dno::new);

   @Override
   public MapCodec<dno> a() {
      return b;
   }

   protected dno(dvc.d $$0) {
      super(dpa.b.e, $$0);
   }
}
