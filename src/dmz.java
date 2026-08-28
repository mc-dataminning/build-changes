import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dmz extends djx {
   public static final MapCodec<dmz> a = b(dmz::new);
   protected static final fcr b = dkl.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<jh> c = jh.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(jh::j).toList();

   @Override
   public MapCodec<dmz> a() {
      return a;
   }

   protected dmz(dxt.d $$0) {
      super($$0);
   }

   public static boolean a(dhh $$0, jh $$1, jh $$2) {
      return $$0.a_($$1.a((kl)$$2)).a(axu.cy) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axu.cz);
   }

   @Override
   protected boolean g_(dxu $$0) {
      return true;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (jh $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               ls.s,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return $$0.C ? a($$2, duy.n, dvs::a) : null;
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return bti.a;
   }

   @Nullable
   @Override
   protected btk b(dxu $$0, dhh $$1, jh $$2) {
      duw $$3 = $$1.c_($$2);
      if ($$3 instanceof dvs) {
         xv $$4 = ((btl)$$3).p_();
         return new btq(($$2x, $$3x, $$4x) -> new ctx($$2x, $$3x, cto.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
