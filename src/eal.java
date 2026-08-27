import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eal extends eas {
   public final arr<cut> a;
   public static final Codec<eal> b = arr.b(jz.e).xmap(eal::new, $$0 -> $$0.a);

   public eal(arr<cut> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public eav.c a(crv $$0, ht $$1, ht $$2, eav.c $$3, eav.c $$4, ear $$5) {
      return dpj.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected eau<?> a() {
      return eau.n;
   }
}
