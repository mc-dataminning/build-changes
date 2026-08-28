import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlr extends del {
   public static final MapCodec<dlr> a = b(dlr::new);
   public static final dst b = dss.E;
   private final bpz c = bpw.a(5);

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   public dlr(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return $$0.B ? null : a($$2, dpj.K, dqn::a);
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, cup $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
