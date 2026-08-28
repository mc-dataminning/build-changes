import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmz extends dgv {
   public static final MapCodec<dmz> a = b(dmz::new);
   public static final dur b = dna.d;

   @Override
   public MapCodec<dmz> a() {
      return a;
   }

   public dmz(dtz.d $$0) {
      super($$0);
      this.l(this.o().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      return this.o().b(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
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
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }
}
