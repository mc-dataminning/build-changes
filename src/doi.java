import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doi extends djp {
   public static final MapCodec<doi> a = b(doi::new);
   public static final dyf b = dye.r;

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   protected doi(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, @Nullable bvx $$3, cxg $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      czp $$5 = $$4.a(ku.Y, czp.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dvu $$5) {
         $$5.s();
         return bta.a;
      } else {
         return bta.e;
      }
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if ($$1.c(b)) {
         return bta.f;
      } else {
         cxg $$7 = $$4.b($$5);
         bta $$8 = cxl.a($$2, $$3, $$7, $$4);
         return (bta)(!$$8.a() ? bta.f : $$8);
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dvu $$5) {
            $$5.s();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvu($$0, $$1);
   }

   @Override
   public boolean f_(dxo $$0) {
      return true;
   }

   @Override
   public int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      if ($$1.c_($$2) instanceof dvu $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return $$1.c_($$2) instanceof dvu $$3 ? $$3.t() : 0;
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return $$1.c(b) ? a($$2, dus.e, dvu::a) : null;
   }
}
