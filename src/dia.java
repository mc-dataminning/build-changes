import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dia extends dby {
   public static final MapCodec<dia> a = b(dia::new);
   public static final dpq b = dib.d;

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   public dia(doy.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
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
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }
}
