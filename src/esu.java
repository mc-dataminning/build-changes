import com.mojang.serialization.MapCodec;

public class esu extends esv {
   public static final MapCodec<esu> a = MapCodec.unit(() -> esu.b);
   public static final esu b = new esu();

   private esu() {
   }

   @Override
   public boolean a(jj $$0, jj $$1, jj $$2, azs $$3) {
      return true;
   }

   @Override
   protected esw<?> a() {
      return esw.a;
   }
}
