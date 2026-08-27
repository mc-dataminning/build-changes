import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class det extends den implements des {
   public static final MapCodec<det> a = b(det::new);

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public det(dtb.d $$0) {
      super($$0);
   }

   @Override
   public csy b() {
      return csy.a;
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dpw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return a($$2, dqe.p, dpw::a);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         if ($$1.c_($$2) instanceof dpw $$5) {
            $$3.a($$5);
            $$3.a(avz.ac);
         }

         return bqa.b;
      }
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }
}
