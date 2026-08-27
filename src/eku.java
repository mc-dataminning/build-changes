import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eku extends eli {
   public static final MapCodec<eku> a = MapCodec.unit(() -> eku.b);
   public static final eku b = new eku();

   @Nullable
   @Override
   public ell.c a(dbc $$0, io $$1, io $$2, ell.c $$3, ell.c $$4, elh $$5) {
      io $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dec.H);
      return $$7 && !dea.a($$4.b().j($$0, $$6)) ? new ell.c($$6, dec.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected elk<?> a() {
      return elk.m;
   }
}
