import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eql(eqx b, ena c) implements eqc {
   public static final Codec<eql> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eqy.a.fieldOf("value").forGetter(eql::c), ena.a.fieldOf("range").forGetter(eql::d)).apply($$0, eql::new)
   );

   @Override
   public eqd b() {
      return eqe.s;
   }

   @Override
   public Set<epl<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(enb $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static eqc.a a(eqx $$0, ena $$1) {
      return () -> new eql($$0, $$1);
   }

   public eqx c() {
      return this.b;
   }

   public ena d() {
      return this.c;
   }
}
