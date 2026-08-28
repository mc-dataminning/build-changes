import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eny extends eon {
   public static final MapCodec<eny> a = MapCodec.unit(() -> eny.b);
   public static final eny b = new eny();

   @Nullable
   @Override
   public eoq.c a(ddv $$0, je $$1, je $$2, eoq.c $$3, eoq.c $$4, eom $$5) {
      je $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dgx.H);
      return $$7 && !dgv.a($$4.b().f($$0, $$6)) ? new eoq.c($$6, dgx.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected eop<?> a() {
      return eop.m;
   }
}
