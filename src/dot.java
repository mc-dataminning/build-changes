import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dot extends dlr {
   public static final MapCodec<dot> a = b(dot::new);
   public static final List<iu> b = iu.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iu::j).toList();
   private static final ffk c = dmf.b(16.0, 0.0, 12.0);

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   protected dot(eag.d $$0) {
      super($$0);
   }

   public static boolean a(dja $$0, iu $$1, iu $$2) {
      return $$0.a_($$1.a((jz)$$2)).a(axc.cB) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axc.cC);
   }

   @Override
   protected boolean g_(eah $$0) {
      return true;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c;
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
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
   public dxf a(iu $$0, eah $$1) {
      return new dyc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return $$0.C ? a($$2, dxh.n, dyc::a) : null;
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
      }

      return bud.a;
   }

   @Nullable
   @Override
   protected buf b(eah $$0, dja $$1, iu $$2) {
      dxf $$3 = $$1.c_($$2);
      if ($$3 instanceof dyc) {
         wy $$4 = ((bug)$$3).m_();
         return new bul(($$2x, $$3x, $$4x) -> new cvr($$2x, $$3x, cvi.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
