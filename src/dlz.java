import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dlz extends diy {
   public static final MapCodec<dlz> a = b(dlz::new);
   protected static final fbu b = djm.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ji> c = ji.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ji::j).toList();

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   protected dlz(dww.d $$0) {
      super($$0);
   }

   public static boolean a(dgi $$0, ji $$1, ji $$2) {
      return $$0.a_($$1.a((km)$$2)).a(awp.cy) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awp.cz);
   }

   @Override
   protected boolean g_(dwx $$0) {
      return true;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (ji $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lt.s,
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
   protected dpx a_(dwx $$0) {
      return dpx.c;
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new duv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return $$0.C ? a($$2, dub.n, duv::a) : null;
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return bsj.a;
   }

   @Nullable
   @Override
   protected bsl b(dwx $$0, dgi $$1, ji $$2) {
      dtz $$3 = $$1.c_($$2);
      if ($$3 instanceof duv) {
         wo $$4 = ((bsm)$$3).p_();
         return new bsr(($$2x, $$3x, $$4x) -> new csy($$2x, $$3x, csp.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
