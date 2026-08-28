import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dly extends dix {
   public static final MapCodec<dly> a = b(dly::new);
   protected static final fbt b = djl.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ji> c = ji.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ji::j).toList();

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   protected dly(dwv.d $$0) {
      super($$0);
   }

   public static boolean a(dgh $$0, ji $$1, ji $$2) {
      return $$0.a_($$1.a((km)$$2)).a(awp.cy) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awp.cz);
   }

   @Override
   protected boolean g_(dww $$0) {
      return true;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
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
   public dty a(ji $$0, dww $$1) {
      return new duu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return $$0.C ? a($$2, dua.n, duu::a) : null;
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return bsj.a;
   }

   @Nullable
   @Override
   protected bsl b(dww $$0, dgh $$1, ji $$2) {
      dty $$3 = $$1.c_($$2);
      if ($$3 instanceof duu) {
         wp $$4 = ((bsm)$$3).p_();
         return new bsr(($$2x, $$3x, $$4x) -> new csx($$2x, $$3x, cso.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
