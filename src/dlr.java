import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlr extends dkd {
   public static final MapCodec<dlr> a = b(dlr::new);
   public static final dyf b = dye.B;
   public static final dyf c = dye.v;

   @Override
   protected MapCodec<? extends dlr> a() {
      return a;
   }

   public dlr(dxn.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arx $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      if ($$1 instanceof arx $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dxo $$0, arx $$1, jh $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dxo $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awv.fI : awv.fJ, aww.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
