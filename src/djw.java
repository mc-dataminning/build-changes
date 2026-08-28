import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djw extends djq implements djv {
   public static final MapCodec<djw> a = b(djw::new);

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   public djw(dxm.d $$0) {
      super($$0);
   }

   @Override
   public cwh b() {
      return cwh.a;
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new duk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return a($$2, dur.p, duk::a);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof duk $$5) {
         $$3.a($$5);
         $$3.a(axp.ab);
      }

      return bte.a;
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }
}
