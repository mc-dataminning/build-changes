import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ejp extends ekd {
   public static final Codec<ejp> a = Codec.unit(() -> ejp.b);
   public static final ejp b = new ejp();

   @Nullable
   @Override
   public ekg.c a(czx $$0, im $$1, im $$2, ekg.c $$3, ekg.c $$4, ekc $$5) {
      im $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dcx.H);
      return $$7 && !dcv.a($$4.b().j($$0, $$6)) ? new ekg.c($$6, dcx.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected ekf<?> a() {
      return ekf.m;
   }
}
