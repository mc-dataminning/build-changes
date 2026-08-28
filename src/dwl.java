import com.mojang.serialization.MapCodec;

public class dwl extends dqu {
   public static final MapCodec<dwl> c = b(dwl::new);
   private static final fgk e = dnc.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dwl> a() {
      return c;
   }

   public dwl(ebd.d $$0) {
      super($$0, jb.b, e, false);
   }

   @Override
   protected dqv c() {
      return (dqv)dne.ph;
   }
}
