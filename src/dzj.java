import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dzj extends dzq {
   public final arh<cua> a;
   public static final Codec<dzj> b = arh.b(jz.e).xmap(dzj::new, $$0 -> $$0.a);

   public dzj(arh<cua> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public dzt.c a(crc $$0, ht $$1, ht $$2, dzt.c $$3, dzt.c $$4, dzp $$5) {
      return doo.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected dzs<?> a() {
      return dzs.n;
   }
}
