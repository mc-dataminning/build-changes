import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evl(evy b, erq c) implements evc {
   public static final MapCodec<evl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evz.a.fieldOf("value").forGetter(evl::c), erq.a.fieldOf("range").forGetter(evl::d)).apply($$0, evl::new)
   );

   @Override
   public evd b() {
      return eve.r;
   }

   @Override
   public Set<euk<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(err $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static evc.a a(evy $$0, erq $$1) {
      return () -> new evl($$0, $$1);
   }

   public evy c() {
      return this.b;
   }

   public erq d() {
      return this.c;
   }
}
