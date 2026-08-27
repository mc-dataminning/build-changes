import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eif(eir b, eew c) implements ehw {
   public static final Codec<eif> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eis.a.fieldOf("value").forGetter(eif::c), eew.a.fieldOf("range").forGetter(eif::d)).apply($$0, eif::new)
   );

   @Override
   public ehx b() {
      return ehy.s;
   }

   @Override
   public Set<ehf<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eex $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ehw.a a(eir $$0, eew $$1) {
      return () -> new eif($$0, $$1);
   }

   public eir c() {
      return this.b;
   }

   public eew d() {
      return this.c;
   }
}
