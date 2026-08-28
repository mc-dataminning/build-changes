import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fab(ezx b, ezx c) implements ezx {
   public static final MapCodec<fab> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezy.a.fieldOf("min").forGetter(fab::c), ezy.a.fieldOf("max").forGetter(fab::d)).apply($$0, fab::new)
   );

   @Override
   public ezw b() {
      return ezy.c;
   }

   public static fab a(float $$0, float $$1) {
      return new fab(ezu.a($$0), ezu.a($$1));
   }

   @Override
   public int a(evs $$0) {
      return ayz.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(evs $$0) {
      return ayz.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ezx c() {
      return this.b;
   }

   public ezx d() {
      return this.c;
   }
}
