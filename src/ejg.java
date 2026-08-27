import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ejg extends ejn {
   public final avt<dch> a;
   public static final Codec<ejg> b = avt.b(ku.f).xmap(ejg::new, $$0 -> $$0.a);

   public ejg(avt<dch> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ejq.c a(czj $$0, id $$1, id $$2, ejq.c $$3, ejq.c $$4, ejm $$5) {
      return dye.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ejp<?> a() {
      return ejp.n;
   }
}
