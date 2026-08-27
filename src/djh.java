import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djh extends dde {
   public static final MapCodec<djh> a = b(djh::new);
   public static final dqy b = dji.d;

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(dqg.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.C($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }
}
