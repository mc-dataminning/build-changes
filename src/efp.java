import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class efp extends egd {
   public static final Codec<efp> a = Codec.unit(() -> efp.b);
   public static final efp b = new efp();

   @Nullable
   @Override
   public egg.c a(cwh $$0, ib $$1, ib $$2, egg.c $$3, egg.c $$4, egc $$5) {
      ib $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(czh.H);
      return $$7 && !czf.a($$4.b().j($$0, $$6)) ? new egg.c($$6, czh.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected egf<?> a() {
      return egf.m;
   }
}
