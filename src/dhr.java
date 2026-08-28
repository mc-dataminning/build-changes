import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dhr {
   eyx u_ = dgv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dur v_ = duq.D;

   static brk a(@Nullable btj $$0, dua $$1, dds $$2, je $$3) {
      if ($$1.c(v_)) {
         dgv.a($$2, $$3, new cvl(cvo.wy, 1));
         float $$4 = azc.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, awd.ef, awe.e, 1.0F, $$4);
         dua $$5 = $$1.b(v_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dyx.c, $$3, dyx.a.a($$0, $$5));
         return brk.a;
      } else {
         return brk.e;
      }
   }

   static boolean j_(dua $$0) {
      return $$0.b(v_) && $$0.c(v_);
   }

   static ToIntFunction<dua> i_(int $$0) {
      return $$1 -> $$1.c(duq.D) ? $$0 : 0;
   }
}
