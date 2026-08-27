import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlt extends dfc {
   public static final MapCodec<dlt> a = b(dlt::new);
   public static final dtt b = dlu.d;

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(dtb.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
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
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }
}
