import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euc(euo b, eqi c) implements ett {
   public static final MapCodec<euc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eup.a.fieldOf("value").forGetter(euc::c), eqi.a.fieldOf("range").forGetter(euc::d)).apply($$0, euc::new)
   );

   @Override
   public etu b() {
      return etv.t;
   }

   @Override
   public Set<etc<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eqj $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ett.a a(euo $$0, eqi $$1) {
      return () -> new euc($$0, $$1);
   }

   public euo c() {
      return this.b;
   }

   public eqi d() {
      return this.c;
   }
}
