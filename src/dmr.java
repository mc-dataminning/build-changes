import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dmr extends djq {
   public static final MapCodec<dmr> a = b(dmr::new);
   public static final List<ji> b = ji.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ji::j).toList();
   private static final fcr c = dke.b(16.0, 0.0, 12.0);

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   protected dmr(dxp.d $$0) {
      super($$0);
   }

   public static boolean a(dgz $$0, ji $$1, ji $$2) {
      return $$0.a_($$1.a((km)$$2)).a(awp.cA) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awp.cB);
   }

   @Override
   protected boolean g_(dxq $$0) {
      return true;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c;
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (ji $$4 : b) {
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
   public dus a(ji $$0, dxq $$1) {
      return new dvo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return $$0.C ? a($$2, duu.n, dvo::a) : null;
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return bsy.a;
   }

   @Nullable
   @Override
   protected bta b(dxq $$0, dgz $$1, ji $$2) {
      dus $$3 = $$1.c_($$2);
      if ($$3 instanceof dvo) {
         wp $$4 = ((btb)$$3).m_();
         return new btg(($$2x, $$3x, $$4x) -> new cts($$2x, $$3x, ctj.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
