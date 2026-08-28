import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eqw extends erl {
   public static final MapCodec<eqw> a = MapCodec.unit(() -> eqw.b);
   public static final eqw b = new eqw();

   @Nullable
   @Override
   public ero.d a(dgl $$0, ji $$1, ji $$2, ero.d $$3, ero.d $$4, erk $$5) {
      ji $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(djo.K);
      return $$7 && !djm.a($$4.b().f($$0, $$6)) ? new ero.d($$6, djo.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected ern<?> a() {
      return ern.m;
   }
}
