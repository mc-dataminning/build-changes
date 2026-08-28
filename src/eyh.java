import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyh(eyd b, eyd c) implements eyd {
   public static final MapCodec<eyh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eye.a.fieldOf("min").forGetter(eyh::c), eye.a.fieldOf("max").forGetter(eyh::d)).apply($$0, eyh::new)
   );

   @Override
   public eyc b() {
      return eye.c;
   }

   public static eyh a(float $$0, float $$1) {
      return new eyh(eya.a($$0), eya.a($$1));
   }

   @Override
   public int a(etw $$0) {
      return azj.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(etw $$0) {
      return azj.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<ewp<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eyd c() {
      return this.b;
   }

   public eyd d() {
      return this.c;
   }
}
