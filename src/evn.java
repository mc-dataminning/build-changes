import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class evn extends ewc {
   public static final MapCodec<evn> a = MapCodec.unit(() -> evn.b);
   public static final evn b = new evn();

   @Nullable
   @Override
   public ewf.d a(dkc $$0, iw $$1, iw $$2, ewf.d $$3, ewf.d $$4, ewb $$5) {
      iw $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dng.K);
      return $$7 && !dne.a($$4.b().f($$0, $$6)) ? new ewf.d($$6, dng.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected ewe<?> a() {
      return ewe.m;
   }
}
