import com.mojang.serialization.Codec;
import java.util.List;

class dtu extends dtx {
   public static final Codec<dtu> a = a(dtu::new);

   public dtu(List<dtv> $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, ib $$1) {
      for (dtv $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dtw<?> a() {
      return dtw.i;
   }
}
