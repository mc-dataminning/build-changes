import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dok extends dnu implements dox {
   public static final MapCodec<dok> c = b(dok::new);
   protected static final fcm g = dke.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dok> a() {
      return c;
   }

   protected dok(dxm.d $$0) {
      super($$0, jm.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dxn $$0) {
      return $$0.a(dkg.J);
   }

   @Override
   protected dke b() {
      return dkg.my;
   }

   @Override
   protected boolean o(dxn $$0) {
      return !$$0.a(dkg.le);
   }

   @Override
   public boolean a(@Nullable cps $$0, dgf $$1, jh $$2, dxn $$3, eto $$4) {
      return false;
   }

   @Override
   public boolean a(dhb $$0, jh $$1, dxn $$2, etp $$3) {
      return false;
   }

   @Override
   protected int a(bam $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      return $$1.a(aya.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected etp b_(dxn $$0) {
      return etq.c.a(false);
   }
}
