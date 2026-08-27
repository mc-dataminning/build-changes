import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface cqi {
   efb r_ = cpn.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dcs s_ = dcr.D;

   static bdx a(@Nullable bfj $$0, dcb $$1, cmm $$2, gu $$3) {
      if ($$1.c(s_)) {
         cpn.a($$2, $$3, new cfz(cgc.vw, 1));
         float $$4 = apa.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, amh.dx, ami.e, 1.0F, $$4);
         dcb $$5 = $$1.a(s_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dgl.c, $$3, dgl.a.a($$0, $$5));
         return bdx.a($$2.B);
      } else {
         return bdx.d;
      }
   }

   static boolean h_(dcb $$0) {
      return $$0.b(s_) && $$0.c(s_);
   }

   static ToIntFunction<dcb> h_(int $$0) {
      return $$1 -> $$1.c(dcr.D) ? $$0 : 0;
   }
}
