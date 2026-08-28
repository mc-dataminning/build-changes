import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dld extends dfa {
   public static final MapCodec<dld> a = b(dld::new);
   public static final dsu b = dle.d;

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   public dld(dsc.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
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
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }
}
