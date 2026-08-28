import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eph extends epw {
   public static final MapCodec<eph> a = MapCodec.unit(() -> eph.b);
   public static final eph b = new eph();

   @Nullable
   @Override
   public epz.c a(dfe $$0, jh $$1, jh $$2, epz.c $$3, epz.c $$4, epv $$5) {
      jh $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dig.H);
      return $$7 && !die.a($$4.b().f($$0, $$6)) ? new epz.c($$6, dig.H.m(), $$4.c()) : $$4;
   }

   @Override
   protected epy<?> a() {
      return epy.m;
   }
}
