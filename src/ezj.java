import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezj(ezw b, evq c) implements eza {
   public static final MapCodec<ezj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezx.a.fieldOf("value").forGetter(ezj::c), evq.a.fieldOf("range").forGetter(ezj::d)).apply($$0, ezj::new)
   );

   @Override
   public ezb b() {
      return ezc.r;
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(evr $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static eza.a a(ezw $$0, evq $$1) {
      return () -> new ezj($$0, $$1);
   }

   public ezw c() {
      return this.b;
   }

   public evq d() {
      return this.c;
   }
}
