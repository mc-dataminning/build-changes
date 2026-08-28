import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdl(fdy b, ezs c) implements fdc {
   public static final MapCodec<fdl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdz.a.fieldOf("value").forGetter(fdl::c), ezs.a.fieldOf("range").forGetter(fdl::d)).apply($$0, fdl::new)
   );

   @Override
   public fdd b() {
      return fde.r;
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ezt $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static fdc.a a(fdy $$0, ezs $$1) {
      return () -> new fdl($$0, $$1);
   }

   public fdy c() {
      return this.b;
   }

   public ezs d() {
      return this.c;
   }
}
