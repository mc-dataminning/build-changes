import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dab extends cua {
   public static final MapCodec<dab> a = b(dab::new);
   public static final dgs b = dac.d;

   @Override
   public MapCodec<dab> a() {
      return a;
   }

   public dab(dga.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
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
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$0.c(b) && !$$1.B($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }
}
