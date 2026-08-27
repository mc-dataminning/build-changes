import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbc extends cva {
   public static final MapCodec<dbc> a = b(dbc::new);
   public static final dhz b = dbd.d;

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   public dbc(dhh.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
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
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$0.c(b) && !$$1.B($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }
}
