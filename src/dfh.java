import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfh extends czf {
   public static final MapCodec<dfh> a = b(dfh::new);
   public static final dmv b = dfi.d;

   @Override
   public MapCodec<dfh> a() {
      return a;
   }

   public dfh(dmd.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
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
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }
}
