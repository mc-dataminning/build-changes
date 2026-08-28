import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class equ extends erj {
   public static final MapCodec<equ> a = MapCodec.unit(() -> equ.b);
   public static final equ b = new equ();

   @Nullable
   @Override
   public erm.d a(dgj $$0, ji $$1, ji $$2, erm.d $$3, erm.d $$4, eri $$5) {
      ji $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(djm.K);
      return $$7 && !djk.a($$4.b().f($$0, $$6)) ? new erm.d($$6, djm.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected erl<?> a() {
      return erl.m;
   }
}
