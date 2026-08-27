import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ebk extends ebc {
   @Override
   public ebd d() {
      return ebf.b;
   }

   @Override
   public ebd e() {
      return ebf.c;
   }

   @Override
   public cke a() {
      return ckm.pL;
   }

   @Override
   public void a(cqz $$0, ht $$1, ebe $$2, ate $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aqd.zT, aqe.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(js.af, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public jq h() {
      return js.m;
   }

   @Override
   protected boolean a(cqz $$0) {
      return $$0.X().b(cqv.R);
   }

   @Override
   protected void a(cra $$0, ht $$1, dgb $$2) {
      ddx $$3 = $$2.t() ? $$0.c_($$1) : null;
      cua.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(crc $$0) {
      return 4;
   }

   @Override
   public dgb b(ebe $$0) {
      return cuc.G.o().a(cyo.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ebd $$0) {
      return $$0 == ebf.c || $$0 == ebf.b;
   }

   @Override
   public int c(crc $$0) {
      return 1;
   }

   @Override
   public int a(crc $$0) {
      return 5;
   }

   @Override
   public boolean a(ebe $$0, cqf $$1, ht $$2, ebd $$3, hx $$4) {
      return $$4 == hx.a && !$$3.a(aqx.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<aqc> j() {
      return Optional.of(aqd.cB);
   }

   public static class a extends ebk {
      @Override
      protected void a(dgc.a<ebd, ebe> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ebe $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ebe $$0) {
         return false;
      }
   }

   public static class b extends ebk {
      @Override
      public int d(ebe $$0) {
         return 8;
      }

      @Override
      public boolean c(ebe $$0) {
         return true;
      }
   }
}
