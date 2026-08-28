import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class des extends dem implements der {
   public static final MapCodec<des> a = b(des::new);

   @Override
   public MapCodec<des> a() {
      return a;
   }

   public des(dsc.d $$0) {
      super($$0);
   }

   @Override
   public ctj b() {
      return ctj.a;
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return a($$2, dpk.o, dpd::a);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         if ($$1.c_($$2) instanceof dpd $$5) {
            $$3.a($$5);
            $$3.a(awk.ab);
         }

         return bqv.c;
      }
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }
}
