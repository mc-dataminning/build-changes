import java.util.Optional;
import javax.annotation.Nullable;

public interface dkf extends ddl, dhv {
   @Override
   default boolean a(@Nullable clh $$0, czj $$1, in $$2, dqh $$3, elz $$4) {
      return $$4 == emb.c;
   }

   @Override
   default boolean a(dae $$0, in $$1, dqh $$2, ema $$3) {
      if (!$$2.c(dqx.C) && $$3.a() == emb.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dqx.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default csz a(@Nullable clh $$0, dae $$1, in $$2, dqh $$3) {
      if ($$3.c(dqx.C)) {
         $$1.a($$2, $$3.a(dqx.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new csz(ctc.qz);
      } else {
         return csz.i;
      }
   }

   @Override
   default Optional<avb> as_() {
      return emb.c.j();
   }
}
