import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eoc(eoo b, ekt c) implements ent {
   public static final Codec<eoc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eop.a.fieldOf("value").forGetter(eoc::c), ekt.a.fieldOf("range").forGetter(eoc::d)).apply($$0, eoc::new)
   );

   @Override
   public enu b() {
      return env.s;
   }

   @Override
   public Set<enc<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eku $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ent.a a(eoo $$0, ekt $$1) {
      return () -> new eoc($$0, $$1);
   }

   public eoo c() {
      return this.b;
   }

   public ekt d() {
      return this.c;
   }
}
