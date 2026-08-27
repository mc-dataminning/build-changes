import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eht(eif b, eek c) implements ehk {
   public static final Codec<eht> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eig.a.fieldOf("value").forGetter(eht::c), eek.a.fieldOf("range").forGetter(eht::d)).apply($$0, eht::new)
   );

   @Override
   public ehl b() {
      return ehm.s;
   }

   @Override
   public Set<egt<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eel $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ehk.a a(eif $$0, eek $$1) {
      return () -> new eht($$0, $$1);
   }

   public eif c() {
      return this.b;
   }

   public eek d() {
      return this.c;
   }
}
