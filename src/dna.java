import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dna extends djy {
   public static final MapCodec<dna> a = b(dna::new);
   protected static final fcs b = dkm.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<jh> c = jh.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(jh::j).toList();

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   protected dna(dxu.d $$0) {
      super($$0);
   }

   public static boolean a(dhi $$0, jh $$1, jh $$2) {
      return $$0.a_($$1.a((kl)$$2)).a(axu.cy) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axu.cz);
   }

   @Override
   protected boolean g_(dxv $$0) {
      return true;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
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
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return $$0.C ? a($$2, duz.n, dvt::a) : null;
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return btj.a;
   }

   @Nullable
   @Override
   protected btl b(dxv $$0, dhi $$1, jh $$2) {
      dux $$3 = $$1.c_($$2);
      if ($$3 instanceof dvt) {
         xv $$4 = ((btm)$$3).p_();
         return new btr(($$2x, $$3x, $$4x) -> new cty($$2x, $$3x, ctp.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
