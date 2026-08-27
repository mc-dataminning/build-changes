import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dav extends cut {
   public static final MapCodec<dav> a = b(dav::new);
   public static final dhn b = daw.d;

   @Override
   public MapCodec<dav> a() {
      return a;
   }

   public dav(dgv.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
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
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$0.c(b) && !$$1.B($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }
}
