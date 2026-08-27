import com.mojang.serialization.MapCodec;

public class dbh extends czi implements coa {
   public static final MapCodec<dbh> c = b(dbh::new);

   @Override
   public MapCodec<dbh> a() {
      return c;
   }

   protected dbh(dle.d $$0) {
      super($$0);
   }

   @Override
   public bnv g() {
      return bnv.f;
   }
}
