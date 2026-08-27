import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dig extends den {
   public static final MapCodec<dig> a = b(dig::new);

   @Override
   public MapCodec<dig> a() {
      return a;
   }

   protected dig(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         if ($$1.c_($$2) instanceof dqy $$6) {
            $$3.a($$6);
            $$3.a(avz.ab);
         }

         return bqa.b;
      }
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return $$0.C ? null : a($$2, dqe.b, dqy::a);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      bpw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return cpg.a($$1.c_($$2));
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }
}
