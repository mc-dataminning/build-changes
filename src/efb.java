import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class efb extends efi {
   public final aup<cys> a;
   public static final Codec<efb> b = aup.b(kg.f).xmap(efb::new, $$0 -> $$0.a);

   public efb(aup<cys> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public efl.c a(cvu $$0, hz $$1, hz $$2, efl.c $$3, efl.c $$4, efh $$5) {
      return dtz.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected efk<?> a() {
      return efk.n;
   }
}
