import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlm extends dlg implements dll {
   public static final MapCodec<dlm> a = b(dlm::new);

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   public dlm(dzn.d $$0) {
      super($$0);
   }

   @Override
   public cxq b() {
      return cxq.a;
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dwi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return a($$2, dwp.p, dwi::a);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dwi $$5) {
         $$3.a($$5);
         $$3.a(awv.ab);
      }

      return bty.a;
   }
}
