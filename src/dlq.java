import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlq extends djp implements drj {
   public static final MapCodec<dlq> a = b(dlq::new);
   public static final dyf b = dye.J;
   private static final int d = 3;
   protected static final fcl c = dkd.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   public dlq(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return a($$2, dus.A, $$0.C ? dvc::a : dvc::b);
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.b;
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(b) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return c;
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axq.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
