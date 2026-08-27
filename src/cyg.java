import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyg extends cya implements cyf {
   public static final MapCodec<cyg> a = b(cyg::new);

   @Override
   public MapCodec<cyg> a() {
      return a;
   }

   public cyg(dle.d $$0) {
      super($$0);
   }

   @Override
   public cnn b() {
      return cnn.a;
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dio($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return a($$2, div.o, dio::a);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         dit $$5 = $$1.c_($$2);
         if ($$5 instanceof dio) {
            $$3.a((dio)$$5);
            $$3.a(atu.ab);
         }

         return blu.b;
      }
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
      if ($$4.B()) {
         dit $$5 = $$0.c_($$1);
         if ($$5 instanceof dio) {
            ((dio)$$5).a($$4.z());
         }
      }
   }
}
