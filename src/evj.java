import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evj(evw b, ero c) implements eva {
   public static final MapCodec<evj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evx.a.fieldOf("value").forGetter(evj::c), ero.a.fieldOf("range").forGetter(evj::d)).apply($$0, evj::new)
   );

   @Override
   public evb b() {
      return evc.r;
   }

   @Override
   public Set<eui<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(erp $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static eva.a a(evw $$0, ero $$1) {
      return () -> new evj($$0, $$1);
   }

   public evw c() {
      return this.b;
   }

   public ero d() {
      return this.c;
   }
}
