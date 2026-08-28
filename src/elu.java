import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elu extends emi {
   public static final MapCodec<elu> a = MapCodec.unit(() -> elu.b);
   public static final elu b = new elu();

   @Nullable
   @Override
   public eml.c a(dcc $$0, iz $$1, iz $$2, eml.c $$3, eml.c $$4, emh $$5) {
      iz $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dfc.H);
      return $$7 && !dfa.a($$4.b().j($$0, $$6)) ? new eml.c($$6, dfc.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected emk<?> a() {
      return emk.m;
   }
}
