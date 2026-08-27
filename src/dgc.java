import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgc extends daa {
   public static final MapCodec<dgc> a = b(dgc::new);
   public static final dnq b = dgd.d;

   @Override
   public MapCodec<dgc> a() {
      return a;
   }

   public dgc(dmy.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
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
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }
}
