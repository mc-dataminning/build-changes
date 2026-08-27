import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eax extends ebe {
   public final arv<cva> a;
   public static final Codec<eax> b = arv.b(jz.e).xmap(eax::new, $$0 -> $$0.a);

   public eax(arv<cva> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ebh.c a(csd $$0, ht $$1, ht $$2, ebh.c $$3, ebh.c $$4, ebd $$5) {
      return dpv.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ebg<?> a() {
      return ebg.n;
   }
}
