import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dms extends djq {
   public static final MapCodec<dms> a = b(dms::new);
   protected static final fcm b = dke.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<jh> c = jh.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(jh::j).toList();

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   protected dms(dxm.d $$0) {
      super($$0);
   }

   public static boolean a(dha $$0, jh $$1, jh $$2) {
      return $$0.a_($$1.a((kl)$$2)).a(axu.cy) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axu.cz);
   }

   @Override
   protected boolean g_(dxn $$0) {
      return true;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
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
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return $$0.C ? a($$2, dur.n, dvl::a) : null;
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return bte.a;
   }

   @Nullable
   @Override
   protected btg b(dxn $$0, dha $$1, jh $$2) {
      dup $$3 = $$1.c_($$2);
      if ($$3 instanceof dvl) {
         xv $$4 = ((bth)$$3).p_();
         return new btm(($$2x, $$3x, $$4x) -> new ctt($$2x, $$3x, ctk.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
