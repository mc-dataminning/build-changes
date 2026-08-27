import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eiz extends ejn {
   public static final Codec<eiz> a = Codec.unit(() -> eiz.b);
   public static final eiz b = new eiz();

   @Nullable
   @Override
   public ejq.c a(czj $$0, id $$1, id $$2, ejq.c $$3, ejq.c $$4, ejm $$5) {
      id $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dcj.H);
      return $$7 && !dch.a($$4.b().j($$0, $$6)) ? new ejq.c($$6, dcj.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected ejp<?> a() {
      return ejp.m;
   }
}
