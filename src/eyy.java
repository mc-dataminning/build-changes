import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyy(eyu b, eyu c) implements eyu {
   public static final MapCodec<eyy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eyv.a.fieldOf("min").forGetter(eyy::c), eyv.a.fieldOf("max").forGetter(eyy::d)).apply($$0, eyy::new)
   );

   @Override
   public eyt b() {
      return eyv.c;
   }

   public static eyy a(float $$0, float $$1) {
      return new eyy(eyr.a($$0), eyr.a($$1));
   }

   @Override
   public int a(eun $$0) {
      return azm.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eun $$0) {
      return azm.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<exg<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eyu c() {
      return this.b;
   }

   public eyu d() {
      return this.c;
   }
}
