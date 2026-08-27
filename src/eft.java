import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eft(egf b, eck c) implements efk {
   public static final Codec<eft> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egg.a.fieldOf("value").forGetter(eft::c), eck.a.fieldOf("range").forGetter(eft::d)).apply($$0, eft::new)
   );

   @Override
   public efl b() {
      return efm.s;
   }

   @Override
   public Set<eet<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ecl $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static efk.a a(egf $$0, eck $$1) {
      return () -> new eft($$0, $$1);
   }

   public egf c() {
      return this.b;
   }

   public eck d() {
      return this.c;
   }
}
