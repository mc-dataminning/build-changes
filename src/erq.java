import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erq extends erw {
   public static final MapCodec<erq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eqk.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, erq::new)
   );
   private final eqk.b b;

   public erq(List<etu> $$0, eqk.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ery<erq> b() {
      return erz.B;
   }

   @Override
   public Set<etd<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      if ($$0.a(cuu.un) && $$1.c(this.b.a()) instanceof cmz $$2) {
         $$0.b(km.V, new cxt($$2.gb()));
      }

      return $$0;
   }

   public static erw.a<?> a(eqk.b $$0) {
      return a($$1 -> new erq($$1, $$0));
   }
}
