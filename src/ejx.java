import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ejx(ekj b, ego c) implements ejo {
   public static final Codec<ejx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekk.a.fieldOf("value").forGetter(ejx::c), ego.a.fieldOf("range").forGetter(ejx::d)).apply($$0, ejx::new)
   );

   @Override
   public ejp b() {
      return ejq.s;
   }

   @Override
   public Set<eix<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(egp $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ejo.a a(ekj $$0, ego $$1) {
      return () -> new ejx($$0, $$1);
   }

   public ekj c() {
      return this.b;
   }

   public ego d() {
      return this.c;
   }
}
