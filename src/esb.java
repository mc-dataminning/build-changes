import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esb extends esh {
   public static final MapCodec<esb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(equ.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, esb::new)
   );
   private final equ.b b;

   public esb(List<euf> $$0, equ.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esj<esb> b() {
      return esk.B;
   }

   @Override
   public Set<etn<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      if ($$0.a(cuf.un) && $$1.c(this.b.a()) instanceof cmk $$2) {
         $$0.b(kn.V, new cxd($$2.fY()));
      }

      return $$0;
   }

   public static esh.a<?> a(equ.b $$0) {
      return a($$1 -> new esb($$1, $$0));
   }
}
