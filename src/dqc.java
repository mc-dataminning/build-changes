import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dqc extends dna {
   public static final MapCodec<dqc> a = b(dqc::new);
   public static final List<iw> b = iw.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iw::j).toList();
   private static final fgw c = dno.b(16.0, 0.0, 12.0);

   @Override
   public MapCodec<dqc> a() {
      return a;
   }

   protected dqc(ebp.d $$0) {
      super($$0);
   }

   public static boolean a(dkj $$0, iw $$1, iw $$2) {
      return $$0.a_($$1.a((kb)$$2)).a(axn.cC) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axn.cD);
   }

   @Override
   protected boolean g_(ebq $$0) {
      return true;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c;
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (iw $$4 : b) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lz.s,
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
   public dyo a(iw $$0, ebq $$1) {
      return new dzl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return $$0.C ? a($$2, dyq.n, dzl::a) : null;
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
      }

      return bvc.a;
   }

   @Nullable
   @Override
   protected bve b(ebq $$0, dkj $$1, iw $$2) {
      dyo $$3 = $$1.c_($$2);
      if ($$3 instanceof dzl) {
         xg $$4 = ((bvf)$$3).P_();
         return new bvk(($$2x, $$3x, $$4x) -> new cwx($$2x, $$3x, cwo.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
