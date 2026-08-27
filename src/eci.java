import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eci extends ecw {
   public static final Codec<eci> a = Codec.unit(() -> eci.b);
   public static final eci b = new eci();

   @Nullable
   @Override
   public ecz.c a(ctl $$0, hx $$1, hx $$2, ecz.c $$3, ecz.c $$4, ecv $$5) {
      hx $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(cwl.H);
      return $$7 && !cwj.a($$4.b().j($$0, $$6)) ? new ecz.c($$6, cwl.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected ecy<?> a() {
      return ecy.m;
   }
}
