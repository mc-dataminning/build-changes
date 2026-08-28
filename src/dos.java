import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dos extends doc implements dpf {
   public static final MapCodec<dos> c = b(dos::new);
   protected static final fcs g = dkm.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dos> a() {
      return c;
   }

   protected dos(dxu.d $$0) {
      super($$0, jm.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dxv $$0) {
      return $$0.a(dko.J);
   }

   @Override
   protected dkm b() {
      return dko.my;
   }

   @Override
   protected boolean o(dxv $$0) {
      return !$$0.a(dko.le);
   }

   @Override
   public boolean a(@Nullable cpx $$0, dgn $$1, jh $$2, dxv $$3, etw $$4) {
      return false;
   }

   @Override
   public boolean a(dhj $$0, jh $$1, dxv $$2, etx $$3) {
      return false;
   }

   @Override
   protected int a(bam $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());
      return $$1.a(aya.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected etx b_(dxv $$0) {
      return ety.c.a(false);
   }
}
