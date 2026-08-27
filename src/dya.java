import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dya extends dyo {
   public static final Codec<dya> a = Codec.unit(() -> dya.b);
   public static final dya b = new dya();

   @Nullable
   @Override
   public dyr.c a(cpo $$0, gu $$1, gu $$2, dyr.c $$3, dyr.c $$4, dyn $$5) {
      gu $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(csm.H);
      return $$7 && !csl.a($$4.b().j($$0, $$6)) ? new dyr.c($$6, csm.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected dyq<?> a() {
      return dyq.m;
   }
}
