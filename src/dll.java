import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dll extends dfi {
   public static final MapCodec<dll> a = b(dll::new);
   public static final dtc b = dlm.d;

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   public dll(dsk.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
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
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }
}
