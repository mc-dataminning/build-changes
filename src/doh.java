import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class doh extends dlg {
   public static final MapCodec<doh> a = b(doh::new);
   public static final List<iu> b = iu.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iu::j).toList();
   private static final feq c = dlu.b(16.0, 0.0, 12.0);

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   protected doh(dzn.d $$0) {
      super($$0);
   }

   public static boolean a(dip $$0, iu $$1, iu $$2) {
      return $$0.a_($$1.a((jz)$$2)).a(axa.cA) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axa.cB);
   }

   @Override
   protected boolean g_(dzo $$0) {
      return true;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c;
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (iu $$4 : b) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lx.s,
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
   public dwn a(iu $$0, dzo $$1) {
      return new dxk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return $$0.C ? a($$2, dwp.n, dxk::a) : null;
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
      }

      return bty.a;
   }

   @Nullable
   @Override
   protected bua b(dzo $$0, dip $$1, iu $$2) {
      dwn $$3 = $$1.c_($$2);
      if ($$3 instanceof dxk) {
         ww $$4 = ((bub)$$3).m_();
         return new bug(($$2x, $$3x, $$4x) -> new cvg($$2x, $$3x, cux.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
