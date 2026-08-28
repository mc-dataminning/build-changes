import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eqx extends erm {
   public static final MapCodec<eqx> a = MapCodec.unit(() -> eqx.b);
   public static final eqx b = new eqx();

   @Nullable
   @Override
   public erp.d a(dgm $$0, ji $$1, ji $$2, erp.d $$3, erp.d $$4, erl $$5) {
      ji $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(djp.K);
      return $$7 && !djn.a($$4.b().f($$0, $$6)) ? new erp.d($$6, djp.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected ero<?> a() {
      return ero.m;
   }
}
