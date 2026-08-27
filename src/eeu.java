import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eeu extends efb {
   public final auo<cyo> a;
   public static final Codec<eeu> b = auo.b(kg.f).xmap(eeu::new, $$0 -> $$0.a);

   public eeu(auo<cyo> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public efe.c a(cvq $$0, hz $$1, hz $$2, efe.c $$3, efe.c $$4, efa $$5) {
      return dts.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected efd<?> a() {
      return efd.n;
   }
}
