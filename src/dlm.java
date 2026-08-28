import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlm extends deg {
   public static final MapCodec<dlm> a = b(dlm::new);
   public static final dso b = dsn.E;
   private final bpu c = bpr.a(5);

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   public dlm(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return $$0.B ? null : a($$2, dpe.K, dqi::a);
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, cuk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
