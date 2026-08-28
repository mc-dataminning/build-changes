import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dkk extends dhk {
   public static final MapCodec<dkk> a = b(dkk::new);
   protected static final fab b = dhy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<jg> c = jg.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(jg::j).toList();

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   protected dkk(dvc.d $$0) {
      super($$0);
   }

   public static boolean a(dev $$0, jg $$1, jg $$2) {
      return $$0.a_($$1.a((kk)$$2)).a(awz.cx) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awz.cy);
   }

   @Override
   protected boolean g_(dvd $$0) {
      return true;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (jg $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lq.s,
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
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return $$0.C ? a($$2, dsi.m, dtb::a) : null;
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return bry.a;
   }

   @Nullable
   @Override
   protected bsa b(dvd $$0, dev $$1, jg $$2) {
      dsg $$3 = $$1.c_($$2);
      if ($$3 instanceof dtb) {
         xh $$4 = ((bsb)$$3).S_();
         return new bsg(($$2x, $$3x, $$4x) -> new csf($$2x, $$3x, crw.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
