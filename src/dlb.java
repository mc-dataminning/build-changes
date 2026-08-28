import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlb extends dey {
   public static final MapCodec<dlb> a = b(dlb::new);
   public static final dss b = dlc.d;

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   public dlb(dsa.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
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
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }
}
