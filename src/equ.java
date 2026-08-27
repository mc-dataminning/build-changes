import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record equ(erg b, enj c) implements eql {
   public static final Codec<equ> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(erh.a.fieldOf("value").forGetter(equ::c), enj.a.fieldOf("range").forGetter(equ::d)).apply($$0, equ::new)
   );

   @Override
   public eqm b() {
      return eqn.s;
   }

   @Override
   public Set<epu<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(enk $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static eql.a a(erg $$0, enj $$1) {
      return () -> new equ($$0, $$1);
   }

   public erg c() {
      return this.b;
   }

   public enj d() {
      return this.c;
   }
}
