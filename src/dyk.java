import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dyk extends dyy {
   public static final Codec<dyk> a = Codec.unit(() -> dyk.b);
   public static final dyk b = new dyk();

   @Nullable
   @Override
   public dzb.c a(cpy $$0, gw $$1, gw $$2, dzb.c $$3, dzb.c $$4, dyx $$5) {
      gw $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(csw.H);
      return $$7 && !csv.a($$4.b().j($$0, $$6)) ? new dzb.c($$6, csw.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected dza<?> a() {
      return dza.m;
   }
}
