import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elo extends emc {
   public static final MapCodec<elo> a = MapCodec.unit(() -> elo.b);
   public static final elo b = new elo();

   @Nullable
   @Override
   public emf.c a(dbw $$0, iz $$1, iz $$2, emf.c $$3, emf.c $$4, emb $$5) {
      iz $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dew.H);
      return $$7 && !deu.a($$4.b().j($$0, $$6)) ? new emf.c($$6, dew.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected eme<?> a() {
      return eme.m;
   }
}
