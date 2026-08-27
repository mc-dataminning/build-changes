import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efo(ega b, ecf c) implements eff {
   public static final Codec<efo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egb.a.fieldOf("value").forGetter(efo::c), ecf.a.fieldOf("range").forGetter(efo::d)).apply($$0, efo::new)
   );

   @Override
   public efg b() {
      return efh.s;
   }

   @Override
   public Set<eeo<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ecg $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static eff.a a(ega $$0, ecf $$1) {
      return () -> new efo($$0, $$1);
   }

   public ega c() {
      return this.b;
   }

   public ecf d() {
      return this.c;
   }
}
