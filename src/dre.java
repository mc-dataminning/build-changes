import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dre extends dql {
   public static final MapCodec<dre> b = b(dre::new);

   @Override
   public MapCodec<dre> a() {
      return b;
   }

   protected dre(dun.d $$0) {
      super(dom.b.d, $$0);
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, @Nullable buk $$3, cvp $$4) {
      drd.a($$0, $$1);
   }
}
