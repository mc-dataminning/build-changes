import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exd(Optional<cs> b) implements eww {
   public static final MapCodec<exd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cs.a.optionalFieldOf("predicate").forGetter(exd::c)).apply($$0, exd::new));

   @Override
   public ewx b() {
      return ewy.j;
   }

   @Override
   public Set<ewe<?>> a() {
      return ImmutableSet.of(ewh.i);
   }

   public boolean a(etl $$0) {
      cvs $$1 = $$0.c(ewh.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static eww.a a(cs.a $$0) {
      return () -> new exd(Optional.of($$0.b()));
   }

   public Optional<cs> c() {
      return this.b;
   }
}
