import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class evl extends ewa {
   public static final MapCodec<evl> a = MapCodec.unit(() -> evl.b);
   public static final evl b = new evl();

   @Nullable
   @Override
   public ewd.d a(dka $$0, iv $$1, iv $$2, ewd.d $$3, ewd.d $$4, evz $$5) {
      iv $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dne.K);
      return $$7 && !dnc.a($$4.b().f($$0, $$6)) ? new ewd.d($$6, dne.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected ewc<?> a() {
      return ewc.m;
   }
}
