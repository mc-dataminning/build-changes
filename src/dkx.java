import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkx extends deu {
   public static final MapCodec<dkx> a = b(dkx::new);
   public static final dso b = dky.d;

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(drw.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
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
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }
}
