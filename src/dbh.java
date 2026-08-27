import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbh extends cvf {
   public static final MapCodec<dbh> a = b(dbh::new);
   public static final die b = dbi.d;

   @Override
   public MapCodec<dbh> a() {
      return a;
   }

   public dbh(dhm.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.B($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$0.c(b) && !$$1.B($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }
}
