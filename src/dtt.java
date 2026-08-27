import com.mojang.serialization.Codec;
import java.util.List;

class dtt extends dtx {
   public static final Codec<dtt> a = a(dtt::new);

   public dtt(List<dtv> $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, ib $$1) {
      for (dtv $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dtw<?> a() {
      return dtw.j;
   }
}
