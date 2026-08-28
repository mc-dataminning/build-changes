import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dty extends dno {
   public static final MapCodec<dty> a = b(dty::new);
   public static final ech b = dtz.b;

   @Override
   public MapCodec<dty> a() {
      return a;
   }

   public dty(ebp.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.D($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$0.c(b) && !$$1.D($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }
}
