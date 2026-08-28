import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqp extends dpx implements drc {
   public static final MapCodec<dqp> c = b(dqp::new);

   @Override
   public MapCodec<dqp> a() {
      return c;
   }

   protected dqp(eag.d $$0) {
      super($$0, ja.b, ffh.b(), true);
   }

   @Override
   protected dpy c() {
      return (dpy)dmh.mI;
   }

   @Override
   protected ewo b_(eah $$0) {
      return ewp.c.a(false);
   }

   @Override
   protected boolean o(eah $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable bxe $$0, dig $$1, iu $$2, eah $$3, ewn $$4) {
      return false;
   }

   @Override
   public boolean a(djb $$0, iu $$1, eah $$2, ewo $$3) {
      return false;
   }
}
