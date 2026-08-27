import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esv extends eta {
   public static final Codec<esv> a = RecordCodecBuilder.create($$0 -> a($$0).and(erp.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, esv::new));
   private final erp.b b;

   public esv(List<euu> $$0, erp.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etc b() {
      return etd.y;
   }

   @Override
   public Set<eud<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      if ($$0.a(cuk.vY) && $$1.c(this.b.a()) instanceof cly $$2) {
         $$0.b(ke.U, new cxs($$2.gk()));
      }

      return $$0;
   }

   public static eta.a<?> a(erp.b $$0) {
      return a($$1 -> new esv($$1, $$0));
   }
}
