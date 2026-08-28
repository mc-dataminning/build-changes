import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doh extends die {
   public static final MapCodec<doh> a = b(doh::new);
   public static final dwa b = doi.d;

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   public doh(dvi.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if (!$$1.C) {
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
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$0.c(b) && !$$1.C($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }
}
