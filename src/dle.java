import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dle extends dfb {
   public static final MapCodec<dle> a = b(dle::new);
   public static final dsv b = dlf.d;

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   public dle(dsd.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
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
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }
}
