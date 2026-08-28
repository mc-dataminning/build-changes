import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class don extends dlm {
   public static final MapCodec<don> a = b(don::new);
   public static final List<iu> b = iu.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iu::j).toList();
   private static final ffc c = dma.b(16.0, 0.0, 12.0);

   @Override
   public MapCodec<don> a() {
      return a;
   }

   protected don(dzy.d $$0) {
      super($$0);
   }

   public static boolean a(div $$0, iu $$1, iu $$2) {
      return $$0.a_($$1.a((jz)$$2)).a(axc.cA) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axc.cB);
   }

   @Override
   protected boolean g_(dzz $$0) {
      return true;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c;
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
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
   public dwx a(iu $$0, dzz $$1) {
      return new dxu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return $$0.C ? a($$2, dwz.n, dxu::a) : null;
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
      }

      return bub.a;
   }

   @Nullable
   @Override
   protected bud b(dzz $$0, div $$1, iu $$2) {
      dwx $$3 = $$1.c_($$2);
      if ($$3 instanceof dxu) {
         wy $$4 = ((bue)$$3).m_();
         return new buj(($$2x, $$3x, $$4x) -> new cvm($$2x, $$3x, cvd.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
