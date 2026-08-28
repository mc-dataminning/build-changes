import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drm extends dqu implements drz {
   public static final MapCodec<drm> c = b(drm::new);

   @Override
   public MapCodec<drm> a() {
      return c;
   }

   protected drm(ebd.d $$0) {
      super($$0, jb.b, fgh.b(), true);
   }

   @Override
   protected dqv c() {
      return (dqv)dne.mI;
   }

   @Override
   protected exo b_(ebe $$0) {
      return exp.c.a(false);
   }

   @Override
   protected boolean o(ebe $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable bxu $$0, djb $$1, iv $$2, ebe $$3, exn $$4) {
      return false;
   }

   @Override
   public boolean a(djy $$0, iv $$1, ebe $$2, exo $$3) {
      return false;
   }
}
