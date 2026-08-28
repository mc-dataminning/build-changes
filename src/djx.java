import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djx extends dij {
   public static final MapCodec<djx> a = b(djx::new);
   public static final dwf b = dwe.w;
   public static final dwf c = dwe.r;

   @Override
   protected MapCodec<? extends djx> a() {
      return a;
   }

   public djx(dvn.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arq $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      if ($$1 instanceof arq $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dvo $$0, arq $$1, jh $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dvo $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awo.fH : awo.fI, awp.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
