import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class esq extends etf {
   public static final MapCodec<esq> a = MapCodec.unit(() -> esq.b);
   public static final esq b = new esq();

   @Nullable
   @Override
   public eti.d a(dhs $$0, jj $$1, jj $$2, eti.d $$3, eti.d $$4, ete $$5) {
      jj $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dkw.K);
      return $$7 && !dku.a($$4.b().f($$0, $$6)) ? new eti.d($$6, dkw.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected eth<?> a() {
      return eth.m;
   }
}
