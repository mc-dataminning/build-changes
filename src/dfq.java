import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfq extends dfk implements dfp {
   public static final MapCodec<dfq> a = b(dfq::new);

   @Override
   public MapCodec<dfq> a() {
      return a;
   }

   public dfq(dtb.d $$0) {
      super($$0);
   }

   @Override
   public cti b() {
      return cti.a;
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dqc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return a($$2, dqj.o, dqc::a);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         if ($$1.c_($$2) instanceof dqc $$5) {
            $$3.a($$5);
            $$3.a(avz.ab);
         }

         return bqr.c;
      }
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }
}
