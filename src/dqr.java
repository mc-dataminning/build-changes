import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqr extends dkl {
   public static final MapCodec<dqr> a = b(dqr::new);
   public static final dyl b = dqs.d;

   @Override
   public MapCodec<dqr> a() {
      return a;
   }

   public dqr(dxt.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      if (!$$1.C) {
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
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }
}
