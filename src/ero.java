import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ero extends eru {
   public static final MapCodec<ero> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eqi.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, ero::new)
   );
   private final eqi.b b;

   public ero(List<ets> $$0, eqi.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erw<ero> b() {
      return erx.B;
   }

   @Override
   public Set<etb<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      if ($$0.a(cus.un) && $$1.c(this.b.a()) instanceof cmx $$2) {
         $$0.b(km.V, new cxr($$2.gb()));
      }

      return $$0;
   }

   public static eru.a<?> a(eqi.b $$0) {
      return a($$1 -> new ero($$1, $$0));
   }
}
