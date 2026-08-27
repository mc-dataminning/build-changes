import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddq extends ddk implements ddp {
   public static final MapCodec<ddq> a = b(ddq::new);

   @Override
   public MapCodec<ddq> a() {
      return a;
   }

   public ddq(dra.d $$0) {
      super($$0);
   }

   @Override
   public csh b() {
      return csh.a;
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dob($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return a($$2, doi.o, dob::a);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         if ($$1.c_($$2) instanceof dob $$5) {
            $$3.a($$5);
            $$3.a(avr.ab);
         }

         return bpu.b;
      }
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }
}
