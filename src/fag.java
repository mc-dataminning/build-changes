import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fag(fat b, ewn c) implements ezx {
   public static final MapCodec<fag> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fau.a.fieldOf("value").forGetter(fag::c), ewn.a.fieldOf("range").forGetter(fag::d)).apply($$0, fag::new)
   );

   @Override
   public ezy b() {
      return ezz.r;
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ewo $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ezx.a a(fat $$0, ewn $$1) {
      return () -> new fag($$0, $$1);
   }

   public fat c() {
      return this.b;
   }

   public ewn d() {
      return this.c;
   }
}
