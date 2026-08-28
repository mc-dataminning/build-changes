import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyh(eyu b, eum c) implements exy {
   public static final MapCodec<eyh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eyv.a.fieldOf("value").forGetter(eyh::c), eum.a.fieldOf("range").forGetter(eyh::d)).apply($$0, eyh::new)
   );

   @Override
   public exz b() {
      return eya.r;
   }

   @Override
   public Set<exg<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eun $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static exy.a a(eyu $$0, eum $$1) {
      return () -> new eyh($$0, $$1);
   }

   public eyu c() {
      return this.b;
   }

   public eum d() {
      return this.c;
   }
}
