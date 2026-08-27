import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record erz(esl b, eok c) implements erq {
   public static final Codec<erz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(esm.a.fieldOf("value").forGetter(erz::c), eok.a.fieldOf("range").forGetter(erz::d)).apply($$0, erz::new)
   );

   @Override
   public err b() {
      return ers.t;
   }

   @Override
   public Set<eqz<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eol $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static erq.a a(esl $$0, eok $$1) {
      return () -> new erz($$0, $$1);
   }

   public esl c() {
      return this.b;
   }

   public eok d() {
      return this.c;
   }
}
