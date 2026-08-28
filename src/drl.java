import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drl extends dqv implements drz {
   public static final MapCodec<drl> c = b(drl::new);
   private static final double g = 0.14;
   private static final fgk h = dnc.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<drl> a() {
      return c;
   }

   protected drl(ebd.d $$0) {
      super($$0, jb.b, h, true, 0.14);
   }

   @Override
   protected boolean h(ebe $$0) {
      return $$0.a(dne.J);
   }

   @Override
   protected dnc b() {
      return dne.mJ;
   }

   @Override
   protected boolean o(ebe $$0) {
      return !$$0.a(dne.lp);
   }

   @Override
   public boolean a(@Nullable bxu $$0, djb $$1, iv $$2, ebe $$3, exn $$4) {
      return false;
   }

   @Override
   public boolean a(djy $$0, iv $$1, ebe $$2, exo $$3) {
      return false;
   }

   @Override
   protected int a(azx $$0) {
      return 1;
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      return $$1.a(axj.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected exo b_(ebe $$0) {
      return exp.c.a(false);
   }
}
