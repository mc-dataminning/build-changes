import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ejy extends ekm {
   public static final Codec<ejy> a = Codec.unit(() -> ejy.b);
   public static final ejy b = new ejy();

   @Nullable
   @Override
   public ekp.c a(dag $$0, in $$1, in $$2, ekp.c $$3, ekp.c $$4, ekl $$5) {
      in $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(ddg.H);
      return $$7 && !dde.a($$4.b().j($$0, $$6)) ? new ekp.c($$6, ddg.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected eko<?> a() {
      return eko.m;
   }
}
