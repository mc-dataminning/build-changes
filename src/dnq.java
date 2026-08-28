import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnq extends dhm {
   public static final MapCodec<dnq> a = b(dnq::new);
   public static final dvj b = dnr.d;

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   public dnq(dur.d $$0) {
      super($$0);
      this.l(this.n().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      return this.n().b(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
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
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }
}
