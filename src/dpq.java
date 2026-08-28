import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dpq extends dmo {
   public static final MapCodec<dpq> a = b(dpq::new);
   public static final List<iv> b = iv.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iv::j).toList();
   private static final fgk c = dnc.b(16.0, 0.0, 12.0);

   @Override
   public MapCodec<dpq> a() {
      return a;
   }

   protected dpq(ebd.d $$0) {
      super($$0);
   }

   public static boolean a(djx $$0, iv $$1, iv $$2) {
      return $$0.a_($$1.a((ka)$$2)).a(axe.cC) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axe.cD);
   }

   @Override
   protected boolean g_(ebe $$0) {
      return true;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c;
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (iv $$4 : b) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               ly.s,
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
   public dyc a(iv $$0, ebe $$1) {
      return new dyz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return $$0.C ? a($$2, dye.n, dyz::a) : null;
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
      }

      return bur.a;
   }

   @Nullable
   @Override
   protected but b(ebe $$0, djx $$1, iv $$2) {
      dyc $$3 = $$1.c_($$2);
      if ($$3 instanceof dyz) {
         xa $$4 = ((buu)$$3).m_();
         return new buz(($$2x, $$3x, $$4x) -> new cwm($$2x, $$3x, cwd.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
