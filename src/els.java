import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class els extends emg {
   public static final MapCodec<els> a = MapCodec.unit(() -> els.b);
   public static final els b = new els();

   @Nullable
   @Override
   public emj.c a(dca $$0, iz $$1, iz $$2, emj.c $$3, emj.c $$4, emf $$5) {
      iz $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dfa.H);
      return $$7 && !dey.a($$4.b().j($$0, $$6)) ? new emj.c($$6, dfa.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected emi<?> a() {
      return emi.m;
   }
}
