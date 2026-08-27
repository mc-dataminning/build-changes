import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eiq extends eje {
   public static final Codec<eiq> a = Codec.unit(() -> eiq.b);
   public static final eiq b = new eiq();

   @Nullable
   @Override
   public ejh.c a(cza $$0, ib $$1, ib $$2, ejh.c $$3, ejh.c $$4, ejd $$5) {
      ib $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dca.H);
      return $$7 && !dby.a($$4.b().j($$0, $$6)) ? new ejh.c($$6, dca.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected ejg<?> a() {
      return ejg.m;
   }
}
