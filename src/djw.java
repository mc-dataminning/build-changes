import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djw extends djq implements djv {
   public static final MapCodec<djw> a = b(djw::new);

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   public djw(dxp.d $$0) {
      super($$0);
   }

   @Override
   public cwe b() {
      return cwe.a;
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dun($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return a($$2, duu.p, dun::a);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dun $$5) {
         $$3.a($$5);
         $$3.a(awk.ab);
      }

      return bsy.a;
   }
}
