import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eke(ekq b, egv c) implements ejv {
   public static final Codec<eke> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekr.a.fieldOf("value").forGetter(eke::c), egv.a.fieldOf("range").forGetter(eke::d)).apply($$0, eke::new)
   );

   @Override
   public ejw b() {
      return ejx.s;
   }

   @Override
   public Set<eje<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(egw $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ejv.a a(ekq $$0, egv $$1) {
      return () -> new eke($$0, $$1);
   }

   public ekq c() {
      return this.b;
   }

   public egv d() {
      return this.c;
   }
}
