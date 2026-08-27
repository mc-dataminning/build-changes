import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface cuw {
   eiy r_ = cua.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dgs s_ = dgr.D;

   static bib a(@Nullable bjt $$0, dgb $$1, cqz $$2, ht $$3) {
      if ($$1.c(s_)) {
         cua.a($$2, $$3, new ckj(ckm.vw, 1));
         float $$4 = asy.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, aqd.dx, aqe.e, 1.0F, $$4);
         dgb $$5 = $$1.a(s_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dkl.c, $$3, dkl.a.a($$0, $$5));
         return bib.a($$2.B);
      } else {
         return bib.d;
      }
   }

   static boolean h_(dgb $$0) {
      return $$0.b(s_) && $$0.c(s_);
   }

   static ToIntFunction<dgb> h_(int $$0) {
      return $$1 -> $$1.c(dgr.D) ? $$0 : 0;
   }
}
