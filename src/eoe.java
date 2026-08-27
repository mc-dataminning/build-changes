import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eoe(eoq b, ekv c) implements env {
   public static final Codec<eoe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eor.a.fieldOf("value").forGetter(eoe::c), ekv.a.fieldOf("range").forGetter(eoe::d)).apply($$0, eoe::new)
   );

   @Override
   public enw b() {
      return enx.s;
   }

   @Override
   public Set<ene<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ekw $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static env.a a(eoq $$0, ekv $$1) {
      return () -> new eoe($$0, $$1);
   }

   public eoq c() {
      return this.b;
   }

   public ekv d() {
      return this.c;
   }
}
