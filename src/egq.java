import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egq(ehc b, edh c) implements egh {
   public static final Codec<egq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehd.a.fieldOf("value").forGetter(egq::c), edh.a.fieldOf("range").forGetter(egq::d)).apply($$0, egq::new)
   );

   @Override
   public egi b() {
      return egj.s;
   }

   @Override
   public Set<efq<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(edi $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static egh.a a(ehc $$0, edh $$1) {
      return () -> new egq($$0, $$1);
   }

   public ehc c() {
      return this.b;
   }

   public edh d() {
      return this.c;
   }
}
