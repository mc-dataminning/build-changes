import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dki {
   fbt s_ = djl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dxn t_ = dxm.c;

   static bsj a(@Nullable buk $$0, dww $$1, dgh $$2, ji $$3) {
      if ($$1.c(t_)) {
         djl.a($$2, $$3, new cwo(cws.xw, 1));
         float $$4 = ayz.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awa.eg, awb.e, 1.0F, $$4);
         dww $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(ebs.c, $$3, ebs.a.a($$0, $$5));
         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   static boolean j_(dww $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dww> i_(int $$0) {
      return $$1 -> $$1.c(dxm.c) ? $$0 : 0;
   }
}
